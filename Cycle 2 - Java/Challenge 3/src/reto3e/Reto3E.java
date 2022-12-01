package reto3e;

import java.util.HashMap;
import java.util.Scanner;

class Producto 
{
    //Atributos del objeto producto.
    public int Codigo;
    public String Nombre;
    public float Precio;
    public int Inventario;
   
    //Constructor del objeto producto.
    public Producto(int Codigo, String Nombre, float Precio, int Inventario)
    {
    this.Codigo = Codigo;
    this.Nombre = Nombre;
    this.Precio = Precio;
    this.Inventario = Inventario;
    }
    
    //Obtenedores y Modificadores del objeto producto.
    //Los getters son funciones del tipo de atributo que retornan el atributo.
    //Los setters son metodos que permiten cambiar el atributo base del objeto.
    public int getCodigo() 
    {
        return Codigo;
    }

    public void setCodigo(int Codigo) 
    {
        this.Codigo = Codigo;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public float getPrecio() 
    {
        return Precio;
    }

    public void setPrecio(float Precio) 
    {
        this.Precio = Precio;
    }

    public int getInventario() 
    {
        return Inventario;
    }

    public void setInventario(int Inventario) 
    {
        this.Inventario = Inventario;
    }

    //El to String es para que puedas imprimir el objeto con todos los atributos base que tenga
    @Override
    public String toString() 
    {
        return "La Lista de Productos es " + "Codigo= " + Codigo + ", Nombre= " + Nombre + ", Precio= " + Precio + ", Inventario= " + Inventario ;
    }
    
}

class BaseDatos 
{
    //Creación de Objeto HashMap.
    HashMap <Integer,Producto> ListaProductos = new HashMap <Integer,Producto>();
 
    public BaseDatos()
    {
    //LLenado del HashMap.
    ListaProductos.put(1,new Producto (1,"Manzanas", (float) 5000.0,25));
    ListaProductos.put(2,new Producto (2,"Limones", (float) 2300.0,15));
    ListaProductos.put(3,new Producto (3,"Peras", (float) 2700.0,33));
    ListaProductos.put(4,new Producto (4,"Arandanos", (float) 9300.0,5));
    ListaProductos.put(5,new Producto (5,"Tomates", (float) 2100.0,42));
    ListaProductos.put(6,new Producto (6,"Fresas", (float) 4100.0,3));
    ListaProductos.put(7,new Producto (7,"Helado", (float) 4500.0,41));
    ListaProductos.put(8,new Producto (8,"Galletas", (float) 500.0,8));
    ListaProductos.put(9,new Producto (9,"Chocolates", (float) 3500.0,80));
    ListaProductos.put(10,new Producto (10,"Jamon", (float) 15000.0,10));
    }
    
    public boolean AgregarProducto(Producto Nproducto)
    {
        //Instrucción para saber si el HashMap no contiene el codigo.
        if(!ListaProductos.containsKey(Nproducto.getCodigo()))
        {
            //Como agregar otro producto desde la clave
            ListaProductos.put(Nproducto.getCodigo(), Nproducto);
            return true;
        }
        return false;
    }
    public boolean ActualizarProducto(Producto Nproducto)
    {
        //Instrucción para saber si el HashMap contiene el codigo.
        if(ListaProductos.containsKey(Nproducto.getCodigo()))
        {
            //Como agregar otro producto con la misma clave, funciona bien
            ListaProductos.replace(Nproducto.getCodigo(), Nproducto);
            return true;
        }
        return false;
    }
    public boolean BorrarProducto(int Codigo,Producto Nproducto)
    {   
        //Instrucción para saber si el HashMap contiene el codigo.
        if(ListaProductos.containsKey(Nproducto.getCodigo()))
        {
            //Como quitar un producto con su clave
            ListaProductos.remove(Nproducto.getCodigo());
            return true;
        }
      return false;
    }
    public String Mayor()
    {
        String ProductoMayor = "";
        float mayor = ListaProductos.get(1).getPrecio(); 
        
        for(Integer i: ListaProductos.keySet())
        {    
            if(ListaProductos.get(i).getPrecio() > mayor)    
            {
            mayor = ListaProductos.get(i).getPrecio();
            ProductoMayor = ListaProductos.get(i).getNombre();
            }        
        }
        
    return ProductoMayor;
    }
    
    public String Menor()
    {
        String ProductoMenor = "";
        float menor = ListaProductos.get(1).getPrecio(); 
        
        for(Integer i: ListaProductos.keySet())
        {    
            if(ListaProductos.get(i).getPrecio() < menor)    
            {
            menor = ListaProductos.get(i).getPrecio();
            ProductoMenor = ListaProductos.get(i).getNombre();
            }        
        }
        
    return ProductoMenor;
    }
    
    public float Promedio()
    {
        float promedio = 0;
        
        for(Integer i: ListaProductos.keySet())
        {        
            promedio+=(ListaProductos.get(i).getPrecio()/ListaProductos.size());          
        }
        
    return promedio;
    }
    
}

public class Reto3E 
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
    //Declaraciones.
    //Declaración de las entradas
   
    String Opcion;
    String Datos_Ingresados [] = new String [4];
    
    //Variables
    int Codigo;
    String Nombre;
    float Precio;
    int Inventario;
    
    //Asignaciones.
    
    // Entradas
    System.out.println("La Opción que desea usar->");
    Opcion = read();
    System.out.println("Digite el Producto->");
    Datos_Ingresados = read().split(" ");
    
    //Variables
    Codigo = Integer.parseInt(Datos_Ingresados[0]);
    Nombre = Datos_Ingresados[1];
    Precio = Float.parseFloat(Datos_Ingresados[2]);
    Inventario = Integer.parseInt(Datos_Ingresados[3]);
    
    //Llamada de objeto base de datos.
    BaseDatos Datos = new BaseDatos();
    //Llamada de objeto Producto.
    Producto Nproducto = new Producto(Codigo,Nombre,Precio,Inventario);
    
    //Condicionales y binarios para imprimir.
    boolean Salida = false; 
    if(Opcion.equals("AGREGAR"))
    {
        Salida = Datos.AgregarProducto(Nproducto);
    }
    else if(Opcion.equals("BORRAR"))
    {
        Salida = Datos.BorrarProducto(Nproducto.getCodigo(),Nproducto);
    }
    else if(Opcion.equals("ACTUALIZAR"))
    {
        Salida = Datos.ActualizarProducto(Nproducto);
    }
    if(Salida)
    {
        System.out.println(Datos.Mayor() +" "+ Datos.Menor() +" "+ Math.round(Datos.Promedio()*10.0)/10.0);
    }
    else
    {
        System.out.println("ERROR");
    }
}
    public static void main(String[] args) 
    {
        Reto3E Principal = new Reto3E();
        Principal.run();
    }    
}
