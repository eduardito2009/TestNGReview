package Class01Review;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login(){
        System.out.println("hello world");
    }
    @Test(dependsOnMethods = "login")
    public void VerifytheDashBoardpage(){
        System.out.println("depend method");
    }
}
