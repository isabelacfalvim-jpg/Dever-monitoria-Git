import java.util.Scanner;

public class java4 {
    public static void main (String [] args)    {
    Scanner scanner = new Scanner(System.in);

    // QUESTOES FACEIS
    //1 
    System.out.println("Escreva um numero inteiro: ");
    int num1 = scanner.nextInt();
    if (num1 % 2 == 0) {
        System.out.println("O numero é par");
    } else {
        System.out.println("O numero é impar");
    }

    //2
    System.out.println("Escreva dois numeros inteiros: ");
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();
    if (num2 > num3) {
        System.out.println("O numero " + num2 + " é maior que " + num3);
    } else if (num3 > num2) {
        System.out.println("O numero " + num3 + " é maior que " + num2);

    //3
    System.out.println("Escreva tres numeros inteiros: ");
    int num4 = scanner.nextInt();
    int num5 = scanner.nextInt();
    int num6 = scanner.nextInt();
    System.out.println(num4+num5+num6/3); 

    //4
    System.out.println("Escreva um numero inteiro: ");
    int num7 = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
        System.out.println(num7 + " x " + i + " = " + (num7 * i));
    }

    //5
    System.out.println("Escreva um numero inteiro: ");
    int num8 = scanner.nextInt();
    for (int j = 1; j <= num8; j++) {
        System.out.println(j);
    }

    //6 
    System.out.println("Escreva um numero inteiro: ");
    int num9 = scanner.nextInt();
    for (int k = num9; k >= 0; k--) {
        System.out.println(k);
    }
}
    //7
    System.out.println("Escreva um numero inteiro: ");
    int num10 = scanner.nextInt();
    int num11 = scanner.nextInt();
    int num12 = scanner.nextInt();
    int num13 = scanner.nextInt();
    int num14 = scanner.nextInt();
    System.out.println(num10+num11+num12+num13+num14);

    //8 
    System.out.println("Escreva um numero inteiro: ");
    int num15 = scanner.nextInt();
    int num16 = scanner.nextInt();
    int num17 = scanner.nextInt();
    int num18 = scanner.nextInt();
    int num19 = scanner.nextInt();
    int maior = num15;
    if (num16 > maior) {
        maior = num16;
    }
    if (num17 > maior) {
        maior = num17;
    }
    if (num18 > maior) {
        maior = num18;
    }
    if (num19 > maior) {
        maior = num19;
    }
    System.out.println("O maior numero é: " + maior);

    //9 
    System.out.println("Escreva um numero inteiro: ");
    int num20 = scanner.nextInt();
    int num21 = scanner.nextInt();
    int num22 = scanner.nextInt();
    int num23 = scanner.nextInt();
    int num24 = scanner.nextInt();
    int menor = num20;
    if (num21 < menor) {
        menor = num21; 
    }
    if (num22 < menor) {
        menor = num22;
    }
    if (num23 < menor) {
        menor = num23;
    }
    if (num24 < menor) {
        menor = num24;
    }
    System.out.println("O menor numero é: " + menor);

    //10 
    System.out.println("Escreva um numero inteiro: ");
    int num25 = scanner.nextInt();
    int num26 = scanner.nextInt();
    int num27 = scanner.nextInt();
    int num28 = scanner.nextInt();
    int num29 = scanner.nextInt();
    int countPositivos = 0;
    if (num25 > 0) {
        countPositivos++;
    }
    if (num26 > 0) {
        countPositivos++;
    }
    if (num27 > 0) {
        countPositivos++;
    }
    if (num28 > 0) {
        countPositivos++;
    }
    if (num29 > 0) {
        countPositivos++;
    }
    System.out.println("Quantidade de numeros positivos: " + countPositivos);

    //11 
    System.out.println("Escreva 10 numeros inteiros: ");
    int[] numeros = new int[10];
    for (int i = 0; i < 10; i++) {
        numeros[i] = scanner.nextInt();
    }
    System.out.println("Numeros pares: ");
    for (int i = 0; i < 10; i++) {
        if (numeros[i] % 2 == 0) {
            System.out.println(numeros[i]);
        }
    }

    //12 
    System.out.println("Escreva um numero inteiro: ");
    int num30 = scanner.nextInt();
    if (num30 % 5 == 0) {
        System.out.println("O numero é multiplo de 5");
    } else {
        System.out.println("O numero não é multiplo de 5");
    }

    //13 
    System.out.println("Escreva dois numeros inteiros: ");
    int num31 = scanner.nextInt();
    int num32 = scanner.nextInt();
    System.out.println("Adição: " + (num31 + num32));
    System.out.println("Subtração: " + (num31 - num32));
    System.out.println("Multiplicação: " + (num31 * num32));
    if (num32 != 0) {
        System.out.println("Divisão: " + (num31 / num32));
    } else {
        System.out.println("Divisão: Não é possível dividir por zero");
    }   

    //14 
    System.out.println("Escreva a idade: ");
    int idade = scanner.nextInt();
    if (idade >= 0 && idade <= 12) {
        System.out.println("Categoria: Criança");
    } else if (idade >= 13 && idade <= 18) {
        System.out.println("Categoria: Adolescente");
    } else if (idade >= 19) {
        System.out.println("Categoria: Adulto");
    } else {
        System.out.println("Idade inválida");
    }

    //15 
    System.out.println("Escreva um numero inteiro: ");
    int num33 = scanner.nextInt();
    if (num33 >= 10 && num33 <= 50) {
        System.out.println("O numero está entre 10 e 50");
    } else {
        System.out.println("O numero não está entre 10 e 50");
    }

    //16 
    System.out.println("Escreva 5 numeros inteiros: ");
    int[] vetor = new int[5];
    for (int i = 0; i < 5; i++) {
        vetor[i] = scanner.nextInt();
    }
    System.out.println("Valores do vetor: ");
    for (int i = 0; i < 5; i++) {
        System.out.println(vetor[i]);
    }

    //17 
    System.out.println("Escreva 5 numeros inteiros: ");
    int[] vetor2 = new int[5];
    for (int i = 0; i < 5; i++) {
        vetor2[i] = scanner.nextInt();
    }
    int soma = 0;
    for (int i = 0; i < 5; i++) {
        soma += vetor2[i];
    }
    double media = (double) soma / 5;
    System.out.println("A média é: " + media);

    //18 
    System.out.println("Escreva 5 numeros inteiros: ");
    int[] vetor3 = new int[5];
    for (int i = 0; i < 5; i++) {
        vetor3[i] = scanner.nextInt();
    }
    int countMaiores100 = 0;
    for (int i = 0; i < 5; i++) {
        if (vetor3[i] > 100) {
            countMaiores100++;
        }
    }
    System.out.println("Quantidade de numeros maiores que 100: " + countMaiores100);
    
    //19 
    System.out.println("Escreva 5 numeros inteiros: ");
    int[] vetor4 = new int[5];
    for (int i = 0; i < 5; i++) {
        vetor4[i] = scanner.nextInt();
    }
    for (int i = 0; i < 5; i++) {
        if (vetor4[i] < 0) {
            vetor4[i] = 0;
        }
    }
    System.out.println("Vetor atualizado: ");
    for (int i = 0; i < 5; i++) {
        System.out.println(vetor4[i]);
    }

    //20 
    System.out.println("Escreva um numero inteiro: ");
    int num34 = scanner.nextInt();
    int dobro = calcularDobro(num34);
    System.out.println("O dobro de " + num34 + " é: " + dobro);
    }   
    public static int calcularDobro(int numero) {
        return numero * 2;
    }
}
