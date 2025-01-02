import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class java8FOREACH
{
    public static void main(String[] args) {
        //----for eac loop---//
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);
        values.forEach(i -> System.out.println(i));//
    }
}
