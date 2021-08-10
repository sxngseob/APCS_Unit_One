import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Unit1_1Tests {

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
    @Order(3)
    void TimeAndDateTest() {
            String[] args = null;
            TimeAndDate.main(args);
            assertEquals("11:59pm\n09/04/2020\n", outContent.toString(), "Check your output");
    }


    @Test
    @Order(4)
    void SentenceTest() {
        String[] args = null;
        String expect = "It is a great\ntime to be a\ncomputer programmer!";
        Sentence.main(args);
        assertEquals(expect, outContent.toString(), "Check your spelling and punctuation?");
    }

    @Test
    @Order(5)
    void Sentence2Test() {
        String[] args = null;
        String expect = "It is a great time to be a computer programmer!";
        Sentence2.main(args);
        assertEquals(expect, outContent.toString(), "Check your spelling and punctuation?");
    }

    @Test
    @Order(2)
    void NameAndSchoolTest() {
        String[] args = null;
        NameAndSchool.main(args);
        assertTrue(outContent.toString().contains("Sandy Spring Friends School"), "Don't abbreviate the school.");
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
    @Order(6)
    void ExpressionsWithLiteralsTest() {
        String[] args = null;
        String expect = "-3\n-29\n-3.0\n26\n28.5\n6\n6.9\n2\n19\n8\n";
        ExpressionsWithLiterals.main(args);
        assertEquals(expect, outContent.toString(), "Check to make sure the problems match the lab");
    }

    @Test
    @Order(7)
    void RectangleAreaTest() {
        String[] args = null;
        String expect = "Area = 84\n";
        RectangleArea.main(args);
        assertEquals(expect, outContent.toString(), "Output should be \"Area = \" then the answer");
    }

    @Test
    @Order(8)
    void PoundsToKilogramsTest() {
        String[] args = null;
        String expect = "115.0 pounds = 52.15419501133787 kilograms\n";
        PoundsToKilograms.main(args);
        assertEquals(expect, outContent.toString(), "Both variables should be doubles");
    }

    @Test
    @Order(9)
    void TotalWithTaxTest() {
        String[] args = null;
        String expect = "Price: $52.75\n" + "Sales Tax: $4.351875000000001\n" + "Total: $51.101875\n";
        TotalWithTax.main(args);
        assertEquals(expect, outContent.toString(), "Are all of your calculations correct?");
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