package ua.nure.lytovchenko.task2.part4;

import ua.nure.lytovchenko.task2.part2.ListImpl;

public class StackImpl<E> extends ListImpl<E> implements Stack<E>{



    @Override
    public void push(E element) {
        addFirst(element);
    }

    @Override
    public E pop() {
        E o = getFirst();
        removeFirst();
        return o;
    }

    @Override
    public E top() {
        return getFirst();
    }

    @Override
    public void clear() {
        head=null;
        length=0;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public String toString() {
        if(length==0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        ListImpl<E> list = new ListImpl<>();
        current = head;
        while (current != null) {
            list.addFirst(current.getData());
            current = current.getNext();
        }
        for(Object o : list){
            sb.append(o).append(", ");
        }
        return sb.toString().substring(0, sb.length() - 2)+"]";

    }
}




