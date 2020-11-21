package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * It is just a sample of a calculator.
 */
public class CalculatorGUI extends JFrame {
    JFrame calcFrame;
    JTabbedPane jTab;

    public CalculatorGUI() {
        calcFrame = new JFrame();
        calcFrame.setTitle("AUT Calculator");
        calcFrame.setSize(450, 450);
        calcFrame.setLocation(200, 200);
        calcFrame.setLayout(null);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jTab = new JTabbedPane();
        jTab.setBounds(40,30,350,350);

        //Add tabs
        simpleCalc();
        engineeringCalc();
        calcFrame.add(jTab);

        calcFrame.setVisible(true);
    }

    /**
     * Sets the simple calculator.
     */
    public void simpleCalc(){
        JPanel simpleMain = new JPanel();
        simpleMain.setLayout(new BorderLayout());

        JPanel simple;
        simple = new JPanel();
        //simple.setSize(200,200);
        //simple.setLocation(10, 150);
        simple.setLayout(new GridLayout(4,4));

        setNumber(simple);

        simpleMain.add(simple);

        //Text
        JTextArea display = new JTextArea();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD,14));

        JScrollPane scroll = new JScrollPane(display);
        scroll.setPreferredSize(new Dimension(200,60));
        //scroll.setLocation(50,20);

        simpleMain.add(scroll,BorderLayout.NORTH);

        jTab.add("Simple" , simpleMain);
    }

    /**
     * Sets the engineering calculator.
     */
    public void engineeringCalc(){
        JPanel engMain = new JPanel();
        engMain.setLayout(new BorderLayout());

        JPanel eng = new JPanel();
        eng.setLayout(new GridLayout(6,4));

        //Number
        setNumber(eng);

        JButton piBtn = new JButton();
        piBtn.setText("pi");
        eng.add(piBtn);
        JButton eBtn = new JButton();
        eBtn.setText("e");
        eng.add(eBtn);
        JButton sinBtn = new JButton();
        sinBtn.setText("sin/cos");
        eng.add(sinBtn);
        JButton tanBtn = new JButton();
        tanBtn.setText("tan/cot");
        eng.add(tanBtn);
        JButton expBtn = new JButton();
        eng.add(tanBtn);
        expBtn.setText("log/exp");
        eng.add(expBtn);
        JButton shiftBtn = new JButton();
        shiftBtn.setText("Shift");
        eng.add(shiftBtn);

        engMain.add(eng);

        //Text
        JTextArea display = new JTextArea();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD,14));

        JScrollPane scroll = new JScrollPane(display);
        scroll.setPreferredSize(new Dimension(200,60));

        engMain.add(scroll,BorderLayout.NORTH);

        jTab.add("Engineer",engMain);

    }

    /**
     * Sets the number of the calculator.
     * @param simple The panel to add
     */
    public void setNumber(JPanel simple){

        for (int i = 9; i > 1; i--) {
            JButton btn = new JButton();
            btn.setText("" + i);
            simple.add(btn);
        }

        JButton sumBtn = new JButton();
        sumBtn.setText("+");
        simple.add(sumBtn);
        JButton oneBtn = new JButton();
        oneBtn.setText("1");
        simple.add(oneBtn);
        JButton zeroBtn = new JButton();
        zeroBtn.setText("0");
        simple.add(zeroBtn);
        JButton subBtn = new JButton();
        subBtn.setText("-");
        simple.add(subBtn);
        JButton mulBtn = new JButton();
        mulBtn.setText("x");
        simple.add(mulBtn);
        JButton modBtn = new JButton();
        modBtn.setText("%");
        simple.add(modBtn);
        JButton divBtn = new JButton();
        divBtn.setText("/");
        simple.add(divBtn);
        JButton doBtn = new JButton();
        doBtn.setText("=");
        simple.add(doBtn);
    }

}
