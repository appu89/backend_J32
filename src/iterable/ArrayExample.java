package iterable;

    import java.util.ArrayList;

    public class ArrayExample  {
        public static void main(String[] args) {
            // Create an ArrayList of objects
            ArrayList<Object> list = new ArrayList<>();
            list.add("Apple");
            list.add(10);
            list.add(3.14);
            list.add(true);

            // Print the ArrayList before removing the last object
            System.out.println("ArrayList before removing the last object: " + list);

            // Remove the last object
            if (!list.isEmpty()) {
                list.remove(list.size() - 1);
            }

            // Print the ArrayList after removing the last object
            System.out.println("ArrayList after removing the last object: " + list);
        }
    }


