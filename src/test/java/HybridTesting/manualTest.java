package HybridTesting;

import java.util.Scanner;

public class manualTest extends BaseTest {

    public void manualtesting(){
        System.out.println("Perform manual testing steps:");
        System.out.println("Click on the login Button");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Press enter to continue after manual testing steps...");
            scanner.nextLine();
        }
    }
          
}
