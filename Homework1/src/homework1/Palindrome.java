/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tolgahan KARABUDAK
 */
public class Palindrome {
    
    ArrayList<String> arlist = new ArrayList<String>();
    static int lengt;
    static String reverse="",normal="",readLine="";
    
     public static void main(String[] args) throws IOException {

         Scanner s = new Scanner(new File("C:\\Users\\esc\\Desktop\\OKUL\\2.Class\\BAHAR\\Data Structure\\Homework1\\palindromes.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()){
            list.add(s.nextLine());        
            }
        s.close();
         for(int i=0;i<list.size();i++)
         {
            readLine = list.get(i);
             
             for(int j=0;j<readLine.length();j++){
               if(('a'<=readLine.charAt(j) && readLine.charAt(j)<='z')|| ('A'<=readLine.charAt(j) && readLine.charAt(j)<='Z'))
                    normal = normal + readLine.charAt(j);
             /* else
                   j++;*/
            }
             
            for ( int k = readLine.length() - 1; k >= 0; k--){
               if(('a'<=readLine.charAt(k) && readLine.charAt(k)<='z')|| ('A'<=readLine.charAt(k) && readLine.charAt(k)<='Z'))
                    reverse= reverse + readLine.charAt(k);
             /*  else
                   k--;*/
            } 
             normal=normal.toLowerCase();
             reverse=reverse.toLowerCase();
             if(normal.equalsIgnoreCase(reverse)){
                  System.out.println(list.get(i) + " is a palindrome!\n");
              }
             reverse="";
              normal="";
         }
         
         
      /*  try {

            File f = new File("C:\\Users\\esc\\Desktop\\OKUL\\2.Class\\BAHAR\\Data Structure\\Homework1\\palindromes.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            //System.out.println("Reading file using Buffered Reader");

            while ((readLine = b.readLine()) != null) {
              //  System.out.println(readLine);
               arlist.add(readLine);
            lengt =  readLine.length();
            for(int i=0;i<lengt;i++){
               if(('a'<=readLine.charAt(i) && readLine.charAt(i)<='z')|| ('A'<=readLine.charAt(i) && readLine.charAt(i)<='Z'))
                    normal = normal + readLine.charAt(i);
               else
                   i++;
            } 
            
              for ( int i = lengt - 1; i >= 0; i--){
               if(('a'<=readLine.charAt(i) && readLine.charAt(i)<='z')|| ('A'<=readLine.charAt(i) && readLine.charAt(i)<='Z'))
                    reverse= reverse + readLine.charAt(i);
               else
                   i--;
            }
            
            
              if(normal.equalsIgnoreCase(reverse)){
                  System.out.println(readLine + " is a palindrome!");
              } 
              lengt=0;
              reverse="";
              normal="";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }
     
     
    
}
