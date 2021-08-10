import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Unit1_1Tests {

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
    void NameAndSchoolTest() {
        NameAndSchool.main(null);
        assertTrue(outContent.toString().contains("Sandy Spring Friends School"), "Don't abbreviate the school.");
    }

    @Test
    void TimeAndDateTest() throws Exception {
        String expect = "";
        File file = new File("data_files/date.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine())
            expect += scan.nextLine() + "\n";
        TimeAndDate.main(null);
        assertEquals(expect, outContent.toString(), "Is your date in the right format?");
    }


    @Test
    void SentenceTest() throws Exception {
        String expect = "";
        File file = new File("data_files/sentence.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine())
            expect += scan.nextLine() + "\n";
        Sentence.main(null);
        assertEquals(expect, outContent.toString(), "Do you have three lines?");
    }

    @Test
    void MetaJavaTest() throws Exception {
        String expect = "";
        File file = new File("data_files/main.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine())
            expect += scan.nextLine() + "\n";
        MetaJava.main(null);
        assertEquals(expect, outContent.toString(), "Check your spacing!");
    }

}