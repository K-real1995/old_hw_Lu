import java.util.List;
import java.util.Random;

public class GenerateList {


    public static List<?> genList(List<Integer> numbers){
        Random rnd = new Random(System.currentTimeMillis());
        while (numbers.size() < 100) {
            numbers.add(rnd.nextInt(900) + 100);
        }
        return numbers;
    }
}
