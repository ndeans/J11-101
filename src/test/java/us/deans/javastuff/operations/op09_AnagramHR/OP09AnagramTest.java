package us.deans.javastuff.operations.op09_AnagramHR;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OP09AnagramTest {

    @Test
    public void testIsAnagram_01() {

        String a = "PAT";
        String b = "TAP";
        OP09_Anagram op09 = new OP09_Anagram();

        boolean tst = op09.isAnagram(a,b);
        System.out.println(tst?("yup"):("neh"));            // - fancy print line :o
        assertTrue(tst);

    }

    @Test
    public void testIsAnagram_02() {

        String a = "anagramm";
        String b = "marganaa";
        OP09_Anagram op09 = new OP09_Anagram();

        boolean tst = op09.isAnagram(a,b);
        System.out.println(tst?("yup"):("neh"));                                // - fancy print line :o
        assertFalse(tst);

    }

    @Test
    public void testIsAnagram_03() {

        String a = "cable";
        String b = "table";
        OP09_Anagram op09 = new OP09_Anagram();

        boolean tst = op09.isAnagram(a,b);
        System.out.println(tst?("yup"):("neh"));
        assertFalse(tst);


    }

    @Test
    public void testIsAnagram_04() {

        String a = "politics";
        String b = "sports";

        OP09_Anagram op09 = new OP09_Anagram();
        boolean tst = op09.isAnagram(a,b);
        System.out.println(tst?("yup"):("neh"));                                // - fancy print line :o
        assertFalse(tst);

    }

    @Test
    public void testIsAnagram_05() {

        String a = "Hello";
        String b = "hello";

        OP09_Anagram op09 = new OP09_Anagram();
        boolean tst = op09.isAnagram(a,b);
        System.out.println(tst?("yup"):("neh"));                                // - fancy print line :o
        assertTrue(tst);

    }

}
