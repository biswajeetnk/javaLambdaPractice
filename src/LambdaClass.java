public class LambdaClass
{
    public static void main(String[] args)
    {
        /*WebPage page = new WebPage()
        {
            @Override
            public void header(String value)
            {
                System.out.println("Hi! this is "+value);
            }
        };

        WebPage page2 = new WebPage()
        {
            @Override
            public void header(String value)
            {
                System.out.println("Hi! this is "+value);
            }
        };

        page.header("Google");
        page2.header("Facebook");*/

        //above code is repititive, all logic remains the same.
        //to overcome this we can use Lambda, made code more simpler with lesser lines
        /*WebPage pageUsingLambda = (String value) -> { System.out.println("Hi! this is "+value); };
        WebPage pageUsingLambda2 = (value2) -> System.out.println("Hi! this is "+value2);
        WebPage pageUsingLambda3 = (n) -> System.out.println(n.length());*/
        WebPage lambdaWtihTwoParams = (value, age) -> System.out.println("Name is : "+value+" and age is --> "+age);


        /*pageUsingLambda.header("Twitter (this using lambda)");
        pageUsingLambda2.header("Instagram (this using lamda)");
        pageUsingLambda3.header("Biswajeet");*/
        lambdaWtihTwoParams.header("Biswajeet",27);
    }
}
