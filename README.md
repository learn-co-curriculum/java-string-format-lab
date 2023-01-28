# String Format Lab (Optional)

## Learning Goals

- Practice formatting `String` values

## Introduction

Consider the following output of an Ice Cream Menu:

```text
Today's daily specials:
One Scoop            ... $3.75
Two Scoops           ... $5.25
Three Scoops         ... $6.75
Ice Cream Sandwiches ... $6.50
Milkshakes           ... $6.95
Small Sundae         ... $6.99
Large Sundae         ... $7.99
Pint                 ... $8.00

Today's ice cream flavors are:
Vanilla              Chocolate
Strawberry           Cookies and Cream
Cookie Dough         Birthday Cake
       Mint Chocolate Chip

Today's ice cream toppings are:
Chocolate Chips      Rainbow Sprinkles    Cherries
Strawberries         Bananas              Caramel Sauce
                     Chocolate Syrup
```

## Instructions

In this lab, we will practice formatting various strings by replicating the
above output. You can either make use of the `String` class' `format()` method
or use the `printf()` method, but you **must** use either or both to re-create
the menu.  Do not hard-code print statements containing
strings with extra spaces between words.

## Hint

We briefly covered in the last lesson the various flags. One of the flags was
how to left-justify an output. Here is an example:

```java
public class StringExample {
    public static void main(String[] args) {
        String vanilla = "Vanilla";

        // Right-justified, no flag necessary, use a width of 12
        String rightJust = String.format("My favorite ice cream flavor is: %12s - it's delicious!", vanilla);
        
        // Left-justified, use the '-' flag with a width of 12
        String leftJust = String.format("My favorite ice cream flavor is: %-12s - it's delicious!", vanilla);
        
        System.out.println(rightJust);
        System.out.println(leftJust);
    }
}
```

Notice that we need to use a width with the left-justify flag `-`. This is
because instead of adding potentially extra whitespace characters in front of
the value, Java will add it after the value:

```text
My favorite ice cream flavor is:      Vanilla - it's delicious!
My favorite ice cream flavor is: Vanilla      - it's delicious!
```

Use the left-justify flag in your lab to help with formatting the ice cream
menu!

The starter project contains a Junit test `StringFormatLabTest` that
you can use to test your output.  Your solution should *not* hardcode
the output like the Junit test does.  You must produce each line of output
using calls to either `String.format()` or `System.out.printf` that use
format strings.