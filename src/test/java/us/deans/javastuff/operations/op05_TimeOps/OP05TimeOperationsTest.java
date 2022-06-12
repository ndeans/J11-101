package us.deans.javastuff.operations.op05_TimeOps;

import org.junit.Test;

public class OP05TimeOperationsTest {

    @Test
    public void testOp05() {

        String input = "08 05 2015";


        OP05_TimeOperations timeOps = new OP05_TimeOperations();
        String result = timeOps.findDay(input);
        System.out.println(result);

    }

}
