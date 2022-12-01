/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author Pedro Leal
 */
@Table("productos")
public class Producto 
{
     //Atributos del objeto producto.
    @Id
    private Integer Codigo;
    private String Nombre;
    private float Precio;
    private Integer Inventario;
   
    //Constructor del objeto producto.
    public Producto(Integer Codigo, String Nombre, float Precio, Integer Inventario)
    {
    this.Codigo = Codigo;
    this.Nombre = Nombre;
    this.Precio = Precio;
    this.Inventario = Inventario;
    }
    
    //Obtenedores y Modificadores del objeto producto.
    //Los getters son funciones del tipo de atributo que retornan el atributo.
    //Los setters son metodos que permiten cambiar el atributo base del objeto.
    public Integer getCodigo() 
    {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) 
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

    public Integer getInventario() 
    {
        return Inventario;
    }

    public void setInventario(Integer Inventario) 
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
