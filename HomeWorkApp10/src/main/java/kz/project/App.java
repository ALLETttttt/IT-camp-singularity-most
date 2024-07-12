package kz.project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CustomLL ll = new CustomLL();
        ll.add(1);
        ll.add(2);
        ll.add(6767);
        ll.print();
        System.out.println();
        ll.addAtIndex(234, 2);
        ll.print();
        System.out.println();
        ll.remove(2);
        ll.print();
        ll.removerFirst();
        System.out.println();
        ll.print();
    }
}
