import java.util.Arrays;
import java.util.List;

public class LambdaPractice
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Biswajeet", "Naveen", "Rahul","Raghav", "Mukesh");

        //conventional method - using 'for' loop :
        System.out.println("Using 'for' loop :");
        for (int i=0; i<names.size(); i++)
        {
            System.out.println(names.get(i));
        }
        System.out.println("--------------------------");

        //Using 'for-each' loop :
        System.out.println("Using 'for-each' loop :");
        for (String str : names)
        {
            System.out.println(str);
        }
        System.out.println("--------------------------");

        //1. using lambda
        System.out.println("Using 'lambda' expression :");
        names.forEach(ele -> System.out.println(ele));
        System.out.println("--------------------------");
        
        //2. using method reference
        System.out.println("Using 'method reference' :");
        names.forEach(System.out::println); //println - method reference name
        System.out.println("--------------------------");

    }
}
