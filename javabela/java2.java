import java.util.Scanner;

public class java2 {
    public static void main (String []args ){
        //1
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            int num1 = new Scanner(System.in).nextInt();
            if (num1 > 50) {
                count++;
            }
        }
        System.out.println("Quantidade de numeros maiores que 50: " + count);

        //2
        int count2 = 0;
        System.out.println("Digite um numero: ");
        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            int numero = new Scanner(System.in).nextInt();

            if (numero >= 10 && numero <= 30) {
                count2++;
            }
        }

        System.out.println("Quantidade de numeros entre 10 e 30: " + count2);


        //3
        int[] vetor = new int[6];
        boolean existeZero = false;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = new Scanner(System.in).nextInt();
            if (vetor[i] == 0) {
                existeZero = true;
                break;
            }  
        }
        if (existeZero) {
            System.out.println("O numero 0 existe no vetor.");
        } else {
            System.out.println("O numero 0 nao existe no vetor.");
        }

        //4
        int count3 = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            int num2 = new Scanner(System.in).nextInt();
            if (num2 % 3 == 0) {
                count3++;
    }
        }
        System.out.println("Quantidade de numeros multiplos de 3: " + count3);

    //5
        boolean todosPositivos = true;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            int num3 = new Scanner(System.in).nextInt();
            if (num3 <= 0) {
                todosPositivos = false;
                break;
            }
        }
        if (todosPositivos) {
            System.out.println("Todos os numeros são positivos.");
        } else {
            System.out.println("Nem todos os numeros são positivos.");
        }

        //6
        int[] numeros = new int[10];
        boolean repetido = false;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                }
            }
        }
        if (repetido) {
            System.out.println("Ha numeros repetidos.");
        } else {
            System.out.println("Nao ha numeros repetidos.");
        }

        //7
        int[] numeros2 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros2[i] = new Scanner(System.in).nextInt();
        }
        int primeiroNumero = numeros2[0];
        int count4 = 0;
        for (int i = 1; i < 10; i++) {
            if (numeros2[i] == primeiroNumero) {
                count4++;
            }
        }
        System.out.println("Quantidade de numeros iguais ao primeiro: " + count4);

        //8
        int[] numeros3 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros3[i] = new Scanner(System.in).nextInt();
        }
        int maior = numeros3[0];
        int menor = numeros3[0];
        for (int i = 1; i < 10; i++) {
            if (numeros3[i] > maior) {
                maior = numeros3[i];
            }
            if (numeros3[i] < menor) {
                menor = numeros3[i];
            }
        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);   

        //9
        int[] numeros4 = new int[10];
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros4[i] = new Scanner(System.in).nextInt();
            soma += numeros4[i];
        }
        double media = soma / 10.0;
        int count5 = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros4[i] > media) {
                count5++;
            }
        }
        System.out.println("Quantidade de numeros acima da media: " + count5);

        //10
        int[] numeros5 = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero  : ");
            numeros5[i] = new Scanner(System.in).nextInt();
        }
        boolean palindromo = true;
        for (int i = 0; i < 4; i++) {
            if (numeros5[i] != numeros5[7 - i]) {
                palindromo = false;
                break;
            }
        }
        if (palindromo) {
            System.out.println("O vetor é um palindromo.");
        } else {
            System.out.println("O vetor nao é um palindromo.");
        } 

        //11 
        int[] numeros6 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros6[i] = new Scanner(System.in).nextInt();
        }
        int menorValor = numeros6[0];
        int posicaoMenor = 0;
        for (int i = 1; i < 10; i++) {
            if (numeros6[i] < menorValor) {
                menorValor = numeros6[i];
                posicaoMenor = i;
            }
        }
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao do menor valor: " + posicaoMenor); 

    }
}
