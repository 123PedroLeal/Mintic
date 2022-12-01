#Entrada para el ciclo
Num_registros = int(input("Ingrese la cantidad de registros de cada lista-->"))

#Contadores
Contador = 0 
Disponible = 0
#Variable de Salida
Precio = 0

#Ciclo
for x in range(Num_registros):
    # Entrada de los datos
    Registros = input("Ingrese las características de la bicicleta que quiere comprobar-->").split()
    
    #Condiciones
    if(int(Registros[0]) >= 240) and (int(Registros[0]) <= 300):
        print("Se cumple la primera caracteristica")
        Contador = Contador + 1
    else:
        print("No se cumple la primera caracteristica")    
    if (int(Registros[1]) >= 160) and (int(Registros[1]) <= 180):
        print("Se cumple la segunda caracteristica")
        Contador = Contador + 1
    else:   
        print("No se cumple la segunda caracteristica")
    if(int(Registros[2]) >= 240 and int(Registros[2]) <= 275):
        print("Se cumple la tercera caracteristica")
        Contador = Contador + 1
    else:
        print("No se cumple la tercera caracteristica")
    if(int(Registros[3]) <= 50):
        print("Se cumple la cuarta caracteristica") 
        Contador = Contador + 1
    else:
        print ("No se cumple la cuarta caracteristica")
        
    #Comprobantes
    print("El contador de condiciones es -->",Contador)
    print ("Las caracteristicas de la bicicleta ",x+1," ",Registros)
    
    #Condiciones del Contador
    if(Contador == 4):
        Disponible = Disponible = Disponible + 1
        Precio = Registros[4] 
        print ("Esta bicicleta cumple todas las condiciones y el precio es -->",Precio)
    else:
        print("La Bicicleta no cumple todas las condiciones y no puede ser vendida")
    
    Contador = 0 

#Condiciones de Salida
if (Disponible==1):
    print("El precio de la bicicleta es -- >", Precio)
else:
    print("NO DISPONIBLE")