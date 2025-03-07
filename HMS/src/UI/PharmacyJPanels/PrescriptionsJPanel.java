/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmacyJPanels;

import Business.Business;
import Insurance.InsurancePlans;
import Pharmacy.Medicine;
import Prescription.Prescription;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MC
 */
public class PrescriptionsJPanel extends javax.swing.JPanel {

    public Business business;
    public UserAccount userAccount;
    DefaultTableModel prescTableModel;
    
    public PrescriptionsJPanel() {
        initComponents();
    }
    
    public PrescriptionsJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.prescTableModel = (DefaultTableModel) prescriptionsTable.getModel();
        
        displayPrescriptions();
    }
    
    public void displayPrescriptions()
    {
        ArrayList<Prescription> ps = this.business.getPrescriptions().getPrescriptions();
        if(ps.size() >= 0) {
            prescTableModel.setRowCount(0);
            for(Prescription p: ps) {
                    Object row[] = new Object[9];
                    row[0] = p.getPrescriptionId();
                    row[1] = p.getDoctor().getFirstName() + ' ' + p.getDoctor().getLastName();
                    row[2] = p.getPatient().getFirstName() + ' ' + p.getPatient().getLastName();
                    row[3] = p.getMedicine().getMedicineName();
                    row[4] = p.getQuantity();
                    row[5] = p.getStatus();
                    row[6] = p.getMedicine().getPrice() * p.getQuantity();
                    if (p.getPatient().getInsurancePlan() != null)
                    {
                        InsurancePlans ip = p.getPatient().getInsurancePlan();
                        Float coverage = ip.getCoveragePercentage();

                        row[7] = (p.getMedicine().getPrice() * p.getQuantity()) * coverage;
                        row[8] = (p.getMedicine().getPrice() * p.getQuantity()) - ((p.getMedicine().getPrice() * p.getQuantity()) * coverage);

                    }
                    else{
                        row[7] = 0.00;
                        row[8] =  p.getMedicine().getPrice() * p.getQuantity();
                    }
                    prescTableModel.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionsTable = new javax.swing.JTable();
        fillPresc = new javax.swing.JButton();
        rejectPresc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        prescriptionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pres Id", "Doctor", "Patient", "Medicine", "Quantity", "Status", "Total Cost", "Paid by Ins", "Paid by Patient"
            }
        ));
        jScrollPane1.setViewportView(prescriptionsTable);

        fillPresc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fillPresc.setText("Fill");
        fillPresc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillPrescActionPerformed(evt);
            }
        });

        rejectPresc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rejectPresc.setText("Reject");
        rejectPresc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectPrescActionPerformed(evt);
            }
        });

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(fillPresc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(rejectPresc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectPresc)
                    .addComponent(fillPresc))
                .addContainerGap(332, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fillPrescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillPrescActionPerformed
        int selectedRowIndex = prescriptionsTable.getSelectedRow();
        String medName = prescriptionsTable.getValueAt(selectedRowIndex, 3).toString();
        String pid = prescriptionsTable.getValueAt(selectedRowIndex, 0).toString();
        Prescription ps = this.business.getPrescriptions().findPrescription(pid);
        ps.setStatus("Filled");
        int quantity = Integer.parseInt(prescriptionsTable.getValueAt(selectedRowIndex, 4).toString());
        Medicine m = this.business.getMedicines().findMedicineByName(medName);
        m.setAvailableCount(m.getAvailableCount() - quantity);
        
        displayPrescriptions();
        
    }//GEN-LAST:event_fillPrescActionPerformed

    private void rejectPrescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectPrescActionPerformed
        int selectedRowIndex = prescriptionsTable.getSelectedRow();
        String medName = prescriptionsTable.getValueAt(selectedRowIndex, 3).toString();
        String pid = prescriptionsTable.getValueAt(selectedRowIndex, 0).toString();
        Prescription ps = this.business.getPrescriptions().findPrescription(pid);
        ps.setStatus("Rejected");
        
        displayPrescriptions();
    }//GEN-LAST:event_rejectPrescActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fillPresc;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable prescriptionsTable;
    private javax.swing.JButton rejectPresc;
    // End of variables declaration//GEN-END:variables
}
