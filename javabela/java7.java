import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.Media;
public class java7 {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);

//61 
    double[] notas = new double[10];
    double soma = 0;
    int aprovados = 0;
    double maiorNota = 0;
        for (int i = 0; i < 10; i++) {
    System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
    notas[i] = sc.nextDouble();
    soma += notas[i];
        if (notas[i] > 6) {
            aprovados++;
    }
        if (i == 0 || notas[i] > maiorNota) {
        maiorNota = notas[i];
    }
    double Media = sc.nextDouble();
    Media = soma / 10;
}
    System.out.println("\n--- Resultados ---");
    System.out.println("Quantidade de aprovados: " + aprovados);
    System.out.println("Média da turma: " + Media);
    System.out.printf("Maior nota: %.2f\n", maiorNota);

//62 
    int totalAlunos = 10;
    double[] Notas = new double[totalAlunos];
    int[] presencas = new int[totalAlunos];
    double somaNotas = 0;
    int totalPresencas = 0;
    int falta =0; 
    double mediadaTurma = somaNotas / totalAlunos;
    int Falta = totalAlunos;
        for (int i = 0; i < 10; i++) {
        System.out.println("--- Aluno " + (i + 1) + " ---");
        System.out.print("Nota: ");
    notas[i] = sc.nextDouble();
    somaNotas += Notas[i];
        
        System.out.print("Presença (1-Sim / 0-Não): ");
    presencas[i] = sc.nextInt();
        if (presencas[i] == 1) totalPresencas++;
    }
    double mediaTurma = somaNotas / totalAlunos;
    int faltas = totalAlunos - totalPresencas;
    double percPresenca = ((double) totalPresencas / totalAlunos) * 100;
        System.out.println("Média Geral da Turma: " + mediaTurma);
        System.out.println("Total de Presenças: " + totalPresencas);
        System.out.println("Total de Faltas: " + faltas);
        System.out.println("Taxa de Frequência: " + percPresenca + "%");

//63
    int lampA = 0;
    int lampB = 0;
    System.out.print("Quantidade de vezes (N): ");
    Scanner Scanner = new Scanner(System.in);
    int n = Scanner.nextInt();
    int[] interruptores = new int[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Interruptor " + (i + 1) + " (1 ou 2): ");
        interruptores[i] = Scanner.nextInt();
        if (interruptores[i] == 1) {
            lampA = (lampA == 0) ? 1 : 0;
        } else if (interruptores[i] == 2) {
            lampA = (lampA == 0) ? 1 : 0;
            lampB = (lampB == 0) ? 1 : 0;
        }
    }
    System.out.println("\nEstado final:");
    System.out.println(lampA);
    System.out.println(lampB);

//64 
    System.out.print("Digite o valor de A: ");
    int A = sc.nextInt();
    System.out.print("Digite o valor de B: ");
    int B = sc.nextInt();
    int mediaInteira = (A + B) / 2;
    System.out.println("A média inteira entre " + A + " e " + B + " é: " + mediaInteira);

//65
    int N = sc.nextInt();
    int Soma = 0;
    int dias = 0;
        for (int i = 0; i < N; i++) {
    int acessos = sc.nextInt();
    Soma += acessos;
        dias++;
    if (soma >= 1000000) {
            break;
        }
    }
    System.out.println(dias);

//66 
int[] tamanhoSequencia = new int[N];
    for (int i = 0; i < N; i++) {
        tamanhoSequencia[i] = sc.nextInt();
        }
int cont = 0;
    for (int i = 0; i < N - 2; i++) {
    if (tamanhoSequencia[i] == 1 && tamanhoSequencia[i + 1] == 0 && tamanhoSequencia[i + 2] == 0) {
            cont++;
        }
    }
    System.out.println(cont);

//67
    int numeroInteiro = sc.nextInt();
    int a = 1, b = 1, c = 1;
        if (numeroInteiro == 0 || numeroInteiro == 1) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= numeroInteiro; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }

//68
    int valores = sc.nextInt();
    int[] v = new int[N];
    for (int i = 0; i < valores; i++) {
            v[i] = sc.nextInt();
        }
    int atual = 1;
    int maior = 1;
    for (int i = 1; i < N; i++) {
        if (v[i] == v[i - 1]) {
            atual++;
        } else {
            atual = 1;
        }
        if (atual > maior) {
            maior = atual;
            }
        }
    System.out.println(maior);

//69 
    double R = sc.nextDouble();
    double area = 3.1416 * R * R;
    System.out.printf("%.2f\n", area);

//70
    int elementos = sc.nextInt();
    int[] num = new int[N];
    for (int i = 0; i < elementos; i++) {
        num[i] = sc.nextInt();
    }
        Arrays.sort(num);
    for (int i = 0; i < elementos; i++) {
    System.out.print(num[i] + " ");
    }

    sc.close();
    }
}
