package us.deans.javastuff.operations.op07_StringsHR;

import org.junit.Test;
import us.deans.javastuff.operations.op07_StringsHR.OP08_Strings2HR;

public class OP08Strings2HRTest {



    @Test
    public void test1Strings2() {
        OP08_Strings2HR op = new OP08_Strings2HR("welcometojava", 3);
        op.outSmallestAndLargest();
    }

    @Test
    public void test2String2() {
        String test = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        OP08_Strings2HR op = new OP08_Strings2HR(test, 30);
        op.outSmallestAndLargest();
    }

}
