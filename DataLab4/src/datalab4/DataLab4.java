/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datalab4;

/**
 *
 * @author USER
 */
public class DataLab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        
        stack.pop();
        stack.pop();
        stack.isPolindrom();
        stack.display();
    }
    
}
