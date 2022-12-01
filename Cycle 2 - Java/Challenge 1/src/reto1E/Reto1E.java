package reto1E;
//@author Pedro Leal
import java.util.Scanner;

/**
 *
 * @author Pedro Leal
 */
public class Reto1E 
{
//Forma de declarar la entrada al sistema
    private final Scanner scanner = new Scanner(System.in);
    
    public String read()
    {
        // Asignación de los datos del sistema
        return this.scanner.nextLine();
    }
    public void run()
    {
    /* Enunciado para saber el inicio del programa*/
    System.out.println("Ingrese los datos de los usuarios-->");
    //Declaraciones.
    
    //Declaración de arreglos
    String Datos_Ingresados [] = new String [3];
    //Variables
    float Altura = 0;
    float Masa = 0;
    float IMC = 0;
    int Edad =0;
    String NivelR = "";
    
    //Asignaciones.
    
    //Asignación de los valores del arreglo separados por un espacio.
    Datos_Ingresados = read().split(" ");
    //Asignación de Variables
    Masa = Float.parseFloat(Datos_Ingresados[0]);
    Altura = Float.parseFloat(Datos_Ingresados[1]);
    Edad = Integer.parseInt(Datos_Ingresados[2]);
    IMC = Masa / (Altura*Altura) ;
    
    if(IMC<22 && Edad<45)
    {
    NivelR ="Bajo";
    }
    if(IMC>=22 && Edad<45)
    {
    NivelR ="Medio";
    }
    if(IMC<22 && Edad>=45)
    {
    NivelR ="Medio";
    }
    if(IMC>=22 && Edad>=45)
    {
    NivelR ="Alto";
    }
    
    if(Masa>=0 && Masa<=150)
    {
        if(Altura>=0.1 && Altura<=2.5)
        {
            if(Edad>=0 && Edad<=110)
            {
            System.out.println("El IMC es-->"+ Math.round(IMC*10.0)/10.0 +" "+ NivelR);
            }
            else
            System.out.println("ERROR");  
        }
        else
        System.out.println("ERROR");  
    }
    else
    System.out.println("ERROR");     
    } 

    public static void main(String[] args) 
    {
        Reto1E Principal = new Reto1E();
        Principal.run();
    }
}
