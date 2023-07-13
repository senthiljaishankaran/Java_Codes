import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    // LinkedList Properties
    // 1. Can contain duplicate values/elements
    // 2. Maintians insertion order
    // 3. Not Synchronized
    // 4. Best for manipulation of elements or data
    // 5. Works on singley or doubley Linked List
    // 6. LinkedList slower in storing and accessing
    // 7. LinkedList has more memory reqirement compared to ArrayList
    // 8. High memory requirement when compareed to ArrayList as it had memory of prev and next element
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        // Adding elements
        ll.add("Java");
        ll.add("C++");
        ll.add("Clang");
        System.out.println(ll);
       
        // Adding elements at first and Last
        ll.addFirst("python");
        ll.addLast("Javascript");
        System.out.println(ll);
        
        // remove first and last element
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        // remove by specifying index
        ll.remove(0);
        System.out.println(ll);

        //for loop
        System.out.println("for loop");
        for(int i=0;i<ll.size();i++)
        System.out.println(ll.get(i));

        // for each loop
        System.out.println("for each loop");
        for(String st:ll){
            System.out.println(st);
        }

        // Iterator method
        System.out.println("Iterator method");
        Iterator itr =ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // While method
        System.out.println("While method");
        int num=0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num++;
        }
    }
}
