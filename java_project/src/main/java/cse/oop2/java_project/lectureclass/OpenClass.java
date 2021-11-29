/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_project.lectureclass;

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
 * @author 정민수,윤채민,이혜리
 */
public class OpenClass extends javax.swing.JFrame {

    /**
     * Creates new form OpenClass
     */
    public OpenClass() {
        initComponents();
    }

    String URL = null;
    String URL_professor = null;

    public OpenClass(String URL) {
        initComponents();
        setTitle("강좌 개설");
        this.URL = URL;
        this.URL_professor = URL + "\\professor.txt";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        professor = new javax.swing.JTextField();
        ClassNum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lecture_num = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lecture_max = new javax.swing.JTextField();
        lecture_min = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lecture_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("담당교수");

        jLabel3.setText("강의주차");

        jButton1.setText("취소");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("확인");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("강좌번호");

        jLabel5.setText("수강가능최대인원");

        jLabel6.setText("최소수강가능인원");

        jLabel1.setText("강좌명");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ClassNum)
                            .addComponent(professor)
                            .addComponent(lecture_num)
                            .addComponent(lecture_max, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(lecture_min)
                            .addComponent(lecture_name))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lecture_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lecture_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(professor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lecture_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lecture_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ClassNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<String> num_list = new ArrayList<>(); // 강의 번호 리스트
    ArrayList<String> name_list = new ArrayList<>(); // 강의명 리스트
    ArrayList<String> major_list = new ArrayList<>(); // 개설학과 리스트
    ArrayList<String> professor_list = new ArrayList<>(); // 교수 이름 리스트
    ArrayList<String> score_list = new ArrayList<>(); // 학점 리스트
    ArrayList<String> info_list = new ArrayList<>(); // 강의 정보 리스트
    ArrayList<String> pname_list = new ArrayList<>(); // 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NewFileCreat(int index) {
        try {

            File file = new File(URL + "\\lectureclass.txt");
            FileWriter writer;
            writer = new FileWriter(file, true);

            //여기서 문제인듯
            String str = String.format("%s/%s/%s/%s/%s/%s%n", num_list.get(index), name_list.get(index), major_list.get(index), professor_list.get(index), score_list.get(index), info_list.get(index));
            writer.write(str);
            writer.flush();// 출력은 버퍼에 쌓여있기에 쌓인 버퍼를 목적지로 보내줌

            JOptionPane.showMessageDialog(null, "강의 개설 완료");
            writer.close();

            num_list.clear();
            name_list.clear();
            major_list.clear();
            professor_list.clear();
            score_list.clear();
            info_list.clear();

        } catch (IOException ex) {
            System.out.println("오류발생");
        }
    }

    private boolean InfoCompare(int index) {
        // 변경하고자 하는 값이 일치할 때 true 반환
        if ((lecture_name.getText().equals(name_list.get(index))) && (lecture_num.getText().equals(num_list.get(index)))) {
            return true;
        } else {
            return false;
        }
    }

    // 같은 강의 번호가 등록이 되어 있는지 확인하는 메소드
    private boolean NumCompare() {
        try {

            String str; // 메모장 안에 있는 데이터를 읽어와 저장
            String[] array = null;

            // 절대경로 바꾸기
            BufferedReader is = new BufferedReader(new FileReader(URL + "\\lectureclass.txt"));
            //파일 객체 생성

            Path path = Paths.get(URL + "\\lectureclass.txt");
            // 캐릭터셋 지정
            Charset cs = StandardCharsets.UTF_8;
            // 파일 내용을 담을 리스트
            ArrayList<String> list = new ArrayList<>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);
            // 모든 파일 내용 읽어와서 저장
            ArrayList<String> list_temp = new ArrayList<>(); // 임시 저장
            ArrayList<String> num_list = new ArrayList<>(); // 임시 저장
            is.close();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                num_list.add(temp[0]);
            }

            for (int i = 0; i < num_list.size(); i++) {
                if (lecture_num.getText().equals(num_list.get(i))) {
                    return false;
                }
            }

        } catch (IOException E10) {
            E10.printStackTrace();
        }

        return true;
    }

    // 등록된 교수인지 확인하는 메소드
    private boolean ProfessorName() {
        try {
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(URL_professor));

            Path path = Paths.get(URL_professor);
            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<>();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                pname_list.add(temp[3]);
            }

            for (int i = 0; i < pname_list.size(); i++) {
                if (professor.getText().equals(pname_list.get(i))) {
                    return true;
                }
            }
            is.close();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return false;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            String str; // 메모장 안에 있는 데이터를 읽어와 저장
            String[] array = null;

            // 절대경로 바꾸기
            BufferedReader is = new BufferedReader(new FileReader(URL + "\\lectureclass_temp.txt"));
            //파일 객체 생성
            Path path = Paths.get(URL + "\\lectureclass_temp.txt");
            // 캐릭터셋 지정
            Charset cs = StandardCharsets.UTF_8;
            // 파일 내용을 담을 리스트
            ArrayList<String> list = new ArrayList<>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);
            // 모든 파일 내용 읽어와서 저장
            ArrayList<String> list_temp = new ArrayList<>(); // 임시 저장
            is.close();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");

                num_list.add(temp[0]);
                name_list.add(temp[1]);
                major_list.add(temp[2]);
                professor_list.add(temp[3]);
                score_list.add(temp[4]);
                info_list.add(temp[5]);

            }
            if (ProfessorName()) {
                if (NumCompare()) {
                    int ch = -1;
                    int index = 0; // 새로운 파일에 복사하기 위함
                    for (int i = 0; i < num_list.size(); i++) {
                        if (InfoCompare(i)) {
                            professor_list.set(i, professor.getText());
                            ch = 0;
                            index = i;
                            break;
                        }
                    }
                    if (ch == 0) {
                        NewFileCreat(index); // 파일에 기록 후 종료
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "강의명 또는 강의 번호가 일치하지 않습니다.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "이미 등록된 강의 번호입니다.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "존재하지 않은 교수입니다.");
            }
        } catch (IOException E10) {
            E10.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(OpenClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpenClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpenClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpenClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpenClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClassNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lecture_max;
    private javax.swing.JTextField lecture_min;
    private javax.swing.JTextField lecture_name;
    private javax.swing.JTextField lecture_num;
    private javax.swing.JTextField professor;
    // End of variables declaration//GEN-END:variables
}
