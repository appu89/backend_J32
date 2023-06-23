package iterable;

import java.util.ArrayList;
    public class StringArray {
        public static void main(String[] args) {
            // Create an ArrayList of Strings
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Apple");
            arrayList.add("Banana");
            arrayList.add("Orange");

            // Convert ArrayList to an array
            String[] array = arrayList.toArray(new String[0]);

            // Print the array
            for (String element : array) {
                System.out.println(element);
            }
        }
    }


