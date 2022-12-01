#Entradas
Metros,VelocidadMax,Segundos = input("Ingrese la Distancia que separa a las camaras, La Velocidad y El Tiempo-->").split()

#Variables
Metros = int(Metros)
VelocidadMax = float(VelocidadMax)
Segundos = int(Segundos)

#Conversiones
Kilometros = Metros/1000
Horas = Segundos/3600

#Calculo de la Velocidad del Vehiculo
VelocidadReg= Kilometros/Horas

#Calculo de Rangos de Castigo
VelCastigo = VelocidadMax + (VelocidadMax*0.2)

#Comprobantes
print("La Velocidad máxima es:", VelocidadMax)
print("La Velocidad de multa es:", VelCastigo)
print("La Velocidad registrada es:", VelocidadReg)

if(Metros<=0) or (VelocidadMax<=0) or (Segundos<=0):
    print("ERROR")
else:
    if(VelocidadReg <= VelocidadMax):
        print("OK")
    elif(VelocidadReg >= VelocidadMax) and (VelocidadReg < VelCastigo):
        print("MULTA")
    elif(VelocidadReg >= VelCastigo):
        print("CURSO SENSIBILIZACION")
