package us.deans.javastuff;

import us.deans.javastuff.operations.op01.OP01_WordFilter;
import us.deans.javastuff.operations.op02_Optimizely.OP02_IntOptimizely;

public class Application {

    public static void main(String[] args) {

        new OP01_WordFilter().start();
        new OP02_IntOptimizely().start();

    }

}
