/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;






/**
 *
 * @author Tauqeer
 */
public class MainPage extends javax.swing.JFrame {
    ListView lv = new ListView();
    MyKid mk = new MyKid();
    StudentInfoEdit sie = new StudentInfoEdit();
    PhyDenPrint pd = new PhyDenPrint();
    StudentInfo si = new StudentInfo();
     AddStaff as = new AddStaff();
     DeleteStaff ds = new DeleteStaff();
     PhyDenDelete pddel = new PhyDenDelete();
     StudentInfo si1 = new StudentInfo();
     PhyDenPrint pd1 = new PhyDenPrint();
     Login ln = new Login();
     MyKid mk1 = new MyKid();
     AddStaff as1 = new AddStaff();
     StudentInfoEdit sie1 = new StudentInfoEdit();
    /**
     * Creates new form mainpage
     */
    public MainPage() {
        initComponents();
//        this.setLayout(new FlowLayout());
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//         Dimension d = toolkit.getScreenSize();
//          int width = d.width;
//          int height = d.height;
//         this.setSize(width,height);
        
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        viewprintbutton = new javax.swing.JButton();
        viewprint = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        newreg = new javax.swing.JButton();
        newregbutton = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        enterrecord = new javax.swing.JButton();
        enterrecordbutton = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        deleterecord = new javax.swing.JButton();
        deleterecodbutton = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        editrecord = new javax.swing.JButton();
        editbutton = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        listview = new javax.swing.JButton();
        listviewbutton = new javax.swing.JButton();
        admincreate = new javax.swing.JPanel();
        newstaff = new javax.swing.JButton();
        newstaffbutton = new javax.swing.JButton();
        admindelete = new javax.swing.JPanel();
        deletestaff = new javax.swing.JButton();
        deletestaffbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EVERYTHING YOU NEED");
        setIconImages(null);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1230, 811));

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setAutoscrolls(true);

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Welcome as");
        jPanel1.add(jLabel6);

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("admin");
        jPanel1.add(jLabel8);

        name.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        name.setForeground(new java.awt.Color(0, 204, 255));
        name.setText("TAUQEER AKHTAR");
        jPanel1.add(name);

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SIGN OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        viewprintbutton.setBackground(new java.awt.Color(0, 51, 204));
        viewprintbutton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        viewprintbutton.setText("VIEW AND PRINT RECORD");
        viewprintbutton.setPreferredSize(new java.awt.Dimension(250, 25));
        viewprintbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewprintbuttonActionPerformed(evt);
            }
        });

        viewprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/images/printer.png"))); // NOI18N
        viewprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(viewprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(viewprintbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(viewprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewprintbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setPreferredSize(new java.awt.Dimension(250, 200));

        newreg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tauqeer\\Downloads\\browser.png")); // NOI18N
        newreg.setPreferredSize(new java.awt.Dimension(250, 200));
        newreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newregActionPerformed(evt);
            }
        });

        newregbutton.setBackground(new java.awt.Color(0, 0, 204));
        newregbutton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        newregbutton.setText("NEW SVHF STUDENT REGISTRATION");
        newregbutton.setPreferredSize(new java.awt.Dimension(250, 25));
        newregbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newregbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newregbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(newreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(newreg, javax.swing.GroupLayout.PREFERRED_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newregbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setPreferredSize(new java.awt.Dimension(250, 200));

        enterrecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/images/doctor.png"))); // NOI18N
        enterrecord.setPreferredSize(new java.awt.Dimension(250, 200));
        enterrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterrecordActionPerformed(evt);
            }
        });

        enterrecordbutton.setBackground(new java.awt.Color(0, 51, 204));
        enterrecordbutton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        enterrecordbutton.setText("ENTER HEALTH CHECKUP RECORD");
        enterrecordbutton.setPreferredSize(new java.awt.Dimension(250, 25));
        enterrecordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterrecordbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enterrecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(enterrecordbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(enterrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterrecordbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setPreferredSize(new java.awt.Dimension(250, 200));

        deleterecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/images/delete.jpg"))); // NOI18N
        deleterecord.setPreferredSize(new java.awt.Dimension(250, 200));
        deleterecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterecordActionPerformed(evt);
            }
        });

        deleterecodbutton.setBackground(new java.awt.Color(0, 0, 204));
        deleterecodbutton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deleterecodbutton.setText("DELETE RECORD");
        deleterecodbutton.setPreferredSize(new java.awt.Dimension(250, 25));
        deleterecodbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterecodbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleterecord, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addComponent(deleterecodbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(deleterecord, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleterecodbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setPreferredSize(new java.awt.Dimension(250, 200));

        editrecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/images/edit (1).png"))); // NOI18N
        editrecord.setPreferredSize(new java.awt.Dimension(250, 200));
        editrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editrecordActionPerformed(evt);
            }
        });

        editbutton.setBackground(new java.awt.Color(0, 51, 204));
        editbutton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        editbutton.setText("EDIT RECORD");
        editbutton.setPreferredSize(new java.awt.Dimension(250, 25));
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editrecord, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
            .addComponent(editbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(editrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setPreferredSize(new java.awt.Dimension(250, 200));

        listview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/images/spreadsheet (1).png"))); // NOI18N
        listview.setPreferredSize(new java.awt.Dimension(250, 200));
        listview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listviewActionPerformed(evt);
            }
        });

        listviewbutton.setBackground(new java.awt.Color(0, 51, 204));
        listviewbutton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        listviewbutton.setText("VIEW LISTS OF STUDENT'S RECORD");
        listviewbutton.setPreferredSize(new java.awt.Dimension(250, 25));
        listviewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listviewbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listviewbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(listview, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listviewbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        admincreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        admincreate.setPreferredSize(new java.awt.Dimension(250, 200));

        newstaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/images/employee.png"))); // NOI18N
        newstaff.setPreferredSize(new java.awt.Dimension(250, 200));
        newstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newstaffActionPerformed(evt);
            }
        });

        newstaffbutton.setBackground(new java.awt.Color(0, 51, 204));
        newstaffbutton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        newstaffbutton.setText("CREATE NEW STAFF");
        newstaffbutton.setPreferredSize(new java.awt.Dimension(250, 25));
        newstaffbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newstaffbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout admincreateLayout = new javax.swing.GroupLayout(admincreate);
        admincreate.setLayout(admincreateLayout);
        admincreateLayout.setHorizontalGroup(
            admincreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newstaffbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(newstaff, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        admincreateLayout.setVerticalGroup(
            admincreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admincreateLayout.createSequentialGroup()
                .addComponent(newstaff, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newstaffbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        admindelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        admindelete.setPreferredSize(new java.awt.Dimension(250, 200));

        deletestaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/images/user.png"))); // NOI18N
        deletestaff.setPreferredSize(new java.awt.Dimension(250, 200));
        deletestaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestaffActionPerformed(evt);
            }
        });

        deletestaffbutton.setBackground(new java.awt.Color(0, 51, 204));
        deletestaffbutton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deletestaffbutton.setText("DELETE STAFF");
        deletestaffbutton.setPreferredSize(new java.awt.Dimension(250, 25));
        deletestaffbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestaffbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout admindeleteLayout = new javax.swing.GroupLayout(admindelete);
        admindelete.setLayout(admindeleteLayout);
        admindeleteLayout.setHorizontalGroup(
            admindeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deletestaffbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deletestaff, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );
        admindeleteLayout.setVerticalGroup(
            admindeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admindeleteLayout.createSequentialGroup()
                .addComponent(deletestaff, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletestaffbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(admindelete, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(admincreate, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(admincreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(admindelete, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1475, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newregbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newregbuttonActionPerformed
           
//          mk.pack();
                mk.setLocationRelativeTo(null);
                mk.setVisible(true);
                                    
    }//GEN-LAST:event_newregbuttonActionPerformed

    private void editrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editrecordActionPerformed
//        sie.pack();
                sie.setLocationRelativeTo(null);
                sie.setVisible(true);
    }//GEN-LAST:event_editrecordActionPerformed

    private void viewprintbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewprintbuttonActionPerformed
     
//        pd.pack();
                pd.setLocationRelativeTo(null);
                pd.setVisible(true);
    }//GEN-LAST:event_viewprintbuttonActionPerformed

    private void listviewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listviewbuttonActionPerformed
//        ListView lv = new ListView();
//        lv.pack();
                lv.setLocationRelativeTo(null);
                lv.setVisible(true);
    }//GEN-LAST:event_listviewbuttonActionPerformed

    private void enterrecordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterrecordbuttonActionPerformed
        
//          si.pack();
                si1.setLocationRelativeTo(null);
                si1.setVisible(true);
    }//GEN-LAST:event_enterrecordbuttonActionPerformed

    private void deleterecodbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterecodbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleterecodbuttonActionPerformed

    private void newstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newstaffActionPerformed
      
//          as.pack();
                as.setLocationRelativeTo(null);
                as.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_newstaffActionPerformed

    private void deletestaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestaffActionPerformed
        
//          ds.pack();
                ds.setLocationRelativeTo(null);
                ds.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_deletestaffActionPerformed

    private void deleterecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterecordActionPerformed
         
//          pddel.pack();
                pddel.setLocationRelativeTo(null);
                pddel.setVisible(true);
    }//GEN-LAST:event_deleterecordActionPerformed

    private void enterrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterrecordActionPerformed
        
//          si.pack();
                si.setLocationRelativeTo(null);
                si.setVisible(true);
    }//GEN-LAST:event_enterrecordActionPerformed

    private void newregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newregActionPerformed
        
        // mk.pack();
                mk1.setLocationRelativeTo(null);
                mk1.setVisible(true);
    }//GEN-LAST:event_newregActionPerformed

    private void viewprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewprintActionPerformed
       
//        pd.pack();
                pd1.setLocationRelativeTo(null);
                pd1.setVisible(true);
    }//GEN-LAST:event_viewprintActionPerformed

    private void listviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listviewActionPerformed
      
//        lv.pack();
                lv.setLocationRelativeTo(null);
                lv.setVisible(true);
    }//GEN-LAST:event_listviewActionPerformed

    private void newstaffbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newstaffbuttonActionPerformed
              
//          as.pack();
                as1.setLocationRelativeTo(null);
                as1.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_newstaffbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
//       ln.pack();
                ln.setLocationRelativeTo(null);
                ln.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
       
//        sie.pack();
                sie1.setLocationRelativeTo(null);
                sie1.setVisible(true);
    }//GEN-LAST:event_editbuttonActionPerformed

    private void deletestaffbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestaffbuttonActionPerformed
         DeleteStaff ds = new DeleteStaff();
//          ds.pack();
                ds.setLocationRelativeTo(null);
                ds.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_deletestaffbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel admincreate;
    public javax.swing.JPanel admindelete;
    private javax.swing.JButton deleterecodbutton;
    private javax.swing.JButton deleterecord;
    private javax.swing.JButton deletestaff;
    private javax.swing.JButton deletestaffbutton;
    private javax.swing.JButton editbutton;
    private javax.swing.JButton editrecord;
    private javax.swing.JButton enterrecord;
    private javax.swing.JButton enterrecordbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton listview;
    private javax.swing.JButton listviewbutton;
    public javax.swing.JLabel name;
    private javax.swing.JButton newreg;
    private javax.swing.JButton newregbutton;
    private javax.swing.JButton newstaff;
    private javax.swing.JButton newstaffbutton;
    private javax.swing.JButton viewprint;
    private javax.swing.JButton viewprintbutton;
    // End of variables declaration//GEN-END:variables
}
