import Calculator.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Calculator{

  int ops;
  float a1;
  float b1;
  MathematicalFormulas sm = new SimpleMath();

  Dimension d = new Dimension(500, 300);

  JButton add;
  JButton sub;
  JButton mul;
  JButton div;
  JButton nroot;
  JButton npwr;
  JButton sqr;
  JButton sqrt;
  JTextField a;


  JButton one;
  JButton two;
  JButton three;
  JButton four;
  JButton five;
  JButton six;
  JButton seven;
  JButton eight;
  JButton nine;
  JButton zero;
  JButton c;
  JButton eq;
  JButton dot;
  JButton fac;
  JButton inv;
  JButton sine;
  JButton cos;
  JButton tan;
  JButton pwr10;
  JButton tanh;
  JButton cosh;
  JButton sinh;
  JButton ee;


  JFrame calcFrame;

  JPanel calcPanel;

  JPanel buttonPanel;

  JPanel calculationsPanel;

  public Calculator() {
    calcFrame = new JFrame();
    calcFrame.setSize(d);

    calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    eq = new JButton(new AbstractAction("=") {
      @Override
      public void actionPerformed(ActionEvent e) {
        equal();
      }
    });

    dot = new JButton(new AbstractAction(".") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum(".");
      }
    });

    fac = new JButton(new AbstractAction("!") {
      @Override
      public void actionPerformed(ActionEvent e) {
        fac();
      }
    });

    inv = new JButton(new AbstractAction("1/x") {
      @Override
      public void actionPerformed(ActionEvent e) {
        inv();
      }
    });

    one = new JButton(new AbstractAction("1") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum("1");
      }
    });

    two = new JButton(new AbstractAction("2") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum("2");
      }
    });

    three = new JButton(new AbstractAction("3") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum("3");
      }
    });

    four = new JButton(new AbstractAction("4") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum("4");
      }
    });

    five = new JButton(new AbstractAction("5") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum("5");
      }
    });

    six = new JButton(new AbstractAction("6") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum("6");
      }
    });

    seven = new JButton(new AbstractAction("7") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum("7");
      }
    });

    eight = new JButton(new AbstractAction("8") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum("8");
      }
    });

    nine = new JButton(new AbstractAction("9") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum("9");
      }
    });

    zero = new JButton(new AbstractAction("0") {
      @Override
      public void actionPerformed(ActionEvent e) {
        absNum("0");
      }
    });

    c = new JButton(new AbstractAction("C") {
      @Override
      public void actionPerformed(ActionEvent e) {
        c();
      }
    });

    add = new JButton(new AbstractAction("+") {
      @Override
      public void actionPerformed(ActionEvent e) {
        add();
      }
    });
    sub = new JButton(new AbstractAction("-") {
      @Override
      public void actionPerformed(ActionEvent e) {
        sub();
      }
    });
    mul = new JButton(new AbstractAction("x") {
      @Override
      public void actionPerformed(ActionEvent e) {
        mul();
      }
    });
    div = new JButton(new AbstractAction("/") {
      @Override
      public void actionPerformed(ActionEvent e) {
        div();
      }
    });
    nroot = new JButton(new AbstractAction("n√") {
      @Override
      public void actionPerformed(ActionEvent e) {
        nroot();
      }
    });

    npwr = new JButton(new AbstractAction("^") {
      @Override
      public void actionPerformed(ActionEvent e) {
        npwr();
      }
    });

    sqr = new JButton(new AbstractAction("^2") {
      @Override
      public void actionPerformed(ActionEvent e) {
        sqr();
      }
    });

    sqrt = new JButton(new AbstractAction("√") {
      @Override
      public void actionPerformed(ActionEvent e) {
        sqrt();
      }
    });

    sine = new JButton(new AbstractAction("sine") {
      @Override
      public void actionPerformed(ActionEvent e) {
        sine();
      }
    });

    cos = new JButton(new AbstractAction("cos") {
      @Override
      public void actionPerformed(ActionEvent e) {
        cos();
      }
    });

    tan = new JButton(new AbstractAction("tan") {
      @Override
      public void actionPerformed(ActionEvent e) {
        tan();
      }
    });

    pwr10 = new JButton(new AbstractAction("10^x") {
      @Override
      public void actionPerformed(ActionEvent e) {
        pwr10();
      }
    });

    tanh = new JButton(new AbstractAction("tanh") {
      @Override
      public void actionPerformed(ActionEvent e) {
        tanh();
      }
    });

    cosh = new JButton(new AbstractAction("cosh") {
      @Override
      public void actionPerformed(ActionEvent e) {
        cosh();
      }
    });

    sinh = new JButton(new AbstractAction("sinh") {
      @Override
      public void actionPerformed(ActionEvent e) {
        sinh();
      }
    });

    ee = new JButton(new AbstractAction("EE") {
      @Override
      public void actionPerformed(ActionEvent e) {
        ee();
      }
    });

    a = new JTextField();


    Color panelC = new Color(118 ,202,245);

    a.setBackground(new Color(255,255,255));

    calcPanel = new JPanel();
    calcPanel.setPreferredSize(d);
    calcPanel.setBackground(panelC);

    a.setPreferredSize(new Dimension(450, 35));

    a.setFont(new Font("Dialog", Font.PLAIN, 30));
    a.setForeground(new Color(0, 0, 0));

    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension(150, 200));
    buttonPanel.setLayout(new GridLayout(4, 3));
    buttonPanel.setBackground(panelC);

    calculationsPanel = new JPanel();
    calculationsPanel.setPreferredSize(new Dimension(300, 200));
    calculationsPanel.setLayout(new GridLayout(4, 2));
    calculationsPanel.setBackground(panelC);

    calcPanel.add(a);
    buttonPanel.add(one);
    buttonPanel.add(two);
    buttonPanel.add(three);
    buttonPanel.add(four);
    buttonPanel.add(five);
    buttonPanel.add(six);
    buttonPanel.add(seven);
    buttonPanel.add(eight);
    buttonPanel.add(nine);
    buttonPanel.add(zero);

    calculationsPanel.add(c);
    calculationsPanel.add(eq);
    calculationsPanel.add(dot);
    calculationsPanel.add(add);
    calculationsPanel.add(sub);
    calculationsPanel.add(mul);
    calculationsPanel.add(div);
    calculationsPanel.add(nroot);
    calculationsPanel.add(npwr);
    calculationsPanel.add(sqr);
    calculationsPanel.add(sqrt);
    calculationsPanel.add(fac);
    calculationsPanel.add(inv);
    calculationsPanel.add(sine);
    calculationsPanel.add(cos);
    calculationsPanel.add(tan);
    calculationsPanel.add(pwr10);
    calculationsPanel.add(tanh);
    calculationsPanel.add(cosh);
    calculationsPanel.add(sinh);
    calculationsPanel.add(ee);
    calcPanel.add(calculationsPanel);
    calcPanel.add(buttonPanel);


    calcFrame.add(calcPanel);
    calcFrame.setVisible(true);

  }

  private void absOpsSet(int opNum){
    a1 = Float.parseFloat(a.getText());
    ops = opNum;
    a.setText("");
  }

  private void absFuncNum(){
    a1 = Float.parseFloat(a.getText());
    a.setText("");
  }

  private void add() {
    absOpsSet(1);
  }

  private void sub() {
    absOpsSet(2);
  }

  private void mul() {
    absOpsSet(3);
  }

  private void div() {
    absOpsSet(4);
  }

  private void nroot() {
    absOpsSet(5);
  }

  private void npwr() {

    absOpsSet(6);
  }

  private void sqr() {
    absFuncNum();
    a.setText(Double.toString(sm.sqrt(a1)));
  }

  private void sqrt() {
    absFuncNum();
    a.setText(Double.toString(sm.sqr(a1)));
  }


  private void absNum(String num){
    String curr = a.getText();
    a.setText(curr + num);
  }

  private void c() {
    a.setText("");
  }

  private void fac(){
    absFuncNum();
    a.setText(Double.toString(sm.fac(a1)));
  }

  private void inv(){
    absFuncNum();
    a.setText(Double.toString(sm.inv(a1)));
  }

  private void sine(){
    absFuncNum();
    a.setText(Double.toString(sm.sine(a1)));

  }

  private void cos(){
    absFuncNum();
    a.setText(Double.toString(sm.cos(a1)));
  }

  private void tan(){
    absFuncNum();
    a.setText(Double.toString(sm.tan(a1)));
  }

  private void sinh(){
    absFuncNum();
    a.setText(Double.toString(sm.sinh(a1)));

  }

  private void cosh(){
    absFuncNum();
    a.setText(Double.toString(sm.cosh(a1)));
  }

  private void tanh(){
    absFuncNum();
    a.setText(Double.toString(sm.tanh(a1)));
  }

  private void pwr10(){
    absFuncNum();
    a.setText(Double.toString(sm.pwer10(a1)));
  }

  private void ee(){
    absOpsSet(7);
  }

  private void equal(){

    b1 = Float.parseFloat(a.getText());

    switch (ops){
      case 1 :
        a.setText(Double.toString(sm.add(a1, b1)));
        break;
      case 2 :
        a.setText(Double.toString(sm.sub(a1, b1)));
       break;
      case 3:
        a.setText(Double.toString(sm.mul(a1, b1)));
        break;
      case 4:
        a.setText(Float.toString(sm.div(a1, b1)));
        break;
      case 5:
        a.setText(Double.toString(sm.nroot(a1, b1)));
        break;
      case 6:
        a.setText(Double.toString(sm.npwr(a1, b1)));
        break;
      case 7:
        a.setText(Double.toString(sm.ee(a1, b1)));
        break;
    }
  }

  public static void main (String args[]){
    Calculator c = new Calculator();
  }
}