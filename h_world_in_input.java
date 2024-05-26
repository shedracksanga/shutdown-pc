/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shed_0;
import java.awt.*;
import java.util.Scanner;

/**
 *
 * @author TIME MATTERS
 */
public class h_world_in_input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int f;
        System.out.println("Enter the value of f: ");
        f = s.nextInt();
        
        for (int i=0; i<f; i++)
            System.out.println( i+1 +" " +"hello world");
    }
    
}
