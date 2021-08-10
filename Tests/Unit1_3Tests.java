import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Unit1_3Tests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void ExpressionsWithLiteralsTest() throws Exception {
        String expect = "";
        File file = new File("data_files/literals.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine())
            expect += scan.nextLine() + "\n";
        ExpressionsWithLiterals.main(null);
        assertEquals(expect, outContent.toString(), "Make sure your expressions are set up correctly");
    }

    @Test
    void RectangleAreaTest() {
        String[] args = null;
        String expect = "Area = 84\n";
        RectangleArea.main(args);
        assertEquals(expect, outContent.toString(), "Output should be \"Area = \" then the answer");
    }

    @Test
    void PoundsToKilogramsTest() {
        String[] args = null;
        String expect = "115.0 pounds = 52.15419501133787 kilograms\n";
        PoundsToKilograms.main(args);
        assertEquals(expect, outContent.toString(), "Both variables should be doubles");
    }

    @Test
    void TotalWithTaxTest() throws Exception {
        String expect = "";
        File file = new File("data_files/taxes.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine())
            expect += scan.nextLine() + "\n";
        TotalWithTax.main(null);
        assertEquals(expect, outContent.toString(), "Make sure your expressions are set up correctly");
    }

    @Test
    void TemperatureConversionTest() {
        String[] args = null;
        String expect = "78 degrees Fahrenheit is 25.555555555555557 degrees Celsius\n";
        TemperatureConversion.main(args);
        assertEquals(expect, outContent.toString(), "Is your formula correct?");
    }
}
