package stepik.java.collections.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static Integer maxElem(List<Integer> list){

        int max = 0;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        List<Integer> listFin = new ArrayList<>();

        listFin.add(23);
        listFin.add(33);
        listFin.add(56);
        listFin.add(12);

        System.out.println(ArrayList1.maxElem(listFin));
    }
}
