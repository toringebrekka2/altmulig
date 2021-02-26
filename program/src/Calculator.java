import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class Calculator implements ActionListener {

    private int displayValue;
    private int memory;
    private ArrayList<Integer> numbersInUse;
    private Machine machine;
    //private ActionListener buttonListener;
    private JTextField textField;
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton times = new JButton("X");
    private JButton div = new JButton("/");
    private JButton equals = new JButton("=");
    private JButton clear = new JButton("C");

    private static final Color BGCOLOR = Color.lightGray;

    private JLabel label2;

    public Calculator(){
        displayValue = 0;
        memory = 0;
        numbersInUse = new ArrayList<Integer>();

        setUpButtonListeners();

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,500);
        frame.setBackground(Color.white);
        JMenuBar menuBar = new JMenuBar();
        JMenu m1 = new JMenu("About");
        JMenu m2 = new JMenu("Help");
        menuBar.add(m1);
        menuBar.add(m2);
        JMenuItem m11 = new JMenuItem("Creator: Tor Inge Brekka");
        JMenuItem m12 = new JMenuItem("Version: 1.0");
        JMenuItem m21 = new JMenuItem("Unfortunately, there is no help to get...");
        m1.add(m11);
        m1.add(m12);
        m2.add(m21);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Go ahead!");
        textField = new JTextField(5);

        panel.add(label);
        panel.add(textField);
        panel.add(plus);
        panel.add(minus);
        panel.add(times);
        panel.add(div);
        panel.add(equals);
        panel.add(clear);
        panel.setBackground(BGCOLOR);
        label2 = new JLabel(String.valueOf(displayValue));
        label2.setBackground(BGCOLOR);
        label2.setSize(50, 15);
        //label2.setHorizontalAlignment(25);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.SOUTH, label2);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }

    public static void main (String[] args){
        new Calculator();
    }

    public void setUpButtonListeners(){
        plus.addActionListener(this);
        minus.addActionListener(this);
        times.addActionListener(this);
        div.addActionListener(this);
        equals.addActionListener(this);
        clear.addActionListener(this);
    }

    public void request(){


    }

    public void updateDisplay(Integer number){
        String x = number.toString();
        label2.setText(x);
    }

    public int readInput(){
         return textField.getColumns();
    }

    public void putToDisplay() {

    }

    public void plus(int a, int b) {
        machine.plus(a,b);
    }

    public void minus(int a, int b) {
        machine.minus(a,b);
    }

    public void times(int a, int b) {
        machine.times(a,b);
    }

    public void div(int a, int b) {
        machine.div(a,b);
    }

    public void equals() {

    }

    public void clear() {
        label2.setText("0");
        clearList();
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == plus) {
            int i = readInput();
            numbersInUse.add(i);
            clearTextField();

        } else if (e.getSource() == minus) {
            int i = readInput();
            numbersInUse.add(i);
            clearTextField();

        } else if (e.getSource() == times) {
            int i = readInput();
            numbersInUse.add(i);
            clearTextField();

        } else if (e.getSource() == div) {
            int i = readInput();
            numbersInUse.add(i);
            clearTextField();

        } else if (e.getSource() == equals) {
            int i = readInput();
            numbersInUse.add(i);
            clearTextField();

        } else if (e.getSource() == clear) {
            int i = readInput();
            numbersInUse.add(i);
            clearTextField();
        }

    }

    public void clearList(){
        numbersInUse.clear();
    }

    public void clearTextField(){
        textField.setText(" ");
    }
}