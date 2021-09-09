import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserInputTests {
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
    void correctChangeExample() throws IOException {
        System.setIn(new FileInputStream("data_files/uione.txt"));
        CorrectChange.main(null);
        assertTrue(outContent.toString().contains("You have 1 dollars, 2 quarters, 1 dimes, 0 nickels, and 3 pennies."), "");
    }

    @Test
    void correctChangeQuarterPenny() throws IOException {
        System.setIn(new FileInputStream("data_files/uitwo.txt"));
        CorrectChange.main(null);
        assertTrue(outContent.toString().contains("You have 6 dollars, 0 quarters, 0 dimes, 0 nickels, and 4 pennies."), "");
    }

    @Test
    void separatingDigitsExample() throws IOException {
        System.setIn(new FileInputStream("data_files/uithree.txt"));
        SeparatingDigits.main(null);
        assertTrue(outContent.toString().contains("4 2 3 3 9"), "");
    }

    @Test
    void separatingDigitsDecending() throws IOException {
        System.setIn(new FileInputStream("data_files/uifour.txt"));
        SeparatingDigits.main(null);
        assertTrue(outContent.toString().contains("8 6 7 5 4"), "");
    }


}
