/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_project.bachelor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 정민수
 */
public class Professor_Info_Register extends javax.swing.JFrame {

    /**
     * Creates new form Professor_Info_Register
     */
    public Professor_Info_Register() {
        initComponents();
    }

    String URL = null;

    public Professor_Info_Register(String URL) {
        initComponents();
        setTitle("학사담당자 - 교수 정보 등록");
        this.URL = URL;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        professor_major = new javax.swing.JTextField();
        professor_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        professor_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        professor_rrn = new javax.swing.JTextField();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("이름");

        jLabel4.setText("학과");

        jLabel5.setText("주민번호");

        Register.setText("등록");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("등록");

        jLabel2.setText("교수 번호");

        Close.setText("닫기");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(professor_rrn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(professor_major, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(professor_name, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(professor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Close)
                        .addGap(18, 18, 18)
                        .addComponent(Register)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professor_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professor_major, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professor_rrn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close)
                    .addComponent(Register))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean MajorCompare() { // 5개 학과 중에서 입력했는지 확인하는 메소드
        String[] major = {"전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주학과"};

        for (String i : major) {
            if (professor_major.getText().equals(i)) {
                return true;
            }
        }
        return false;
    }

    private boolean RrnCompare() {
        String temp = professor_rrn.getText();
        boolean ch = false; // 주민등록번호 입력란에 -가 들어갔는지 확인하기 위함
        int rrn_first = 0;
        int rrn_second = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '-') {
                ch = true;
                break;
            }
        }

        // 주민등록번호 입력 시 "-" 이 없을 때 오류를 방지하기 위함
        if (ch) {
            String[] cmp = temp.split("-");
            rrn_first = cmp[0].length(); // 주민등록번호 앞
            rrn_second = cmp[1].length(); // 주민등록번호 뒤            
        }

        // 주민등록번호 앞 6, 뒤 7자리를 입력했는지 확인하기 위함
        if ((rrn_first == 6) && (rrn_second == 7)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean IdCompare(String url) {
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
            ArrayList<String> id_list = new ArrayList<String>(); // id_list

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                id_list.add(temp[0]);
            }

            for (String tmp : id_list) {
                if (professor_ID.getText().equals(tmp)) {
                    is.close();
                    return false;
                }
            }

        } catch (IOException E10) {
            E10.printStackTrace();
        }

        return true;
    }


    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
        char id_cmp = professor_ID.getText().charAt(0);
        boolean major_cmp = MajorCompare();
        boolean rrn_cmp = RrnCompare();

        if ((id_cmp == 'P') && (major_cmp) && (rrn_cmp)) {
            try {
                String id = professor_ID.getText();
                String name = professor_name.getText();
                String major = professor_major.getText();
                String number = professor_rrn.getText();
                String s = "/";
                String n = "\n";

                // 교수 번호가 중복인지 확인하기 위함
                boolean id_temp = IdCompare(URL);
                if (id_temp) { // 교수 번호가 중복이 아니면                    
                    File file = new File(URL);
                    FileWriter writer;
                    writer = new FileWriter(file, true);
                    writer.write(id);
                    writer.write(s);
                    writer.write(number);
                    writer.write(s);
                    writer.write(major);
                    writer.write(s);
                    writer.write(name);
                    writer.write(n);
                    writer.flush();// 출력은 버퍼에 쌓여있기에 쌓인 버퍼를 목적지로 보내줌
                    writer.close();
                    JOptionPane.showMessageDialog(null, "교수가 등록되었습니다.");

                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "같은 교수 번호가 존재합니다. 다른 교수 번호를 입력해주시기 바랍니다.");
                    professor_ID.setText(null);
                    professor_name.setText(null);
                    professor_major.setText(null);
                    professor_rrn.setText(null);
                }

            } catch (IOException ex) {
                System.out.println("오류발생");
            }

        } else {
            JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 입력해주세요.");
            professor_ID.setText(null);
            professor_name.setText(null);
            professor_major.setText(null);
            professor_rrn.setText(null);
        }
    }//GEN-LAST:event_RegisterActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(Professor_Info_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professor_Info_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professor_Info_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professor_Info_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Professor_Info_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField professor_ID;
    private javax.swing.JTextField professor_major;
    private javax.swing.JTextField professor_name;
    private javax.swing.JTextField professor_rrn;
    // End of variables declaration//GEN-END:variables
}
