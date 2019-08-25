package ListTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(455);// добавляет элементы в массив
        list.add(588);
        list.add(899);
        list.add(3,588);

        System.out.println(list.get(1)); //определяет элемент массива по индексу
        System.out.println(list.get(3));
        list.set(3,599); //переопределяет элемент массива по индексу
        System.out.println(list.get(3));
        list.remove(1);// удаляет элемент массива со сдвигом вверх
        System.out.println(list.get(1));
        System.out.println(list.size());// определяет колличество элементов массива(размер)
        list.clear();//очищает элементы массива
        System.out.println(list.size());
        list.add(123);
        list.add(125);
        list.add(365);
        System.out.println(list.size());
        List<Integer>list2 = new ArrayList<>();
        list2.add(128);
        list2.add(258);
        System.out.println(list2.size());
        list2.addAll(list);
        System.out.println(list.size());
        System.out.println(list2.size());

       int [] myArgs = new int[5];
       myArgs[0] = 1;
       myArgs[1] = 2;
       myArgs[2] = 10;
       myArgs[3] = 15;
       myArgs[4] = 20;

       int [] myArgs1 = {2, 4, 5, 45, 12};

        for (int n:myArgs1) {
            System.out.print(n + " ");
        }
        Iterator<Integer>iterator = list.iterator();
        System.out.println(iterator.next());

        Iterator<Integer>iterator2 = list2.iterator();
       // System.out.println(iterator2.next());
       // System.out.println(iterator2.next());
       // System.out.println(iterator2.next());
       // System.out.println(iterator.hasNext());
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
