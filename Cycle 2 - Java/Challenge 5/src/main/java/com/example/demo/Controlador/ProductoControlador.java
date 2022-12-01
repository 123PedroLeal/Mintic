package com.example.demo.Controlador;

import com.example.demo.Modelo.Producto;
import com.example.demo.Modelo.ProductoRepositorio;
import com.example.demo.Vista.Vista;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import javax.swing.JTable;

public class ProductoControlador implements ActionListener 
{
    ProductoRepositorio productorepositorio;
    Vista Inicio;
    
    //Inyección de dependencias.
    public ProductoControlador(ProductoRepositorio productorepositorio,Vista Inicio)
    {
        this.productorepositorio = productorepositorio;
        this.Inicio = Inicio;
        Eventos();
        PonerProductos();
    }
    
    private void Eventos()
    {   
        //Llamado del ActionListener para agregar los eventos al controlador.
        Inicio.getBotonAgregar().addActionListener(this);
        Inicio.getBotonActualizar().addActionListener(this);
        Inicio.getBotonBorrar().addActionListener(this);
        Inicio.getBotonInforme().addActionListener(this);
        Inicio.getBotonActualizarAct().addActionListener(this);
    }
    
    private void AgregarProductos()
    {  
        String NombreNP = Inicio.getEspacioNombre().getText();
        float PrecioNP = Float.parseFloat(Inicio.getEspacioPrecio().getText());
        int InventarioNP = Integer.parseInt(Inicio.getEspacioInventario().getText());
        
        Producto NP = new Producto(null, NombreNP, PrecioNP, InventarioNP);
        
        productorepositorio.save(NP);
        
        JOptionPane.showMessageDialog(null, "Se Agrego el Producto correctamente","Creado",JOptionPane.INFORMATION_MESSAGE);
        
        Inicio.getEspacioNombre().setText("");
        Inicio.getEspacioPrecio().setText("");
        Inicio.getEspacioInventario().setText("");
    }
    
    private void ActualizarProductos()
    {
        JTable MiTabla = Inicio.getTablaProductos();
        Integer CodProducto = (Integer) MiTabla.getModel().getValueAt(MiTabla.getSelectedRow(), 0);
        
        if(CodProducto == null)
        {
            JOptionPane.showMessageDialog(null, "Seleccione el Codigo que quiere actualizar de la Tabla");
        }
        else
        {
            int Opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea actualizar ese producto?");
            
            if(Opcion == 0)
            {
                String NombrePACT = Inicio.getEspacioNombreAct().getText();
                float PrecioPACT = Float.parseFloat(Inicio.getEspacioPrecioAct().getText());
                int InventarioPACT = Integer.parseInt(Inicio.getEspacioInventarioAct().getText());
        
                Producto PACT = new Producto(CodProducto, NombrePACT, PrecioPACT, InventarioPACT);
        
                productorepositorio.save(PACT);
                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
            }
        }
    }
    private void BorrarProductos()
    {
        JTable MiTabla = Inicio.getTablaProductos();
        Integer CodigoProducto = (Integer) MiTabla.getModel().getValueAt(MiTabla.getSelectedRow(), 0);
        
        if(CodigoProducto == null)
        {
            JOptionPane.showMessageDialog(null, "Seleccione el Codigo que quiere eliminar de la Tabla");
        }
        else
        {
            int Opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar ese producto?");
            
            if(Opcion == 0)
            {
                productorepositorio.deleteById(CodigoProducto);
                JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
            }
        }
            
    }
    private void GenerarInforme()
    {
        List<Producto> ListaProductos = (List<Producto>) productorepositorio.findAll();
        String NombrePrecioMayor = "";
        String NombrePrecioMenor = "";
        float PrecioMayor = (float) 0.0;
        float PrecioMenor = (float) 99999999999999999.9;
        float TotalPrecios = (float) 0.0;
        float TotalInventario = (float) 0.0;
        float Promedio = (float) 0.0;
        
        for (Producto Nproducto : ListaProductos) 
        {
            if(Nproducto.getPrecio() > PrecioMayor)
            {
                PrecioMayor = Nproducto.getPrecio();
                NombrePrecioMayor = Nproducto.getNombre();
            }
            if(Nproducto.getPrecio() < PrecioMenor)
            {
                PrecioMenor = Nproducto.getPrecio();
                NombrePrecioMenor = Nproducto.getNombre();
            }
            TotalInventario += Nproducto.getInventario()*Nproducto.getPrecio();
            TotalPrecios += Nproducto.getPrecio();
        }
        Promedio = TotalPrecios/ListaProductos.size();
        
        JOptionPane.showMessageDialog(null, 
                  "El Producto Mayor es: " + NombrePrecioMayor + 
                "\nEl Producto Menor es: " + NombrePrecioMenor + 
                "\nEl Promedio es: "+ String.format("%.1f", Promedio) + 
                "\nEl Total del Inventario es: " + TotalInventario);
    }

        private void LLenarInfoActualizar()
    {
        JTable MiTabla = Inicio.getTablaProductos();
        
        String NombreAct = (String) MiTabla.getModel().getValueAt(MiTabla.getSelectedRow(), 1);
        float PrecioAct = (float) MiTabla.getModel().getValueAt(MiTabla.getSelectedRow(), 2);
        Integer InventarioAct = (Integer) MiTabla.getModel().getValueAt(MiTabla.getSelectedRow(), 3);
        
        Inicio.getEspacioNombreAct().setText(NombreAct);
        Inicio.getEspacioPrecioAct().setText(String.valueOf(PrecioAct));
        Inicio.getEspacioInventarioAct().setText(String.valueOf(InventarioAct));
    }
    
    
    private void PonerProductos()
    {
        //Lista que devuelve la cantidad de registros que hay en la tabla.
        List<Producto> ListaProductos = (List<Producto>) productorepositorio.findAll();
        JTable MiTabla = Inicio.getTablaProductos();
        
        //Contador para las Filas de la Tabla.
        Integer NFilas =0;
        
        //Ciclo para llenar la Tabla de la Interfaz.
        for (Producto TP : ListaProductos) 
        {   
            //Llenado de la primera fila con cada columna de datos.
            MiTabla.setValueAt(TP.getCodigo(), NFilas, 0);
            MiTabla.setValueAt(TP.getNombre(), NFilas, 1);
            MiTabla.setValueAt(TP.getPrecio(), NFilas, 2);
            MiTabla.setValueAt(TP.getInventario(), NFilas, 3);
            
            //Variable para aumentar el número de filas y llenar todas las filas.
            NFilas++;
        }
        
        //Ciclo para colocar valores vacios en la tabla cada vez que eliminemos un registro.
        for (int i = 0; i < MiTabla.getRowCount(); i++) 
        {
            MiTabla.setValueAt("", NFilas, 0);
            MiTabla.setValueAt("", NFilas, 1);
            MiTabla.setValueAt("", NFilas, 2);
            MiTabla.setValueAt("", NFilas, 3);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getSource()==Inicio.getBotonAgregar())
        {
            if(Inicio.getEspacioNombre().getText().equals("")
             ||Inicio.getEspacioPrecio().getText().equals("")
             ||Inicio.getEspacioInventario().getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
            AgregarProductos();
            PonerProductos();
            }            
        }
        else if(evento.getSource()==Inicio.getBotonActualizar())
        {
            Inicio.getVentanaActualizar().setVisible(true);
            Inicio.getVentanaActualizar().setLocationRelativeTo(null);
            Inicio.getVentanaActualizar().setSize(460, 260);
            LLenarInfoActualizar();
        }
        else if(evento.getSource()==Inicio.getBotonBorrar())
        {
            BorrarProductos();
            PonerProductos();
        }
        else if(evento.getSource()==Inicio.getBotonInforme())
        {
            GenerarInforme();
        }
        else if(evento.getSource()==Inicio.getBotonActualizarAct())
        {
            if(Inicio.getEspacioNombreAct().getText().equals("")
             ||Inicio.getEspacioPrecioAct().getText().equals("")
             ||Inicio.getEspacioInventarioAct().getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
            ActualizarProductos();
            PonerProductos();
            Inicio.getVentanaActualizar().setVisible(false);
            }
        }
    }
}
