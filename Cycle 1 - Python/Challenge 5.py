# Función de los datos de entrada.
def leer_datos():
    Operación = input("Que operación desea realizar \n AGREGAR \n ACTUALIZAR \n BORRAR \n --->")
    Productos = input("Ingrese el 1.Codigo - 2.Nombre - 3.Precio - 4.Inventario --->" ).split()
    Productos[0] = int(Productos[0])
    Productos[2] = float(Productos[2])
    Productos[3] = int(Productos[3])
    return Operación, Productos

#Recepción de los datos de entrada.
Operación,Productos = leer_datos()

#Función para agregar un producto a la base de datos
def AgregarDatos(Base_de_datos, Productos):
    # 1. Verifica Si el codigo esta en la base de datos
    if Productos[0] in Base_de_datos:
    # 2.En Caso de que el producto este en la base de datos retorname falso porque no puedo agregar un producto que ya existe.
        return False
    #3. Guarda el Codigo del producto y almacenalo en una variable.
    Clave = Productos[0]
    #4. Elimina el codigo de la lista ingresada.
    Productos.pop(0)
    #5. Toma la varible que tiene el codigo y colocalo como clave de la lista y el resto de esa lista tomalo como el valor del diccionario 
    Base_de_datos [Clave] = Productos
    #6. Retorna un un true para asegurar que la operación esta bien hecho
    return True

#Función pata actualizar un producto en la base de datos.
def ActualizarDatos(Base_de_datos,Productos):
    # 1. Verifica Si el codigo esta en la base de datos
    if(Productos[0] in Base_de_datos):
        #2. Guarda el Codigo del producto y almacenalo en una variable.
        Clave = Productos[0]
        Productos.pop(0)
        Base_de_datos [Clave] = Productos
        return True
    else:
        return False

#Función pata Borrar un producto en la base de datos.
def BorrarDatos(Base_de_datos):
    if(Productos[0] in Base_de_datos):
        Base_de_datos.pop(Productos[0])
        return True
    else:
        return False

def precio_mayor(Base_de_datos):

    mayor = list(Base_de_datos.keys())
    mayor = mayor[0]

    for i in Base_de_datos:
        #Recorre toda la columna de codigos tomando sus precios comparandolos a cada uno con las de la varible mayor 
        #que son las mismas claves y precios hasta conseguir el de valor más alto 
        if (Base_de_datos[i][1] > Base_de_datos[mayor][1]):
            #El valor más alto almacenado en la varible i
            mayor = i
    return Base_de_datos[mayor][0]

def precio_menor(Base_de_datos):
    menor = list(Base_de_datos.keys())
    menor = menor[0]
    for i in Base_de_datos:
        if Base_de_datos[i][1]<Base_de_datos[menor][1]:
            menor = i
    return Base_de_datos[menor][0]

def promedio_precios(Base_de_datos):
    promedio = 0 
    for i in Base_de_datos:
        promedio += Base_de_datos[i][1]
    promedio /= len(Base_de_datos)
    return promedio

def valor_inventario(Base_de_datos):
    valor_inventario = 0.0
    for i in Base_de_datos:
        valor_inventario += Base_de_datos[i][1] * Base_de_datos[i][2]
    return valor_inventario

#Creación de la Base de datos.
Base_de_datos = {
    1: ['Manzanas', 5000.0, 25],
    2: ['Limones', 2300.0, 15],
    3: ['Peras', 2700.0, 33],
    4: ['Arandanos', 9300.0, 5],
    5: ['Tomates', 2100.0, 42],
    6: ['Fresas', 4100.0, 3],
    7: ['Helado', 4500.0, 41],
    8: ['Galletas', 500.0, 8],
    9: ['Chocolates', 3500.0, 80],
    10: ['Jamon', 15000.0, 10]
}

#Condicional para llamar las distintas operaciones
if(Operación == 'AGREGAR'):
    Ope = AgregarDatos(Base_de_datos, Productos)
elif(Operación == 'ACTUALIZAR'):
    Ope = ActualizarDatos(Base_de_datos, Productos)
elif(Operación == 'BORRAR'):
    Ope = BorrarDatos(Base_de_datos)
if(Ope==False):
    print("ERROR")
else: 
    Mayor = precio_mayor(Base_de_datos)
    Menor = precio_menor(Base_de_datos)
    Promedio = round(promedio_precios(Base_de_datos),1)
    Inventario = round(valor_inventario(Base_de_datos),1)

    print (Mayor,Menor,Promedio,Inventario)

