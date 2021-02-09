package net.algorithmAndStructure.Sorters;

public class DataStructuresUtil {

    public static void randomFillArr(Sorter sorter){
        int [] arr = sorter.getArr();
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*200 - 100);
        }
    }
}
