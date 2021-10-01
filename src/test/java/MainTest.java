import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {
    @Test
public void isCodeup(){
        assertEquals("codeup","codeup");
    }

    @Test
    public void testAssertions(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages,moreLanguages);

    }

    @Test
    public void testAssertArrays(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers,otherNumbers);
    }

    @Test
    public void  testAssertFalseOrTrue(){

        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue(language,language.contains("H"));
        assertFalse(language,language.contains("J"));


    }

//    @Test
//    public void tesetReturnGreeting Greeting(){
//        assertEquals("weell , jello", Main.returnGreeting());
//    }

    @Test
    public void testAdd(){
        assertEquals(4,Main.add(2,2));

        assertEquals(5,Main.add(2,3));
    }


}
