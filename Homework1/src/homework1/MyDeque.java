/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.LinkedList;
/**
 *
 * @author Tolgahan KARABUDAK
 */
public class MyDeque<Gen> {
    
     LinkedList<Gen> list=new LinkedList<Gen>();
     
     
 public void push(Gen item) {
     list.addFirst(item);
}
    
 public Gen pop(){
     Gen itemy= list.getFirst();
     list.removeFirst();
     return itemy;
 }
    
 public void inject(Gen item){
     list.addLast(item);
 }
 
 public Gen eject(){
     Gen itemy=  list.getLast();
     list.removeLast();
     return itemy;
 }
}
