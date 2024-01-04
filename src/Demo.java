import java.util.*;

public class Demo {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(3);
        data.add(3);
        data.add(4);
        data.add(2);
        System.out.println(data);

        Set<Integer> set = new HashSet<Integer>(data);
        data = new ArrayList<Integer>(set);
        System.out.println(data);
        /*
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = set1; //is a pointer not a clone
        Set<Integer> set3 = new HashSet<Integer>(set1);
        set3.addAll(set1);
        System.out.println(set3);

        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(5);
        set2.add(6);
        set2.add(4);
        set1.retainAll(set2); //intersection
        System.out.println(set1);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        Set <Integer> set = new HashSet<Integer>(list);

        System.out.println(set);
        List<String> al = new ArrayList<String>(pF);
        Iterator<String> it = pF.iterator();
        while(it.hasNext()) System.out.println(it.next());


        Set<String> pF = new HashSet<String>();
        pF.add("pecan");
        pF.add("pumpkin");
        pF.add("apple");
        pF.add("shepherds");
        pF.add("cherry");
        System.out.println(pF);
        pF.remove("shepherds");
        System.out.println(pF);
        System.out.println(pF.contains("cherry"));
        */
    }
}
