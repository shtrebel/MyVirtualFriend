package Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFriend {
    @Test
    void friendCreationTest(){
        Friend friend = new Friend();
        Assertions.assertNotNull(friend);
    }
}
