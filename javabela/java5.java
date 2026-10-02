import java.util.Scanner;
public class java5 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
    
        //21 
        System.out.println("Escreva 10 numeros inteiros: ");
        int somaPares = 0;
        int quantidadePares = 0;
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                somaPares += numero;
                quantidadePares++;
            }
        }
        if (quantidadePares > 0) {
            double mediaPares = (double) somaPares / quantidadePares;
            System.out.println("A média dos números pares é: " + mediaPares);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

    //22 
        System.out.println("Escreva 10 numeros inteiros: ");
        int maiorValor = scanner.nextInt();
        int posicaoMaiorValor = 0;
        for (int i = 1; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero > maiorValor) {
                maiorValor = numero;
                posicaoMaiorValor = i;
            }
        }
        System.out.println("O maior valor é: " + maiorValor + " e sua posição é: " + posicaoMaiorValor);

    //23 
        System.out.println("Escreva 10 numeros inteiros: ");
        int primeiroNumero = scanner.nextInt();
        int quantidadeIguais = 0;
        for (int i = 1; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero == primeiroNumero) {
                quantidadeIguais++;
            }
        }
        System.out.println("A quantidade de números iguais ao primeiro é: " + quantidadeIguais);

    //24 
        System.out.println("Escreva 5 numeros inteiros: ");
        int[] vetor = new int[5];
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Vetor invertido: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

    //25 
        System.out.println("Escreva 10 numeros inteiros: ");
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }
        boolean temRepetidos = false;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numeros[i] == numeros[j]) {
                    temRepetidos = true;
                    break;
                }
            }
            if (temRepetidos) {
                break;
            }
        }
        if (temRepetidos) {
            System.out.println("Há números repetidos.");
        } else {
            System.out.println("Não há números repetidos.");
        }
    
    //26 
        System.out.println("Escreva 10 numeros inteiros: ");
        int quantidadePar = 0;
        int quantidadeImpares = 0;
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                quantidadePar++;
            } else {
                quantidadeImpares++;
            }
        }
        System.out.println("Quantidade de números pares: " + quantidadePar);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
        
    //27
        System.out.println("Escreva 10 numeros inteiros: ");
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }
        // aqui eu usei o método de bolha
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println("Números em ordem crescente: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }

    //28
        System.out.println("Escreva os elementos de uma matriz 3x3: ");
        int[][] matriz = new int[3][3];
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }
        System.out.println("A soma dos elementos da matriz é: " + soma);

    //29 
        System.out.println("Escreva os elementos de uma matriz 3x3: ");
        int[][] matriz2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Diagonal principal da matriz: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz2[i][i]);
        }
    
    //30 
        System.out.println("Escreva 10 numeros inteiros: ");
        int somaImpares = 0;
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 != 0) {
                somaImpares += numero;
            }
        }
        System.out.println("A soma dos números ímpares é: " + somaImpares);

    //31 
        System.out.println("Escreva 10 numeros inteiros: ");
        int[] numeros2 = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros2[i] = scanner.nextInt();
        }
        boolean estaCrescente = true;
        for (int i = 1; i < 10; i++) {
            if (numeros2[i] < numeros2[i - 1]) {
                estaCrescente = false;
                break;
            }
        }
        if (estaCrescente) {
            System.out.println("Os números estão em ordem crescente.");
        } else {
            System.out.println("Os números não estão em ordem crescente.");
        }

    //32 
    System.out.print("Digite o 1º número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = scanner.nextInt();
        int maior, segundo;
        if (n1 > n2) {
            maior = n1;
            segundo = n2;
        } else {
            maior = n2;
            segundo = n1;
        }
        for (int i = 3; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int atual = scanner.nextInt();

            if (atual > maior) {
                segundo = maior; 
                maior = atual;   
            } else if (atual > segundo) {
                segundo = atual; 
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O segundo maior é: " + segundo);

    //33
    System.out.println("Escreva 10 numeros inteiros: ");
        int[] numeros3 = new int[10];
        int soma3 = 0;
        for (int i = 0; i < 10; i++) {
            numeros3[i] = scanner.nextInt();
            soma3 += numeros3[i];
        }
        double media3 = (double) soma3 / 10;
        int countMaioresMedia = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros3[i] > media3) {
                countMaioresMedia++;
            }
        }
        System.out.println("Quantidade de números maiores que a média: " + countMaioresMedia);

    //34
    System.out.println("Escreva 5 numeros inteiros para o primeiro vetor: ");
        int[] vetorA = new int[5];
        for (int i = 0; i < 5; i++) {
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Escreva 5 numeros inteiros para o segundo vetor: ");
        int[] vetorB = new int[5];
        for (int i = 0; i < 5; i++) {
            vetorB[i] = scanner.nextInt();
        }
        int[] somaVetores = new int[5];
        for (int i = 0; i < 5; i++) {
            somaVetores[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("Soma dos vetores: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(somaVetores[i]);
        }

    //35 
    System.out.println("Escreva os elementos de uma matriz 3x3: ");
        int[][] matriz3 = new int[3][3];
        int maiorValorMatriz = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3[i][j] = scanner.nextInt();
                if (matriz3[i][j] > maiorValorMatriz) {
                    maiorValorMatriz = matriz3[i][j];
                }
            }
        }
        System.out.println("O maior valor da matriz é: " + maiorValorMatriz);

    //36
    System.out.println("Escreva 10 numeros inteiros: ");
        int[] vetor5 = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor5[i] = scanner.nextInt();
        }
        int[] vetorSemDuplicados = new int[10];
        int n = 0;
        for (int i = 0; i < 10; i++) {
            boolean encontrado = false;
            for (int j = 0; j < n; j++) {
                if (vetor5[i] == vetorSemDuplicados[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                vetorSemDuplicados[n] = vetor5[i];
                n++;
            }
        }
        System.out.println("Vetor sem duplicados: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorSemDuplicados[i]);
        }

    //37
    int Maior = vetor[0]; 
    for (int i = 1; i < vetor.length; i++) {
        if (vetor[i] > Maior) {
            Maior = vetor[i]; 
        }
    System.out.println("O maior número do vetor é: " + Maior);}
    }

    //38 
    public static double calcularMedia(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return (double) soma / vetor.length;
    }

    //39
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escreva 10 numeros intiros : ");
        int[] vetor6 = new int[10];
        for (int k = 0; k < 10; k++) {
            vetor6[k] = scanner.nextInt();
        }
        for (int k = 0; k < 10; k++) {
            if (vetor6[k] % 2 == 0) {
                vetor6[k] = -1;
            }
        }
        System.out.println("Vetor atualizado: ");
        for (int k = 0; k < 10; k++) {
            System.out.println(vetor6[k]);
        }

    //40 
    System.out.println("Escreva 10 numeros inteiros: ");
        int[] vetor7 = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor7[i] = scanner.nextInt();
        }
        System.out.print("Digite o valor a ser contado: ");
        int valorContar = scanner.nextInt();
        int countValor = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor7[i] == valorContar) {
                countValor++;
            }
        }
        System.out.println("O valor " + valorContar + " aparece " + countValor + " vezes no vetor.");
    
        scanner.close();
    }
}