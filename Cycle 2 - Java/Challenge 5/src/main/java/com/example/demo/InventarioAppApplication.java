package com.example.demo;

import com.example.demo.Controlador.ProductoControlador;
import com.example.demo.Modelo.ProductoRepositorio;
import com.example.demo.Vista.Vista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioAppApplication 
{
        @Autowired
        ProductoRepositorio productorepositorio;
        
	public static void main(String[] args) 
        {
            new SpringApplicationBuilder(InventarioAppApplication.class).headless(false).run(args);
	}
        
        @Bean
        public void Ejecutor()
        {
            new ProductoControlador(productorepositorio,new Vista());
        }

}
