package StackException;

import java.util.EmptyStackException;

/**
 * Created by Guillem on 22/02/2017.
 */
public interface Stack<E> {
    void push(E e) throws FullStackException;
    E pop() throws EmptyStackException;
    int size();
}
