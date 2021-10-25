package com.rpk.dsa.queue;

public class CircularQueue {
    int data[];
    int head;
    int tail;
    int size;

    public CircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    public boolean enQueue(int value) {
        // full
        if(isFull()){

            return false;
        }

        // storage left at front
        if(tail == size-1 && head != 0){
            tail = 0;
            data[tail] = value;
            return true;
        }

        // currently empty
        if( isEmpty()){
            head = 0;
            tail = 0;
            data[tail] = value;
            return true;
        }

        tail = (tail + 1)%size;

        data[tail] = value;
        return true;


    }

    public boolean deQueue() {
        // check if empty
        if( isEmpty()){
            return false;
        }

        // check if only one element in the queue
        if(head == tail){
            head = -1;
            tail = -1;
            return true;
        }

        head = (head +1)%size;
        return true;

    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return data[head];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return data[tail];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return ((head == 0 && tail == size-1) || tail == head - 1);
    }
}
