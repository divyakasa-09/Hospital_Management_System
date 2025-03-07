/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminJPanels;

import Business.Business;
import Business.Validations;
import Hospital.Hospital;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MC
 */
public class hospitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form hospitalsJPanel
     */
    public Business business;
    DefaultTableModel hospitalsTableModel;
    
    public hospitalsJPanel(Business business) {
        initComponents();
        this.business = business;
        this.hospitalsTableModel = (DefaultTableModel) hospTable.getModel();
        
        displayHospitals();
        //populateHospitals();
    }
    
    public void displayHospitals()
    {
        ArrayList<Hospital> hospitals = this.business.getHospitals().getHospitals();
        if(hospitals.size() >= 0) {
            hospitalsTableModel.setRowCount(0);
            for(Hospital b: hospitals) {
                Object row[] = new Object[5];
                row[0] = b.getHospitalId();
                row[1] = b.getHospitalName();
                row[2] = b.getAddress();
                row[3] = b.getPhoneNumber();
                row[4] = b.getEmail();
                hospitalsTableModel.addRow(row);
            }
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

        jLabel1 = new javax.swing.JLabel();
        hosNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hosAddressTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hosPhoneTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hosEmailTextField = new javax.swing.JTextField();
        addHospital = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Hospital Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Address");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Email");

        hosEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hosEmailTextFieldActionPerformed(evt);
            }
        });

        addHospital.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addHospital.setText("Add Hospital");
        addHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHospitalActionPerformed(evt);
            }
        });

        hospTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Hospital Name", "Address", "Phone", "Email"
            }
        ));
        jScrollPane1.setViewportView(hospTable);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hospital Management System");
        jPanel2.add(jLabel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(addHospital))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(hosNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                        .addComponent(hosAddressTextField))
                                    .addComponent(hosPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(hosEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hosNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hosAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hosPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(hosEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(addHospital)
                .addGap(294, 294, 294))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hosEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hosEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hosEmailTextFieldActionPerformed

    private void addHospitalActionPerformed(java.awt.event.ActionEvent evt) {                                            

        try {
             String address = hosAddressTextField.getText();
           String hospitalName = hosNameTextField.getText();
            String phone = hosPhoneTextField.getText();
            String email = hosEmailTextField.getText();
            if (hosNameTextField.equals(null) || hosAddressTextField.equals(null) || hosPhoneTextField.equals(null) || hosEmailTextField.equals(null)) {
                JOptionPane.showMessageDialog(null, "Please check data and try again!");

            }

            if (Validations.ValidateEmail(email) && Validations.ValidatePhone(phone)) {
                this.business.getHospitals().addHospital(hospitalName, address, phone, email);
                displayHospitals();
            } else {

                JOptionPane.showMessageDialog(this, "Please check data and try again!");
            }
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please check data and try again!");
        } 
        hosAddressTextField.setText("");
                hosNameTextField.setText("");
                hosPhoneTextField.setText("");
                        hosEmailTextField.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHospital;
    private javax.swing.JTextField hosAddressTextField;
    private javax.swing.JTextField hosEmailTextField;
    private javax.swing.JTextField hosNameTextField;
    private javax.swing.JTextField hosPhoneTextField;
    private javax.swing.JTable hospTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
