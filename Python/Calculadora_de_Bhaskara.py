#Autor: Pedro Gonella Barão
#Data: 24/032025
#Objetivo: Calculadora de Bhaskara

import math


print("\nBem-vindo a Calculadora de Bhaskara!")
a = float(input("Qual é o valor de a?: "))
b = float(input("Qual é o valor de b?: "))
c = float(input("Qual é o valor de c?: "))

x1 = (-b + math.sqrt((b**2) - 4 * a * c))/(2 * a)
x2 = (-b - math.sqrt((b**2) - 4 * a * c))/(2 * a)

print(f"\nO valor de x1 é igual a {x1}")
print(f"O valor de x2 é igual a {x2}")