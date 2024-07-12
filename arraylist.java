import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;






public class arraylist {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        System.out.println("Abhi al1 ka travers "+ al1);

        for (int i = 0; i <= al1.size()-1; i++) { 
            System.out.println("Index " + i + "value :- " +al1.get(i));
        }



        System.out.println("using Iterator");
        Iterator itr = al1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }



        System.out.println("Using List Iterator");

        ListIterator li1= al1.listIterator();
        while(li1.hasNext()) {
            System.out.println(li1.next() + " ");   
            }



        System.out.println("in revers Order");
        ListIterator li2= al1.listIterator(al1.size());
        while(li2.hasPrevious()) {
            System.out.println(li2.previous() + " ");
            }
        


            

            
    }
}