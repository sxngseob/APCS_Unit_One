import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Unit1_1Tests_old {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @Test
    @Order(11)
    void RoundNegativesTest() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/data.txt"));
        RoundNegatives.main(args);
        assertTrue(outContent.toString().contains("-4.32 rounded to a whole number is -4"));
    }

    @Test
    @Order(12)
    void RoundTenthTest() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/data2.txt"));
        RoundTenth.main(args);
        assertTrue(outContent.toString().contains("27.623 rounded to the nearest tenth is 27.6"));
        System.setIn(new FileInputStream("data_files/data3.txt"));
        RoundTenth.main(args);
        assertTrue(outContent.toString().contains("19.851 rounded to the nearest tenth is 19.9"));
    }


    @Test
    @Order(10)
    void TemperatureConversionTest() {
        String[] args = null;
        String expect = "78 degrees Fahrenheit is 25.555555555555557 degrees Celsius\n";
        TemperatureConversion.main(args);
        assertEquals(expect, outContent.toString(), "Is your formula correct?");
    }

    @Test
    @Order(13)
    void AverageRoundedTest() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/data4.txt"));
        AverageRounded.main(args);
        assertTrue(outContent.toString().contains("Average = 25"), "Make sure your final answer is an int");
    }

    @Test
    @Order(15)
    void CorrectChangeTest() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/change.txt"));
        CorrectChange.main(args);
        assertTrue(outContent.toString().contains("You have 6 dollars, 3 quarters, 1 dimes, 1 nickels, and 4 pennies."),
                "Double-check all your calculations. Check your punctuation too.");
    }

    @Test
    @Order(14)
    void PaintingARoomTest() {
        String[] args = null;
        String expect = "You will need 13.611428571428572 of paint.\n";
        PaintingARoom.main(args);
        assertEquals(expect, outContent.toString(), "Are your formulas correct?");
    }


}