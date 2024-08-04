/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.User;

import Controller.DetallePedidoController;
import Controller.PedidoController;
import Controller.ProductController;
import Controller.PromotionController;
import Model.Dao.PedidoDao;
import Model.Dao.ProductDao;
import Model.Entity.DetallePedido;
import Model.Entity.Pedido;
import Model.Entity.Producto;
import Model.Entity.Promocion;
import Model.Service.Credenciales;
import View.Common.Pedidov;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amado
 */
public class EditarPedido extends javax.swing.JPanel {
    
    
    
    
    private List<Pedido> pedidosInfo;
    
    private ArrayList<Producto> productosPedidos;
    
    private ProductDao productoDao = new ProductDao();
    private int contador;
    private double PrecioParcial,PrecioTotal,PrecioFinal=0;
    private Producto productoSeleccionado = null;
    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private Credenciales credenciales;
    private PedidoController PedidoC;
    private ProductController pc = new ProductController();
    private PromotionController promoC = new PromotionController();
    private List<Promocion> promociones;
    private ArrayList<Integer> IndexProductosConPromocion;
    private DetallePedidoController detalleC;
    private List<Producto> productosList;
    
    
    public EditarPedido(Credenciales credenciales) {
        
        
        detalleC = new DetallePedidoController();
        productosPedidos = new ArrayList<Producto>();
        productosList = productoDao.getAllActiveProducts();
        initComponents();
        IndexProductosConPromocion = new ArrayList<Integer>();
        PedidoC = new PedidoController();
        
       
        
        this.credenciales = credenciales;
        list.setModel(modeloLista);
        CostoProducto.setDisabledTextColor(Color.decode("#006633"));
        CostoTotal.setDisabledTextColor(Color.decode("#006633"));
        
        
        pc.llenarComboBoxConProductos(Productos);        
        llenarPromos();
        
        PedidoC.llenarcombo(pedidoscombo, credenciales.getId());
        pedidosInfo = PedidoC.obtenerPedidosUsuario(credenciales.getId());     
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PromosDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        panelRound1 = new redondo.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPromos = new org.jdesktop.swingx.JXTable();
        Principal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Productos = new javax.swing.JComboBox<>();
        Cantidad = new javax.swing.JSpinner();
        EtiquetaTipo = new javax.swing.JLabel();
        CostoProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CostoTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pedidoscombo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        panelRound1.setBackground(new java.awt.Color(204, 204, 204));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        TablaPromos.setBackground(new java.awt.Color(204, 204, 204));
        TablaPromos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", ""},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPromos.setEditable(false);
        TablaPromos.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TablaPromos);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PromosDialogLayout = new javax.swing.GroupLayout(PromosDialog.getContentPane());
        PromosDialog.getContentPane().setLayout(PromosDialogLayout);
        PromosDialogLayout.setHorizontalGroup(
            PromosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PromosDialogLayout.setVerticalGroup(
            PromosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 204, 204));

        Principal.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(22, 120, 243));
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Ver promociones ");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(22, 120, 243));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Editar pedido");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Productos.setBackground(new java.awt.Color(255, 255, 255));
        Productos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Productos.setBorder(null);
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });

        Cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Cantidad.setEditor(new javax.swing.JSpinner.NumberEditor(Cantidad, "0"));
        Cantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantidadStateChanged(evt);
            }
        });

        EtiquetaTipo.setForeground(new java.awt.Color(0, 0, 0));
        EtiquetaTipo.setText("Kilogramos");

        CostoProducto.setEditable(false);
        CostoProducto.setBackground(new java.awt.Color(255, 255, 255));
        CostoProducto.setText("$");
        CostoProducto.setBorder(null);
        CostoProducto.setEnabled(false);

        jLabel3.setText("Costo");

        jButton3.setBackground(new java.awt.Color(102, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Agregar producto");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        list.setBackground(new java.awt.Color(255, 255, 255));
        list.setForeground(new java.awt.Color(51, 51, 51));
        list.setToolTipText("");
        list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(list);

        jButton4.setBackground(new java.awt.Color(146, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Eliminar producto seleccionado");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Costo total del pedido:");

        CostoTotal.setEditable(false);
        CostoTotal.setBackground(new java.awt.Color(255, 255, 255));
        CostoTotal.setText("$");
        CostoTotal.setBorder(null);
        CostoTotal.setEnabled(false);

        jLabel5.setText("Selecciona producto");

        jLabel6.setText("Selecciona la cantidad");

        jButton5.setBackground(new java.awt.Color(83, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ELIMINAR PEDIDO");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Selecciona el pedido a editar");

        pedidoscombo.setBackground(new java.awt.Color(255, 255, 255));
        pedidoscombo.setBorder(null);
        pedidoscombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoscomboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(260, 260, 260))
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(pedidoscombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Productos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CostoProducto)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PrincipalLayout.createSequentialGroup()
                                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(PrincipalLayout.createSequentialGroup()
                                                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(EtiquetaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(4, 4, 4)))
                        .addGap(6, 6, 6))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(CostoTotal)
                        .addGap(10, 10, 10)))
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(pedidoscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(EtiquetaTipo)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(CostoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(CostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 120, 243));
        jLabel1.setText("Editar Pedido");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void llenarPromos(){
        
        promociones= promoC.llenarComboBoxConPromociones();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Producto");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        
        for (Promocion promocion : promociones) {
            Producto producto = promocion.getProducto();
            String nombreProducto = producto != null ? producto.getNombre() : "Producto desconocido";
            
            IndexProductosConPromocion.add(promocion.getProducto().getId());
            
            int cantidad2 = promocion.getCantidad();
            double precioPromo = promocion.getPrecioPorPromocion();
            model.addRow(new Object[]{nombreProducto,cantidad2,precioPromo});
        }
        
        TablaPromos.setModel(model);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(PedidoC.eliminarPedido(pedidosInfo.get(pedidoscombo.getSelectedIndex()).getId())){
            if(list.getModel().getSize()!=0){
                Date fechaActual = new Date();
                Pedido nuevo = null;
                ArrayList<DetallePedido> arregloDetalles = new ArrayList<DetallePedido>();


                for(int i = 0;i<productosPedidos.size();i++){
                    String[] datos = separarCadena(modeloLista.getElementAt(i));
                    int idDB= productosPedidos.get(i).getId();
                    int medidaDatos = datos.length;
                    int cantDB = Integer.parseInt(datos[medidaDatos-4]);
                    double costoDB = productosPedidos.get(i).getCostoPorKilo();
                    double subTotalDB = Double.parseDouble(datos[medidaDatos-1]);

                    arregloDetalles.add(new DetallePedido(idDB,cantDB,costoDB,subTotalDB));

                }
                nuevo = new Pedido(credenciales.getId(),PrecioFinal,fechaActual,arregloDetalles);

                if(PedidoC.crearPedido(nuevo)){
                    Pedidov.crearPed();
                    JOptionPane.showMessageDialog(null, "Pedido actualizado correctamente", "PEDIDO ACTUALIZADO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el pedido intente mas tarde", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el pedido intente mas tarde", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public static String[] separarCadena(String cadena) {
        return cadena.split(" ");
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               
        int selectedIndex = list.getSelectedIndex();
        
        System.out.println(selectedIndex);
        
        if (selectedIndex != -1) {
            PrecioFinal-=convertirUltimoValor(list.getSelectedValue(), " ");
            modeloLista.remove(selectedIndex);
            CostoTotal.setText("$"+PrecioFinal);
            
            
            productosPedidos.remove(selectedIndex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed
    public double convertirUltimoValor(String cadena, String separador) {
        String[] valores = cadena.split(separador);
        return Double.parseDouble(valores[valores.length - 1]);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        modeloLista.addElement((String)Productos.getSelectedItem()+" "+Cantidad.getValue()+" "+EtiquetaTipo.getText()+"= $ "+PrecioTotal);
        
        PrecioFinal+= PrecioTotal;
        
        PrecioParcial=productoSeleccionado.getCostoPorKilo();
        PrecioTotal=productoSeleccionado.getCostoPorKilo();
        
        Cantidad.setValue(1);
        CostoTotal.setText("$"+PrecioFinal);
         
        productosPedidos.add(productoSeleccionado);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PromosDialog.pack(); // Ajusta el tamaño del JDialog al contenido
        PromosDialog.setLocationRelativeTo(null);
        PromosDialog.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(PedidoC.eliminarPedido(pedidosInfo.get(pedidoscombo.getSelectedIndex()).getId())){
            
            JOptionPane.showMessageDialog(null, "Pedido eliminado", "PEDIDO ELIMINADO", JOptionPane.INFORMATION_MESSAGE);
            Pedidov.crearPed();
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el pedido intente mas tarde", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        int index = Productos.getSelectedIndex();
        if(index>-1){
            productoSeleccionado = productosList.get(index);
        
            PrecioParcial=productoSeleccionado.getCostoPorKilo();

            if(productoSeleccionado.getTipo()==1){
                EtiquetaTipo.setText("Kilogramos");
            }else{
                EtiquetaTipo.setText("Piezas");
            }
            Cantidad.setValue(1);
            CostoProducto.setText("$"+PrecioParcial);
            PrecioTotal = PrecioParcial;
        }
    }//GEN-LAST:event_ProductosActionPerformed

    private void CantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CantidadStateChanged
       contador =  Integer.parseInt(String.valueOf(Cantidad.getValue()));
        
        if(IndexProductosConPromocion.contains(productoSeleccionado.getId())){
            Promocion promoAplicar = promocionActiva();
            if(promoAplicar!=null){
                int cantidadPromo = promoAplicar.getCantidad();
                double precioPromo = promoAplicar.getPrecioPorPromocion();
                int promosCompletas = contador/cantidadPromo;
                int residuos = contador%cantidadPromo;
                
                PrecioTotal=promosCompletas*precioPromo+residuos*PrecioParcial;
            }else{
                System.out.println("problema con la promocion");
            }
        }else{
            PrecioTotal = PrecioParcial*contador;
        }
        
        
        
        
        CostoProducto.setText("$"+PrecioTotal);
    }//GEN-LAST:event_CantidadStateChanged

    private void pedidoscomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoscomboActionPerformed
       modeloLista.removeAllElements();
        if(!(pedidosInfo==null)){
               productosPedidos = PedidoC.obtenerProductosPorIdPedido(pedidosInfo.get(pedidoscombo.getSelectedIndex()).getId());
               llenarJlist(pedidosInfo.get(pedidoscombo.getSelectedIndex()).getId());
               CostoTotal.setText(String.valueOf(pedidosInfo.get(pedidoscombo.getSelectedIndex()).getCostoFinal()));
               PrecioFinal=pedidosInfo.get(pedidoscombo.getSelectedIndex()).getCostoFinal();
        }
        
    }//GEN-LAST:event_pedidoscomboActionPerformed
    public Promocion promocionActiva(){

        for (Promocion promocion : promociones) {
            if(promocion.getProducto().getId()==productoSeleccionado.getId()){
                return promocion;
            }
  
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Cantidad;
    private javax.swing.JTextField CostoProducto;
    private javax.swing.JTextField CostoTotal;
    private javax.swing.JLabel EtiquetaTipo;
    private javax.swing.JPanel Principal;
    private javax.swing.JComboBox<String> Productos;
    private javax.swing.JDialog PromosDialog;
    private org.jdesktop.swingx.JXTable TablaPromos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list;
    private redondo.PanelRound panelRound1;
    private javax.swing.JComboBox<String> pedidoscombo;
    // End of variables declaration//GEN-END:variables

    private void llenarCombobox() {
        
    }

    private void llenarJlist(int id) {
        detalleC.llenarjlist(list, id);
    }
}
