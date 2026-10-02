#1
final = int(input("Digite o valor final: "))
for i in range(1, final + 1):
    print(i)

print("Quantidade de valores:", final)

#2
inicio = int(input("Digite o valor inicial: "))
qt = 0

for i in range(inicio, -1, -1):
    print(i)
    qt = qt + 1

print("Quantidade de valores:", qt)

#3
soma1 = 0
for i in range(1, 501):
    soma1 = soma1 + i

print("Soma total:", soma1)

#4
soma2 = 0

for i in range(1, 501):
    if i % 2 != 0 & i % 3 == 0:
        soma2 = soma2 + i

print("Soma total:", soma2)

#5
for i in range(0, 7):
    for j in range(0, 7):
        print(i, "-", j)

#6
for i in range(0, 7):
    for j in range(i, 7):
        print(i, "-", j)

