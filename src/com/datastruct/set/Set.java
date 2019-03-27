package com.datastruct.set;

public interface Set<E> {

    public void add(E e);

    public boolean contains(E e);

    public void remove(E e);

    public int getSize();

    public boolean isEmpty();
}
