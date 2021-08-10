import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Unit1_5Tests {

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
    void RoundNegativesTest() throws IOException {
        System.setIn(new FileInputStream("data_files/data.txt"));
        RoundNegatives.main(null);
        assertTrue(outContent.toString().contains("-4.32 rounded to a whole number is -4"));
    }

    @Test
    void RoundTenthTest() throws IOException {
        System.setIn(new FileInputStream("data_files/data2.txt"));
        RoundTenth.main(null);
        assertTrue(outContent.toString().contains("27.623 rounded to the nearest tenth is 27.6"));
        System.setIn(new FileInputStream("data_files/data3.txt"));
        RoundTenth.main(null);
        assertTrue(outContent.toString().contains("19.851 rounded to the nearest tenth is 19.9"));
    }

    @Test
    void AverageRoundedTest() throws IOException {
        System.setIn(new FileInputStream("data_files/data4.txt"));
        AverageRounded.main(null);
        assertTrue(outContent.toString().contains("Average = 25"), "Make sure your final answer is an int");
    }
}
