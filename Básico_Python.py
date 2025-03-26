"Autor: Pedro Gonella Barão"
"Data: 26/03/2025"
"Objetivo: Aprender o básico de python"


texto = input("informe seu texto: ")
VOGAIS = "AEIOUL"

for letra in texto:
    if letra.upper() in VOGAIS:
        print(letra, end="")

print()