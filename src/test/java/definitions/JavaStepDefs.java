package definitions;

import cucumber.api.java.en.Given;

public class JavaStepDefs {
    @Given("I write my string")
    public void iWriteMyString() {
        System.out.println("hello world");
    }

    @Given("I join two strings")
    public void iJoinTwoStrings() {
        //Declaring variables
        String firstName="Peter";
        String lastName="Smith";
        //Print variable name
        System.out.println(firstName);
        //Print first and last name
        System.out.println(firstName+lastName);
        //Print message with variable name
        System.out.println("Hi, my name is "+firstName+" "+lastName);
    }

    @Given("I perform some actions on {string} and {string}")
    public void iPerformSomeActionsOnAnd(String var1, String var2) {
        //Convert into uppercase or into lowercase
        System.out.println("Convert Smith into lower case: "+var2.toLowerCase());
        System.out.println(var1.toUpperCase());
        System.out.println(var1.length());
        System.out.println(var2.length());
        //compare string
        System.out.println(var1.equals(var2));
        System.out.println(var1.equalsIgnoreCase(var2));
        String var3="arrange";
        System.out.println(var1.equalsIgnoreCase(var3));
        // method contains()
        String var4="th";
        System.out.println(var2.contains(var4));

    }

    @Given("I calculate {int} and {int}")
    public void iCalculateAnd(int num1, int num2) {
        System.out.println(num1 + num2);
        int sum = num1 + num2;
        System.out.println(sum);
        System.out.println(num1 / num2);
        //declare float and double types
        float num3 = 3.0f;
        double num4 = 3.00;
        System.out.println(num1 * num3);
        int quot = num2 / num1;
        System.out.println(quot);
        if (num1 > num2) {
            System.out.println(num1 + " is grater than " + num2);
        } else {

            System.out.println(num1 + " less or equal to " + num2);
        }
        System.out.println(num3 > num4);
        boolean num = num2 == num3;
        System.out.println(num);
    }

    @Given("I select url for {string}")
    public void iSelectUrlFor(String url) {
        switch (url){
            case "yahoo":
                System.out.println("https://yahoo.com");
                break;
            case "google":
                System.out.println("https://google.com");
                break;
            case "bing":
                System.out.println("https://bing.com");
                break;
            default:
                System.out.println("unknown site "+url);
        }
    }

    @Given("I  work on array")
    public void iWorkOnArray() {
        // declare array
        String[] colors={"red", "yellow", "green", "white", "orange"};
        System.out.println(colors);
        System.out.println(colors[1]);
        System.out.println(colors[4]);
        System.out.println(colors[3]);
        //declare numeric array
        int[] numbers={1,2,3,4,5,6,7};
        // for loop
        for (int i=0;i<numbers.length-1;i++){
            System.out.println(numbers[i]);
        }

        //for each loop

        for (int num:numbers){
            System.out.println(num);
        }
    }

    @Given("I prepare my borchsh")
    public void iPrepareMyBorchsh() {

    }
}
