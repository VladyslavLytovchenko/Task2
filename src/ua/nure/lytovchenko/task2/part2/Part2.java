package ua.nure.lytovchenko.task2.part2;


import ua.nure.lytovchenko.task2.Writer;

public class Part2 {
    public static void main(String[] args) {
        ListImpl<Integer> array = new ListImpl<>();
        array.addFirst(1);
        array.addLast(2);
        array.addLast(3);
        array.addFirst(4);
        array.addFirst(4);
        array.remove(2);



        System.out.println("asd"   +  array.search(4));
        array.removeFirst();
        System.out.println(array.getLast());
        Writer.write(array);
    }
}
