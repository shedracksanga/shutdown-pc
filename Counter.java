/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counter;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 *
 * @author TIME MATTERS
 */

public class Counter extends Frame {
    
    /**
     * @param args the command line arguments
     */
    
     private Label lblCount;
     private TextField tfCount;
     private Button btnCount;
     //private int count=0;
     
     public Counter(){
     
         setLayout(new FlowLayout());
         
         lblCount = new Label("Counter");
         add(lblCount);
         
         tfCount = new TextField("",10);
         tfCount.setEditable(false);
         add(tfCount);
         
         btnCount =new Button("count");
         add(btnCount);
         
         BtnCountListener listener = new BtnCountListener();
         btnCount. addActionListener(listener);
         
         
         
         
         setTitle("Counter");
                        setSize(300,100);
                        setVisible(true);
     
     
     }         
    
    
    public static void main(String[] args) {
        // TODO code application logic here
            new Counter();
            }
    
    private class BtnCountListener implements ActionListener{
        @override
        public void actionPerformed(ActionEvent evt){
            ++Count;
            tfCount.setText(count + "");
            
        }
    }

    

    
    


}
    