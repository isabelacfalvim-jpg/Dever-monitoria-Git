x=int('8')
print(type(x))

a=3
b=5
c=13
print((a+b+c)/3)

x=3
cubo=x**3
print(cubo)

print('x=',(3+2)**5)
print('x=',3+5*2-1/2**3)

x=64
raiz=x ** (1/3)
print(raiz)

x=1000
raiz=x ** (1/5)
print(raiz)

x=9
y=5
print(x*y)
z=3 
print(z * y * x)
print(2 * z * x + 2 * z * y)

x=5
y=12
cálculo= x*3600+ y*60
print(cálculo)

a=2
b=4
c=2
x1= (-b+(b**2-4*a*c)**(1/2))/2*a
print(x1)
x2= (-b-(b**2-4*a*c)**(1/2))/2*a
print(x2)


G= 9.80665
valor = (2*x/G) ** (1/2)
print(valor)

preço = 10.25
preço_com_desconto = round(preço*0.9, 2)
print(preço_com_desconto)

x= 100
a= x-0.9
p1= x/5
p2= x/10+0.17
print(a)
print(p1)
print(p2)

import pyautogui
print(pyautogui.__version__)

for i in range(2004,2096,4):
    print(i)

for i in range (10, -2, -1):
    print(i)
print('fogo!')

for n in range(10):
    print(2**n)


valor = int(input("1000"))
for parcelas in range(1, 25):
    prestacao = valor // parcelas
    print(parcelas, "x de ", prestacao)