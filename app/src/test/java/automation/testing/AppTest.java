/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package automation.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    
    @Test
    @DisplayName("Example")
    void appHasLogic() {
    	assertEquals(1+1, 2);
    	
    }
}
