#Lista while
#1
contador_par = soma_par = 0
contador_impar = soma_impar = 0 
media = 0

while True: 
    numero = int(input("Digite um numero ou 0 para sair: "))
    if numero == 0: 
        break
    if numero %2 == 0: 
        contador_par = contador_par + 1
        soma_par = soma_par + numero
    else:
        contador_impar = contador_impar + 1
        soma_impar = soma_impar + numero

media = (soma_par + soma_impar) / (contador_par + contador_impar)
print("Quantidade de números digitados:" , contador_par + contador_impar)
print("Média dos números digitados:" , media)

#2
contador2 = soma2 = media2 = 0  
maior = menor = 0
maior_igual_50 = 0 

while True: 
    numero2 = float(input("Digite um numero real ou -0 para encerrar: "))
    if numero2 == 0:
        break 
    if numero2 >= 50: 
        maior_igual_50 = maior_igual_50 + 1
        
    if contador2 == 0:
        maior = numero2
        menor = numero2
    else:
        if numero2 > maior: 
            maior = numero2
        if numero2 < menor: 
            menor = numero2
    contador2 = contador2 + 1
    soma2 = soma2 + numero2
    
media2 = soma2 / contador2
print("Quantidade de números digitados:" , contador2)
print("Média dos números digitados:" , media2)
print("Maior número digitado:" , maior)
print("Menor número digitado:" , menor)
print("Quantidade de números maiores ou iguais a 50:" , maior_igual_50)

#3
contador3 = soma_votos = 0
voto_normal = voto_branco = voto_nulo = 0
while True: 
    voto = int(input("Digite o seu voto. (Voto normal: 1, 2 ou 3. Voto nulo: 5. Voto branco: 6. )"))
    
    if voto == 0: 
        break
    
    if voto == 1 or voto == 2 or voto == 3:
        print("Voto normal.")
        voto_normal = voto_normal + 1
    elif voto == 5: 
        print("Voto nulo.")
        voto_nulo = voto_nulo + 1
    elif voto == 6: 
        print("Voto branco.")
        voto_branco = voto_branco + 1
    else: 
        print("Voto inválido.")
        contador3 = contador3 + 1

soma_votos = voto_normal + voto_branco + voto_nulo
print("Quantidade de votos normais:" , voto_normal)
print("Quantidade de votos nulos:" , voto_nulo)
print("Quantidade de votos brancos:" , voto_branco)
print("Quantidade total de votos:" , soma_votos)

#4 nao fiz 

#Lista for
#1
quantidade = 0
final = int(input("Digite um valor final:"))
for i in range (1, final + 1):
    print(i)
    quantidade = quantidade + 1 

print("Quantidade de valores digitados:" , quantidade)

#2
quantidade2 = 0
inicial = int(input("Digite um valor inicial:"))

for i in range (inicial, -1, -1):
    print(i)
    quantidade2 = quantidade2 + 1

print("Quantidade de valores digitados:" , quantidade2)

#3
soma_valores = 0 
for i in range(1, 501):
    soma_valores = soma_valores + i
print("Soma total:" , soma_valores)

#4
soma_total = 0 
impar = multiplo_3 = 0

for i in range(1, 501):
    if i %2 != 0 and i %3 == 0: 
        multiplo_3 = multiplo_3 + 1

print("Quantidade de números ímpares e múltiplos de 3:" , multiplo_3)

#5 e 6
for lado_a in range(0, 7):
    for lado_b in range(0, 7):
        print(lado_a, "-", lado_b)
    print()

for lado_a in range(0, 7):
    for lado_b in range(lado_a, 7):
        print(lado_a, "-", lado_b)
    print()


#Lista def
#1
def programa( mensagem , numero):
    print("Mensagem: ", mensagem)
    print("Numero: ", numero)
    
def main(): 
    Msg = input("Digite uma mensagem: ")
    Num = int(input("Digite um número: "))
    programa(Msg, Num)
main()

#2
def calcular_numeros(x1,x2,x3):
    soma = 1+2+3
    return soma

def main():
    n1 = int(input("Digite o primeiro número: "))
    n2 = int(input("Digite o segundo número: "))
    n3 = int(input("Digite o terceiro número: "))
    print("A soma dos números é: ", calcular_numeros(n1, n2, n3))
main()

#3
def calculo_idade(nasceu_nasceu, ano_atual): 
    idade = ano_atual - nasceu_nasceu
    return idade    

def main():
    nascimento = int(input("Digite o ano de nascimento: "))
    atual = int(input("Digite o ano atual: "))
    print("A idade é: ", calculo_idade(nascimento, atual))
main()


#Lista def 2
#1
def somar(a,b):
    return a + b

def subtrair(a,b):
    return a - b

def multiplicar(a,b):
    return a * b

def dividir(a,b):
    return a / b

def main():
    num1 = float(input("Digite o primeiro número: "))
    num2 = float(input("Digite o segundo número: "))
    print("Soma: ", somar(num1, num2))
    print("Subtração: ", subtrair(num1, num2))
    print("Multiplicação: ", multiplicar(num1, num2))
    print("Divisão: ", dividir(num1, num2))
main()

#2
def fatorial(n):
    resultado = 1
    
    for i in range(1, n + 1):
        resultado = resultado * i
    return resultado

def main():
    numero = int(input("Digite um número: "))
    print("O fatorial é:", fatorial(numero))

main()

#Lista de list
#1
lista_vazia = []
