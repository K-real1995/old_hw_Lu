import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println(Math.getSum("5","5"));
        System.out.println(Math.getSum(4,3));
        System.out.println(Math.getMul("3","4"));
        System.out.println(Math.getMul(3,4));
        System.out.println(Math.getDivision("5","6"));
        System.out.println(Math.getDivision(10,5));
        System.out.println(Math.getDivision(3,0));
        System.out.println(Math.getSub(10,5));
        System.out.println(Math.getSub("10","2"));


        List<Integer> numbers = new ArrayList<>(100);
        List<?> NewGeneratedList = GenerateList.genList(numbers);
        System.out.println(NewGeneratedList.size());
        System.out.println(NewGeneratedList);
    }
}
