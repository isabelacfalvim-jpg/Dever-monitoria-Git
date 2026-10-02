import java.util.Scanner; 
public class java6 {
    public static void main (String [] args ) {
        Scanner scanner = new Scanner(System.in);
    
//41 
        int [] vetor = new int [5];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

//42 
        int [] vetor2 = new int [5];
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Digite um número: ");
            vetor2[i] = scanner.nextInt();
        }
        int [] pares = new int [vetor2.length];
        int [] impares = new int [vetor2.length];
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] % 2 == 0) {
                pares[quantidadePares] = vetor2[i];
                quantidadePares++;
            } else {
                impares[quantidadeImpares] = vetor2[i];
                quantidadeImpares++;
            }
        }
        System.out.println("Números pares: ");
        for (int i = 0; i < quantidadePares; i++) {
            System.out.println(pares[i]);
        }
        System.out.println("Números ímpares: ");
        for (int i = 0; i < quantidadeImpares; i++) {
            System.out.println(impares[i]);
        }

//43
        int [][] matriz = new int [3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite um número: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        boolean simetrica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) {
                break;
            }   
        }
        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }   

//44 
        int [][] matriz2 = new int [3][3];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("Digite um número: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz2.length; i++) {
            somaDiagonalPrincipal += matriz2[i][i];
            somaDiagonalSecundaria += matriz2[i][matriz2.length - 1 - i];
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

//45 
        int [] vetor3 = new int [10];
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println("Digite um número: ");
            vetor3[i] = scanner.nextInt();
        }
        int numeroMaisFrequente = vetor3[0];
        int frequenciaMaisAlta = 1;
        for (int i = 0; i < vetor3.length; i++) {
            int frequenciaAtual = 1;
            for (int j = i + 1; j < vetor3.length; j++) {
                if (vetor3[i] == vetor3[j]) {
                    frequenciaAtual++;
                }
            }
            if (frequenciaAtual > frequenciaMaisAlta) {
                numeroMaisFrequente = vetor3[i];
                frequenciaMaisAlta = frequenciaAtual;
            }
        }
System.out.println("O número mais frequente é: " + numeroMaisFrequente + " com frequência de: " + frequenciaMaisAlta);

//46
        int [] vetor4 = new int [10];
        for (int i = 0; i < vetor4.length; i++) {
            System.out.println("Digite um número: "); 
            vetor4[i] = scanner.nextInt();
        }
        System.out.println("Digite o valor de x: ");    
        int x = scanner.nextInt();
        System.out.println("Pares que somam " + x + ": ");
        for (int i = 0; i < vetor4.length; i++) {
            for (int j = i + 1; j < vetor4.length; j++) {
                if (vetor4[i] + vetor4[j] == x) {
                    System.out.println(vetor4[i] + " + " + vetor4[j] + " = " + x);
                }
            }
        }   

//47 
        int [] vetor5 = new int [5];
        for (int i = 0; i < vetor5.length; i++) {   
            System.out.println("Digite um número: ");
            vetor5[i] = scanner.nextInt();
        }
        int ultimoElemento = vetor5[vetor5.length - 1];
        for (int i = vetor5.length - 1; i > 0; i--) {
            vetor5[i] = vetor5[i - 1];
        }
        vetor5[0] = ultimoElemento;
        System.out.println("Vetor rotacionado para a direita: ");
        for (int i = 0; i < vetor5.length; i++) {
            System.out.println(vetor5[i]);
        }

//48
        int [] vetor6 = new int [5];
        for (int i = 0; i < vetor6.length; i++) {   
            System.out.println("Digite um número: ");
            vetor6[i] = scanner.nextInt();
        }
        boolean palindromo = true;
        for (int i = 0; i < vetor6.length / 2; i++) {
            if (vetor6[i] != vetor6[vetor6.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }
        if (palindromo) {   
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor não é um palíndromo.");
        }

//49 
        int [][] matriz3 = new int [3][3];
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.println("Digite um número: ");
                matriz3[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Digite o número para multiplicar a matriz: ");
        int multiplicador = scanner.nextInt();
        int [][] matrizMultiplicada = new int [3][3];
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                matrizMultiplicada[i][j] = matriz3[i][j] * multiplicador;
            }
        }
        System.out.println("Matriz multiplicada: ");
        for (int i = 0; i < matrizMultiplicada.length; i++) {
            for (int j = 0; j < matrizMultiplicada[i].length; j++) {
                System.out.print(matrizMultiplicada[i][j] + " ");
            }
            System.out.println();
        }  

//50
        int [] vetor7 = new int [5];
        int [] vetor8 = new int [5];
        System.out.println("Digite os elementos do primeiro vetor: ");
        for (int i = 0; i < vetor7.length; i++) {
            vetor7[i] = scanner.nextInt();  
        }
        System.out.println("Digite os elementos do segundo vetor: ");
        for (int i = 0; i < vetor8.length; i++) {
            vetor8[i] = scanner.nextInt();
        }
        boolean vetoresIguais = true;
        for (int i = 0; i < vetor7.length; i++) {
            if (vetor7[i] != vetor8[i]) {
                vetoresIguais = false;
                break;
            }  
        }
        if (vetoresIguais) {
            System.out.println("Os vetores são iguais.");
        } else {    
            System.out.println("Os vetores são diferentes.");
        }

//51 leia uma matriz e conte os numeros positivos 
        int [][] matriz4 = new int [3][3];
        for (int i = 0; i < matriz4.length; i++) {  
            for (int j = 0; j < matriz4[i].length; j++) {
                System.out.println("Digite um número: ");
                matriz4[i][j] = scanner.nextInt();
            }
        }
        int quantidadePositivos = 0;
        for (int i = 0; i < matriz4.length; i++) {
            for (int j = 0; j < matriz4[i].length; j++) {
                if (matriz4[i][j] > 0) {
                    quantidadePositivos++;
                }   
            }
        }
System.out.println("Quantidade de números positivos na matriz: " + quantidadePositivos);

//52  
        int [] vetor9 = new int [10];
        for (int i = 0; i < vetor9.length; i++) {
            System.out.println("Digite um número: ");  
            vetor9[i] = scanner.nextInt();
        }
        int inicioSequencia = 0;
        int fimSequencia = 0;
        int maiorInicio = 0;
        int maiorFim = 0;
        for (int i = 1; i < vetor9.length; i++) {
            if (vetor9[i] > vetor9[i - 1]) {
                fimSequencia = i;
            } else {
                if (fimSequencia - inicioSequencia > maiorFim - maiorInicio) {
                    maiorInicio = inicioSequencia;
                    maiorFim = fimSequencia;
                }
                inicioSequencia = i;
                fimSequencia = i;
            }
        }  
        if (fimSequencia - inicioSequencia > maiorFim - maiorInicio) {
            maiorInicio = inicioSequencia;
            maiorFim = fimSequencia;
        }
        System.out.println("Maior sequência crescente: ");
        for (int i = maiorInicio; i <= maiorFim; i++) {
            System.out.println(vetor9[i]);
        }

//53 
        int [] vetor10 = new int [10];
        for (int i = 0; i < vetor10.length; i++) {  
            System.out.println("Digite um número: ");
            vetor10[i] = scanner.nextInt();
        }
        System.out.println("Digite o valor a ser removido: ");
        int valorRemover = scanner.nextInt();
        int quantidadeRemovidos = 0;
        for (int i = 0; i < vetor10.length; i++) {  
            if (vetor10[i] == valorRemover) {
                quantidadeRemovidos++;
            } else {
                vetor10[i - quantidadeRemovidos] = vetor10[i];
            }
        }
        System.out.println("Vetor após remoção: ");
        for (int i = 0; i < vetor10.length - quantidadeRemovidos; i++) {
            System.out.println(vetor10[i]);
        }   

//54 
        int [] vetor11 = new int [10];
        for (int i = 0; i < vetor11.length; i++) {  
            System.out.println("Digite um número: ");
            vetor11[i] = scanner.nextInt();
        }
        int quantidadeZeros = 0;
        for (int i = 0; i < vetor11.length; i++) {
            if (vetor11[i] == 0) {
                quantidadeZeros++;
            } else {
                vetor11[i - quantidadeZeros] = vetor11[i];
            }
        }
        System.out.println("Vetor compactado (sem zeros): ");
        for (int i = 0; i < vetor11.length - quantidadeZeros; i++) {
            System.out.println(vetor11[i]);
        } 

//55 
        int [][] matriz5 = new int [3][3];
        for (int i = 0; i < matriz5.length; i++) {
            for (int j = 0; j < matriz5[i].length; j++) {
                System.out.println("Digite um número: ");
                matriz5[i][j] = scanner.nextInt();
            }
        }
        int [][] matrizTransposta = new int [3][3];
        for (int i = 0; i < matriz5.length; i++) {
            for (int j = 0; j < matriz5[i].length; j++) {
                matrizTransposta[j][i] = matriz5[i][j];
            }
        }
        System.out.println("Matriz transposta: ");
        for (int i = 0; i < matrizTransposta.length; i++) { 
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }

//56 
        int [][] matriz6 = new int [3][3];
        for (int i = 0; i < matriz6.length; i++) {
            for (int j = 0; j < matriz6[i].length; j++) {
                System.out.println("Digite um número: ");
                matriz6[i][j] = scanner.nextInt();
            }
        }
        boolean identidade = true;  
        for (int i = 0; i < matriz6.length; i++) {
        for (int j = 0; j < matriz6[i].length; j++) {
        if ((i == j && matriz6[i][j] != 1) || (i != j && matriz6[i][j] != 0)) {
            identidade = false;
                break;
            }
        }
        if (!identidade) {
            break;
            }
        }
        if (identidade) {
            System.out.println("A matriz é identidade.");
        } else {
            System.out.println("A matriz não é identidade.");
        }

//57 
        int [] vetor12 = new int [10];
        for (int i = 0; i < vetor12.length; i++) {
            System.out.println("Digite um número: ");
            vetor12[i] = scanner.nextInt();
        }
        int [] diferencas = new int [vetor12.length - 1];
        for (int i = 0; i < diferencas.length; i++) {
            diferencas[i] = vetor12[i + 1] - vetor12[i];
        }
        System.out.println("Diferenças consecutivas: ");
        for (int i = 0; i < diferencas.length; i++) {
            System.out.println(diferencas[i]);  
        }   

//58 
        int [] vetor13 = new int [10];
        for (int i = 0; i < vetor13.length; i++) {
            System.out.println("Digite um número: ");
            vetor13[i] = scanner.nextInt();
        }
        int segundoMaior = scanner.nextInt();
        int maior = scanner.nextInt();
        for (int i = 0; i < vetor13.length; i++) {
            if (vetor13[i] > maior) {
                segundoMaior = maior;
                maior = vetor13[i];
            } else if (vetor13[i] > segundoMaior && vetor13[i] != maior) {
                segundoMaior = vetor13[i];
            }
        }
        if (segundoMaior == scanner.nextInt()) {    
            System.out.println("Não há segundo maior valor.");
        } else {
            System.out.println("O segundo maior valor é: " + segundoMaior);
        }

//59 
        int [] vetor14 = new int [10];
        for (int i = 0; i < vetor14.length; i++) {
            System.out.println("Digite um número: ");
            vetor14[i] = scanner.nextInt(); 
        }
        for (int i = 0; i < vetor14.length; i++) {
            for (int j = 0; j < vetor14.length - 1; j++) {
                if (vetor14[j] > vetor14[j + 1]) {
                    int temp = vetor14[j];
                    vetor14[j] = vetor14[j + 1];
                    vetor14[j + 1] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < vetor14.length; i++) {
            System.out.println(vetor14[i]);
        }

//60
        int [][] matriz7 = new int [3][3];
        for (int i = 0; i < matriz7.length; i++) {
            for (int j = 0; j < matriz7[i].length; j++) {
                System.out.println("Digite um número: ");
                matriz7[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Menor valor por linha: ");
        for (int i = 0; i < matriz7.length; i++) {
            int menorValor = matriz7[i][0];
            for (int j = 1; j < matriz7[i].length; j++) {
                if (matriz7[i][j] < menorValor) {   
                    menorValor = matriz7[i][j];
                }
            }
            System.out.println("Linha " + i + ": " + menorValor);
        }   

        scanner.close();
    }
}