package sortStuff.tdd;

import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class SortedSet<E> implements sortStuff.SortedSet<E> {

    private Comparator<E> comparator;
    private int size;

    SortedSet() {
        // empty
    }

    SortedSet(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Comparator getComparator() {
        return comparator;
    }

    @Override
    public E first() throws NoSuchElementException {
        throw new NoSuchElementException();
    }

    @Override
    public E last() throws NoSuchElementException {
        throw new NoSuchElementException();
    }

    @Override
    public boolean add(E element) {
        size++;
        return false;
    }

    @Override
    public boolean addAll(Collection elements) {
        return false;
    }

    @Override
    public boolean remove(Object element) {
        return false;
    }

    @Override
    public boolean removeAll(Collection elements) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public boolean containsAll(Collection elements) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
