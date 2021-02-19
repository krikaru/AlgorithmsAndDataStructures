package net.algorithmAndStructure.Structure;

public class Main {
    public static void main(String[] args) {
        CatsLinkedList catsLL = new CatsLinkedList();
        catsLL.add(new Cat("Tom"));
        catsLL.add(new Cat("Puh"));
        catsLL.add(new Cat("Barsik"));
        catsLL.add(new Cat("Marble"));
        catsLL.addFirst(new Cat("Kermit"));

        System.out.println(catsLL.get().getName());
        System.out.println(catsLL.getFirst().getName());

        catsLL.displayAll();
    }
}
