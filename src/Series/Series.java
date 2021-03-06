package Series;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author July
 */
public final class Series extends javax.swing.JFrame {
    
    DefaultTableModel model;
    DefaultTableCellRenderer alinearCentro;
    ArrayList<Serie> series= new ArrayList<Serie>();

    /** Creates new form Series */
    public Series() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resource/pelicula.png"));
        setIconImage(icon);
        initComponents();
        setTitle ("Mis Series July");
        cargarArchivo();
        mostrarSeries();
        getContentPane().setBackground(Color.BLACK);
        jScroll.getViewport().setOpaque(false);
        //jScroll.getViewport().setBackground(Color.BLACK);
        cerrar();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeries = new javax.swing.JPanel();
        bAnadir = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jPosicion = new javax.swing.JLayeredPane();
        jScroll = new javax.swing.JScrollPane();
        tablaSeries = new javax.swing.JTable();
        jImagen = new javax.swing.JLabel();
        jSeriesVistas = new javax.swing.JLabel();
        bmasTemp = new javax.swing.JButton();
        bmenTemp = new javax.swing.JButton();
        bmasCap = new javax.swing.JButton();
        bmenCap = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Series Vistas");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));

        jSeries.setBackground(new java.awt.Color(0, 0, 0));
        jSeries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeries.setPreferredSize(new java.awt.Dimension(720, 456));

        bAnadir.setBackground(new java.awt.Color(255, 153, 51));
        bAnadir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bAnadir.setForeground(new java.awt.Color(255, 255, 255));
        bAnadir.setText("Añadir Serie");
        bAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnadirActionPerformed(evt);
            }
        });

        jEliminar.setBackground(new java.awt.Color(255, 153, 51));
        jEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jScroll.setBackground(new java.awt.Color(51, 255, 255));
        jScroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScroll.setForeground(new java.awt.Color(255, 255, 153));
        jScroll.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScroll.setOpaque(false);

        tablaSeries.setBackground(new java.awt.Color(0, 0, 0));
        tablaSeries.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaSeries.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tablaSeries.setForeground(new java.awt.Color(255, 255, 255));
        tablaSeries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TÍTULO", "TEMPORADA", "CAPITULO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSeries.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaSeries.setGridColor(new java.awt.Color(255, 255, 102));
        tablaSeries.setOpaque(false);
        tablaSeries.setSelectionBackground(new java.awt.Color(255, 102, 51));
        tablaSeries.setSelectionForeground(new java.awt.Color(255, 255, 51));
        tablaSeries.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScroll.setViewportView(tablaSeries);

        jScroll.setBounds(20, 0, 630, 310);
        jPosicion.add(jScroll, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jImagen.setBackground(new java.awt.Color(0, 0, 0));
        jImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Series/resource/mm.png"))); // NOI18N
        jImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jImagen.setEnabled(false);
        jImagen.setFocusable(false);
        jImagen.setBounds(0, 20, 640, 310);
        jPosicion.add(jImagen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeriesVistas.setBackground(java.awt.Color.black);
        jSeriesVistas.setFont(new java.awt.Font("Tahoma", 1, 18));
        jSeriesVistas.setForeground(new java.awt.Color(255, 255, 153));
        jSeriesVistas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Series/resource/titulo.png"))); // NOI18N

        bmasTemp.setBackground(java.awt.Color.black);
        bmasTemp.setForeground(new java.awt.Color(255, 255, 153));
        bmasTemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Series/resource/mas.png"))); // NOI18N
        bmasTemp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bmasTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmasTempActionPerformed(evt);
            }
        });

        bmenTemp.setBackground(java.awt.Color.black);
        bmenTemp.setForeground(new java.awt.Color(255, 255, 153));
        bmenTemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Series/resource/menos.png"))); // NOI18N
        bmenTemp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bmenTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmenTempActionPerformed(evt);
            }
        });

        bmasCap.setBackground(java.awt.Color.black);
        bmasCap.setForeground(new java.awt.Color(255, 255, 153));
        bmasCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Series/resource/mas.png"))); // NOI18N
        bmasCap.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bmasCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmasCapActionPerformed(evt);
            }
        });

        bmenCap.setBackground(java.awt.Color.black);
        bmenCap.setForeground(new java.awt.Color(255, 255, 153));
        bmenCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Series/resource/menos.png"))); // NOI18N
        bmenCap.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bmenCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmenCapActionPerformed(evt);
            }
        });

        bEditar.setBackground(new java.awt.Color(255, 153, 51));
        bEditar.setFont(new java.awt.Font("Tahoma", 1, 12));
        bEditar.setForeground(new java.awt.Color(255, 255, 255));
        bEditar.setText("Editar Titulo");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSeriesLayout = new javax.swing.GroupLayout(jSeries);
        jSeries.setLayout(jSeriesLayout);
        jSeriesLayout.setHorizontalGroup(
            jSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSeriesLayout.createSequentialGroup()
                .addGroup(jSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSeriesLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jSeriesVistas))
                    .addGroup(jSeriesLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(bAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jSeriesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jSeriesLayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(bmasTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(bmenTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(bmasCap, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(bmenCap, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jSeriesLayout.setVerticalGroup(
            jSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSeriesLayout.createSequentialGroup()
                .addComponent(jSeriesVistas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bmasTemp)
                    .addComponent(bmenTemp)
                    .addComponent(bmenCap)
                    .addComponent(bmasCap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAnadir)
                    .addComponent(bEditar)
                    .addComponent(jEliminar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed

        int fila = tablaSeries.getSelectedRow();
        if(fila != -1){
            if(JOptionPane.showConfirmDialog(this, "Realmente deseaBorrarlo", "Borrar",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE) == JOptionPane.OK_OPTION){
                model.removeRow(fila);
                series.remove(fila);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void bAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnadirActionPerformed
        pSerie panel= new pSerie();

        if(JOptionPane.showConfirmDialog(this, panel, "Introduzca una serie",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE) == JOptionPane.OK_OPTION){
            Serie serie= new Serie(panel.getTitulo(),panel.getTemp(),panel.getCap());
            series.add(serie);
            
            model.addRow(serie.datos(series.size()));
        }
    }//GEN-LAST:event_bAnadirActionPerformed

    private void bmasTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmasTempActionPerformed
        int fila = tablaSeries.getSelectedRow();
       
        if(fila != -1){
            int actualizado= (Integer)model.getValueAt(fila, 1)+1;
            model.setValueAt(actualizado,fila ,1);
            series.get(fila).setTemporada(series.get(fila).getTemporada()+1);
        }
    }//GEN-LAST:event_bmasTempActionPerformed

    private void bmenTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmenTempActionPerformed
        int fila = tablaSeries.getSelectedRow();

        if((fila != -1)&&(series.get(fila).getTemporada()>0)){
            int actualizado= (Integer)model.getValueAt(fila, 1)-1;
            model.setValueAt(actualizado,fila ,1);
            series.get(fila).setTemporada(series.get(fila).getTemporada()-1);
        }
    }//GEN-LAST:event_bmenTempActionPerformed

    private void bmasCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmasCapActionPerformed
        int fila = tablaSeries.getSelectedRow();

        if(fila != -1){
            int actualizado= (Integer)model.getValueAt(fila, 2)+1;
            model.setValueAt(actualizado,fila ,2);
            series.get(fila).setCapitulo(series.get(fila).getCapitulo()+1);
        }
    }//GEN-LAST:event_bmasCapActionPerformed

    private void bmenCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmenCapActionPerformed
        int fila = tablaSeries.getSelectedRow();

        if((fila != -1)&&(series.get(fila).getCapitulo()>0)){
            int actualizado= (Integer)model.getValueAt(fila, 2)-1;
            model.setValueAt(actualizado,fila ,2);
            series.get(fila).setCapitulo(series.get(fila).getCapitulo()-1);
        }
    }//GEN-LAST:event_bmenCapActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        pSerie panel= new pSerie();
        int fila = tablaSeries.getSelectedRow();
        
        if(fila != -1){
            String id= ((String)model.getValueAt(fila, 0)).substring(0,5);
            panel.setTitulo(((String)model.getValueAt(fila, 0)).substring(5));
            panel.getcomboTemp().setSelectedIndex((Integer)model.getValueAt(fila, 1));
            panel.getcomboCap().setSelectedIndex((Integer)model.getValueAt(fila, 2));

            if(JOptionPane.showConfirmDialog(this, panel, "Introduzca una serie",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE) == JOptionPane.OK_OPTION){
                series.get(fila).setTitulo(panel.getTitulo());
                series.get(fila).setTemporada(panel.getTemp());
                series.get(fila).setCapitulo(panel.getCap());
                model.setValueAt(id+panel.getTitulo(),fila,0);
                model.setValueAt(panel.getTemp(),fila,1);
                model.setValueAt(panel.getCap(),fila,2);
            }
        }
    }//GEN-LAST:event_bEditarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Series().setVisible(true);
            }
        });
    }

    public void guardarArchivo(){
        try {
            Ficheros fich = new Ficheros();
            fich.abrirEscribir("series.bin");
            if(fich != null){
                fich.escribir(series);
                fich.cerrar();
            }
        } catch (IOException ex) {
            System.out.println("Ese archivo no existe guardar");
        }
    }

    public void cargarArchivo(){
        try {
            Ficheros fich = new Ficheros();
            fich.abrirLeer("series.bin");
            if(fich != null){
                series= fich.leer();
                fich.cerrar();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Series.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Ese archivo no existe cargar");
        }

    }

    public void cerrar(){
        this.addWindowListener(new WindowListener (){
            public void windowClosing(WindowEvent e) {
                guardarArchivo();
            }
            public void windowOpened(WindowEvent e) {
            }
            public void windowClosed(WindowEvent e) {
            }
            public void windowIconified(WindowEvent e) {
            }
            public void windowDeiconified(WindowEvent e) {
            }
            public void windowActivated(WindowEvent e) {
            }
            public void windowDeactivated(WindowEvent e) {
            }
        });
    }

    public void mostrarSeries(){

        model=new DefaultTableModel();
        tablaSeries.setModel(model);
        
        model.addColumn("TITULO");
        model.addColumn("TEMPORADA");
        model.addColumn("CAPITULO");

        for(int i=0;i<series.size();i++){
            Serie serie=(Serie)series.get(i); 
            model.addRow(serie.datos(i));
        }
        
        alinearCentro = new DefaultTableCellRenderer();
        alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);
        //Alinear el contenido
        tablaSeries.getColumnModel().getColumn(1).setCellRenderer(alinearCentro);
        tablaSeries.getColumnModel().getColumn(2).setCellRenderer(alinearCentro);
        //Distancia de columnas
        tablaSeries.getColumnModel().getColumn(0).setPreferredWidth(250);
        tablaSeries.getColumnModel().getColumn(1).setPreferredWidth(20);
        tablaSeries.getColumnModel().getColumn(2).setPreferredWidth(20);
        // Cabecera
        tablaSeries.getColumnModel().getColumn(0).setHeaderRenderer(new MyRenderer(Color.BLACK,Color.orange));
        tablaSeries.getColumnModel().getColumn(1).setHeaderRenderer(new MyRenderer(Color.BLACK,Color.orange));
        tablaSeries.getColumnModel().getColumn(2).setHeaderRenderer(new MyRenderer(Color.BLACK,Color.orange));
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnadir;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bmasCap;
    private javax.swing.JButton bmasTemp;
    private javax.swing.JButton bmenCap;
    private javax.swing.JButton bmenTemp;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jImagen;
    private javax.swing.JLayeredPane jPosicion;
    private javax.swing.JScrollPane jScroll;
    private javax.swing.JPanel jSeries;
    private javax.swing.JLabel jSeriesVistas;
    private javax.swing.JTable tablaSeries;
    // End of variables declaration//GEN-END:variables

}
