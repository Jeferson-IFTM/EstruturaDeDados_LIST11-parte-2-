package dev.Jeferson.datastructures.list;

public interface MyList<T> {

        void addFirst (T element);
        void addLast (T element);
        void insertAt(int i, T element);
        void addSorted(T element);

        T removeFirst ();
        T removeLast ();
        T removeAt (int i);
        boolean remove(T element);
        void clear ();

        int find(T element);
        T get (int i);
        void set(int i, T element);

        int size();

}
