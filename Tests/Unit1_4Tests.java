import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Unit1_4Tests {

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
    void FindTheAverageTest() throws IOException {
        System.setIn(new FileInputStream("data_files/ftaone.txt"));
        FindTheAverage.main(null);
        assertTrue(outContent.toString().contains("Average = 7.2675"), "");
    }

    @Test
    void AddOneTakeOneTestOne() throws IOException {
        System.setIn(new FileInputStream("data_files/addone.txt"));
        AddOneTakeOne.main(null);
        assertTrue(outContent.toString().contains("36 37 38"), "");
    }

    @Test
    void AddOneTakeOneTestTwo() throws IOException {
        System.setIn(new FileInputStream("data_files/addtwo.txt"));
        AddOneTakeOne.main(null);
        assertTrue(outContent.toString().contains("-9 -8 -7"), "");
    }


}
