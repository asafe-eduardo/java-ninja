package br.com.machop_academia;

import br.com.machop_academia.domain.Aluno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MachoAcademiaMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();
        System.out.println("███╗   ███╗ █████╗  ██████╗██╗  ██╗ ██████╗ ██████╗ ");
        System.out.println("████╗ ████║██╔══██╗██╔════╝██║  ██║██╔═══██╗██╔══██╗");
        System.out.println("██╔████╔██║███████║██║     ███████║██║   ██║██████╔╝");
        System.out.println("██║╚██╔╝██║██╔══██║██║     ██╔══██║██║   ██║██╔═══╝ ");
        System.out.println("██║ ╚═╝ ██║██║  ██║╚██████╗██║  ██║╚██████╔╝██║     ");
        System.out.println("╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝     ");
        System.out.println("      █████╗  ██████╗ █████╗ ██████╗ ███████╗███╗   ███╗██╗ █████╗ ");
        System.out.println("     ██╔══██╗██╔════╝██╔══██╗██╔══██╗██╔════╝████╗ ████║██║██╔══██╗");
        System.out.println("     ███████║██║     ███████║██║  ██║█████╗  ██╔████╔██║██║███████║");
        System.out.println("     ██╔══██║██║     ██╔══██║██║  ██║██╔══╝  ██║╚██╔╝██║██║██╔══██║");
        System.out.println("     ██║  ██║╚██████╗██║  ██║██████╔╝███████╗██║ ╚═╝ ██║██║██║  ██║");
        System.out.println("     ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝╚═════╝ ╚══════╝╚═╝     ╚═╝╚═╝╚═╝  ╚═╝");
        System.out.println();

        while (true) {
            System.out.println("========== MENU ==========");
            System.out.println("Alunos");
            System.out.println("  1) Cadastrar aluno");
            System.out.println("  2) Listar alunos");
            System.out.println("  3) Buscar aluno por id");
            System.out.println("  4) Remover aluno por id");
            System.out.println();
            System.out.println("  0) Sair");
            System.out.println("==========================");

            String opcaoRaw = br.readLine();
            int opcao = Integer.parseInt(opcaoRaw);

            try {
                switch (opcao) {
                    case 1: cadastrarAluno(br); break;
                    case 2: listarAlunos(); break;
                    case 3: buscarAluno(br); break;

                    case 0:
                        System.out.println("Encerrando Machop Academia. Até mais.");
                        return;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("ERRO: " + e.getMessage());
            }
        }

    }

    // ===== Alunos =====
    private static void cadastrarAluno(BufferedReader io) throws IOException {
        System.out.println("== Cadastrar Aluno ==");
        System.out.println("Informe o id: ");
        String idRaw = io.readLine();
        int id = Integer.parseInt(idRaw);
        System.out.println("Informe o nome: ");
        String nome = io.readLine();
        System.out.println("Informe o email: ");
        String email = io.readLine();

        Aluno aluno = new Aluno(id, nome, email);

        System.out.println("Aluno cadastrado com sucesso.");
    }

    private static void listarAlunos() {
        System.out.println("== Listar Alunos (ordenado por nome) ==");
        List<Aluno> alunos = new ArrayList<>();
        if (alunos.isEmpty()) {
            System.out.println("(vazio)");
            return;
        }
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    private static void buscarAluno(BufferedReader br) throws IOException {
        System.out.println("== Buscar Aluno ==");
        String idRaw = br.readLine();
        int id = Integer.parseInt(idRaw);
        //Aluno aluno = busca aluno
        //System.out.println(aluno != null ? "aluno: " +  aluno.toString() : "Aluno não encontrado.");
    }
}
