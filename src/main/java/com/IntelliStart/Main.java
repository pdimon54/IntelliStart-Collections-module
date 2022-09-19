package com.IntelliStart;

public class Main {
    public static void main(String[] args) {

        /*MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        System.out.println(myArrayList.size());
        myArrayList.remove(2);
        myArrayList.remove(2);
        System.out.println(myArrayList.size());*/
        //LinkedList
        /*MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println(myLinkedList.size());
        myLinkedList.remove(0);
        myLinkedList.remove(3);
        System.out.println(myLinkedList.size());*/
        /*MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue.size());
        //myQueue.remove(0);
        //myQueue.remove(3);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.size());
        //myStack.remove(0);
        //myStack.remove(3);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());*/
        MyHashMap<Integer,Integer> myHashMap = new MyHashMap<>();
        myHashMap.put(1,1);
        myHashMap.put(2,2);
        myHashMap.put(3,3);
        myHashMap.put(4,4);
        myHashMap.put(5,5);
        System.out.println(myHashMap.size());
        System.out.println(myHashMap.get(4));
        System.out.println(myHashMap.get(6));
        myHashMap.remove(2);
        System.out.println(myHashMap.size());
    }
}
