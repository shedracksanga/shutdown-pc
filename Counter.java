package counter;

import java.awt.*;
import java.awt.event.*;

public class Counter extends Frame {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0; 
    
    public Counter() {
        setLayout(new FlowLayout());
        
        lblCount = new Label("Counter");
        add(lblCount);
        
        tfCount = new TextField(count + " ", 10);
        tfCount.setEditable(false);
        add(tfCount);
        
        btnCount = new Button("Count");
        add(btnCount);
        
        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);
        
        setTitle("Simple Calculator");
        setSize(300, 200);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        new Counter();
    }
    
    private class BtnCountListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + " ");
        }
    }
}
