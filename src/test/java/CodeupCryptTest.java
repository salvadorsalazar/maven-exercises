
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {


    private static double version;

    @Test
    public void testIfVersionIsSet(){
        assertEquals(0.0, CodeupCryptTest.version, 0);
        CodeupCryptTest.version = 1.2;
        assertEquals(1.2, CodeupCryptTest.version, 0);
    }


    public void testHashPassword(){

        assertEquals("", CodeupCrypt.hashPassword(""));
        assertEquals("444", CodeupCrypt.hashPassword("444"));
        assertEquals("c4t", CodeupCrypt.hashPassword("cat"));
        assertEquals("c4t", CodeupCrypt.hashPassword("cAt"));

        assertEquals("333", CodeupCrypt.hashPassword("333"));
        assertEquals("c0d39p", CodeupCrypt.hashPassword("codeup"));


    }
    }

