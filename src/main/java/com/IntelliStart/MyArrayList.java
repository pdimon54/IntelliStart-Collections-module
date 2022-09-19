package com.IntelliStart;

import java.util.Arrays;

public class MyArrayList<T> {

    private static final int INIT_SIZE = 10;
    private static final int COF = 4;
    private int capacity;
    private Object[] array;

    public MyArrayList(){
        this.array = new Object[INIT_SIZE];
    }

    public void add(T element){
        if(capacity == array.length-1){
            resize(array.length*2);
        }
        array[capacity] = element;
        capacity++;
    }

    public void remove(int index){
        if(index<0||index>=array.length){
            throw new IndexOutOfBoundsException();
        }
        if(capacity<= array.length/ COF){
            resize(array.length/2);
        }
        Object[] newArray = new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index+1, newArray, index, array.length-(index+1));
        array = newArray;
        capacity--;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, capacity);
        array = newArray;
    }

    public Object get(int index){
        if(index<0||index>=array.length){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public int size(){
        return capacity;
    }

    public void clear(){
        Arrays.fill(array, null);
        capacity = 0;
    }
}