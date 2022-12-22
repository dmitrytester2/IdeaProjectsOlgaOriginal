package definitions;

import cucumber.api.java.en.Given;

public class JavaHWStepDefs {
    @Given("I write my address")
    public void iWriteMyAddress() {
        System.out.println("123 Main str");
        System.out.println("Apartment 456");
        System.out.println("Sunnyvale");
        System.out.println("CA");
    }

    @Given("I concatenate  my address into one phrase")
    public void iConcatenateMyAddressIntoOnePhrase() {
        String addressFirstLine="123 Main str";
        String addressSecondLine="Apartment 456";
        String addressCity="Sunnyvale";
        String addressState="CA";
        System.out.println("Hi, my address is: "+addressFirstLine+", "+addressSecondLine+", "+addressCity+", "+addressState+".");

    }

    @Given("I define my address lines length: {string}, {string}, {string}, {string}.")
    public void iDefineMyAddressLinesLength(String addressFirstLine, String addressSecondLine, String addressCity, String addressState) {
        System.out.println(addressFirstLine.length());
        System.out.println(addressSecondLine.length());
        System.out.println(addressCity.length());
        System.out.println(addressState.length());
    }

    @Given("I comparise my address lines")
    public void iCompariseMyAddressLines() {
        String addressFirstLine="123 Main str";
        String addressSecondLine="Apartment 456";
        String addressCity="Sunnyvale";
        String addressState="CA";

        // I use method .equals

        if (addressFirstLine.equals(addressSecondLine))
        {
            System.out.println("Address first line is EQUAL to Address second line");
        }
        else
        {
            System.out.println("Address first line is NOT EQUAL to Address second line");
        }
        if (addressCity.equals(addressState))
        {
            System.out.println("Address city is EQUAL to Address state");
        }
        else
        {
            System.out.println("Address city is NOT EQUAL to Address state");
        }

        // or I use operator ==

        System.out.println(addressFirstLine == addressSecondLine);
        System.out.println(addressCity == addressState);

        // or I use method .compareTo

        System.out.println(addressFirstLine.compareTo(addressSecondLine));
        System.out.println(addressCity.compareTo(addressState));
        System.out.println(addressFirstLine.compareTo(addressState));
    }
}
