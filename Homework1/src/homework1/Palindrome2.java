/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tolgahan KARABUDAK
 */
public class Palindrome2 {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        MyDeque<String> dq = new MyDeque<String>();
        Scanner s = new Scanner(new File("C:\\Users\\esc\\Desktop\\OKUL\\2.Class\\BAHAR\\Data Structure\\Homework1\\palindromes.txt"));
        String reversee="",normall="",readLinee="";
        int counter=0;
        
        while (s.hasNextLine()){
            //list.add(s.nextLine());
            dq.push(s.nextLine());
            counter++;
            }
        s.close();
        for(int i=0;i<counter;i++)
         {
            readLinee = dq.pop();
             
             for(int j=0;j<readLinee.length();j++){
               if(('a'<=readLinee.charAt(j) && readLinee.charAt(j)<='z')|| ('A'<=readLinee.charAt(j) && readLinee.charAt(j)<='Z'))
                    normall = normall + readLinee.charAt(j);
             /* else
                   j++;*/
            }
             
            for ( int k = readLinee.length() - 1; k >= 0; k--){
               if(('a'<=readLinee.charAt(k) && readLinee.charAt(k)<='z')|| ('A'<=readLinee.charAt(k) && readLinee.charAt(k)<='Z'))
                    reversee= reversee + readLinee.charAt(k);
             /*  else
                   k--;*/
            } 
             normall=normall.toLowerCase();
             reversee=reversee.toLowerCase();
             if(normall.equalsIgnoreCase(reversee)){
                  System.out.println(readLinee + " is a palindrome!\n");
              }
             reversee="";
              normall="";
         }
        
        
        
        
        
    }
    
}
