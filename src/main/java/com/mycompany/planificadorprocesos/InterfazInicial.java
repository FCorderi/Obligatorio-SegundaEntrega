/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.planificadorprocesos;

import javax.swing.table.DefaultTableModel;
import java.lang.Math;

/**
 *
 * @author Felipe
 */
public class InterfazInicial extends javax.swing.JFrame {

    /**
     * Creates new form InterfazInicial
     */
    public InterfazInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        duracionProceso = new javax.swing.JSpinner();
        tEntreES = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tEsperaES = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        prioridadProceso = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProcesos = new javax.swing.JTable();
        botonAñadir = new javax.swing.JButton();
        botonIniciar = new javax.swing.JButton();
        quantum = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tipoProceso = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        botonAñadirVarios = new javax.swing.JButton();
        botonAñadirProcesoRandom = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        cantProcAleatorios = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Ingresar procesos");

        jLabel4.setText("Duración");

        duracionProceso.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        tEntreES.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel5.setText("Tiempo entre E/S");

        jLabel6.setText("Tiempo de espera E/S");

        tEsperaES.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel7.setText("Prioridad");

        prioridadProceso.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

        tablaProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Duración", "Tiempo entre E/S", "Tiempo espera de E/S", "Prioridad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProcesos);

        botonAñadir.setText("Añadir proceso");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        botonIniciar.setText("Iniciar");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        quantum.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel8.setText("Ingresar Quantum");

        jLabel9.setText("Tipo");

        tipoProceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "SO", "Batch" }));
        tipoProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoProcesoActionPerformed(evt);
            }
        });

        botonAñadirVarios.setText("Añadir varios procesos");
        botonAñadirVarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirVariosActionPerformed(evt);
            }
        });

        botonAñadirProcesoRandom.setText("Añadir procesos aleatorio");
        botonAñadirProcesoRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirProcesoRandomActionPerformed(evt);
            }
        });

        jLabel10.setText("Cant. Proc");

        cantProcAleatorios.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel9)))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(duracionProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(tEntreES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(tEsperaES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(prioridadProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAñadir)
                                .addGap(18, 18, 18)
                                .addComponent(botonAñadirVarios)
                                .addGap(18, 18, 18)
                                .addComponent(botonAñadirProcesoRandom)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantProcAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(quantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(botonIniciar))
                    .addComponent(jLabel8))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duracionProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tEntreES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tEsperaES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioridadProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAñadir)
                    .addComponent(botonAñadirVarios)
                    .addComponent(botonAñadirProcesoRandom)
                    .addComponent(jLabel10)
                    .addComponent(cantProcAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIniciar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Crea un proceso con los datos generados aleatoriamente para luego devolverlo.
     */
    private Proceso CrearProcesoRandom() {
        String[] tipos = {"SO", "Usuario", "Batch"};
        String tipo = tipos[(int) (Math.random() * 3)];
        long duracion = (long) (Math.random() * 10) + 1;
        long tiempoEntreES = (long) (Math.random() * 10);
        long duracionES = (long) (Math.random() * 10);
        int prioridad = (int) (Math.random() * 99) + 1;
        idProceso++;

        Proceso proceso = new Proceso(idProceso, tipo, duracion, tiempoEntreES, duracionES, prioridad);

        return proceso;
    }

    /*
    * Crea un proceso con los datos ingresados en la interfaz para luego devolverlo.
     */
    private Proceso CrearProceso() {
        String tipo = tipoProceso.getItemAt(tipoProceso.getSelectedIndex());
        long duracion = Integer.parseInt(duracionProceso.getValue().toString());
        long tiempoEntreES = Integer.parseInt(tEntreES.getValue().toString());
        long duracionES = Integer.parseInt(tEsperaES.getValue().toString());
        int prioridad = Integer.parseInt(prioridadProceso.getValue().toString());
        idProceso++;

        Proceso proceso = new Proceso(idProceso, tipo, duracion, tiempoEntreES, duracionES, prioridad);

        return proceso;
    }

    /*
    * Agrega los procesos, creados con los datos de la interfaz, a la tabla de la interfaz para que se vayan mostrando, 
    * luego los ingresa en las colas segun el tipo de proceso que sea y en orden correspondiente.
     */
    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        Proceso proceso = CrearProceso();
        DefaultTableModel dt = (DefaultTableModel) tablaProcesos.getModel();
        String[] datos = {
            String.valueOf(proceso.ID),
            proceso.Tipo,
            String.valueOf(proceso.Duracion),
            String.valueOf(proceso.TEntreES),
            String.valueOf(proceso.DuracionES),
            String.valueOf(proceso.Prioridad),};
        dt.addRow(datos);

        Nodo nodo = new Nodo(proceso.ID, proceso);
        if (proceso.Tipo.equals("SO")) {
            colaProcesos1.insertarOrdenado(nodo);
        } else if (proceso.Tipo.equals("Batch")) {
            colaProcesos4.insertarOrdenado(nodo);
        } else if (proceso.TEntreES > proceso.DuracionES) {
            colaProcesos2.insertarOrdenado(nodo);
        } else {
            colaProcesos3.insertarOrdenado(nodo);
        }
    }//GEN-LAST:event_botonAñadirActionPerformed

    /*
    * Crea una nueva interfaz informacion con sus respectivos parametros y a la vez la hace visible,
    * luego cambia la visibilidad de esta interfaz.
     */
    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        Quantum = Integer.parseInt(quantum.getValue().toString());
        new InterfazInformacion(Quantum, colaProcesos1, colaProcesos2, colaProcesos3, colaProcesos4).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void tipoProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoProcesoActionPerformed

    /*
    * Lee el archivo ListaProcesos.txt, del cual toma los valores para crear los procesos necesarios.
    * Los valores dentro del txt deben ser, por cada proceso una linea, cada dato separado por ";",
    * el orden de los datos es tipo;duracion;tEntreES;duracionES;prioridad
    * Agrega los procesos a la tabla de la interfaz para que se muestren, 
    * luego los ingresa en las colas segun el tipo de proceso que sea y en orden correspondiente.
     */
    private void botonAñadirVariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirVariosActionPerformed
        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String[] lineas = manejador.leerArchivo("/Users/felipe/Documents/SO/Obligatorio-SegundaEntrega/src/main/java/com/mycompany/planificadorprocesos/ListaProcesos.txt", false);
        for (int i = 0; i < lineas.length; i++) {
            String[] sproceso = lineas[i].split(";");
            idProceso++;
            Proceso proceso = new Proceso(idProceso, sproceso[0], Long.parseLong(sproceso[1]), Long.parseLong(sproceso[2]), Long.parseLong(sproceso[3]), Integer.parseInt(sproceso[4]));

            DefaultTableModel dt = (DefaultTableModel) tablaProcesos.getModel();
            String[] datos = {
                String.valueOf(proceso.ID),
                proceso.Tipo,
                String.valueOf(proceso.Duracion),
                String.valueOf(proceso.TEntreES),
                String.valueOf(proceso.DuracionES),
                String.valueOf(proceso.Prioridad),};
            dt.addRow(datos);

            Nodo nodo = new Nodo(proceso.ID, proceso);
            if (proceso.Tipo.equals("SO")) {
                colaProcesos1.insertarOrdenado(nodo);
            } else if (proceso.Tipo.equals("Batch")) {
                colaProcesos4.insertarOrdenado(nodo);
            } else if (proceso.TEntreES > proceso.DuracionES) {
                colaProcesos2.insertarOrdenado(nodo);
            } else {
                colaProcesos3.insertarOrdenado(nodo);
            }
        }
    }//GEN-LAST:event_botonAñadirVariosActionPerformed

    /*
    * Agrega la cantidad ingresada en la interfaz de procesos, creados con los datos aleatorios, a la tabla de la interfaz para que se vayan mostrando, 
    * luego los ingresa en las colas segun el tipo de proceso que sea y en orden correspondiente.
     */
    private void botonAñadirProcesoRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirProcesoRandomActionPerformed
        for(int i = 0 ; i < Integer.parseInt(cantProcAleatorios.getValue().toString()) ; i++){
            Proceso proceso = CrearProcesoRandom();
            DefaultTableModel dt = (DefaultTableModel) tablaProcesos.getModel();
            String[] datos = {
                String.valueOf(proceso.ID),
                proceso.Tipo,
                String.valueOf(proceso.Duracion),
                String.valueOf(proceso.TEntreES),
                String.valueOf(proceso.DuracionES),
                String.valueOf(proceso.Prioridad),};
            dt.addRow(datos);

            Nodo nodo = new Nodo(proceso.ID, proceso);
            if (proceso.Tipo.equals("SO")) {
                colaProcesos1.insertarOrdenado(nodo);
            } else if (proceso.Tipo.equals("Batch")) {
                colaProcesos4.insertarOrdenado(nodo);
            } else if (proceso.TEntreES > proceso.DuracionES) {
                colaProcesos2.insertarOrdenado(nodo);
            } else {
                colaProcesos3.insertarOrdenado(nodo);
            }
        }
        
    }//GEN-LAST:event_botonAñadirProcesoRandomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InterfazInicial().setVisible(true);
            }
        });
    }

    Lista<Proceso> colaProcesos1 = new Lista();
    Lista<Proceso> colaProcesos2 = new Lista();
    Lista<Proceso> colaProcesos3 = new Lista();
    Lista<Proceso> colaProcesos4 = new Lista();
    int idProceso = 0;
    int Quantum;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAñadir;
    private javax.swing.JToggleButton botonAñadirProcesoRandom;
    private javax.swing.JButton botonAñadirVarios;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JSpinner cantProcAleatorios;
    private javax.swing.JSpinner duracionProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner prioridadProceso;
    private javax.swing.JSpinner quantum;
    private javax.swing.JSpinner tEntreES;
    private javax.swing.JSpinner tEsperaES;
    private javax.swing.JTable tablaProcesos;
    private javax.swing.JComboBox<String> tipoProceso;
    // End of variables declaration//GEN-END:variables
}
