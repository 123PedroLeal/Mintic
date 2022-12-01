#Creación de la funcion para las Entradas
def leer_datos():
    N, K = [int(x) for x in list(input("Ingrese el número de baldosas a revisar y la cantidad de baldosas guardadas-->").split())]
    M = [int(x) for x in list(input("Ingrese el número de baldosas revisadas por el sensor-->").split())]
    return N,K,M

#Recepción de la función
N,K,M = leer_datos()

#Creación de la función para la detección de fallas
def Calcular_Baldosas(M,K):
    #Declaración de variables diccionario y tipos de fallas
    diccionario = dict()
    Fallas_detectadas= 0
    Fallas_totales= 0

    #Ciclo para llenar el diccionario
    for posicion, valor in enumerate(M):    

        #Comprobantes de los datos recibidos
        print("El diccionario es-->",diccionario)
        print("Este valor esta repetido-->",valor in diccionario)
        print("La posición del valor repetido en el diccionario es-->",valor in diccionario and posicion)
        print("Este valor es-->",diccionario.get(posicion))
        print("El resultado de la operación es-->",valor in diccionario and posicion - diccionario.get(valor))

        #Condicional que compara que si los valores estan en el diccionario me de su posición y les reste el valor del mismo y en caso de ser menor o igual que k lo tome como una falla.
        if(valor in diccionario and posicion - diccionario.get(valor)<=K): 
            Fallas_detectadas = Fallas_detectadas+1
    
        #Condicional para ver si el valor ya se encuentra dentro del diccionario me lo sume como una falla
        if(valor in diccionario):
            Fallas_totales = Fallas_totales + 1
    
        diccionario [valor] = posicion
    
    return Fallas_detectadas, Fallas_totales

#Recepción de la función que me detecta las fallas.
Fallas_detectadas, Fallas_totales = Calcular_Baldosas(M,K)

#Salidas
print("Las Salidas son-->",Fallas_totales,Fallas_detectadas,len(M))