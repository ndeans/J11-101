package us.deans.javastuff.operations.op07_StringsHR;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OP10Strings3HRTest {

    @Test
    public void testStart1() {

        OP10_Strings3HR op10 = new OP10_Strings3HR();
        op10.start("He is a very very good boy, isn't he?");

    }

    @Test
    public void testStart2() {

        OP10_Strings3HR op10 = new OP10_Strings3HR();
        op10.start("Good thing he's a dog.");

    }

    @Test
    public void testStart3() {

        OP10_Strings3HR op10 = new OP10_Strings3HR();
        op10.start("Otherwise, I'd have to pay him.");

    }

    @Test
    public void testStart4() {

        File file = new File("src/main/resources/op10-input.txt");
        String input = "";
        
        try {
            Scanner scan = new Scanner(file);
            input = scan.nextLine();
        } 
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        OP10_Strings3HR op10 = new OP10_Strings3HR();
        op10.start(input);

    }
}

