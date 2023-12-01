/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javacal;

import java.text.DecimalFormat;


public final class JavaCalculator extends javax.swing.JFrame {

    public JavaCalculator() {
        initComponents();
    }
    
    char operator;
    double sum = 0;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ResultField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Jbtn_8 = new javax.swing.JButton();
        Jbtn_9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Jbtn_5 = new javax.swing.JButton();
        Jbtn_6 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        Jbtn_1 = new javax.swing.JButton();
        Jbtn_3 = new javax.swing.JButton();
        Jbtn_0 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        JEqual = new javax.swing.JButton();
        JClear = new javax.swing.JButton();
        Jbtn_4 = new javax.swing.JButton();
        Jbtn_7 = new javax.swing.JButton();
        Jbtn_2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton4.setBackground(new java.awt.Color(77, 77, 77));
        jButton4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("C");
        jButton4.setToolTipText("");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator By Hasan");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(260, 360));

        jPanel1.setBackground(new java.awt.Color(90, 89, 89));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Calculator By Hasan");

        ResultField.setEditable(false);
        ResultField.setBackground(new java.awt.Color(77, 77, 77));
        ResultField.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        ResultField.setForeground(new java.awt.Color(255, 255, 255));
        ResultField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ResultField.setToolTipText("");
        ResultField.setBorder(null);
        ResultField.setFocusTraversalKeysEnabled(false);
        ResultField.setFocusable(false);
        ResultField.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ResultField.setRequestFocusEnabled(false);
        ResultField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultFieldActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(77, 77, 77));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+/-");
        jButton2.setToolTipText("");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.setFocusTraversalKeysEnabled(false);
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(2);
        jButton2.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton2.setMaximumSize(new java.awt.Dimension(52, 0));
        jButton2.setMinimumSize(new java.awt.Dimension(50, 0));
        jButton2.setPreferredSize(new java.awt.Dimension(52, 52));

        jButton3.setBackground(new java.awt.Color(77, 77, 77));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("%");
        jButton3.setToolTipText("");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusTraversalKeysEnabled(false);
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(2);
        jButton3.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton3.setMaximumSize(new java.awt.Dimension(52, 0));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 0));
        jButton3.setPreferredSize(new java.awt.Dimension(52, 52));

        jButton6.setBackground(new java.awt.Color(255, 153, 51));
        jButton6.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("X");
        jButton6.setToolTipText("");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(52, 0));
        jButton6.setMinimumSize(new java.awt.Dimension(50, 0));
        jButton6.setPreferredSize(new java.awt.Dimension(52, 52));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Jbtn_8.setBackground(new java.awt.Color(77, 77, 77));
        Jbtn_8.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Jbtn_8.setForeground(new java.awt.Color(255, 255, 255));
        Jbtn_8.setText("8");
        Jbtn_8.setToolTipText("");
        Jbtn_8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Jbtn_8.setBorderPainted(false);
        Jbtn_8.setFocusTraversalKeysEnabled(false);
        Jbtn_8.setFocusable(false);
        Jbtn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_8.setIconTextGap(2);
        Jbtn_8.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Jbtn_8.setMaximumSize(new java.awt.Dimension(52, 0));
        Jbtn_8.setMinimumSize(new java.awt.Dimension(50, 0));
        Jbtn_8.setPreferredSize(new java.awt.Dimension(52, 52));
        Jbtn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_8ActionPerformed(evt);
            }
        });

        Jbtn_9.setBackground(new java.awt.Color(77, 77, 77));
        Jbtn_9.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Jbtn_9.setForeground(new java.awt.Color(255, 255, 255));
        Jbtn_9.setText("9");
        Jbtn_9.setToolTipText("");
        Jbtn_9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Jbtn_9.setBorderPainted(false);
        Jbtn_9.setFocusPainted(false);
        Jbtn_9.setFocusTraversalKeysEnabled(false);
        Jbtn_9.setFocusable(false);
        Jbtn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_9.setIconTextGap(2);
        Jbtn_9.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Jbtn_9.setMaximumSize(new java.awt.Dimension(52, 0));
        Jbtn_9.setMinimumSize(new java.awt.Dimension(50, 0));
        Jbtn_9.setPreferredSize(new java.awt.Dimension(52, 52));
        Jbtn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 153, 0));
        jButton10.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("-");
        jButton10.setToolTipText("");
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton10.setBorderPainted(false);
        jButton10.setFocusPainted(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setMaximumSize(new java.awt.Dimension(52, 0));
        jButton10.setMinimumSize(new java.awt.Dimension(50, 0));
        jButton10.setPreferredSize(new java.awt.Dimension(52, 52));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        Jbtn_5.setBackground(new java.awt.Color(77, 77, 77));
        Jbtn_5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Jbtn_5.setForeground(new java.awt.Color(255, 255, 255));
        Jbtn_5.setText("5");
        Jbtn_5.setToolTipText("");
        Jbtn_5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Jbtn_5.setBorderPainted(false);
        Jbtn_5.setFocusTraversalKeysEnabled(false);
        Jbtn_5.setFocusable(false);
        Jbtn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_5.setIconTextGap(2);
        Jbtn_5.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Jbtn_5.setMaximumSize(new java.awt.Dimension(52, 0));
        Jbtn_5.setMinimumSize(new java.awt.Dimension(50, 0));
        Jbtn_5.setPreferredSize(new java.awt.Dimension(52, 52));
        Jbtn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_5ActionPerformed(evt);
            }
        });

        Jbtn_6.setBackground(new java.awt.Color(77, 77, 77));
        Jbtn_6.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Jbtn_6.setForeground(new java.awt.Color(255, 255, 255));
        Jbtn_6.setText("6");
        Jbtn_6.setToolTipText("");
        Jbtn_6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Jbtn_6.setBorderPainted(false);
        Jbtn_6.setFocusPainted(false);
        Jbtn_6.setFocusTraversalKeysEnabled(false);
        Jbtn_6.setFocusable(false);
        Jbtn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_6.setIconTextGap(2);
        Jbtn_6.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Jbtn_6.setMaximumSize(new java.awt.Dimension(52, 0));
        Jbtn_6.setMinimumSize(new java.awt.Dimension(50, 0));
        Jbtn_6.setPreferredSize(new java.awt.Dimension(52, 52));
        Jbtn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_6ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 153, 0));
        jButton14.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("+");
        jButton14.setToolTipText("");
        jButton14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton14.setBorderPainted(false);
        jButton14.setFocusPainted(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setMaximumSize(new java.awt.Dimension(52, 0));
        jButton14.setMinimumSize(new java.awt.Dimension(50, 0));
        jButton14.setPreferredSize(new java.awt.Dimension(52, 52));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        Jbtn_1.setBackground(new java.awt.Color(77, 77, 77));
        Jbtn_1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Jbtn_1.setForeground(new java.awt.Color(255, 255, 255));
        Jbtn_1.setText("1");
        Jbtn_1.setToolTipText("");
        Jbtn_1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Jbtn_1.setBorderPainted(false);
        Jbtn_1.setFocusTraversalKeysEnabled(false);
        Jbtn_1.setFocusable(false);
        Jbtn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_1.setIconTextGap(2);
        Jbtn_1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Jbtn_1.setMaximumSize(new java.awt.Dimension(52, 0));
        Jbtn_1.setMinimumSize(new java.awt.Dimension(50, 0));
        Jbtn_1.setPreferredSize(new java.awt.Dimension(52, 52));
        Jbtn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_1ActionPerformed(evt);
            }
        });

        Jbtn_3.setBackground(new java.awt.Color(77, 77, 77));
        Jbtn_3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Jbtn_3.setForeground(new java.awt.Color(255, 255, 255));
        Jbtn_3.setText("3");
        Jbtn_3.setToolTipText("");
        Jbtn_3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Jbtn_3.setBorderPainted(false);
        Jbtn_3.setFocusPainted(false);
        Jbtn_3.setFocusTraversalKeysEnabled(false);
        Jbtn_3.setFocusable(false);
        Jbtn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_3.setIconTextGap(2);
        Jbtn_3.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Jbtn_3.setMaximumSize(new java.awt.Dimension(52, 0));
        Jbtn_3.setMinimumSize(new java.awt.Dimension(50, 0));
        Jbtn_3.setPreferredSize(new java.awt.Dimension(52, 52));
        Jbtn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_3ActionPerformed(evt);
            }
        });

        Jbtn_0.setBackground(new java.awt.Color(77, 77, 77));
        Jbtn_0.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Jbtn_0.setForeground(new java.awt.Color(255, 255, 255));
        Jbtn_0.setText("0");
        Jbtn_0.setToolTipText("");
        Jbtn_0.setBorder(null);
        Jbtn_0.setBorderPainted(false);
        Jbtn_0.setFocusPainted(false);
        Jbtn_0.setFocusTraversalKeysEnabled(false);
        Jbtn_0.setFocusable(false);
        Jbtn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_0.setIconTextGap(2);
        Jbtn_0.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Jbtn_0.setRequestFocusEnabled(false);
        Jbtn_0.setRolloverEnabled(false);
        Jbtn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_0ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(77, 77, 77));
        jButton20.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText(".");
        jButton20.setToolTipText("");
        jButton20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton20.setBorderPainted(false);
        jButton20.setFocusPainted(false);
        jButton20.setFocusTraversalKeysEnabled(false);
        jButton20.setFocusable(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setIconTextGap(2);
        jButton20.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton20.setMaximumSize(new java.awt.Dimension(52, 0));
        jButton20.setMinimumSize(new java.awt.Dimension(50, 0));
        jButton20.setPreferredSize(new java.awt.Dimension(52, 52));

        JEqual.setBackground(new java.awt.Color(255, 153, 0));
        JEqual.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        JEqual.setForeground(new java.awt.Color(255, 255, 255));
        JEqual.setText("=");
        JEqual.setToolTipText("");
        JEqual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JEqual.setBorderPainted(false);
        JEqual.setFocusPainted(false);
        JEqual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JEqual.setMaximumSize(new java.awt.Dimension(52, 0));
        JEqual.setMinimumSize(new java.awt.Dimension(50, 0));
        JEqual.setPreferredSize(new java.awt.Dimension(52, 52));
        JEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEqualActionPerformed(evt);
            }
        });

        JClear.setBackground(new java.awt.Color(77, 77, 77));
        JClear.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        JClear.setForeground(new java.awt.Color(255, 255, 255));
        JClear.setText("C");
        JClear.setToolTipText("");
        JClear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JClear.setBorderPainted(false);
        JClear.setFocusTraversalKeysEnabled(false);
        JClear.setFocusable(false);
        JClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JClear.setIconTextGap(2);
        JClear.setMargin(new java.awt.Insets(1, 1, 1, 1));
        JClear.setMaximumSize(new java.awt.Dimension(52, 0));
        JClear.setMinimumSize(new java.awt.Dimension(50, 0));
        JClear.setPreferredSize(new java.awt.Dimension(52, 52));
        JClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JClearActionPerformed(evt);
            }
        });

        Jbtn_4.setBackground(new java.awt.Color(77, 77, 77));
        Jbtn_4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Jbtn_4.setForeground(new java.awt.Color(255, 255, 255));
        Jbtn_4.setText("4");
        Jbtn_4.setToolTipText("");
        Jbtn_4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Jbtn_4.setBorderPainted(false);
        Jbtn_4.setFocusTraversalKeysEnabled(false);
        Jbtn_4.setFocusable(false);
        Jbtn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_4.setIconTextGap(2);
        Jbtn_4.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Jbtn_4.setMaximumSize(new java.awt.Dimension(52, 0));
        Jbtn_4.setMinimumSize(new java.awt.Dimension(50, 0));
        Jbtn_4.setPreferredSize(new java.awt.Dimension(52, 52));
        Jbtn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_4ActionPerformed(evt);
            }
        });

        Jbtn_7.setBackground(new java.awt.Color(77, 77, 77));
        Jbtn_7.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Jbtn_7.setForeground(new java.awt.Color(255, 255, 255));
        Jbtn_7.setText("7");
        Jbtn_7.setToolTipText("");
        Jbtn_7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Jbtn_7.setBorderPainted(false);
        Jbtn_7.setFocusTraversalKeysEnabled(false);
        Jbtn_7.setFocusable(false);
        Jbtn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_7.setIconTextGap(2);
        Jbtn_7.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Jbtn_7.setMaximumSize(new java.awt.Dimension(52, 0));
        Jbtn_7.setMinimumSize(new java.awt.Dimension(50, 0));
        Jbtn_7.setPreferredSize(new java.awt.Dimension(52, 52));
        Jbtn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_7ActionPerformed(evt);
            }
        });

        Jbtn_2.setBackground(new java.awt.Color(77, 77, 77));
        Jbtn_2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Jbtn_2.setForeground(new java.awt.Color(255, 255, 255));
        Jbtn_2.setText("2");
        Jbtn_2.setToolTipText("");
        Jbtn_2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Jbtn_2.setBorderPainted(false);
        Jbtn_2.setFocusTraversalKeysEnabled(false);
        Jbtn_2.setFocusable(false);
        Jbtn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_2.setIconTextGap(2);
        Jbtn_2.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Jbtn_2.setMaximumSize(new java.awt.Dimension(52, 0));
        Jbtn_2.setMinimumSize(new java.awt.Dimension(50, 0));
        Jbtn_2.setPreferredSize(new java.awt.Dimension(52, 52));
        Jbtn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_2ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 153, 0));
        jButton7.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("/");
        jButton7.setToolTipText("");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.setFocusTraversalKeysEnabled(false);
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setIconTextGap(2);
        jButton7.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton7.setMaximumSize(new java.awt.Dimension(52, 0));
        jButton7.setMinimumSize(new java.awt.Dimension(50, 0));
        jButton7.setPreferredSize(new java.awt.Dimension(52, 52));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ResultField)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Jbtn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jbtn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jbtn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Jbtn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jbtn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jbtn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JClear, JEqual, Jbtn_1, Jbtn_2, Jbtn_3, Jbtn_4, Jbtn_5, Jbtn_6, Jbtn_7, Jbtn_8, Jbtn_9, jButton10, jButton14, jButton2, jButton20, jButton3, jButton6, jButton7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ResultField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jbtn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jbtn_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jbtn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jbtn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jbtn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jbtn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jbtn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jbtn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jbtn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JEqual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jbtn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JClear, JEqual, Jbtn_1, Jbtn_2, Jbtn_3, Jbtn_4, Jbtn_5, Jbtn_6, Jbtn_7, Jbtn_8, Jbtn_9, jButton10, jButton14, jButton2, jButton20, jButton3, jButton6, jButton7});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Calculator By Hasan");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_1ActionPerformed
       ResultField.setText("1");
    }//GEN-LAST:event_Jbtn_1ActionPerformed

    private void ResultFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultFieldActionPerformed
        
    }//GEN-LAST:event_ResultFieldActionPerformed

    private void Jbtn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_3ActionPerformed
        ResultField.setText("3");
    }//GEN-LAST:event_Jbtn_3ActionPerformed

    private void Jbtn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_4ActionPerformed
        ResultField.setText("4");
    }//GEN-LAST:event_Jbtn_4ActionPerformed

    private void Jbtn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_5ActionPerformed
        ResultField.setText("5");
    }//GEN-LAST:event_Jbtn_5ActionPerformed

    private void Jbtn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_6ActionPerformed
        ResultField.setText("6");
    }//GEN-LAST:event_Jbtn_6ActionPerformed

    private void Jbtn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_7ActionPerformed
        ResultField.setText("7");
    }//GEN-LAST:event_Jbtn_7ActionPerformed

    private void Jbtn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_8ActionPerformed
        ResultField.setText("8");
    }//GEN-LAST:event_Jbtn_8ActionPerformed

    private void Jbtn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_9ActionPerformed
        ResultField.setText("9");
    }//GEN-LAST:event_Jbtn_9ActionPerformed

    private void Jbtn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_0ActionPerformed
        ResultField.setText("0");
    }//GEN-LAST:event_Jbtn_0ActionPerformed

    private void JClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JClearActionPerformed
        ResultField.setText("");
        sum = 0;
    }//GEN-LAST:event_JClearActionPerformed

    private void Jbtn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_2ActionPerformed
        ResultField.setText("2");
    }//GEN-LAST:event_Jbtn_2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String a = ResultField.getText();
        sum += Double.parseDouble(a);
        operator = '+';
    }//GEN-LAST:event_jButton14ActionPerformed

    private void JEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEqualActionPerformed
        String a = ResultField.getText();
        double b = Double.parseDouble(a);
        String err = "Error";
        switch(operator){
            case '+':
                sum += b;
                break;
            case '-':
                sum -= b;
                break;
            case '*':
                sum *= b;
                break;
            case '/':
                sum /= b;
                break;                
        }
        
        if(b != 0){
            DecimalFormat dcm = new DecimalFormat("0.00");
            ResultField.setText(String.valueOf(dcm.format(sum)));
        }else {
            ResultField.setText(err);
        }
        
        
    }//GEN-LAST:event_JEqualActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String a = ResultField.getText();
        sum += Double.parseDouble(a);
        operator = '-';
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String a = ResultField.getText();
        sum += Double.parseDouble(a);
        operator = '*';
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String a = ResultField.getText();
        sum += Double.parseDouble(a);
        operator = '/';
    }//GEN-LAST:event_jButton7ActionPerformed

    



    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JClear;
    private javax.swing.JButton JEqual;
    private javax.swing.JButton Jbtn_0;
    private javax.swing.JButton Jbtn_1;
    private javax.swing.JButton Jbtn_2;
    private javax.swing.JButton Jbtn_3;
    private javax.swing.JButton Jbtn_4;
    private javax.swing.JButton Jbtn_5;
    private javax.swing.JButton Jbtn_6;
    private javax.swing.JButton Jbtn_7;
    private javax.swing.JButton Jbtn_8;
    private javax.swing.JButton Jbtn_9;
    private javax.swing.JTextField ResultField;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
