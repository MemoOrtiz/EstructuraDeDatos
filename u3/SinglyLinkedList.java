import java.util.Random;

public class SinglyLinkedList<E>{
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }
        public E getElement(){
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

        public String toString(){
            return (String) element;
        }



    }
    // instance variables of the SinglyLinkedList
    private Node<E> head = null;    // head node of the list (or null if empty)
    private Node<E> tail = null;     // last node of the list (or null if empty)
    private int size = 0;            // number of nodes in the list
    public SinglyLinkedList() { }   // constructs an initially empty list
    // access methods

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public E first() {
        if (isEmpty()) return null; return head.getElement();
    }
    public E last() {
        if (isEmpty()) return null;
        return tail.getElement(); }
    // update methods
    public void addFirst(E e) {
        head = new Node<>(e, head); if (size == 0)
            tail = head; size++;
    }
    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty( )) head = newest;
        else
            tail.setNext(newest); tail = newest;
        size++;
    }
    public E removeFirst( ) {
        if (isEmpty( )) return null;
        E answer = head.getElement( ); head = head.getNext( ); size--;
        if (size == 0)
            tail = null;
        return answer;
    }
    public String toString(){
        String s = "";
        Node<E> n =head;
        while(n!=null){

            s+= n.getElement().toString()+ ", ";
            n = n.getNext();
        }
        return s;
    }



    public static void main(String[]args){
        Random ran = new Random();
        SinglyLinkedList<Integer>lista1  = new SinglyLinkedList<>();
        int total = ran.nextInt(100);
        for(int contador = 1;contador <= total; contador++){
            lista1.addLast(ran.nextInt(1000));
        }
        System.out.println(lista1.toString());
    }

    }

