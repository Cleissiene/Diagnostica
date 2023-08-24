import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int[][] estoque = new int[4][5];

        Scanner scanner = new Scanner(System.in);

        boolean encerrar = false;

        while (!encerrar) {
            System.out.println("Escolha uma opção de 1 a 3:");
            System.out.println("1. Inserir 1 caixa");
            System.out.println("2. Mostrar quantidade de caixas nas prateleiras");
            System.out.println("3. Encerrar programa");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o numero do armário de 1 a 5:");
                    int armario = scanner.nextInt() - 1;
                    System.out.println("Digite o numero da prateleira de 1 a 4:");
                    int prateleira = scanner.nextInt() - 1;

                    if (armario >= 0 && armario < 5 && prateleira >= 0 && prateleira < 4) {
                        if (estoque[prateleira][armario] < 10) {
                            estoque[prateleira][armario]++;
                            System.out.println("Caixa inserida");
                        } else {
                            System.out.println("ESPAÇO INSUFICIENTE");
                        }
                    } else {
                        System.out.println("Números de prateleira ou caixa inválidos, escolha novamente.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.println("Armário " + (j + 1) + " Prateleira " + (i + 1) + ": " + estoque[i][j] + " caixas");
                        }
                    }
                    break;

                case 3:
                    encerrar = true;
                    break;

                default:
                    System.out.println("Opção inválida. Escolha novamente");
            }
        }

        scanner.close();
    }
}
