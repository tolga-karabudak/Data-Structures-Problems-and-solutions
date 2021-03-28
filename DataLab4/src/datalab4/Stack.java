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
public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity=size;
        top=-1;
    }
    
    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
        }
        System.out.println("Insert " + x);
        arr[++top] = x;
        
    }
    
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        System.out.println(peek());
        
        return arr[top--];
    }
    
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        else{
            return -1;
        }
    }
    
    public void display(){
        System.out.println("Display :\n");
        while(!isEmpty()){
            int x = pop();
        }
        
    }
    
    public int size(){
        return top +1;
    }
    
    public void isPolindrom(){
        int start = 0;
        int last = top;
        boolean status = true;
        
        while (status) {            
            if (arr[start] == arr[last]) {
                if (start == last || start +1 == last) {
                    System.out.println("Stack is a polindrome");
                    status = false;
                }
                start++;
                last--;
            }
            else{
                System.out.println("Stack is not a polindrome");
                status=false;
                break;
            }
        }     
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return top ==capacity -1;
    }
    
    
    
    
}
