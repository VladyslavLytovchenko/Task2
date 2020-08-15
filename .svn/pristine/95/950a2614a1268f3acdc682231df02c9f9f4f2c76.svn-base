package ua.nure.lytovchenko.task2;

import java.util.Iterator;

public final class Writer {
    private Writer() {

    }

    public static <E> void write(Iterable<E> cont) {
        for (Object o : cont) {
            System.out.print(o + " ");
        }
        System.out.println(cont.toString());
        Iterator<E> iter = cont.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
