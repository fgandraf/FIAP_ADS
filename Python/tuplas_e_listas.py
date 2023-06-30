import sys

categorias_lista = ["Felipe", "Fernanda", "Marcos"]
categorias_tupla = ("Youngling", "Padawan", "Knigh", "Master")

print("Lista: ")
print(categorias_lista)
print("Tupla: ")
print(categorias_tupla)

print("\n")
print("Laço de repetição:")
print("------------------")
for categoria in categorias_tupla:
    print (categoria)

print("\n")
print("Tamanho:")
print("--------")
lista_vazia = []
tupla_vazia = ()
print("O objeto lista_vazia é do tipo {} e ocupa {} bytes na memória".format(type(lista_vazia), sys.getsizeof(lista_vazia)))
print("O objeto tupla_vazia é do tipo {} e ocupa {} bytes na memória".format(type(tupla_vazia), sys.getsizeof(tupla_vazia)))