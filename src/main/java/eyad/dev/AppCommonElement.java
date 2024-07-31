package eyad.dev;

import java.util.ArrayList;
import java.util.Scanner;

public class AppCommonElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        System.out.println("Enter numbers of listA:");
        int n1 = scanner.nextInt();
        System.out.println("Enter numbers of listA:");
        for (int i = 0; i < n1; i++) {
            listA.add(scanner.nextInt());
        }

        System.out.println("Enter numbers of listB:");
        int n2 = scanner.nextInt();
        System.out.println("Enter numbers of listB:");
        for (int i = 0; i < n2; i++) {
            listB.add(scanner.nextInt());
        }

        CommonElement commonElement = new CommonElement();
        ArrayList<Integer> commonElements = commonElement.findCommonElements(listA, listB);

        System.out.println("Common elements:");
        for (Integer element : commonElements) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
