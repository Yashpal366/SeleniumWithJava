package HybridTesting;

public class HybridTest {
    public static void main(String[] args){
        HybridTest hybrid = new HybridTest();
        hybrid.runTest();
    }

    public void runTest(){
        seleniumTest st = new seleniumTest();
        manualTest mt = new manualTest();

        try{
            st.setUp();
            st.login("student", "Password123");
            mt.manualtesting();
            System.out.println("Success");
        }finally{
            st.tearDown();
        }

    }
}

