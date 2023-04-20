package com.sinfloo.vista;

import com.formdev.flatlaf.FlatLightLaf;
import com.sinfloo.modelo.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.*;
import javax.swing.text.*;

public class vista extends javax.swing.JFrame {

    public String busqueda;
    public Connection con;
    private boolean negritaAplicada = false;

    public vista(String busqueda) {
        initComponents();
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            this.getContentPane().setBackground(Color.WHITE);
        } catch (Exception e) {
            System.out.println(e);
        }
        this.busqueda = busqueda;
        this.getContentPane().setBackground(Color.WHITE);
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
        establecerRegistrosEnCampos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtExpediente = new javax.swing.JTextField();
        txtJuez = new javax.swing.JTextField();
        txtMateria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTipoCaso = new javax.swing.JTextField();
        txtDemandante = new javax.swing.JTextField();
        txtDemandado = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegrear = new javax.swing.JButton();
        btnMayuscula = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnPequeño = new javax.swing.JButton();
        btnCapitalizar = new javax.swing.JButton();
        btnGrande = new javax.swing.JButton();
        btnNegrita = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTION DE EXPEDIENTES");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane5.setViewportView(txtHistorial);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtExpediente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtJuez.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtMateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("No. Expediente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("No. Juez");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Materia");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Tipo de Caso:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Demandante:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Demandado:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Fecha de Inicio:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMateria)
                    .addComponent(txtJuez, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtExpediente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaInicio))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTipoCaso, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtDemandante)
                            .addComponent(txtDemandado))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtDemandante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtJuez, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtDemandado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/add.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/delete.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/update.png"))); // NOI18N
        btnActualizar.setText("UPDATE");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/nuevo.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegrear.setBackground(new java.awt.Color(255, 255, 255));
        btnRegrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/nuevo.png"))); // NOI18N
        btnRegrear.setText("REGRESAR");
        btnRegrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnRegrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegrear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnRegrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnMayuscula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/mayuscula.png"))); // NOI18N
        btnMayuscula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayusculaActionPerformed(evt);
            }
        });

        btnMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/minuscula.png"))); // NOI18N
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/font_pequeña.png"))); // NOI18N
        btnPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPequeñoActionPerformed(evt);
            }
        });

        btnCapitalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/capitalizar.png"))); // NOI18N
        btnCapitalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapitalizarActionPerformed(evt);
            }
        });

        btnGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/font_grande.png"))); // NOI18N
        btnGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrandeActionPerformed(evt);
            }
        });

        btnNegrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/negrita.png"))); // NOI18N
        btnNegrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegritaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMayuscula, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCapitalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNegrita, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNegrita, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapitalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPequeño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMayuscula, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void establecerRegistrosEnCampos() {
        try {
            Statement stmt = con.createStatement();
            String consulta = "SELECT * FROM expediente WHERE num_exp = '" + busqueda + "'";

            ResultSet rs = stmt.executeQuery(consulta);
            List<String[]> registros = new ArrayList<>(); // lista para guardar los registros

            while (rs.next()) {
                String[] registro = new String[9]; // arreglo para guardar los valores de un registro
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("num_exp");
                registro[2] = rs.getString("num_juez");
                registro[3] = rs.getString("materia");
                registro[4] = rs.getString("demandante");
                registro[5] = rs.getString("demandado");
                registro[6] = rs.getString("tipo_caso");
                registro[7] = rs.getString("fecha_inicio");
                registro[8] = rs.getString("historial");

                registros.add(registro); // añadir el registro a la lista
                establecerCampos(registros.get(0));
            }
        } catch (Exception e) {
        }
    }

    public void establecerCampos(String[] registro) {

        txtId.setText(registro[0]);
        txtExpediente.setText(registro[1]);
        txtJuez.setText(registro[2]);
        txtMateria.setText(registro[3]);
        txtDemandante.setText(registro[4]);
        txtDemandado.setText(registro[5]);
        txtTipoCaso.setText(registro[6]);
        txtFechaInicio.setText(registro[7]);
        txtHistorial.setText(registro[8]);

    }

    public void insertarCampos(String[] registro) {
        try {
            String sql = "SELECT * FROM expediente WHERE num_exp = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, registro[0]);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El expediente ya existe.");
            } else {
                sql = "INSERT INTO expediente(num_exp, num_juez, materia, tipo_caso, demandante, demandado, fecha_inicio, historial) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, registro[0]);
                stmt.setString(2, registro[1]);
                stmt.setString(3, registro[2]);
                stmt.setString(4, registro[3]);
                stmt.setString(5, registro[4]);
                stmt.setString(6, registro[5]);
                stmt.setString(7, registro[6]);
                stmt.setString(8, registro[7]);
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Se registraron los campos con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "La inserción falló. Registros inválidos.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "La inserción falló. Error de conexión.");
        }
    }

    public void actualizarCampos(String[] registro) {

        try {
            String sql = "UPDATE expediente SET num_juez = ?, materia = ?, tipo_caso = ?, demandante = ?, demandado = ?, fecha_inicio = ?, historial = ? WHERE num_exp = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, registro[1]);
            stmt.setString(2, registro[2]);
            stmt.setString(3, registro[3]);
            stmt.setString(4, registro[4]);
            stmt.setString(5, registro[5]);
            stmt.setString(6, registro[6]);
            stmt.setString(7, registro[7]);
            stmt.setString(8, registro[0]);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "El registro se actualizó con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "La actualización falló");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void eliminarCampos(String[] registro) {
        try {
            String sql = "delete from expediente where num_exp = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, registro[0]);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "El registro se elimino con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "La eliminacion fallo");
                System.out.println(registro[0]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        List<String[]> registro = new ArrayList<>();

        String[] registros = new String[8];

        registros[0] = txtExpediente.getText();
        registros[1] = txtJuez.getText();
        registros[2] = txtMateria.getText();
        registros[3] = txtTipoCaso.getText();
        registros[4] = txtDemandante.getText();
        registros[5] = txtDemandado.getText();
        registros[6] = txtFechaInicio.getText();
        registros[7] = txtHistorial.getText();

        registro.add(registros);
        insertarCampos(registro.get(0));


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        List<String[]> registro = new ArrayList<>();

        String[] registros = new String[8];

        registros[0] = txtExpediente.getText();
        registros[1] = txtJuez.getText();
        registros[2] = txtMateria.getText();
        registros[3] = txtTipoCaso.getText();
        registros[4] = txtDemandante.getText();
        registros[5] = txtDemandado.getText();
        registros[6] = txtFechaInicio.getText();
        registros[7] = txtHistorial.getText();

        registro.add(registros);
        actualizarCampos(registro.get(0));

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar miFrame2 = new buscar();
        miFrame2.setVisible(true);
        miFrame2.setBackground(Color.white);
        miFrame2.setLocationRelativeTo(null);
        miFrame2.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void limpiarCampos() {
        txtId.setText("");
        txtExpediente.setText("");
        txtJuez.setText("");
        txtMateria.setText("");
        txtTipoCaso.setText("");
        txtDemandante.setText("");
        txtDemandado.setText("");
        txtFechaInicio.setText("");
        txtHistorial.setText("");
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de querer hacer esto?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            List<String[]> registro = new ArrayList<>();

            String[] registros = new String[8];

            registros[0] = txtExpediente.getText();
            registros[1] = txtJuez.getText();
            registros[2] = txtMateria.getText();
            registros[3] = txtTipoCaso.getText();
            registros[4] = txtDemandante.getText();
            registros[5] = txtDemandado.getText();
            registros[6] = txtFechaInicio.getText();
            registros[7] = txtHistorial.getText();

            registro.add(registros);
            eliminarCampos(registro.get(0));
            limpiarCampos();
        } else {
            // El usuario seleccionó "No" o cerró el diálogo
            System.out.println("El usuario seleccionó No o cerró el diálogo");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRegrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegrearActionPerformed
        inicio miFrame2 = new inicio();
        miFrame2.setVisible(true);
        miFrame2.setBackground(Color.white);
        miFrame2.setLocationRelativeTo(null);
        miFrame2.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btnRegrearActionPerformed

    private void btnMayusculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayusculaActionPerformed
        String mayus = txtHistorial.getText().toUpperCase();
        txtHistorial.setText(mayus);
    }//GEN-LAST:event_btnMayusculaActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        String minus = txtHistorial.getText().toLowerCase();
        txtHistorial.setText(minus);
    }//GEN-LAST:event_btnMinusActionPerformed

    public String capitalizarTextoPorLineas(String texto) {
        String[] lineas = texto.split("\\n");
        String resultado = "";
        for (int i = 0; i < lineas.length; i++) {
            String lineaCapitalizada = capitalizarTexto(lineas[i]);
            resultado += lineaCapitalizada + "\n";
        }
        return resultado;
    }

    public String capitalizarTexto(String texto) {
        String primeraLetra = texto.substring(0, 1).toUpperCase();
        String restoDeLaCadena = texto.substring(1).toLowerCase();
        String textoConvertido = primeraLetra + restoDeLaCadena;
        return textoConvertido;
    }

    private void btnCapitalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapitalizarActionPerformed
        txtHistorial.setText(capitalizarTextoPorLineas(txtHistorial.getText()));

    }//GEN-LAST:event_btnCapitalizarActionPerformed

    private void btnPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPequeñoActionPerformed
        Font font = txtHistorial.getFont();
        Font newFont = new Font(font.getName(), font.getStyle(), font.getSize() - 2);
        txtHistorial.setFont(newFont);

    }//GEN-LAST:event_btnPequeñoActionPerformed

    private void btnGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrandeActionPerformed
        Font font = txtHistorial.getFont();
        Font newFont = new Font(font.getName(), font.getStyle(), font.getSize() + 2);
        txtHistorial.setFont(newFont);

    }//GEN-LAST:event_btnGrandeActionPerformed

    public void toggleBoldSelectedText(JTextPane textPane) {
        StyledDocument doc = textPane.getStyledDocument();
        int start = textPane.getSelectionStart();
        int end = textPane.getSelectionEnd();
        Element elem = doc.getCharacterElement(start);
        AttributeSet attrs = elem.getAttributes();
        MutableAttributeSet attrSet = new SimpleAttributeSet(attrs.copyAttributes());
        StyleConstants.setBold(attrSet, !StyleConstants.isBold(attrs));
        doc.setCharacterAttributes(start, end - start, attrSet, true);
    }


    private void btnNegritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegritaActionPerformed
        Font font = txtHistorial.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        if (attributes.containsKey(TextAttribute.WEIGHT)) {
            Object weight = attributes.get(TextAttribute.WEIGHT);
            if (weight.equals(TextAttribute.WEIGHT_BOLD)) {
                attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_REGULAR);
            } else {
                attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
            }
        } else {
            attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
        }
        txtHistorial.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_btnNegritaActionPerformed

    public static void main(String args[]) {
        vista v = new vista("");

        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCapitalizar;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGrande;
    private javax.swing.JButton btnMayuscula;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnNegrita;
    private javax.swing.JButton btnPequeño;
    public javax.swing.JButton btnRegrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    public javax.swing.JTextField txtDemandado;
    public javax.swing.JTextField txtDemandante;
    public javax.swing.JTextField txtExpediente;
    public javax.swing.JTextField txtFechaInicio;
    private javax.swing.JEditorPane txtHistorial;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtJuez;
    public javax.swing.JTextField txtMateria;
    public javax.swing.JTextField txtTipoCaso;
    // End of variables declaration//GEN-END:variables
}
