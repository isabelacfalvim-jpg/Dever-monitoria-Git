#1
numero1 = float(input("Digite o primeiro numero: "))
numero2 = float(input("Digite o segundo número: "))
print("Escolha a operação (+, -, *, /): ")
operação = input()
operação = input("Digite o símbolo da operação: ")
if operação == "+":
    print("Resultado:", numero1 + numero2) 
elif operação == "-":
    print("Resultado:", numero1 - numero2)
elif operação == "*":
    print("Resultado:", numero1 * numero2)
elif operação == "/":
    if numero2 != 0:
        print("Resultado: ", numero1/numero2)
    else:
        print("Errado: Não pode haver uma divisão por zero.")
else:
    print("Operação errada.")

#2
qnt= 0
soma= 0 
maior_20 = 0
while True: 
    valor = float(input("Digite um valor (ou 0 para encerrar): "))
    if valor == 0:
        break
    qnt += 1
    soma += valor 
    if valor > 20: 
        maior_20 += 1
    if qnt > 0:
        media= soma/qnt
    else: 
        media = 0 
print("Quantidade de valores: ", qnt)
print("Soma de valores: ", soma)
print("Média: ", media)
print("Valores maiores que 20: ", maior_20)

#3
qt = soma = 0
aprovados = 0 
reprovados = 0 

while True: 
    nota = float(input("Digite a nota do aluno (ou -1 para parar): "))
    if nota == -1:
        break
    qt +=1
    soma += soma 
    if nota >= 5: 
        aprovados +=1 
    else: 
        reprovados += 1 
        
    if qt >0 : 
        media = soma/qt
    else: 
        media = 0 
    print("Quantos alunos? ", qt)
    print("Aprovados", aprovados)
    print("Reprovados", reprovados)
    print("Média: ", media)

#4
qntd = soma_total = 0 
soma_pares = qntd_pares = 0 
soma_impares = qntd_impares = 0 
while True: 
    numero = int(input("Digite um numero (ou 0 para encerrar): "))
    if numero == 0:
        break 
    qntd += 1
    soma_total += numero 
    if numero %2 == 0: 
        soma_pares += numero 
        qntd_pares += 1
    else: 
        soma_impares +=1
        qntd_impares +=1
    if qntd_pares > 0: 
        media_pares = soma_pares/qntd_pares
    else: 
        media_pares = 0
    if qntd_impares > 0:
        media_impares = soma_impares/qntd_impares
    else: 
        media_impares = 0
    print("Quantidade de numeros: ", qntd)
    print("Soma de numeros: ", soma_total)
    print("Media dos pares: ", media_pares)
    print("Media dos impares", media_impares)
    