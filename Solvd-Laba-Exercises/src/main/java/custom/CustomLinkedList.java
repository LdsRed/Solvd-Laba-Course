package custom;

import java.security.DrbgParameters;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

class Node<T> {

    //Variables members
    // data variable will store the value of a node of any type
    T value;

    //Node next will point to next node in the LinkedList
    Node<T> next;


    //The given constructor will receive any type of data
    //When a new now is created, then the data must be stored into data variable and the next pointer must point to null
    Node(T value) {

        this.value = value;
        this.next = null;
    }


    public T getValue() {
        return this.value;
    }

    //getNext method will return the next node to which the current node is pointing to
    public Node<T> getNext() {
        return next;
    }
}

public class CustomLinkedList<T> implements Iterable<T>{


    private int length;
    private Node<T> head;
    private Node<T> tail;


    public CustomLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public CustomLinkedList(T value) {
        Node<T> newNode = new Node<T>(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    //Method to print the LinkedList
    public void printLinkedList(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println("\t" + temp.value);
            temp = temp.next;
        }
    }

    //Method to add a new Node to the end of the list
    public void append(T value){
        Node<T> newNode = new Node<>(value);
        if (length == 0){
            head = newNode;
        }else {
            //If the list is not empty, then the tail.next will point to the new added value
            tail.next = newNode;
        }

        //After that the tail pointer will point to the last Node added
        tail = newNode;
        length++;
    }

    //Method to bring the value of the first element or the head of the list
    public void getHead(){
        if (head == null){
            System.out.println("Head: Null");
        }else {
            System.out.println("Head: " + head.value);
        }
    }


    public void getTail(){
        if(tail == null){
            System.out.println("Tail: Null");
        }else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public int getLength(){
        return this.length;
    }

    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }


    public Node<T> removeLastElement() {
        if (length == 0) {
            head = null;
            tail = null;
            return  null;
        }
        Node<T> temp = head;
        Node<T> pre = head;


        while (temp.next != null){
            pre = temp;
            temp = temp.next;

        }
        tail = pre;
        tail.next = null;
        length--;
        return temp;

    }

    public void prepend(T value){
        Node<T> newNode = new Node<>(value);

        //if linked list == 0
        if (length == 0){
            head = newNode;
            tail = newNode;
            tail.next = null;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;

    }

    public Node<T> removeFirstItem () {

        Node<T> temp = head;
        //Node pre = head;
        if (length == 0 ) return null;
        if (length == 1) {
            head = null;
            tail = null;
        }else {
            head = head.next;
            temp.next = null;
        }
        length--;


        return temp;

    }

    public Node<T> remove(int index){

        if(index < 0 || index > length) {
            return null;
        }

        if (index == 0) {
            return removeFirstItem();
        }
        if(index == length - 1) {return removeLastElement();}

        Node<T> prev = get(index - 1 );
        Node<T> temp = prev.next;

        prev.next = temp.next;
        temp.next =  null;

        length--;
        return temp;

    }


    public Node<T> get(int index){

        if (index < 0 || index >= length) return null;
        Node<T> temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, T value) {
        Node<T> temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }


    public boolean insert(int index, T value) {

        if (index < 0 || index > length) { return false; }

        if (index == 0) {
            append(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node<T> newNode = new Node<>(value);
        Node<T> temp = get(index - 1);

        newNode.next = temp.next;

        temp.next = newNode;
        length++;
        return true;

    }


    public void reverse(){
        Node<T> temp = head;
        head = tail;
        tail = temp;

        Node<T> after;
        Node<T> before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}





