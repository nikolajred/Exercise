package SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(12);
        mySet.add(15);
        mySet.add(45);
        mySet.add(45);
        mySet.add(45);
        mySet.add(45);
        System.out.println(mySet.size());
        Iterator<Integer>iterator = mySet.iterator();
        for (int i:mySet) {
            System.out.println(i);
        }

    }

}
