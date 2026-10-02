import java.util.Scanner;
public class java3 {
    public static void main (String []args ){
    
        Scanner sc = new Scanner(System.in);

    //12
    int[] numeros = new int[10];
    int[]resultado = new int[10];
    int pos = 0;
    for (int i = 0; i<10; i++){
        System.out.println("Digite o " + (i+1) + "º numero: ");
        numeros[i] = sc.nextInt();}
    for (int i = 0; i<10; i++){
        if (numeros[i] % 2 == 0){
            resultado[pos] = numeros[i];
            pos++;
        }
    }
        System.out.println("Numeros reorganizados: ");  
    for (int i = 0; i<10; i++){
        if (numeros [i] % 2 != 0){
            resultado[pos] = numeros[i];
            pos++;
            }
        }
        System.out.println("Numeros reorganizados: ");
        for (int i = 0; i<10; i++){
            System.out.println(resultado[i]+" ");
        }

    //13 
    int[] numeros2 = new int[10];
    int[] ctg = new int[10];
    for (int i = 0; i<10; i++){
        System.out.println("Digite o " + (i+1) + "º numero: ");
        numeros2[i] = sc.nextInt();
    }
    for (int i = 0; i<10; i++){
        for (int j = 0; j<10; j++){
            if (numeros2[i] == numeros2[j]){
                ctg[i]++;
            }
        }
    }
    int maisRepetido = numeros2[0];
    int maxContagem = ctg[0];
    for (int i = 1; i<10; i++){
        if (ctg[i] > maxContagem){
            maxContagem = ctg[i];
            maisRepetido = numeros2[i];
        }
    }
    System.out.println("O numero mais repetido é: " + maisRepetido + " com " + maxContagem + " repetições.");   

    //14 
    int[] numeros3 = new int[10];
    int[] somaAnterior = new int[10];
    for (int i = 0; i<10; i++){
        System.out.println("Digite o " + (i+1) + "º numero: ");
        numeros3[i] = sc.nextInt();
    }
    somaAnterior[0] = numeros3[0];
    for (int i = 1; i<10; i++){
        somaAnterior[i] = numeros3[i] + numeros3[i-1];
    }
    System.out.println("Vetor com a soma do elemento atual com o anterior: ");
    for (int i = 0; i<10; i++){
        System.out.println(somaAnterior[i]+" ");
    }

    //15 
    int[] numeros4 = new int[10];
    for (int i = 0; i<10; i++){
        System.out.println("Digite o " + (i+1) + "º numero: ");
        numeros4[i] = sc.nextInt();
    }
    boolean sequenciaCrescente = false;
    int ct = 1;
    for (int i = 1; i<10; i++){
        if (numeros4[i] > numeros4[i-1]){
            ct++;
            if (ct >= 3){
                sequenciaCrescente = true;
                break;
            }
        } else {
            ct = 1;
        }
    }
    if (sequenciaCrescente){
        System.out.println("Há uma sequência crescente de pelo menos 3 números consecutivos.");
    } else {
        System.out.println("Não há uma sequência crescente de pelo menos 3 números consecutivos.");
    }

    //16 leia 10 numeros e encontre os pares de elementos cuja soma seja igual a um valor x informado pelo usuario
    int[] numeros5 = new int[10];
    System.out.println("Digite o valor de x: ");
    int x = sc.nextInt();
    for (int i = 0; i<10; i++){
        System.out.println("Digite o " + (i+1) + "º numero: ");
        numeros5[i] = sc.nextInt();
    }
    System.out.println("Pares de elementos cuja soma é igual a " + x + ": ");
    for (int i = 0; i<10; i++){
        for (int j = i+1; j<10; j++){
            if (numeros5[i] + numeros5[j] == x){
                System.out.println(numeros5[i] + " + " + numeros5[j] + " = " + x);
            }
        }
    }

//Desafios

    //17
    int acima_80 = 0;
    int aumentos = 0;
    int maior_queda = 0;
    System.out.println("Digite a 1ª temperatura:");
    int anterior = sc.nextInt();
    if (anterior > 80){
        acima_80++; 
    }
    for (int i = 2; i<=10; i++){
        System.out.println("Digite a " + i + "ª temperatura:");
        int atual = sc.nextInt();
        if (atual > 80){
            acima_80++;
        }
        if (atual > anterior){
            aumentos++;
        }
        int queda = anterior - atual;
        if (queda > maior_queda){
            maior_queda = queda;
        }
        anterior = atual;
    }
    System.out.println("Número de temp. acima de 80: " + acima_80);
    System.out.println("Número de aumentos : " + aumentos);
    System.out.println("Maior queda: " + maior_queda);

    //18
    double [] compras = new double[10];
    int acima100 = 0;
    double soma = 0;
    boolean sequencia = false;
    System.out.println("Digite o valor da compra:");
    double valor_compra = sc.nextDouble();
    soma += valor_compra;
    if (valor_compra > 100){
        acima100++;
    }
    for (int i = 2; i<=10; i++){
        System.out.println("Digite o valor da compra:");
        double atual = sc.nextDouble();
        if (atual > 100){
            acima100++;
        }
        if (atual < valor_compra && valor_compra < compras[i+1]){
            sequencia = true;
        }
    }
    double media = soma / 10;
    System.out.println("Número de compras acima de 100: " + acima100);
    System.out.println("Média das compras: " + media);
    if (sequencia){
        System.out.println("Existe sequência cresente.");
    } else {
        System.out.println("Não existe sequência crescente.");
    }


    //19
    int [] pontos = new int[10];
    int maior = 0;
    int recordes = 0;
    boolean quedaBrusca = false;
    for (int i = 0; i<10; i++){
        System.out.println("Digite a pontuação: ");
        pontos[i] = sc.nextInt();}
        maior = pontos[0];
        for (int i = 1; i<10; i++){
            if (pontos[i] > maior){
                maior = pontos[i];
                recordes++;
            }
            if (pontos[i-1] - pontos[i] >20){
                quedaBrusca = true;
            }
        }
        System.out.println("Maior pontuação: " + maior);
        System.out.println("Número de recordes: " + recordes);
        if (quedaBrusca){
            System.out.println("Teve queda brusca.");
        } else {
            System.out.println("Não teve queda brusca.");
        } 
        
        
        //20
        double [] saldo = new double[10];
        int diasNegativos = 0;
        double Maior = saldo [0];
        boolean sequenciaNegativa = false;
        for (int i = 0; i<10; i++){
            System.out.println("Digite o seu saldo do dia: ");
            saldo[i] = sc.nextDouble();
            if (saldo[i] < 0){
                diasNegativos++;
            }
            if (saldo[i] > Maior){
                Maior = saldo[i];
            }
        }
        for (int i = 1; i<10; i++){
            if (saldo[i] > Maior){ {
                Maior = saldo[i];}
            if (i<8){
                if (saldo[i] < 0 && saldo[i+1] < 0 && saldo[i+2] < 0){
                    sequenciaNegativa = true;
                    break;
                }
            }
            }
        System.out.println("Número de dias com saldo negativo: " + diasNegativos);
        System.out.println("Maior saldo: " + Maior);
        if (sequenciaNegativa){
            System.out.println("Existe sequência de 3 dias negativos.");
        } else {
            System.out.println("Não existe sequência de 3 dias negativos.");
        }

    sc.close();
        }
    }
}