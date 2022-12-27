""" CONTADOR
contador = 0
while contador < 10:
    if contador > 5:
        print (contador)
    contador = contador + 1
"""

print("\x1b[2J\x1b[1;1H")

lista = ['a', 3, True, 4.5]
print(lista)

lista.append(45)
print(lista)

lista.insert(0,56)
print(lista)

lista.pop()
print(lista)

lista.clear()
print(lista)