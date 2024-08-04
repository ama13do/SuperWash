/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.User;

import Controller.PedidoController;
import Controller.ProductController;
import Controller.PromotionController;
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
public class CrearPedido extends javax.swing.JPanel {
    private int contador;
    private double PrecioParcial,PrecioTotal,PrecioFinal=0;
    private Producto productoSeleccionado = null;
    private ProductDao productoDao = new ProductDao();
    private PromotionController promoC = new PromotionController();
    private PedidoController PedidoC = new PedidoController();
    private ArrayList<Integer> IndexProductosConPromocion;
    
    private List<Producto> productosList;
    
    private List<Promocion> promociones;
    
    private ArrayList<Producto> productosPedidos;
    private Credenciales credenciales;
    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private ProductController pc = new ProductController();
    
    public CrearPedido(Credenciales credenciales) {
        this.credenciales = credenciales;
        
        productosPedidos = new ArrayList<Producto>();
        
        
        IndexProductosConPromocion = new ArrayList<Integer>();
        PrecioParcial=0;
        PrecioTotal=0;
        contador=0;
        initComponents();
        
        productosList = productoDao.getAllActiveProducts();
        
        pc.llenarComboBoxConProductos(Productos);
        
        list.setModel(modeloLista);
        
        llenarPromos();
        
        CostoProducto.setDisabledTextColor(Color.decode("#006633"));
        CostoTotal.setDisabledTextColor(Color.decode("#006633"));
    }

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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PromosDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        panelRound1 = new redondo.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPromos = new org.jdesktop.swingx.JXTable();
        jPanel4 = new javax.swing.JPanel();
        Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        panelRound1.setBackground(new java.awt.Color(204, 204, 204));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        TablaPromos.setBackground(new java.awt.Color(204, 204, 204));
        TablaPromos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"sss", "ss", ""},
                {null, null, null},
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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 204, 204));

        Principal.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 120, 243));
        jLabel1.setText("Crear Pedido");

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
        jButton2.setText("Crear pedido");
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
        CostoProducto.setForeground(new java.awt.Color(0, 25, 11));
        CostoProducto.setText("$");
        CostoProducto.setBorder(null);
        CostoProducto.setEnabled(false);
        CostoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoProductoActionPerformed(evt);
            }
        });

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

        jLabel4.setForeground(new java.awt.Color(0, 46, 107));
        jLabel4.setText("Costo total del pedido:");

        CostoTotal.setEditable(false);
        CostoTotal.setBackground(new java.awt.Color(255, 255, 255));
        CostoTotal.setForeground(new java.awt.Color(0, 102, 51));
        CostoTotal.setText("$0");
        CostoTotal.setBorder(null);
        CostoTotal.setEnabled(false);

        jLabel5.setText("Selecciona producto");

        jLabel6.setText("Selecciona la cantidad");

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CostoProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrincipalLayout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addGap(1, 1, 1))
                                    .addComponent(Productos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrincipalLayout.createSequentialGroup()
                                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EtiquetaTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(PrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CostoTotal)))
                                .addGap(10, 10, 10))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaTipo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CostoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(73, 73, 73)
                        .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
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
                JOptionPane.showMessageDialog(null, "Pedido realizado", "PEDIDO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
                Pedidov.crearPed();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo realizar el pedido intente mas tarde", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public static String[] separarCadena(String cadena) {
        return cadena.split(" ");
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               
        int selectedIndex = list.getSelectedIndex();
        
        
        if (selectedIndex != -1) {
            PrecioFinal-=convertirUltimoValor(list.getSelectedValue(), " ");
            modeloLista.remove(selectedIndex);
            CostoTotal.setText("$"+PrecioFinal);
            
            
            productosPedidos.remove(selectedIndex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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

    private void CostoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostoProductoActionPerformed

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
    
    public double convertirUltimoValor(String cadena, String separador) {
        String[] valores = cadena.split(separador);
        return Double.parseDouble(valores[valores.length - 1]);
    }
    
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list;
    private redondo.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
