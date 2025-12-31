# Analise de Benchmark — Desafio (Fundamentos Java III)
## Benchmark de Algoritmos (Busca e Ordenação Otimizadas)

### Contexto
Você deve construir um programa em Java que **compara o desempenho** de diferentes algoritmos de **busca** e **ordenação**, executando múltiplos testes e gerando um **relatório** com tempos e análise prática.

O objetivo do desafio é praticar:
- Big-O na prática
- Ordenações: Bubble, Insertion, Merge, Quick
- Buscas: linear, binária
- Recursão e otimizações
- Coleta de métricas e benchmark simples (sem frameworks)

---

## Requisitos

### 1) Geração de datasets
O programa deve gerar arrays de inteiros em diferentes cenários:
- **Aleatório**
- **Quase ordenado**
- **Reverso**

Tamanhos sugeridos:
- 1.000
- 10.000

### 2) Algoritmos obrigatórios
**Ordenação**
- Bubble Sort
- Insertion Sort
- Merge Sort
- Quick Sort

**Busca**
- Linear Search
- Binary Search (após ordenar)

### 3) Benchmark (métricas)
Para cada cenário e tamanho:
- medir tempo de execução (ms ou ns)
- repetir N vezes (ex.: 5) e calcular **média** e **pior caso**
- imprimir relatório em formato de tabela no console

Exemplo desejado:
- cenário: aleatório, n=10.000  
  - Bubble: X ms  
  - Insertion: Y ms  
  - Merge: Z ms  
  - Quick: W ms  

### 4) Validação de corretude
Após cada ordenação, validar se o array está ordenado.
Se não estiver, o teste deve falhar com mensagem clara.

---

## Instruções gerais

### 1) Medição
- Use `System.nanoTime()` para medir tempo.
- Faça **warm-up**: permitir uma execução prévia antes de medir (reduz variação).

---

## Restrições
- Sem bibliotecas externas de benchmark (sem JMH).
- Não usar `Arrays.sort()` como solução (pode usar apenas para validação comparativa opcional, não como algoritmo principal).
- Tudo em Java puro.

---

