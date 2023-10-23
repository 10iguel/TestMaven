import org.example.NameGetter;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class test01Test {
    @DisplayName("Test Greetings")
    @Test
    public void nameTest(){
        NameGetter nameGetter = new NameGetter();
        nameGetter.setName("Miguel");
        assertEquals("Hello Miguel", nameGetter.getName());
    }
}