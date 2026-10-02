#1
numeros = []

while True:
    valor = int(input("Digite um número ou -1 pra encerrar: "))

    if valor == -1:
        break
    numeros.append(valor)

print("Quantidade de números digitados:", len(numeros))


#2
notas = []

while True:
    nota = float(input("Digite a nota ou -1 pra encerrar: "))

    if nota == -1:
        break
    notas.append(nota)

if len(notas) > 0:
    media = sum(notas) / len(notas)

    print("Média da turma:", media)
    print("Quantidade de alunos:", len(notas))
else:
    print("Nenhum aluno foi informado.")


#3
alturas = []
generos = []

while True:
    altura = float(input("Digite a altura ou 0 para sair: "))

    if altura == 0:
        break
    genero = input("Digite o gênero (m/f): ")
    alturas.append(altura)
    generos.append(genero)

print("Maior altura:", max(alturas))
print("Menor altura:", min(alturas))
print("Quantidade de homens:", generos.count("m"))
print("Quantidade de mulheres:", generos.count("f"))