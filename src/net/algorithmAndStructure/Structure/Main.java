package net.algorithmAndStructure.Structure;

public class Main {
    public static void main(String[] args) {
        CatsLinkedList catsLL = new CatsLinkedList();
        catsLL.add(new Cat("Tom"));
        catsLL.add(new Cat("Puh"));
        catsLL.add(new Cat("Barsik"));
        catsLL.add(new Cat("Marble"));
        catsLL.addFirst(new Cat("Kermit"));
        catsLL.displayAll();
//
//        System.out.println(catsLL.get().getName());
//        System.out.println(catsLL.getFirst().getName());


        //check addAll
//        CatsLinkedList otherLL = new CatsLinkedList();
//        otherLL.add(new Cat("Cake"));
//        otherLL.add(new Cat("Kitty"));
//        catsLL.addAll(otherLL);
//        catsLL.displayAll();


        //check remove
//        System.out.println(catsLL.removeFirst());
//        catsLL.displayAll();
//        System.out.println(catsLL.removeFirst());
//        catsLL.displayAll();
//        System.out.println(catsLL.removeFirst());
//        catsLL.displayAll();
//        System.out.println(catsLL.removeFirst());
//        catsLL.displayAll();
//        System.out.println(catsLL.removeFirst());
//        catsLL.displayAll();
//        System.out.println(catsLL.removeFirst());
    }
}
