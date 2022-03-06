import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.table.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class PatientAdmit_WardRecord_1 extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;

    /**
     * Creates new form PatientAdmit_RoomRecord
     */
    public PatientAdmit_WardRecord_1() {
        initComponents();
        con= Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }
 private void Get_Data(){
          try{
              String sql="Select AdmitID as 'Admit ID',"
                      + "PatientRegistration.PatientID as"
                      + " 'Patient ID',PatientRegistration.PatientName "
                      + "as 'Patient Name',PatientRegistration.Gen as "
                      + "'Gender',PatientRegistration.BG as 'Blood Group'"
                      + ",Disease,AdmitDate as 'Admit Date',Ward.Wardname "
                      + "as 'Ward Name',Doctor.DoctorID as 'Doctor ID',DoctorName"
                      + " as 'Doctor Name',AdmitPatient_Ward.AP_Remarks as 'Remarks'"
                      + " ,Ward.Charges as 'Bed Charges' from Ward,Doctor,PatientRegistration,AdmitPatient_Ward"
                      + " where Ward.Wardname=AdmitPatient_Ward.Wardname and"
                      + " Doctor.DoctorID=AdmitPatient_Ward.DoctorID and "
                      + "PatientRegistration.PatientID=AdmitPatient_Ward.PatientID order by admitid";
             DefaultTableModel model = (DefaultTableModel)
jTable1.getModel(); int rows=model.getRowCount();
if (rows>0)
{
for (int i=0; i<rows; i++)
 model.removeRow(0); 
}


Statement stmt = con.createStatement();
             rs= stmt.executeQuery(sql);
             model = (DefaultTableModel) jTable1.getModel();
          while(rs.next())
{
String a = rs.getString("Admit ID");
String b = rs.getString("Patient ID");
String c = rs.getString("Patient Name");
String d = rs.getString("Gender");
String e = rs.getString("Blood Group");
String f = rs.getString("Disease");
String g = rs.getString("Admit Date");
String h = rs.getString("Ward Name");
String i = rs.getString("Doctor ID");
String j = rs.getString("Doctor Name");
String k = rs.getString("Remarks");
String l = rs.getString("Bed Charges");
model.addRow (new Object[] {a,b,c,d,e,f,g,h,i,j,k,l});
}
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
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
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admit Patient Record");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Admit ID", "Patient ID", "Patient Name", "Gender", "Blood Group", "Disease", "Admit Date", "Ward Name", "Doctor ID", "Doctor Name", "Remarks", "Bed Charge"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    try{
            con=Connect.ConnectDB();
            int row= jTable1.getSelectedRow();
            String table_click= jTable1.getModel().getValueAt(row, 0).toString();
             String sql="Select * from Ward,Doctor,PatientRegistration,AdmitPatient_Ward where Ward.Wardname=AdmitPatient_Ward.Wardname and Doctor.DoctorID=AdmitPatient_Ward.DoctorID and PatientRegistration.PatientID=AdmitPatient_Ward.PatientID and AdmitID=" + table_click + "";   
        
Statement stmt = con.createStatement();
             rs= stmt.executeQuery(sql);
            if(rs.next()){
                this.hide();
                 Bill_Ward frm = new Bill_Ward();
                frm.setVisible(true);
                String add1=rs.getString("DoctorID");
                frm.txtDoctorID.setText(add1);
                String add2=rs.getString("Doctorname");
                frm.txtDoctorName.setText(add2);
                String add3=rs.getString("PatientID");
                frm.PatientID.setText(add3);
                String add5=rs.getString("PatientName");
                frm.txtPatientName.setText(add5);
                String add6=rs.getString("Gen");
                frm.txtGender.setText(add6);
                String add7=rs.getString("BG");
                frm.txtBloodGroup.setText(add7);
                String add9=rs.getString("Disease");
                frm.txtDisease.setText(add9);
                String add11=rs.getString("AdmitDate");
                frm.txtAdmitDate.setText(add11);
                String add14=rs.getString("Wardname");
                frm.txtWardname.setText(add14);
                String add15=rs.getString("Charges");
                frm.txtBedCharges.setText(add15);
             
                int add16 = rs.getInt("AdmitID");
                String add17= Integer.toString(add16);
                frm.txtAdmitID.setText(add17);
                
                frm.btnUpdate.setEnabled(false);
                frm.btnDelete.setEnabled(false);
                frm.Transaction.setEnabled(true);
                jTable1.setEnabled(true);
             
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       this.hide();
      Bill_Ward frm = new Bill_Ward();
                frm.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new PatientAdmit_WardRecord_1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
