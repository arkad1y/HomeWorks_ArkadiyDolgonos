package com.levelup.lesson7.linkedlists;

import com.levelup.lesson3.task1.Pen;

/**
 * Created by admin on 21.08.2016.
 */
public class MyLinkedList<T> {
    private int size = 0;
    private Node<T> tail;
    private Node<T> head;

    class Node<T> {
        private Node<T> next;
        private Node<T> prev;
        private T value;

        public Node() {
        }

        public Node(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public boolean add(T value) {
        Node<T> node = new Node<T>(value);
        if (size == 0) {
            tail = node;
            head = node;
            size++;
            return true;
        }
        size++;
        tail.setNext(node);
        node.setPrev(tail);
        tail = node;
        return true;
    }

    public T get(int index) {
        if (index > (size - 1)) {
            throw new IllegalArgumentException("index out of length");
        }
        Node<T> t = head;
        for (int i = 0; i < index; i++) {
            t = t.getNext();
        }
        return t.getValue();
    }

    public boolean remove(int index) {
        if (index > (size - 1) && index < 0) {
            throw new IllegalArgumentException("index out of length");
        }
        if (index == 0) {
            head.getNext().setPrev(null);
            Node<T> delNode = head;
            head = head.getNext();
            delNode.setNext(null);
            size--;
            return true;
        }

        if (index == (size - 1)) {
            tail.getPrev().setNext(null);
            Node<T> delNode = tail;
            tail = tail.getPrev();
            delNode.setPrev(null);
            size--;
            return true;
        }


        Node<T> t = head;
        for (int i = 0; i < index; i++) {
            t = t.getNext();
        }

        t.getPrev().setNext(t.getNext());
        t.getNext().setPrev(t.getPrev());
        t.setNext(null);
        t.setPrev(null);
        t = null;
        size--;
        return true;
    }


    public boolean remove(T t) {
        Node<T> temp = head;
        int counter = 0;
        while (temp.getNext() != null) {
            if (temp.getValue().equals(t)) {
                return remove(counter);
            }
            counter++;
            temp = temp.getNext();

        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public static void main(String[] args) {


        MyLinkedList<Pen> pens = new MyLinkedList<>();
        pens.add(new Pen("red", "a", 0));
        pens.add(new Pen("red2", "a2", 2));
        pens.add(new Pen("red3", "a3", 3));
        pens.add(new Pen("red4", "a4", 4));
        pens.add(new Pen("red5", "a5", 5));

        System.out.println("size:" + pens.getSize());
        pens.remove(3);
        System.out.println("size:" + pens.getSize());


    }


}
