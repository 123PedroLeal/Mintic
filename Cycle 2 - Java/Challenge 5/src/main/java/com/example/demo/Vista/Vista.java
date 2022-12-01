package com.example.demo.Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Vista extends javax.swing.JFrame 
{

    public Vista() 
    {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaActualizar = new javax.swing.JFrame();
        TituloPestañaact = new javax.swing.JLabel();
        TituloNombreAct = new javax.swing.JLabel();
        TituloPrecioAct = new javax.swing.JLabel();
        TituloInventarioAct = new javax.swing.JLabel();
        EspacioNombreAct = new javax.swing.JTextField();
        EspacioPrecioAct = new javax.swing.JTextField();
        EspacioInventarioAct = new javax.swing.JTextField();
        BotonActualizarAct = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        EspacioAgregar = new javax.swing.JLayeredPane();
        TituloSecciónAgregar = new javax.swing.JLabel();
        TituloNombre = new javax.swing.JLabel();
        TituloPrecio = new javax.swing.JLabel();
        TituloInventario = new javax.swing.JLabel();
        EspacioNombre = new javax.swing.JTextField();
        EspacioInventario = new javax.swing.JTextField();
        EspacioPrecio = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JButton();
        PanelConBarras = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        BotonBorrar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonInforme = new javax.swing.JButton();

        TituloPestañaact.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        TituloPestañaact.setText("Actualizar Producto");

        TituloNombreAct.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        TituloNombreAct.setText("Nombre");

        TituloPrecioAct.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        TituloPrecioAct.setText("Precio");

        TituloInventarioAct.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        TituloInventarioAct.setText("Inventario");

        BotonActualizarAct.setText("Actualizar Info Productos");
        BotonActualizarAct.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout VentanaActualizarLayout = new javax.swing.GroupLayout(VentanaActualizar.getContentPane());
        VentanaActualizar.getContentPane().setLayout(VentanaActualizarLayout);
        VentanaActualizarLayout.setHorizontalGroup(
            VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaActualizarLayout.createSequentialGroup()
                .addGroup(VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaActualizarLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(TituloPestañaact))
                    .addGroup(VentanaActualizarLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentanaActualizarLayout.createSequentialGroup()
                                .addGroup(VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TituloPrecioAct)
                                    .addComponent(TituloNombreAct))
                                .addGap(39, 39, 39)
                                .addGroup(VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EspacioNombreAct, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EspacioPrecioAct)))
                            .addGroup(VentanaActualizarLayout.createSequentialGroup()
                                .addComponent(TituloInventarioAct)
                                .addGap(18, 18, 18)
                                .addGroup(VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EspacioInventarioAct)
                                    .addGroup(VentanaActualizarLayout.createSequentialGroup()
                                        .addComponent(BotonActualizarAct, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VentanaActualizarLayout.setVerticalGroup(
            VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaActualizarLayout.createSequentialGroup()
                .addGroup(VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaActualizarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(TituloPestañaact, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentanaActualizarLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TituloNombreAct)
                            .addComponent(EspacioNombreAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TituloPrecioAct)
                            .addComponent(EspacioPrecioAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VentanaActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TituloInventarioAct)
                            .addComponent(EspacioInventarioAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(BotonActualizarAct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        Titulo.setText("Bienvenido al Inventario.APP :)");

        EspacioAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TituloSecciónAgregar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        TituloSecciónAgregar.setText("Agregar un nuevo Producto");

        TituloNombre.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        TituloNombre.setText("Nombre");

        TituloPrecio.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        TituloPrecio.setText("Precio");

        TituloInventario.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        TituloInventario.setText("Inventario");

        BotonAgregar.setText("Agregar Producto");
        BotonAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        EspacioAgregar.setLayer(TituloSecciónAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EspacioAgregar.setLayer(TituloNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EspacioAgregar.setLayer(TituloPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EspacioAgregar.setLayer(TituloInventario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EspacioAgregar.setLayer(EspacioNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EspacioAgregar.setLayer(EspacioInventario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EspacioAgregar.setLayer(EspacioPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EspacioAgregar.setLayer(BotonAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EspacioAgregarLayout = new javax.swing.GroupLayout(EspacioAgregar);
        EspacioAgregar.setLayout(EspacioAgregarLayout);
        EspacioAgregarLayout.setHorizontalGroup(
            EspacioAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EspacioAgregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(EspacioAgregarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(EspacioAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloPrecio)
                    .addComponent(TituloNombre)
                    .addComponent(TituloInventario))
                .addGap(24, 24, 24)
                .addGroup(EspacioAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EspacioAgregarLayout.createSequentialGroup()
                        .addComponent(TituloSecciónAgregar)
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addGroup(EspacioAgregarLayout.createSequentialGroup()
                        .addGroup(EspacioAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EspacioPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EspacioInventario)
                            .addComponent(EspacioNombre))
                        .addGap(18, 18, 18))))
        );
        EspacioAgregarLayout.setVerticalGroup(
            EspacioAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspacioAgregarLayout.createSequentialGroup()
                .addComponent(TituloSecciónAgregar)
                .addGap(12, 12, 12)
                .addGroup(EspacioAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EspacioAgregarLayout.createSequentialGroup()
                        .addGroup(EspacioAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EspacioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TituloNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TituloPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EspacioAgregarLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(EspacioPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EspacioAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EspacioInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TituloInventario))))
                .addGap(18, 18, 18)
                .addComponent(BotonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        PanelConBarras.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Inventario"
            }
        ));
        TablaProductos.setName(""); // NOI18N
        PanelConBarras.setViewportView(TablaProductos);

        BotonBorrar.setText("Borrar Producto");
        BotonBorrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BotonActualizar.setText("Actualizar Producto");
        BotonActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BotonInforme.setText("Generar Informe");
        BotonInforme.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EspacioAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(124, 124, 124)
                                    .addComponent(Titulo))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(93, 93, 93)
                                    .addComponent(PanelConBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacioAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelConBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonActualizarAct;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonInforme;
    private javax.swing.JLayeredPane EspacioAgregar;
    private javax.swing.JTextField EspacioInventario;
    private javax.swing.JTextField EspacioInventarioAct;
    private javax.swing.JTextField EspacioNombre;
    private javax.swing.JTextField EspacioNombreAct;
    private javax.swing.JTextField EspacioPrecio;
    private javax.swing.JTextField EspacioPrecioAct;
    private javax.swing.JScrollPane PanelConBarras;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloInventario;
    private javax.swing.JLabel TituloInventarioAct;
    private javax.swing.JLabel TituloNombre;
    private javax.swing.JLabel TituloNombreAct;
    private javax.swing.JLabel TituloPestañaact;
    private javax.swing.JLabel TituloPrecio;
    private javax.swing.JLabel TituloPrecioAct;
    private javax.swing.JLabel TituloSecciónAgregar;
    private javax.swing.JFrame VentanaActualizar;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonActualizar() 
    {
        return BotonActualizar;
    }

    public JButton getBotonAgregar() 
    {
        return BotonAgregar;
    }

    public JButton getBotonBorrar() 
    {
        return BotonBorrar;
    }

    public JButton getBotonInforme() 
    {
        return BotonInforme;
    }

    public JLayeredPane getEspacioAgregar() 
    {
        return EspacioAgregar;
    }

    public JTextField getEspacioInventario() 
    {
        return EspacioInventario;
    }

    public JTextField getEspacioNombre() 
    {
        return EspacioNombre;
    }

    public JTextField getEspacioPrecio() 
    {
        return EspacioPrecio;
    }

    public JScrollPane getPanelConBarras() 
    {
        return PanelConBarras;
    }

    public JTable getTablaProductos() 
    {
        return TablaProductos;
    }

    public JLabel getTitulo() 
    {
        return Titulo;
    }

    public JLabel getTituloInventario() 
    {
        return TituloInventario;
    }

    public JLabel getTituloNombre() 
    {
        return TituloNombre;
    }

    public JLabel getTituloPrecio() 
    {
        return TituloPrecio;
    }

    public JLabel getTituloSecciónAgregar() 
    {
        return TituloSecciónAgregar;
    }

    public JButton getBotonActualizarAct() {
        return BotonActualizarAct;
    }

    public JTextField getEspacioInventarioAct() {
        return EspacioInventarioAct;
    }

    public JTextField getEspacioNombreAct() {
        return EspacioNombreAct;
    }

    public JTextField getEspacioPrecioAct() {
        return EspacioPrecioAct;
    }

    public JLabel getTituloInventarioAct() {
        return TituloInventarioAct;
    }

    public JLabel getTituloNombreAct() {
        return TituloNombreAct;
    }

    public JLabel getTituloPestañaact() {
        return TituloPestañaact;
    }

    public JLabel getTituloPrecioAct() {
        return TituloPrecioAct;
    }

    public JFrame getVentanaActualizar() {
        return VentanaActualizar;
    }

    

}
