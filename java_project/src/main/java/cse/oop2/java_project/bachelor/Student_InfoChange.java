/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_project.bachelor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author ppak
 */
public class Student_InfoChange extends javax.swing.JFrame {

    /**
     * Creates new form Student_InfoCange
     */
    public Student_InfoChange() {
        initComponents();
        setTitle("정보 수정");
    }

    String URL = null;

    public Student_InfoChange(String url) {
        initComponents();
        setTitle("정보 수정");
        URL = url + "\\student.txt";
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
        BUTT_CHANGE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        student_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("정보 수정");

        BUTT_CHANGE.setText("수정");
        BUTT_CHANGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_CHANGEActionPerformed(evt);
            }
        });

        jLabel2.setText("학생 이름");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BUTT_CHANGE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUTT_CHANGE))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTT_CHANGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_CHANGEActionPerformed
        // TODO add your handling code here:

        try {

            String str; // 메모장 안에 있는 데이터를 읽어와 저장
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(URL));

            //파일 객체 생성
            Path path = Paths.get(URL);
            // 캐릭터셋 지정
            Charset cs = StandardCharsets.UTF_8;
            // 파일 내용을 담을 리스트
            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);
            // 모든 파일 내용 읽어와서 저장
            ArrayList<String> list_temp = new ArrayList<String>(); // 임시 저장
            ArrayList<String> name_list = new ArrayList<String>(); // id_list

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            System.out.println(list_temp);

            for (String i : list_temp) {
                String[] temp = i.split("/");
                name_list.add(temp[3]);
            }
            
            System.out.println(name_list);
            
            int co = 0;
            for (String cmp : name_list) {
                if (student_name.getText().equals(cmp)) {
                    Student_InfoChange1 sic = new Student_InfoChange1(co);                    
                    sic.setVisible(true);
                    dispose();
                } else {
                    co++;
                }
            }

        } catch (IOException E10) {
            E10.printStackTrace();
        }
    }//GEN-LAST:event_BUTT_CHANGEActionPerformed

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
            java.util.logging.Logger.getLogger(Student_InfoChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_InfoChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_InfoChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_InfoChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_InfoChange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTT_CHANGE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField student_name;
    // End of variables declaration//GEN-END:variables
}
