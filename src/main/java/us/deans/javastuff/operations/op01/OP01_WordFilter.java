package us.deans.javastuff.operations.op01;

import us.deans.javastuff.base.BaseOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/**
 *  This test is from the Volvo Interview - Take 5 paragraphs from Lorem Ipsum and extract all the words
 *  that start with "s"
 *
 */
public class OP01_WordFilter extends BaseOperation {

    File file = new File("src/main/resources/lorem_ipsum.txt");
    Set<String> s_words = new HashSet<>();

    @Override
    public void start() {
        super.start();
        wordFilter();
    }

    private void wordFilter() {

        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNext()) {
                String[] words = scan.nextLine().toLowerCase(Locale.ROOT).split(" ");
                for(String word: words) {
                    if (word.startsWith("s"))  {
                        if (word.endsWith(".")) word = word.substring(0,word.length()-1);
                        s_words.add(word);
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        printResults();
    }

    private void printResults() {
        for(String s_word: s_words) {
            System.out.println(s_word);
        }
    }
}
