package dev.Jeferson.datastructures.list;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyLinkedLis<Integer> lista = new MyLinkedLis<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU MY LINKED LIST ---");
            System.out.println("1. Adicionar no Início (addFirst)");
            System.out.println("2. Adicionar no Final (addLast)");
            System.out.println("3. Adicionar Ordenado (addSorted)");
            System.out.println("4. Remover do Início");
            System.out.println("5. Remover do Final");
            System.out.println("6. Buscar Elemento (find)");
            System.out.println("7. Exibir Lista e Tamanho");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o número: ");
                        lista.addFirst(scanner.nextInt());
                        break;
                    case 2:
                        System.out.print("Digite o número: ");
                        lista.addLast(scanner.nextInt());
                        break;
                    case 3:
                        System.out.print("Digite o número para inserir ordenado: ");
                        lista.addSorted(scanner.nextInt());
                        break;
                    case 4:
                        System.out.println("Removido: " + lista.removeFirst());
                        break;
                    case 5:
                        System.out.println("Removido: " + lista.removeLast());
                        break;
                    case 6:
                        System.out.print("Digite o valor para buscar: ");
                        int valor = scanner.nextInt();
                        int pos = lista.find(valor);
                        System.out.println(pos != -1 ? "Encontrado na posição: " + pos : "Não encontrado.");
                        break;
                    case 7:
                        exibirLista(lista);
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida ou operação não permitida.");
                scanner.nextLine(); // Limpa o buffer do erro
            }
        }
        scanner.close();
    }

    private static void exibirLista(MyLinkedLis<Integer> lista) {
        System.out.print("Conteúdo da Lista: [ ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + (i < lista.size() - 1 ? ", " : " "));
        }
        System.out.println("]");
        System.out.println("Tamanho atual: " + lista.size());
    }
}
