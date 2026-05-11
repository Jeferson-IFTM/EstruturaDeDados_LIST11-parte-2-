package dev.Jeferson.datastructures.list;

public class MyLinkedLis<T> implements MyList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void insertAt(int i, T element) {
        if (i < 0 || i > size) throw new IndexOutOfBoundsException();
        if (i == 0)
        { addFirst(element); return; }
        if (i == size) {
            addLast(element);
            return; }

        Node<T> prev = getNode(i - 1);
        Node<T> newNode = new Node<>(element, prev.next);
        prev.next = newNode;
        size++;
    }

    @Override
    public void addSorted(T element) {
        Comparable<T> value = (Comparable<T>) element;

        if (size == 0 || value.compareTo(head.element) <= 0) {
            addFirst(element);
        } else if (value.compareTo(tail.element) >= 0) {
            addLast(element);
        } else {
            Node<T> current = head;
            while (current.next != null && ((Comparable<T>)current.next.element).compareTo(element) < 0) {
                current = current.next;
            }
            current.next = new Node<>(element, current.next);
            size++;
        }
    }

    @Override
    public T removeFirst() {
        if (size == 0) return null;
        T data = head.element;
        head = head.next;
        size--;
        if (size == 0) tail = null;
        return data;
    }

    @Override
    public T removeLast() {
        if (size == 0) return null;
        if (size == 1) return removeFirst();

        Node<T> prev = getNode(size - 2);
        T data = tail.element;
        prev.next = null;
        tail = prev;
        size--;
        return data;
    }

    @Override
    public T removeAt(int i) {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException();
        if (i == 0) return removeFirst();
        if (i == size - 1) return removeLast();

        Node<T> prev = getNode(i - 1);
        T data = prev.next.element;
        prev.next = prev.next.next;
        size--;
        return data;
    }

    @Override
    public boolean remove(T element) {
        int index = find(element);
        if (index != -1) {
            removeAt(index);
            return true;
        }
        return false;
    }

    @Override
    public int find(T element) {
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(element)) return i;
            current = current.next;
        }
        return -1;
    }

    @Override
    public T get(int i) {
        return getNode(i).element;
    }

    @Override
    public void set(int i, T element) {
        getNode(i).element = element;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    private Node<T> getNode(int i) {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException();
        Node<T> current = head;
        for (int j = 0; j < i; j++) current = current.next;
        return current;
    }

    public static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
        }

        Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }
    }
}