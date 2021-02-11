package net.algorithmAndStructure.Sorters.InsertSort;

import net.algorithmAndStructure.Sorters.BubbleSort.BubbleSorterArray;
import net.algorithmAndStructure.Sorters.DataStructuresUtil;
import net.algorithmAndStructure.Sorters.Sorter;

public class Main {
    public static void main(String[] args) {
        //Auto random fill array for insert test
        Sorter arrForSort = new InsertSorterArray(10);
        DataStructuresUtil.randomFillArr(arrForSort);

        arrForSort.display();
        arrForSort.sort();
        arrForSort.display();

        //Array is filled by method insert(). For remove test.
//        BubbleSorterArray arrForRemove = new BubbleSorterArray(10);
//
//        arrForRemove.insert(10);
//        arrForRemove.insert(54);
//        arrForRemove.insert(9);
//        arrForRemove.insert(52);
//        arrForRemove.insert(1);
//        arrForRemove.insert(-74);
//        arrForRemove.insert(-25);
//        arrForRemove.insert(80);
//        arrForRemove.insert(-25);
//        arrForRemove.insert(43);
//        arrForRemove.insert(43);
//
//        arrForRemove.display();
//        arrForRemove.remove(-25);
//        arrForRemove.display();
    }
}
