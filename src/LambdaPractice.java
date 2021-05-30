import java.util.Arrays;
import java.util.List;

public class LambdaPractice
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Biswajeet", "Naveen", "Rahul","Raghav", "Mukesh");

        //1. using lambda
        names.forEach(ele -> System.out.println(ele));
        
        //2. using method reference
        names.forEach(System.out::println); //println - method reference name

    }
}
