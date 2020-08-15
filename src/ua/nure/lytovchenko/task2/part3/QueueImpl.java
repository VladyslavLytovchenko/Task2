package ua.nure.lytovchenko.task2.part3;

import ua.nure.lytovchenko.task2.part2.ListImpl;


public class QueueImpl<E> extends ListImpl<E> implements Queue<E> {


    @Override
    public void enqueue(E element) {
        addLast(element);
    }

    @Override
    public void clear() {
        length=0;
        head=null;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public E dequeue() {
        E o = getFirst();
        removeFirst();
        return o;
    }

    @Override
    public E top() {
        return head.getData();
    }


}
