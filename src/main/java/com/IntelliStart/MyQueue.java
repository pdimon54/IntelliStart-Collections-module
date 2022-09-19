package com.IntelliStart;

public class MyQueue<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public void add(E value){

        Node<E> newNode = new Node<>(null,value,null);
        if(first == null){
            first = newNode;
        }else{
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
        size++;
    }
    public void remove(int index){
        if(index<0||index>=size||first == null){
            throw new IndexOutOfBoundsException();
        }else if(size == 1){
            first = null;
            last = null;
        }else if(index == 0){
            first = first.next;
            first.prev = null;
        }else if(index == size-1){
            last = last.prev;
            last.next = null;
        } else{
            Node<E> tempNode = first;
            for (int i = 1; i < index-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
        }
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

    public E peek(){
        return first.item;
    }

    public E poll(){
        E temp = first.item;
        first = first.next;
        first.prev = null;
        return temp;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
