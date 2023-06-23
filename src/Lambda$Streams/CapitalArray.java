package Lambda$Streams;
import java.util.Arrays;


public class CapitalArray {
    public static void main(String[] args) {
        String StrArray[]={"Apple","banana","grapes","oranges","watermelon"};
        Arrays.stream(StrArray)
                .map(s -> s.substring(0,1).toUpperCase()+s.substring(1))
                .sorted()
                .forEach(s -> System.out.println(s));


    }
}
