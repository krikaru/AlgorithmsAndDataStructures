package net.algorithmAndStructure.Structure;

public class CatsLinkedList {
    private Node first;
    private Node last;
    private int nElem = 0;

    public void add(Cat cat){
        addLast(cat);
    }

    public void addLast(Cat cat){
        Node newCat = new Node(cat, last, null);
        if (last == null){
            first = newCat;
        }else {
            last.next = newCat;
        }
        last = newCat;
        nElem++;
    }

    public void addFirst(Cat cat){
        Node newCat = new Node(cat, null, first);
        if (first == null){
            last = newCat;
        }else {
            first.prev = newCat;
        }
        first = newCat;
        nElem++;
    }

    public Cat get(){
        return getLast();
    }

    public Cat getFirst(){
        if (first != null){
            return first.elem;
        }else {
            System.out.println("There're not cats!");
            return null;
        }
    }

    public Cat getLast(){
        if (last != null){
            return last.elem;
        }else {
            System.out.println("There're not cats!");
            return null;
        }
    }

    public boolean remove(){
        return removeLast();
    }

    public boolean removeFirst(){
        if (first != null && nElem > 1){
            first = first.next;
            first.prev = null;
            nElem--;
            return true;
        }else if (nElem == 1){
            last = null;
            first = null;
            nElem--;
            return true;
        }
        return false;
    }

    public boolean removeLast(){
        if (last != null && nElem > 1){
            last = last.prev;
            last.next = null;
            nElem--;
            return true;
        }else if (nElem == 1){
            last = null;
            first = null;
            nElem--;
            return true;
        }
        return false;
    }

    public void addAll(CatsLinkedList otherLL){
        last.next = otherLL.first;
        otherLL.first.prev = last;
        nElem += otherLL.nElem;
    }

    public void displayAll(){
        if (nElem == 0){
            System.out.println("There're not cats!");
        }else {
            for (Node currentNode = this.first; currentNode != null; currentNode = currentNode.next){
                System.out.println(currentNode.elem.getName());
            }
        }

    }

    private static class Node{
        private Cat elem;
        private Node prev;
        private Node next;

        public Node(Cat elem, Node prev, Node next) {
            this.elem = elem;
            this.prev = prev;
            this.next = next;
        }
    }
}
