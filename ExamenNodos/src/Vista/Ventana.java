/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Controlador;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Controlador controlador;
    public Ventana() {
        initComponents();
        controlador= new Controlador(this);
        setLocation(400,200);
        agregarEventos();
    }
    
    public int enviarInformacionEdad()
    {
        int datos=0;
        datos=Integer.parseInt(jt_Edad.getText());
        return datos;
    }
    
    public String[] enviarInformacion()
    {
        String[] datos=new String[2];
        datos[1]=jt_Nombre.getText();
        datos[0]=this.jt_Cedula.getText();
        return datos;
    }
    
    public void nuevaCita(String cita)
    {
        this.jl_NuevaCita.setText(cita);
    }
    
    public void citaActual(String cita)
    {
        
        this.jl_CitaActual.setText(cita);
    }
    
    public void imprimirLista(String texto)
    {
        this.jTextArea1.setText(texto);
    }
    
    public void refresarVentana()
    {
        this.jt_Cedula.setText("");
        this.jt_Nombre.setText("");
        this.jt_Edad.setText("");
        this.Rbtn_Preferencial.setSelected(false);
        this.Rbtn_Regular.setSelected(false);
    }
    
    public String enviarPrioridad()
    {
        String datos="";
        if(Rbtn_Preferencial.isSelected())
        {
            datos="A";
        }
        else
        {
            if(Rbtn_Regular.isSelected())
            {
                datos="B";
            }
        }
        
        return datos;
    }
    
    
    public void agregarEventos()
    {
        this.btn_Ingresar.addActionListener(controlador);
        this.btn_MayorMenor.addActionListener(controlador);
        this.btn_MenorMayor.addActionListener(controlador);
        this.btn_Siguiente.addActionListener(controlador);
        this.jmt_Informacion.addActionListener(controlador);
        this.jmt_Salir.addActionListener(controlador); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Titulo = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Cedula = new javax.swing.JLabel();
        jl_Edad = new javax.swing.JLabel();
        Rbtn_Regular = new javax.swing.JRadioButton();
        Rbtn_Preferencial = new javax.swing.JRadioButton();
        btn_Ingresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_Siguiente = new javax.swing.JButton();
        btn_MayorMenor = new javax.swing.JButton();
        btn_MenorMayor = new javax.swing.JButton();
        jl_CitaActual = new javax.swing.JLabel();
        jl_TituloFicha = new javax.swing.JLabel();
        jl_NuevaCita = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jt_Edad = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Propiedades = new javax.swing.JMenu();
        jmt_Informacion = new javax.swing.JMenuItem();
        jmt_Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 350));
        setPreferredSize(new java.awt.Dimension(550, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Titulo.setText("Información Personal");
        getContentPane().add(jl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 31, -1, -1));

        jl_Nombre.setText("Nombre");
        getContentPane().add(jl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jl_Cedula.setText("Cédula");
        getContentPane().add(jl_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 69, -1, -1));

        jl_Edad.setText("Edad");
        getContentPane().add(jl_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 141, -1, -1));

        Rbtn_Regular.setText("Regular");
        Rbtn_Regular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_RegularActionPerformed(evt);
            }
        });
        getContentPane().add(Rbtn_Regular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        Rbtn_Preferencial.setText("Preferencial (Ley 7600)");
        Rbtn_Preferencial.setActionCommand("Preferencial");
        getContentPane().add(Rbtn_Preferencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btn_Ingresar.setText("Ingresar");
        getContentPane().add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 126, 188));

        btn_Siguiente.setText("Siguiente");
        getContentPane().add(btn_Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        btn_MayorMenor.setText(">");
        btn_MayorMenor.setActionCommand("MayorMenor");
        getContentPane().add(btn_MayorMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        btn_MenorMayor.setText("<");
        btn_MenorMayor.setActionCommand("MenorMayor");
        getContentPane().add(btn_MenorMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jl_CitaActual.setText("----");
        getContentPane().add(jl_CitaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jl_TituloFicha.setText("Cita");
        jl_TituloFicha.setToolTipText("");
        getContentPane().add(jl_TituloFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jl_NuevaCita.setText("---");
        getContentPane().add(jl_NuevaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));
        getContentPane().add(jt_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 66, 80, -1));
        getContentPane().add(jt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 97, 80, -1));
        getContentPane().add(jt_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 135, 80, -1));

        jm_Propiedades.setText("Propiedades");

        jmt_Informacion.setText("Informacion");
        jm_Propiedades.add(jmt_Informacion);

        jmt_Salir.setText("Salir");
        jm_Propiedades.add(jmt_Salir);

        jMenuBar1.add(jm_Propiedades);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rbtn_RegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_RegularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbtn_RegularActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rbtn_Preferencial;
    private javax.swing.JRadioButton Rbtn_Regular;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JButton btn_MayorMenor;
    private javax.swing.JButton btn_MenorMayor;
    private javax.swing.JButton btn_Siguiente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_CitaActual;
    private javax.swing.JLabel jl_Edad;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_NuevaCita;
    private javax.swing.JLabel jl_Titulo;
    private javax.swing.JLabel jl_TituloFicha;
    private javax.swing.JMenu jm_Propiedades;
    private javax.swing.JMenuItem jmt_Informacion;
    private javax.swing.JMenuItem jmt_Salir;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Edad;
    private javax.swing.JTextField jt_Nombre;
    // End of variables declaration//GEN-END:variables
}
