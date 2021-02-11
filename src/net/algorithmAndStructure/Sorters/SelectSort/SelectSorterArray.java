package net.algorithmAndStructure.Sorters.SelectSort;

import net.algorithmAndStructure.Sorters.Sorter;

import java.util.Arrays;

public class SelectSorterArray implements Sorter {
    private int[] arr;
    private int nElem = 0;
    private final int size;

    public SelectSorterArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    @Override
    public void insert(int key) {
        try {
            if (nElem < size){
                arr[nElem] = key;
                nElem++;
            }else {
                throw new IndexOutOfBoundsException("Array is full!");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.toString() + " " + key + " isn't insert in array!");
        }

    }

    @Override
    public void remove(int key) {
        for (int i = 0; i < size; i++){
            if (key == arr[i]){
                System.arraycopy(arr, i + 1, arr, i, size - i - 1);
                arr[size - 1] = 0;
                nElem--;
            }
        }
    }

    @Override
    public void sort() {
        int minIndex;
        int temp;
        for (int i = 0; i < size - 1; i++){
            minIndex = i;
            for (int j = i + 1; j < size ;j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    @Override
    public int[] getArr() {
        return arr;
    }

    @Override
    public void display() {
        System.out.println(Arrays.toString(arr));
    }
}
