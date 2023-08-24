public class Questao1 {

    public static void main(String[] args) {

        int[] vetor = new int[8];

        vetor[0] = 31;
        vetor[1] = 13;
        vetor[2] = 10;
        vetor[3] = 25;
        vetor[4] = 65;
        vetor[5] = 58;
        vetor[6] = 30;
        vetor[7] = 29;

        System.out.print("Vetor: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();


        int contador = 0;
        int soma = 0;
        for (int i = 0; i < 8; i++) {
            if (vetor[i] > 30) {
                contador++;
                soma = soma + vetor[i];
            }
        }


        System.out.println("Qtd de números maiores que 30: " + contador);

        System.out.println("Soma dos números maiores que 30: " + soma);


        int somaTotal = 0;
        for (int i = 0; i < 8; i++) {
            somaTotal = somaTotal + vetor[i];
        }


        System.out.println("Soma total de todos os 8 elementos do vetor: " + somaTotal);
    }
}
