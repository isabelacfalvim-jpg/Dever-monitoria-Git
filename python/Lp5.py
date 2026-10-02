#1
def mostrar_dados(msg, num):
    print(msg, num)

def main():
    texto = input("Digite uma mensagem: ")
    numero = input("Digite um número: ")
    mostrar_dados(texto, numero)

main()

#2
def somar(a, b, c):
    resultado = a + b + c
    return resultado

def main():
    n1 = int(input("Digite o primeiro número: "))
    n2 = int(input("Digite o segundo número: "))
    n3 = int(input("Digite o terceiro número: "))
    
    total = somar(n1, n2, n3)
    print("O resultado da soma é:", total)

main()

#3
def calcular_idade(ano_nasc):
    idade = 2026 - ano_nasc  
    return idade

def main():
    ano = int(input("Em que ano você nasceu? "))
    resultado = calcular_idade(ano)
    print("Você tem (ou vai fazer):", resultado, "anos")

main()

#4
def converter_p_dolar(reais, cotacao):
    dolares = reais / cotacao
    return dolares

def main():
    print("___________Converter moeda___________")
    valor_real = float(input("Quantos Reais (R$) você tem? "))
    valor_c = float(input("Qual o valor do Dólar hoje? "))
    
    resultado = converter_p_dolar(valor_real, valor_c)
    print("Você tem o equivalente a: US$", round(resultado, 2))

main()


