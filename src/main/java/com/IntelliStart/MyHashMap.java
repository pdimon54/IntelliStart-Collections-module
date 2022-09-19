package com.IntelliStart;


public class MyHashMap<K,V> {

    private int size;
    private Node<K,V> first;
    private Node<K,V> last;


    public void put(K key, V value){
        Node<K,V> newNode = new Node<>(key.hashCode(),key,value,null);
        if(first == null){
            first = newNode;
            last = newNode;
            size++;
        }else{
            Node<K,V> tempNode = first;
            for (int i = 0; i < size; i++) {
                if(newNode.key.equals(tempNode.key))
                    return;
                if(i == size-1){
                    tempNode.next = newNode;
                    last = newNode;
                }
                tempNode = tempNode.next;
            }
            size++;
        }
        
    }

    public void remove(K key){
        Node<K,V> tempNode = first;
        if(tempNode.next.key.equals(key)){
            tempNode.next = tempNode.next.next;
        }
        do{
            if (tempNode.next.key.equals(key)){
                tempNode.next = tempNode.next.next;
            }
            tempNode = tempNode.next;
        }while (tempNode.next!=last);

        size--;
    }

    public void clear(){
        first = null;
        last = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public V get(K key){
        Node<K,V> tempNode = first;
        for (int i = 0; i < size; i++) {
            if(tempNode.key.equals(key))
                return tempNode.value;
            tempNode = tempNode.next;
        }
        return null;
    }

    static class Node<K,V> {
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }

}
