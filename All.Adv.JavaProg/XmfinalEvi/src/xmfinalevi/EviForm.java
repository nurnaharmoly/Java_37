/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmfinalevi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class EviForm extends javax.swing.JFrame {

    /**
     * Creates new form EviForm
     */
    public EviForm() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        btnAddTableFile = new javax.swing.JButton();
        btnReadFile = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClearTable = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        chkReading = new javax.swing.JCheckBox();
        chkWriting = new javax.swing.JCheckBox();
        chkCoding = new javax.swing.JCheckBox();
        cmbRound = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAdd = new javax.swing.JTextArea();
        passwordFiel = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Student Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(519, 519, 519)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("ID");

        jLabel3.setText("Name");

        jLabel4.setText("Age");

        jLabel5.setText("Email");

        jLabel6.setText("Gender");

        jLabel7.setText("Hobby");

        jLabel8.setText("Round");

        jLabel9.setText("Address");

        jLabel10.setText("Password");

        lblMsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(0, 102, 102));

        btnAddTableFile.setText("Add to Table and Write to File");
        btnAddTableFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTableFileActionPerformed(evt);
            }
        });

        btnReadFile.setText("Read From File");
        btnReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadFileActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClearTable.setText("Clear To Table");
        btnClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtAge.setText("0");

        buttonGroup1.add(rdMale);
        rdMale.setSelected(true);
        rdMale.setText("Male");

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");

        chkReading.setText("Reading");

        chkWriting.setText("Writing");

        chkCoding.setText("Coding");

        cmbRound.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selected A Round", "Round_36", "Round_37", "Round_38" }));

        txtAreaAdd.setColumns(20);
        txtAreaAdd.setRows(5);
        jScrollPane2.setViewportView(txtAreaAdd);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(btnClear)
                                .addGap(27, 27, 27)
                                .addComponent(btnClearTable))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAddTableFile)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnReadFile))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnExit))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(124, 124, 124))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chkReading)
                                .addGap(18, 18, 18)
                                .addComponent(chkWriting)
                                .addGap(18, 18, 18)
                                .addComponent(chkCoding))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdMale)
                                .addGap(32, 32, 32)
                                .addComponent(rdFemale))
                            .addComponent(txtId)
                            .addComponent(txtName)
                            .addComponent(txtAge)
                            .addComponent(txtEmail)
                            .addComponent(cmbRound, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(passwordFiel))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rdMale)
                            .addComponent(rdFemale))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkReading)
                        .addComponent(chkWriting)
                        .addComponent(chkCoding)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(passwordFiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTableFile)
                    .addComponent(btnReadFile))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnClearTable)
                    .addComponent(btnExit))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Email", "Gender", "Hobby", "Round", "Address", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblDisplay);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public boolean checkEmailValidation(String email){
 int atpos = email.indexOf("@");
 int dotpos = email.lastIndexOf(".");
 if(atpos>1 && dotpos<email.length()-3 && atpos< dotpos-1 && email.length() >=7){
 return true;
 }else{
 return false;
 }
 }  
    private void btnAddTableFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTableFileActionPerformed
        // TODO add your handling code here:
        String id="",name="",age="0",email="",gender="",hobby="",round="",address="",password="";
        
        if(txtId.getText().length()<1){
            JOptionPane.showMessageDialog(null,"Enter the ID");
        }else if(txtName.getText().length()<1){
            JOptionPane.showMessageDialog(null,"Enter the Name");
        }else if(Integer.parseInt(txtAge.getText())<18 || Integer.parseInt(txtAge.getText()) >70){
            JOptionPane.showMessageDialog(null,"Enter the Age");
        }else if(!checkEmailValidation(txtEmail.getText()) ||  txtEmail.getText().length()<1){
            JOptionPane.showMessageDialog(null,"Enter the Email");
        }else if(!chkReading.isSelected() && !chkWriting.isSelected() && !chkCoding.isSelected()){
            JOptionPane.showMessageDialog(null,"Enter the Hobby");
        }else if(cmbRound.getItemAt(cmbRound.getSelectedIndex()) == "Selected A Round"){
            JOptionPane.showMessageDialog(null,"Selected A Round");
        }else if(txtAreaAdd.getText().length()<5){
            JOptionPane.showMessageDialog(null,"Enter the Address");
        }else if(passwordFiel.getText().length()<5){
            JOptionPane.showMessageDialog(null,"Enter the Password");
        }else{
        
            id = txtId.getText();
            name = txtName.getText();
            age = txtAge.getText();
            email = txtEmail.getText();
            if(rdMale.isSelected()){
            gender = rdMale.getText();
            }
            if(rdFemale.isSelected()){
            gender = rdFemale.getText();
            }
            if(chkReading.isSelected()){
            hobby += chkReading.getText()+" ";
            }
            if(chkWriting.isSelected()){
            hobby += chkWriting.getText()+" ";
            }
            if(chkCoding.isSelected()){
            hobby += chkCoding.getText()+" ";
            }
            round = cmbRound.getItemAt(cmbRound.getSelectedIndex());
            address = txtAreaAdd.getText();
            password = passwordFiel.getText();
            lblMsg.setText("Successfully Data into table and write to file");
            
            Students students = new Students(id, name, Integer.parseInt(age), email, gender, hobby, round, address, password);
            List<Students> list = new ArrayList<>();
            list.add(students);
            
            DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
            Object row[] = new Object[9];
            
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getAge();
                row[3] = list.get(i).getEmail();
                row[4] = list.get(i).getGender();
                row[5] = list.get(i).getHobby();
                row[6] = list.get(i).getRound();
                row[7] = list.get(i).getAddress();
                row[8] = list.get(i).getPassword();
                model.addRow(row);
                
                try {
                    Utils.writeToFIle("abc", list);
                } catch (Exception e) {
                }
            }
        }
        
    }//GEN-LAST:event_btnAddTableFileActionPerformed

    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadFileActionPerformed
        // TODO add your handling code here:
        String columns[] = {"ID","Name","Age","Email","Gender","Hobby","Round","Address","Password"}; 
        DefaultTableModel tableModel;
        tableModel = new DefaultTableModel(0,9);
        tableModel.setColumnIdentifiers(columns);
        tblDisplay.setModel(tableModel);
        Utils.displayDataFromFile("abc", tableModel);
    }//GEN-LAST:event_btnReadFileActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtEmail.setText("");
        buttonGroup1.clearSelection();
        chkReading.setSelected(false);
        chkWriting.setSelected(false);
        chkCoding.setSelected(false);
        cmbRound.setSelectedIndex(0);
        txtAreaAdd.setText("");
        passwordFiel.setText("");
        lblMsg.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClearTableActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(EviForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EviForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EviForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EviForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EviForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTableFile;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearTable;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReadFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkCoding;
    private javax.swing.JCheckBox chkReading;
    private javax.swing.JCheckBox chkWriting;
    private javax.swing.JComboBox<String> cmbRound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JPasswordField passwordFiel;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextArea txtAreaAdd;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}