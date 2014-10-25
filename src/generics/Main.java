package generics;
import java.util.*;

/**
 * Created by ksamykandil on 8/9/14.
 */
public class Main {
    public static void main(String[] args){
        List<GenericPair<Integer, String>> g = new ArrayList<GenericPair<Integer, String>>();
        g.add(new GenericPair<Integer, String>(5, "A"));
        g.add(new GenericPair<Integer, String>(4, "D"));
        g.add(new GenericPair<Integer, String>(4, "C"));

        Collections.sort(g, new Comparator<GenericPair<Integer, String>>() {

            @Override
            public int compare(GenericPair<Integer, String> o1, GenericPair<Integer, String> o2) {
                if(o1.getKey() > o2.getKey())
                    return -1;

                if(o1.getKey() < o2.getKey())
                    return 1;

                // o1 is equal to o2, then compare the string value using compareTo
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (GenericPair<Integer, String> g1 : g){
            System.out.println(g1.getKey() + " , " + g1.getValue());
        }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
        /**
         * When you use "? extends " you can't add to the list after initialization.
         */
        List<? extends Number> x = new ArrayList<Number>(Arrays.asList(1, 2, 3, 2.5, 6));
        x.get(0);
//        x.add(2.5); compile time error

        List<? super Integer> y = new ArrayList<Number>(Arrays.asList(1, 2, 3, 2.5, 6));
        y.get(0);
        y.add(1);
    }
}
