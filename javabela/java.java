import java.util.Scanner; 

public class java {
    public static void main(String[] args) {

        //1
        System.out.printf(" Escreva tres numeros inteiros: ");
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt(); 
        int numero2 = scanner.nextInt(); 
        int numero3 = scanner.nextInt(); 
        System.out.println(numero1+numero2+numero3); 
        //2
        System.out.printf(" Escreva um numero inteiro: ");
        int numero4 = scanner.nextInt();
        System.out.println(numero4*2);
        System.out.println(numero4*3);
        System.out.println(numero4*4);
        //3
        System.out.printf(" Escreva o seu peso e a sua altura: ");
        int peso  = scanner.nextInt();
        double altura  = scanner.nextDouble();
        System.out.println(peso/(altura*altura));
        //4
        System.out.printf(" Escreva tres numeros reais: ");
        double numero5 = scanner.nextDouble();
        double numero6 = scanner.nextDouble();
        double numero7 = scanner.nextDouble();
        System.out.println(numero5*2+numero6*3+numero7*5);
        //5
        System.out.printf(" Escreva a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println(idade*365);
        //6
        System.out.printf(" Escreva o seu salário: ");
        double salario = scanner.nextDouble();
        System.out.println(salario+salario*0.15);
        //7
        System.out.printf(" Escreva um numero inteiro: ");
        int numero8 = scanner.nextInt();
        System.out.println(numero8-1);
        System.out.println(numero8+1);
        //8
        System.out.printf(" Escreva quanto você ganha por dia e quantos dias você trabalhou: ");
        double ganhoPorDia = scanner.nextDouble();
        int diasTrabalhados = scanner.nextInt();
        System.out.println(ganhoPorDia * diasTrabalhados);
        //9
        System.out.printf(" Escreva o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.println(preco-preco*0.10);
        //10
        System.out.printf(" Qual é o seu peso? ");
        double peso2 = scanner.nextDouble();
        System.out.println(peso2*2.205);

        //11
        System.out.printf(" Escreva dois numeros inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("Os numeros são iguais");
        }

        //12
        System.out.printf(" Escreva tres numeros inteiros: ");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        if (num3 > num4 && num3 > num5) {
            System.out.println(num3);
        } else if (num4 > num3 && num4 > num5) {
            System.out.println(num4);
        } else if (num5 > num3 && num5 > num4) {
            System.out.println(num5);
        } else {
            System.out.println("Os numeros são iguais");
        }

        //13
        System.out.printf(" Escreva um numero inteiro: ");
        int num6 = scanner.nextInt();
        if (num6 % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }

        //14
        System.out.printf(" Escreva a sua Altura e o seu sexo: ");
        double Altura = scanner.nextDouble();
        String sexo = scanner.next();
        if (sexo.equalsIgnoreCase("masculino")) {
            double pesoIdeal = (72.7 * Altura) - 58;
            System.out.println("O peso ideal é: " + pesoIdeal);
        } else if (sexo.equalsIgnoreCase("feminino")) {
            double pesoIdeal = (62.1 * Altura) - 44.7;
            System.out.println("O peso ideal é: " + pesoIdeal);
        } else {
            System.out.println("Sexo inválido");
        }

        //15
        System.out.printf(" Escreva um numero inteiro: ");
        int num7 = scanner.nextInt();
        if (num7 % 3 == 0 && num7 % 5 == 0) {
            System.out.println("O numero é múltiplo por 3 e por 5.");
        } else {
            System.out.println("O numero não é múltiplo por 3 nem por 5.");
        }

        //16
        System.out.print("Digite o primeiro número: ");
        int numero9 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero10 = scanner.nextInt();
        if (numero9 > 0 && numero10 > 0) {
            int resultado = numero9 * numero10;
            System.out.println("Os dois são positivos. Multiplicação: " + resultado);
        }else{
            int resultado = numero9 + numero10;
            System.out.println("Pelo menos um dos números é negativo. Soma: " + resultado);
        }

        //17
        System.out.print("Escreva o seu salário: ");
        double salário = scanner.nextDouble();
        if (salário <= 1000) {
            double aumento = salário * 0.10;
            double novoSalário = salário + aumento;
            System.out.println("Salário com aumento de 10%: " + novoSalário);
        } else {
            double aumento = salário * 0.05;
            double novoSalário = salário + aumento;
            System.out.println("Salário com aumento de 5%: " + novoSalário);
        }

        //18
        System.out.print("Escreva um número inteiro entre 1 e 7: ");
        int diaSemana = scanner.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3: 
                System.out.println("Terça-feira");
                break;
            case 4:            
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:            
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Por favor, digite um número entre 1 e 7.");
                break;  
        }

        //19
        System.out.print("Escreva tres numeros reais: ");
        double num11 = scanner.nextDouble();
        double num12 = scanner.nextDouble();
        double num13 = scanner.nextDouble();
        if (num11 > num12 && num11 > num13) {
            System.out.println("O maior número é: " + num11);
        } else if (num12 > num11 && num12 > num13) {
            System.out.println("O maior número é: " + num12);
        } else if (num13 > num11 && num13 > num12) {
            System.out.println("O maior número é: " + num13);
        } else {
            System.out.println("Os números são iguais");
        }

        //20
        System.out.print("Escreva a sua idade: ");
        int Idade = scanner.nextInt();
        if (Idade < 9) {
            System.out.println("Mirim");
        } else if (Idade >= 10 && Idade < 13) {
            System.out.println("Infantil");
        } else if (Idade >= 14 && Idade < 17) {
            System.out.println("Juvenil");
        } else {
            System.out.println("Adulto");
        }
    
    }
}  



