import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringFormatLabTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void mainTest() {
        String expectedOutput = "Today's daily specials:\n" +
                "One Scoop            ... $3.75\n" +
                "Two Scoops           ... $5.25\n" +
                "Three Scoops         ... $6.75\n" +
                "Ice Cream Sandwiches ... $6.50\n" +
                "Milkshakes           ... $6.95\n" +
                "Small Sundae         ... $6.99\n" +
                "Large Sundae         ... $7.99\n" +
                "Pint                 ... $8.00\n" +
                "\n" +
                "Today's ice cream flavors are:\n" +
                "Vanilla              Chocolate\n" +
                "Strawberry           Cookies and Cream\n" +
                "Cookie Dough         Birthday Cake\n" +
                "       Mint Chocolate Chip\n" +
                "\n" +
                "Today's ice cream toppings are:\n" +
                "Chocolate Chips      Rainbow Sprinkles    Cherries\n" +
                "Strawberries         Bananas              Caramel Sauce\n" +
                "                     Chocolate Syrup\n";

        //call the main method
        StringFormatLab.main(null);

        //compare expected output with actual output
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}