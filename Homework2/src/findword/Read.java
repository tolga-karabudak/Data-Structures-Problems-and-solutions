/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findword;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Tolgahan KARABUDAK
 */
public class Read {

    public Read() {
    }
   static HashSet<String> hash = new HashSet<String>();
   static Map<String,Integer> map = new HashMap<String,Integer>(); 
    static ArrayList<String> v = new ArrayList<String>();
	static ArrayList<String> tot=new ArrayList<>();
	static DataOutputStream dataout;
	static StringBuilder stringBuilder = new StringBuilder();
	public  static void readtxtfile()
	{
		File input = new File("commonwords.txt");
		Scanner s;
                  String word;
		
		
		try 
                {
			s = new Scanner(input);
			while(s.hasNext())
			{
				word=s.next();
				
                                
                                //System.out.println(""+word+"\n");
                                map.put(word,0);
                                
                                
				
			}
			s.close();
			
		} catch (FileNotFoundException e1) 
                {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
                  String word1;
		
		
		
		
	}
        public  static void readTOTCfile()
	{
		File input = new File("totc.txt");
		Scanner s;
                  String word1;
		
		
		try 
                {
                    int i=0;
			s = new Scanner(input);
			while(s.hasNext())
			{
				word1=s.nextLine();
                               word1=word1.toLowerCase();
                              // System.out.println("1 "+word1+"\t");
                               
                               String[] word =word1.split("[^a-zA-Z]");
                               
                               for (String string : word) {
                                   //System.out.println("2 "+string+"\n");
                                   
                                   if(map.containsKey(string)){
                                       map.put(string,map.get(string)+1);
                                       //System.out.println( string+""+map.get(string)+"\n");
                                      
                                   }
                                    
                                   
                                
                            }
                               //stringBuilder.append(t);
                              //System.out.println(stringBuilder.toString());
                            	//if(map.containsKey(t))
                               //     map.put(t,map.get(t)+1);
                                    
                              // System.out.println("mapin içinde"+map.get("the")+"kadar vardır");
			
                        }
                         
                        for (String k : map.keySet()) {
                           System.out.println(k +"  :  " + map.get(k));
                        }
                        
			s.close();
			
		} catch (FileNotFoundException e1) 
                {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
        
        public void showWords(){
            
            int i=0;
            
            for(i=0;i<v.size();i++){
                
                System.out.println(""+v.get(i).toString()+"\n");
            }
            
        }
        
    
    public void showTOTWords(){
           
            int i,count=0;
                for(i=0;i<tot.size();i++){
                    
                  // 
                    
                    
                   //System.out.println(""+tot.get(i));
                    hash.addAll(tot);
                   
                        
                        
                }
               
                
               
        }
    
}
