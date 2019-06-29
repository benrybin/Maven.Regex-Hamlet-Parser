import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        String test = hamletParser.nameReplace("Hamlet","Leon");


        Boolean actual = test.contains("Hamlet");
        Boolean expected = false;

        assertEquals(actual,expected);

    }

    @Test
    public void testChangeHoratioToTariq() {
        String test = hamletParser.nameReplace("Horatio","Tariq");

       Boolean actual = test.contains("Horatio");
       Boolean expected = false;

       assertEquals(actual,expected);
    }

    @Test
    public void testFindHoratio() {


        Boolean actual = hamletText.contains("Horatio");
        Boolean expected = true;

        assertEquals(actual,expected);

    }

    @Test
    public void testFindHamlet() {
        Boolean actual = hamletText.contains("Hamlet");
        Boolean expected = true;

        assertEquals(actual,expected);
    }
}