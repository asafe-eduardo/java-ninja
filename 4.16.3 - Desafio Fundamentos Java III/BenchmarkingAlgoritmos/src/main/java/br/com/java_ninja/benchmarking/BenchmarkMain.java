package br.com.java_ninja.benchmarking;

import java.util.Random;

/**
 * Exemplo mínimo: benchmark apenas de Linear Search (busca linear)
 * - Gera um array aleatório
 * - Gera amostragem (metade existentes, metade não existentes)
 * - Mede com System.nanoTime()
 * - Repete N vezes e calcula média e pior caso
 */
public class BenchmarkMain {
    private static final int N = 200_000;     // tamanho do array
    private static final int AMOSTRA = 5_000; // quantidade de buscas por repetição
    private static final int REPS = 5;        // repetições do benchmark
    private static final long SEED = 12345L; //Vai gerar números dentro dessa margem.

    public static void main(String[] args) {
        Random rng = new Random(SEED);

        // Dataset base
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = rng.nextInt(N * 10);
        }

        // Targets: metade existente, metade não existente
        int[] amostragem = new int[AMOSTRA];
        for (int i = 0; i < AMOSTRA; i++) {
            if ((i & 1) == 0) {
                amostragem[i] = data[rng.nextInt(N)];       // existente
            } else {
                amostragem[i] = (N * 10) + 1 + rng.nextInt(50_000); // provavelmente não existente
            }
        }

        // Warm-up (não conta)
        warmUp(data, amostragem);

        long soma = 0L;
        long pior = 0L;
        int furo = 0; // evita otimização (dead-code elimination).

        for (int r = 1; r <= REPS; r++) {
            long t0 = System.nanoTime();

            for (int a : amostragem) {
                // sem atribuição de valor a JVM pode "otimizar seu código" simplificando ou removendo o algoritmo
                furo ^= linearSearch(data, a);
            }

            long t1 = System.nanoTime();
            long dt = t1 - t0;

            soma += dt;
            if (dt > pior) pior = dt;

            System.out.println("Rep " + r + ": " + toMs(dt) + " ms");
        }

        long media = soma / REPS;

        System.out.println();
        System.out.println("==== Resultado Linear Search ====");
        System.out.println("n=" + N + ", amostras=" + AMOSTRA + ", reps=" + REPS);
        System.out.println("Média: " + toMs(media) + " ms");
        System.out.println("Pior : " + toMs(pior) + " ms");

        // uso do sink para impedir que o compilador otimize o loop inteiro
        if (furo == 42) System.out.println("sink=42");
    }

    /**
     * Aquecimento fazendo a JVM fazer o pré carregamento de classes e otimizações
     * para não infectar os testes de benchmark
     * @param data
     * @param targets
     */
    private static void warmUp(int[] data, int[] targets) {
        int sink = 0;
        for (int i = 0; i < 2; i++) { // poucas rodadas só para aquecer
            for (int x : targets) sink ^= linearSearch(data, x);
        }
        if (sink == 42) System.out.println("warmup sink=42");
    }

    // Busca linear: O(n)
    private static int linearSearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) return i;
        }
        return -1;
    }

    private static double toMs(long nanos) {
        return nanos / 1_000_000.0;
    }
}
