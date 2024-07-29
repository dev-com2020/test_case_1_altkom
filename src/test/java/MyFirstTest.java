import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("A special test case")
public class MyFirstTest {

    @BeforeAll
    static void setupAll(){
        System.out.println("Setup ALL TESTS");
    }

    @BeforeEach
    void setup(){
        System.out.println("Setup EACH TEST");
    }

    @Test
    @DisplayName("Custom test name with spaces")
    void my1stTest() {
        String message = "1+1 should be equal to 2";
        System.out.println(message);
        assertEquals(2,1+1,message);
    }
    @Test
    @DisplayName("\uD83D\uDE31")
    @Disabled
    void my2ndTest() {
        String message = "1+2 should be equal to 3";
        System.out.println(message);
        assertEquals(3,1+2,message);
    }

    @AfterEach
    void teardown(){
        System.out.println("Teardown EACH TEST");
    }
    @AfterAll
    static void teardownAll(){
        System.out.println("Teardown ALL TESTS");
    }
}
