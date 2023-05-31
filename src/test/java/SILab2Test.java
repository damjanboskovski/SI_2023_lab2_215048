import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {
    @Test
    void EveryBranchTest() {
        assertTrue(SILab2.function(new User("Damjan", "P@ssw0rd123", "damjan@gmail.com"),new ArrayList<User>()));
        assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertTrue(SILab2.function(new User(null, "P@ssw0rd123", "damjan@gmail.com"),new ArrayList<User>()));

    }

}
