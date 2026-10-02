#1
soma = quantidade = 0 
soma_pares = quantidade_pares = 0 
soma_impares = quantidade_impares = 0 
numero = int(input("Digite um numero ou 0 pra encerrar: "))
while numero != 0:
    soma = soma + numero 
    quantidade = quantidade + 1 
    if numero %2 == 0: 
        soma_pares = soma_pares + numero 
        quantidade_pares = quantidade_pares + 1
    else: 
        soma_impares = soma_impares + 1
        quantidade_impares = quantidade_impares + 1
    numero = int(input("Digite um numero ou 0 para encerrar: "))
if quantidade_pares >0 : 
    media_pares = soma_pares / quantidade_pares
else: 
    media_pares = 0
if quantidade_impares >0: 
    media_impares = soma_impares / quantidade_impares
else: 
    media_impares = 0 
print("Quantidade: ", quantidade)
print("Soma: ", soma)
print("Média pares: ", media_pares)
print("Media impares: ", media_impares)

#2
Quantidade = Soma = 0 
Quantidade_maior50 = 0
numero2 = float(input("Digite um numero ou 0 para sair: "))

if numero2 != 0: 
    maior = numero2
    menor = numero2
    
    while numero2 != 0: 
        Quantidade = Quantidade + 1
        Soma = Soma + 1
        
        if numero2 > maior: 
            maior = numero2
        if numero2 < menor: 
            menor = numero2
        
        if numero2 >= 50: 
            Quantidade_maior50 = Quantidade_maior50 + 1
        numero2 = float(input("Digite um numero ou 0 para encerrar: "))
    media = Soma / Quantidade
    print("Quantidade: ", Quantidade)
    print("Soma: ", Soma)
    print("Media: ", media)
    print("Maior: ", maior)
    print("Menor: ",menor)
    print("Maiores que 50:", Quantidade_maior50)

#3
v1 = v2 = v3 = 0 
nulos = brancos = 0 
voto = int(input("Digite o voto ou 0 para sair: "))

while voto != 0: 
    if voto ==1: 
        v1 = v1 + 1
    elif voto ==2: 
        v2 = v2 + 1
    elif voto ==3: 
        v3 = v3 + 1
    elif voto ==5: 
        nulos = nulos + 1
    elif voto ==6: 
        brancos = brancos + 1
    voto = int(input("Digite um numero ou 0 para encerrar: "))
total = v1+v2+v3 + nulos + brancos 
if total > 0: 
    percentual_nulos = (nulos*100)/ total 
    percentual_brancos = (brancos*100)/ total 
else: 
    percentual_nulos = 0
    percentual_brancos = 0
    
print("Votos candidato 1: ", v1)
print("Votos candidato 2: ", v2)
print("Votos candidato 3: ", v3)
print("Votos nulos: ", nulos)
print("Votos branco: ", brancos)
print("Percentual nulos: ", percentual_nulos, "%")
print("Percentual brancos: ", percentual_brancos, "%")

#4
menor_5 = entre_5e10 = maior_10 = 0
total_folha_Pgto = 0 
salario_minimo = float(input("Digite o salario minimo ou 0: "))
salario = float(input("Digite um salario ou 0: "))

while salario != 0: 
    total_folha_Pgto = total_folha_Pgto + salario
    if salario < 5 * salario_minimo: 
        menor_5 = menor_5 + 1
    elif salario < 10 * salario_minimo: 
        entre_5e10 = entre_5e10 + 1
    else: 
        maior_10 = maior_10 + 1 
        
    salario = float(input("Digite o salario ou 0: "))
print("Funcionarios com menos de 5 salarios minimos: ", menor_5)
print("Entre 5 e 10 salarios: ", entre_5e10)
print("Com 10 ou mais salarios minimos: ", maior_10)
print("Total da folha de pagamento: ", total_folha_Pgto)