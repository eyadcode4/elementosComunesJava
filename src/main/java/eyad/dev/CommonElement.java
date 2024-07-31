package eyad.dev;

import java.util.ArrayList;

public class CommonElement {

    private ArrayList<Integer> commonElements = new ArrayList<>();

    public ArrayList<Integer> findCommonElements(ArrayList<Integer> listA, ArrayList<Integer> listB) {

        for (Integer element : listA) {
            if (listB.contains(element) && !commonElements.contains(element)) {
                commonElements.add(element);
            }
        }
        return commonElements;
    }

}