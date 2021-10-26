package com.rpk.dsa.competitiveprograming.practice;

/**
 *
 * @param <K>
 * @param <V>
 *
 *     add and get method is working
 *     duplicate key can not be added
 *     inbuilt hashMap can have one null key - currently not handled
 *     Map object can be created with explicit capacity
 *     should work for generic data
 *
 */

public class CustomHashMap<K,V> {
    int initCapacity;
    double loadFactor;// not in use right now
    Object[] bucket;


    public CustomHashMap(){
        this.initCapacity = 8;// default capacity
        this.loadFactor=0;
        this.bucket = new Object[initCapacity];
    }

    public CustomHashMap(int capcity){
        this.initCapacity = capcity;// default capacity
        this.loadFactor=0;
        this.bucket = new Object[initCapacity];
    }

    public boolean add(K key, V value){
        // Load Factor logic needs to be added in this method
        int hashValue = key.hashCode() & 0x7fffffff ;// shift mask to avoid negative hash value
        System.out.println("Generated Hash Code : "+hashValue);
        int bucketIndex = hashValue%this.initCapacity;
        System.out.println("Bucket index : "+bucketIndex);
        if(bucket[bucketIndex] == null){
            this.bucket[bucketIndex] = new Node<>(key,value,hashValue,null);
            return true;
        }

        if(getValueFromNode(this.bucket[bucketIndex],key) != null){
            System.out.println("key already added in the map");
            return false;
        }
        Node<K,V> lastNode = getLastNode(this.bucket[bucketIndex]);
        lastNode.next = new Node<>(key,value,hashValue,null);
        return true;
    }


    public V get(K key){
        int hashValue = key.hashCode() & 0x7fffffff;
        System.out.println("Generated Hash Code : "+hashValue);
        int bucketIndex = hashValue%this.initCapacity;
        if(this.bucket[bucketIndex] == null)
            return null;
        // traverse the node and return the value from the matching key in the node
        return getValueFromNode(this.bucket[bucketIndex],key);
    }

    private Node<K,V> getLastNode(Object head){
        @SuppressWarnings("unchecked")
        Node<K,V> tempNode = (Node<K, V>) head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }

        return tempNode;
    }


    private V getValueFromNode(Object head,K key){
        @SuppressWarnings("unchecked")
        Node<K,V> tempNode = (Node<K,V>)head;
        if(tempNode.next == null && tempNode.key.equals(key))
            return tempNode.value;

        while(tempNode.next != null){
            if(tempNode.key.equals(key)){
                return tempNode.value;
            }
            tempNode = tempNode.next;
        }

        return null;
    }


}

class Node<K,V>{
    K key;
    V value;
    int hashCode;
    Node<K,V> next;

    public Node(K key, V value, int hashCode, Node<K,V> next) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
        this.next = next;
    }

    public Node(){

    }
}

class client{
    public static void main(String[] args) {
        CustomHashMap<String,Integer> hashMap = new CustomHashMap<>();

        hashMap.add("KEY1",100);
        hashMap.add("KEY2",200);
        hashMap.add("KEY3",300);
        hashMap.add("KEY4",100);
        hashMap.add("KEY5",200);
        hashMap.add("KEY6",300);
        hashMap.add("KEY7",100);
        hashMap.add("KEY8",200);
        hashMap.add("KEY9",300);
        hashMap.add("KEY10",300);
    }
}
