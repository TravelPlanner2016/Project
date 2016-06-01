/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourism;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SergiyVol
 */
public class TouristGUI extends javax.swing.JFrame {

    private void retrieveLocations()
    {
        DefaultTableModel defaultTableModel = new LocationDBWorker().getDataLocation();
        tourisLocationsTable.setModel(defaultTableModel);
    }

    private void retrieveHotel()
    {
        DefaultTableModel defaultTableModel = new HotelsDBWorker().getDataHotel();
        hotelsTable.setModel(defaultTableModel);
    }

    private void retrieveService()
    {
        DefaultTableModel defaultTableModel = new RentDBWorker().getDataService();
        rentStationsTable.setModel(defaultTableModel);
    }
    public TouristGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tourismLocationLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentStationsTable = new javax.swing.JTable();
        hotelsRetrieveBut = new javax.swing.JButton();
        hotelsDeleteBut = new javax.swing.JButton();
        rentStationsAddBut = new javax.swing.JButton();
        hotelsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tourisLocationsTable = new javax.swing.JTable();
        tourisLocationsRetrieveBut = new javax.swing.JButton();
        hotelsAddBut = new javax.swing.JButton();
        tourisLocationsDeleteBut = new javax.swing.JButton();
        rentStationsLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        hotelsTable = new javax.swing.JTable();
        rentStationsRetrieveBut = new javax.swing.JButton();
        tourisLocationsAddBut = new javax.swing.JButton();
        rentStationsDeleteBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tourismLocationLabel.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        tourismLocationLabel.setText("                   Tourism Locations");

        rentStationsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        rentStationsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentStationsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rentStationsTable);

        hotelsRetrieveBut.setText("Retrieve");
        hotelsRetrieveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelsRetrieveButActionPerformed(evt);
            }
        });

        hotelsDeleteBut.setText("Delete");
        hotelsDeleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelsDeleteButActionPerformed(evt);
            }
        });

        rentStationsAddBut.setText("Add");
        rentStationsAddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentStationsAddButActionPerformed(evt);
            }
        });

        hotelsLabel.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        hotelsLabel.setText("                                Hotels");

        tourisLocationsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        tourisLocationsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tourisLocationsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tourisLocationsTable);

        tourisLocationsRetrieveBut.setText("Retrieve");
        tourisLocationsRetrieveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourisLocationsRetrieveButActionPerformed(evt);
            }
        });

        hotelsAddBut.setText("Add");
        hotelsAddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelsAddButActionPerformed(evt);
            }
        });

        tourisLocationsDeleteBut.setText("Delete");
        tourisLocationsDeleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourisLocationsDeleteButActionPerformed(evt);
            }
        });

        rentStationsLabel.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        rentStationsLabel.setText("                        Rent Stations");

        hotelsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        hotelsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotelsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(hotelsTable);

        rentStationsRetrieveBut.setText("Retrieve");
        rentStationsRetrieveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentStationsRetrieveButActionPerformed(evt);
            }
        });

        tourisLocationsAddBut.setText("Add");
        tourisLocationsAddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourisLocationsAddButActionPerformed(evt);
            }
        });

        rentStationsDeleteBut.setText("Delete");
        rentStationsDeleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentStationsDeleteButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(tourisLocationsRetrieveBut)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(tourisLocationsAddBut)
                                                        .addGap(32, 32, 32)
                                                        .addComponent(tourisLocationsDeleteBut))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(hotelsRetrieveBut)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(hotelsAddBut)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hotelsDeleteBut))
                                                        .addComponent(hotelsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(rentStationsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(rentStationsRetrieveBut)
                                                                .addGap(33, 33, 33)
                                                                .addComponent(rentStationsAddBut)
                                                                .addGap(38, 38, 38)
                                                                .addComponent(rentStationsDeleteBut))
                                                        .addComponent(tourismLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane3))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(tourismLocationLabel)
                                                .addGap(57, 57, 57)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tourisLocationsDeleteBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tourisLocationsAddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tourisLocationsRetrieveBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(hotelsLabel)
                                                .addGap(48, 48, 48)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(hotelsDeleteBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(hotelsAddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(hotelsRetrieveBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rentStationsLabel)
                                                .addGap(55, 55, 55)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(rentStationsRetrieveBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(rentStationsAddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(rentStationsDeleteBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void tourisLocationsRetrieveButActionPerformed(java.awt.event.ActionEvent evt) {
        retrieveLocations();
    }

    private void tourisLocationsAddButActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Test");
    }

    private void tourisLocationsDeleteButActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Test");
    }

    private void tourisLocationsTableMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Test");
    }

    private void hotelsRetrieveButActionPerformed(java.awt.event.ActionEvent evt) {
        retrieveHotel();
    }

    private void hotelsAddButActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Test");
    }

    private void hotelsDeleteButActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Test");
    }

    private void hotelsTableMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Test");
    }

    private void rentStationsRetrieveButActionPerformed(java.awt.event.ActionEvent evt) {
        retrieveService();
    }

    private void rentStationsAddButActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Test");
    }

    private void rentStationsDeleteButActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Test");
    }

    private void rentStationsTableMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Test");
    }

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
            java.util.logging.Logger.getLogger(TouristGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TouristGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TouristGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TouristGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TouristGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton hotelsAddBut;
    private javax.swing.JButton hotelsDeleteBut;
    private javax.swing.JLabel hotelsLabel;
    private javax.swing.JButton hotelsRetrieveBut;
    private javax.swing.JTable hotelsTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton rentStationsAddBut;
    private javax.swing.JButton rentStationsDeleteBut;
    private javax.swing.JLabel rentStationsLabel;
    private javax.swing.JButton rentStationsRetrieveBut;
    private javax.swing.JTable rentStationsTable;
    private javax.swing.JButton tourisLocationsAddBut;
    private javax.swing.JButton tourisLocationsDeleteBut;
    private javax.swing.JButton tourisLocationsRetrieveBut;
    private javax.swing.JTable tourisLocationsTable;
    private javax.swing.JLabel tourismLocationLabel;
    // End of variables declaration
}
