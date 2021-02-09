package net.algorithmAndStructure.Sorters.BubbleSort;

import net.algorithmAndStructure.Sorters.Sorter;

import java.util.Arrays;

public class BubbleSorterArray implements Sorter {
    private int[] arr;
    private int nElem = 0;
    private final int size;
    private int[] copyArr;

    public BubbleSorterArray(int size) {
        this.arr = new int[size];
        this.size = size;
    }

    //Insert to end
    public void insert(int key){
        if (nElem <= size){
            arr[nElem] = key;
            nElem++;
        }else {
            throw new IndexOutOfBoundsException("Array is full!");
        }

    }

    //Remove all elements by key
    public void remove(int key){
        for (int i = 0; i < size; i++){
            if (arr[i] == key){
                copyArr = new int[size];
                System.arraycopy(arr, 0, copyArr, 0, i);
                System.arraycopy(arr, i + 1, copyArr, i, size - i - 1);
                arr = copyArr;
                nElem--;
            }
        }
    }

    //Inplace sort
    public void sort(){
        int temp;

        for (int i = size - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void display(){
        System.out.println(Arrays.toString(arr));
    }
}
