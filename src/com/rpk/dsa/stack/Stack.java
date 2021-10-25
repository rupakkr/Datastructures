package com.rpk.dsa.stack;

public class Stack {
    static  final int Max=10000;
    int top;
    int[] a = new int[Max];

    public Stack(){

        this.top = -1;
    }

    public Stack(int max){
        this.top = -1;
    }

    public boolean push(int item){
        if(top >= (Max - 1)){
            System.out.println("Stack Overflow");

            return false;
        } else {
            a[++top] = item;
            return true;
        }
    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    public int peek(){
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        } else {
            return a[top];
        }
    }

    public void print(){
        for(int i=top; i> -1; i--){
            System.out.println(a[i]);
        }
    }

    public boolean isEmpty(){
        return top < 0;
    }
}

class client{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.print();

        System.out.println("POP top element : "+stack.pop());

    }
}
