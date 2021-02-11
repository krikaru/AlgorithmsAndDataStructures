package net.algorithmAndStructure.Sorters.InsertSort;

import net.algorithmAndStructure.Sorters.Sorter;

import java.util.Arrays;

public class InsertSorterArray implements Sorter {
    private int[] arr;
    private int nElem = 0;
    private final int size;

    public InsertSorterArray(int size) {
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
            if (arr[i] == key){
                System.arraycopy(arr, i + 1, arr, i, size - i - 1);
                arr[size - 1] = 0;
                nElem--;
            }
        }
    }

    @Override
    public void sort() {
        for (int i = 1; i < size; i++){
            int temp = arr[i];
            int j = i;
            while (j > 0 && (arr[j - 1] >= temp)){
                j--;
            }
            if (j != i){
                System.arraycopy(arr, j, arr, j + 1, i - j);
                arr[j] = temp;
            }
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
