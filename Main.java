import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        int opcao;

        do {

            System.out.println("\n===== ÁRVORE BINÁRIA DE BUSCA =====");
            System.out.println("1 - Inserir");
            System.out.println("2 - Buscar");
            System.out.println("3 - Remover");
            System.out.println("4 - Pré-Ordem");
            System.out.println("5 - Em Ordem");
            System.out.println("6 - Pós-Ordem");
            System.out.println("7 - Altura");
            System.out.println("8 - Contar Nós");
            System.out.println("9 - Contar Folhas");
            System.out.println("10 - Menor Valor");
            System.out.println("11 - Maior Valor");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Valor: ");
                    arvore.insere(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Valor: ");
                    System.out.println(arvore.busca(sc.nextInt()));
                    break;

                case 3:
                    System.out.print("Valor: ");
                    arvore.retiraNodo(sc.nextInt());
                    break;

                case 4:
                    arvore.imprimePre();
                    break;

                case 5:
                    arvore.imprimeEmOrdem();
                    break;

                case 6:
                    arvore.imprimePos();
                    break;

                case 7:
                    System.out.println("Altura: " + arvore.altura());
                    break;

                case 8:
                    System.out.println("Nós: " + arvore.contaNos());
                    break;

                case 9:
                    System.out.println("Folhas: " + arvore.contaFolhas());
                    break;

                case 10:
                    System.out.println("Menor: " + arvore.menorValor());
                    break;

                case 11:
                    System.out.println("Maior: " + arvore.maiorValor());
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}
