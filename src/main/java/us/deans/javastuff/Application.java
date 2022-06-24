package us.deans.javastuff;

import us.deans.javastuff.operations.op01_VolvoInt.*;
import us.deans.javastuff.operations.op02_OptimizelyInt.*;
import us.deans.javastuff.operations.op04_GoDaddyInt.OP04_GoDaddy_LookUp;
import us.deans.javastuff.operations.op04_GoDaddyInt.OP04_GoDaddy_NestedLoop;
import us.deans.javastuff.operations.op09_AnagramHR.OP09_Anagram;

public class Application {

    public static void main(String[] args) {

        new OP01_WordFilter().start();
        new OP02_IntOptimizely().start();
        new OP04_GoDaddy_LookUp().start();
        new OP04_GoDaddy_NestedLoop().start();

        new OP09_Anagram().start();

    }

}
