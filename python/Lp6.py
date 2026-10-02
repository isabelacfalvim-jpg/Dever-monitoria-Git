#1
def soma(X, Y):
    resultado = X + Y
    print("Resultado:", resultado)

def subtracao(X, Y):
    resultado = X - Y
    print("Resultado:", resultado)

def multiplicacao(X, Y):
    resultado = X * Y
    print("Resultado:", resultado)

def divisao(X, Y):
    resultado = X / Y
    print("Resultado:", resultado)

if __name__ == "__main__":
    operador = input("Digite a operação (+, -, x, /): ")
    num1 = float(input("Digite o primeiro valor: "))
    num2 = float(input("Digite o segundo valor: "))

    if operador == "+":
        soma(num1, num2)
    elif operador == "-":
        subtracao(num1, num2)
    elif operador == "x":
        multiplicacao(num1, num2)
    elif operador == "/":
        divisao(num1, num2)
    else:
        print("Operação inválida")



#2
def fatorial(numero):
    result = 1
    for i in range(1, numero + 1):
        result = result * i
    return result

if __name__ == "__main__":
    valor = int(input("Digite um número: "))
    Fatorial = fatorial(valor)

    print("O fatorial é:", Fatorial)



#3
def calcular_desconto(valor, desconto):
    valor_final = valor - (valor * desconto / 100)
    return valor_final

if __name__ == "__main__":
    compra = float(input("Digite o valor da maquiagem: "))
    desconto = float(input("Digite o desconto (%): "))
    Resultado = calcular_desconto(compra, desconto)

    print("Valor final da compra: R$", Resultado)