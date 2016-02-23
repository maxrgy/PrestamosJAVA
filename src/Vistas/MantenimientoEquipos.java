/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.datacontract.schemas._2004._07.prestamosservicios.ArrayOfEquipo;
import org.datacontract.schemas._2004._07.prestamosservicios.Equipo;
import org.tempuri.IEquiposCrearEquipoEquipoRepetidoExcepcionFaultFaultMessage;
import org.tempuri.IEquiposEliminarEquipoEquipoEliminarExcepcionFaultFaultMessage;

/**
 *
 * @author utilisateur
 */
public class MantenimientoEquipos extends javax.swing.JInternalFrame {

    int filaseleccionada;
    int TipoProcedimiento = 0;
    DefaultComboBoxModel ModelModelos;
    DefaultTableModel ModelEquipos;
    List<Equipo> listaEquipos;
    List<String> modelos;
    Iterator iteratorEquipos;
    Equipo nuevoEquipo;
    Iterator iterator;
    String nuevomodelo;

    /* Creates new form NewJInternalFrame
     */
    public MantenimientoEquipos() {
        ModelModelos = new DefaultComboBoxModel();
        //Valores a títulos de tabla Equipos
        ModelEquipos = new DefaultTableModel();
        ModelEquipos.addColumn("ID");
        ModelEquipos.addColumn("Modelo");
        ModelEquipos.addColumn("Serie");
        ModelEquipos.addColumn("Estado");
        initComponents();
        modelos = listarModelosEquipos().getString();
        listaEquipos = listarEquipos().getEquipo();
        iteratorEquipos = listaEquipos.iterator();

        CbModelo.setVisible(false);
        BtInsertarModificar.setVisible(false);
        EtEstado.setVisible(false);
        EtSerie.setVisible(false);
        EtModelo.setVisible(false);
        TxEstado.setVisible(false);
        TxSerie.setVisible(false);

        //Cargando Tabla Equipos
        iterator = modelos.iterator();
        while (iteratorEquipos.hasNext()) {
            nuevoEquipo = (Equipo) iteratorEquipos.next();

            String[] Datos = new String[4];
            Datos[0] = nuevoEquipo.getId().toString();
            Datos[1] = nuevoEquipo.getModelo().getValue();
            Datos[2] = nuevoEquipo.getSerie().getValue();
            Datos[3] = nuevoEquipo.getEstado().getValue();

            ModelEquipos.addRow(Datos);
        }

        //Cargando CbModelos
        while (iterator.hasNext()) {
            nuevomodelo = (String) iterator.next();
            ModelModelos.addElement(nuevomodelo);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EtModelo = new javax.swing.JLabel();
        BtEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbEquipos = new javax.swing.JTable();
        CbModelo = new javax.swing.JComboBox<>();
        BtInsertar = new javax.swing.JButton();
        BtModificar = new javax.swing.JButton();
        BtActualizar = new javax.swing.JButton();
        TxSerie = new javax.swing.JTextField();
        TxEstado = new javax.swing.JTextField();
        EtSerie = new javax.swing.JLabel();
        EtEstado = new javax.swing.JLabel();
        BtInsertarModificar = new javax.swing.JButton();

        setTitle("Eliminar Equipos");

        EtModelo.setText("Modelo:");

        BtEliminar.setText("Eliminar seleccionado");
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });

        TbEquipos.setModel(ModelEquipos);
        jScrollPane1.setViewportView(TbEquipos);

        CbModelo.setModel(ModelModelos);
        CbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbModeloActionPerformed(evt);
            }
        });

        BtInsertar.setText("Insertar nuevo");
        BtInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInsertarActionPerformed(evt);
            }
        });

        BtModificar.setText("Modificar seleccionado");
        BtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtModificarActionPerformed(evt);
            }
        });

        BtActualizar.setText("Actualizar tabla");
        BtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtActualizarActionPerformed(evt);
            }
        });

        TxSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxSerieActionPerformed(evt);
            }
        });

        EtSerie.setText("Serie:");

        EtEstado.setText("Estado:");

        BtInsertarModificar.setText("jButton1");
        BtInsertarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInsertarModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EtEstado)
                        .addGap(492, 492, 492))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtModelo)
                            .addComponent(EtSerie))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxEstado)
                            .addComponent(TxSerie)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(BtInsertarModificar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(329, 329, 329))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(BtInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(BtModificar)
                        .addGap(21, 21, 21)
                        .addComponent(BtEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(BtActualizar)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtModelo)
                    .addComponent(CbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtSerie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtEstado))
                .addGap(18, 18, 18)
                .addComponent(BtInsertarModificar)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbModeloActionPerformed

    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed
        filaseleccionada = TbEquipos.getSelectedRow();
        if (filaseleccionada > 0) {
            try {
                eliminarEquipo(Integer.parseInt(TbEquipos.getValueAt(filaseleccionada, 0).toString()));
                ModelEquipos.removeRow(filaseleccionada);
            } catch (IEquiposEliminarEquipoEquipoEliminarExcepcionFaultFaultMessage ex) {
                JOptionPane.showOptionDialog(this, ex.getFaultInfo().getMensaje().getValue(), ex.getMessage(), JOptionPane.ERROR_MESSAGE, JOptionPane.ERROR_MESSAGE, null, new Object[]{" Aceptar "}, "Cancelar");
            }

        }
        
    }//GEN-LAST:event_BtEliminarActionPerformed

    private void TxSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxSerieActionPerformed

    private void BtInsertarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInsertarModificarActionPerformed
        if (TipoProcedimiento == 1) {
            int indice = CbModelo.getSelectedIndex();
            try {
                crearEquipo(TxSerie.getText(), CbModelo.getItemAt(indice), "D");
                BtInsertarModificar.setText("");
                CbModelo.setVisible(false);
                BtInsertarModificar.setVisible(false);
                EtSerie.setVisible(false);
                EtModelo.setVisible(false);
                TxSerie.setVisible(false);
                
            } catch (IEquiposCrearEquipoEquipoRepetidoExcepcionFaultFaultMessage ex) {
                JOptionPane.showOptionDialog(this, ex.getFaultInfo().getMensaje().getValue(), ex.getMessage(), JOptionPane.ERROR_MESSAGE, JOptionPane.ERROR_MESSAGE, null, new Object[]{" Aceptar "}, "Cancelar");
            }
        }
        else if (TipoProcedimiento==2){
            int indice = CbModelo.getSelectedIndex();
            modificarEquipo(Integer.parseInt(TbEquipos.getValueAt(filaseleccionada, 0).toString()),TxSerie.getText(), CbModelo.getItemAt(indice), TxEstado.getText());
            BtInsertarModificar.setText("");
                CbModelo.setVisible(false);
                BtInsertarModificar.setVisible(false);
                EtSerie.setVisible(false);
                EtModelo.setVisible(false);
                TxSerie.setVisible(false);
                TxEstado.setVisible(false);
                EtEstado.setVisible(false);
        }
    }//GEN-LAST:event_BtInsertarModificarActionPerformed

    private void BtInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInsertarActionPerformed
        TipoProcedimiento = 1;
        BtInsertarModificar.setText("Insertar");
        CbModelo.setVisible(true);
        BtInsertarModificar.setVisible(true);
        EtSerie.setVisible(true);
        EtModelo.setVisible(true);
        TxSerie.setVisible(true);
        TxEstado.setVisible(false);
        EtEstado.setVisible(false);

    }//GEN-LAST:event_BtInsertarActionPerformed

    private void BtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtModificarActionPerformed
        TipoProcedimiento = 2;
        int seleccionado = 0;
        filaseleccionada = TbEquipos.getSelectedRow();
        if (filaseleccionada > 0) {
            TxEstado.setText(TbEquipos.getValueAt(filaseleccionada, 3).toString());
            TxSerie.setText(TbEquipos.getValueAt(filaseleccionada, 2).toString());

            /*while (iterator.hasNext()) {
            nuevomodelo = (String) iterator.next().toString();
            if (nuevomodelo==TbEquipos.getValueAt(filaseleccionada,1).toString()){
                seleccionado = iterator.;
            }
            }*/
            CbModelo.setSelectedIndex(seleccionado);
            BtInsertarModificar.setText("Modificar");
            CbModelo.setVisible(true);
            BtInsertarModificar.setVisible(true);
            EtEstado.setVisible(true);
            EtSerie.setVisible(true);
            EtModelo.setVisible(true);
            TxEstado.setVisible(true);
            TxSerie.setVisible(true);
        }
        else{
            
        }
    }//GEN-LAST:event_BtModificarActionPerformed

    private void BtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtActualizarActionPerformed
        int filas = TbEquipos.getRowCount();
        for (int i = 0; filas > i; i++) {
            ModelEquipos.removeRow(0);
        }
        listaEquipos = listarEquipos().getEquipo();
        iteratorEquipos = listaEquipos.iterator();
        while (iteratorEquipos.hasNext()) {
            nuevoEquipo = (Equipo) iteratorEquipos.next();

            String[] Datos = new String[4];
            Datos[0] = nuevoEquipo.getId().toString();
            Datos[1] = nuevoEquipo.getModelo().getValue();
            Datos[2] = nuevoEquipo.getSerie().getValue();
            Datos[3] = nuevoEquipo.getEstado().getValue();

            ModelEquipos.addRow(Datos);
        }

    }//GEN-LAST:event_BtActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtActualizar;
    private javax.swing.JButton BtEliminar;
    private javax.swing.JButton BtInsertar;
    private javax.swing.JButton BtInsertarModificar;
    private javax.swing.JButton BtModificar;
    private javax.swing.JComboBox<String> CbModelo;
    private javax.swing.JLabel EtEstado;
    private javax.swing.JLabel EtModelo;
    private javax.swing.JLabel EtSerie;
    private javax.swing.JTable TbEquipos;
    private javax.swing.JTextField TxEstado;
    private javax.swing.JTextField TxSerie;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private static ArrayOfstring listarModelosEquipos() {
        org.tempuri.Equipos service = new org.tempuri.Equipos();
        org.tempuri.IEquipos port = service.getBasicHttpBindingIEquipos();
        return port.listarModelosEquipos();
    }

    private static ArrayOfEquipo listarEquipos() {
        org.tempuri.Equipos service = new org.tempuri.Equipos();
        org.tempuri.IEquipos port = service.getBasicHttpBindingIEquipos();
        return port.listarEquipos();
    }

    private static void eliminarEquipo(java.lang.Integer id) throws IEquiposEliminarEquipoEquipoEliminarExcepcionFaultFaultMessage {
        org.tempuri.Equipos service = new org.tempuri.Equipos();
        org.tempuri.IEquipos port = service.getBasicHttpBindingIEquipos();
        port.eliminarEquipo(id);
    }

    private static Equipo crearEquipo(java.lang.String serie, java.lang.String modelo, java.lang.String estado) throws IEquiposCrearEquipoEquipoRepetidoExcepcionFaultFaultMessage {
        org.tempuri.Equipos service = new org.tempuri.Equipos();
        org.tempuri.IEquipos port = service.getBasicHttpBindingIEquipos();
        return port.crearEquipo(serie, modelo, estado);
    }

    private static Equipo modificarEquipo(java.lang.Integer id, java.lang.String serie, java.lang.String modelo, java.lang.String estado) {
        org.tempuri.Equipos service = new org.tempuri.Equipos();
        org.tempuri.IEquipos port = service.getBasicHttpBindingIEquipos();
        return port.modificarEquipo(id, serie, modelo, estado);
    }
}
