# Entradas
SalarioBase, Cantidad_Horas_Extra, Bonificaciones = input("Ingrese el Salario Base, las horas extras y las Bonificaciones -->").split()

SalarioBase = float(SalarioBase)
Cantidad_Horas_Extra = int(Cantidad_Horas_Extra)
Bonificaciones = int(Bonificaciones)

#Imprimir las entradas
print ("El Salario Base es -->",SalarioBase)
print ("Las Horas extra son -->",Cantidad_Horas_Extra)
print ("Hay Bonificaciones Sí/No -->",Bonificaciones)

#Valor de las horas trabajadas, horas extras y Bonificaciones
ValorHoraTrabajada = SalarioBase/192
Valor_Horas_Extra = Cantidad_Horas_Extra*(ValorHoraTrabajada + (ValorHoraTrabajada* 0.25))

#Condicional para aplicar las bonificaciones
if Bonificaciones == 1:
    Valor_Bonificaciones = SalarioBase*0.05
else:
    Valor_Bonificaciones = 0

#Salto de Linea
print ("-----------------------------------------------------------------------------")

#Imprimir los Valores
print ("El Valor de la Hora Trabajada es-->",ValorHoraTrabajada)
print ("El Valor de las Horas Extras es-->",Valor_Horas_Extra)
print ("El Valor de las Bonificaciones es-->",Valor_Bonificaciones)

#Calculo del Salario sin Descuentos
SalarioTotal = SalarioBase + Valor_Horas_Extra + Valor_Bonificaciones

#Salto de Linea
print ("-----------------------------------------------------------------------------")

#Imprimir Salario sin descuentos
print ("El Valor del Salario sin los Descuentos es-->",SalarioTotal)

#Calculo de Descuentos
DescuentoSalud = SalarioTotal * 0.035
DescuentoPension = SalarioTotal * 0.04
DescuentoCajaCompensación = SalarioTotal * 0.01

#Salto de Linea
print ("-----------------------------------------------------------------------------")

#Imprimir Descuentos
print ("El Valor de los Descuentos por Salud es-->",DescuentoSalud)
print ("El Valor de los Descuentos por Pension es-->",DescuentoPension)
print ("El Valor de los Descuentos por Caja de Compensación es-->",DescuentoCajaCompensación)

#Calculo del Salario Final
SalarioFinal = SalarioTotal - DescuentoSalud - DescuentoPension - DescuentoCajaCompensación

#Salto de Linea
print ("-----------------------------------------------------------------------------")

#Imprimir el Salario Final
print("EL Salario Final es -->",round(SalarioFinal,1))
