
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFriend {

    Friend friend = new Friend();

    @Test
    void friendCreationTest(){
        assertNotNull(friend);
    }

    @Test
    public void getRandomResponseTest() {
        String[] testArray = {"A", "B", "C"};
        String result = friend.getRandomResponse(testArray);
        assertTrue(result.equals("A") || result.equals("B") || result.equals("C"));
    }


}
