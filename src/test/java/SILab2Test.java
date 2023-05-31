import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {
    @Test
    void EveryBranchTest() {
        assertTrue(SILab2.function(new User("Damjan", "P@ssw0rd123", "damjan@gmail.com"),new ArrayList<User>()));
        assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertTrue(SILab2.function(new User(null, "P@ssw0rd123", "damjan@gmail.com"),new ArrayList<User>()));
        assertFalse(SILab2.function(new User(null, "password", "damjangmailcom"),new ArrayList<User>()));

        ArrayList users = new ArrayList<User>(); users.add(new User("Damjan", "P@ssw0rd123", "damjan@gmail.com"));
        assertFalse(SILab2.function(new User("Damjan", "P@ssw0rd123", "damjan@gmail.com"), users));

        assertFalse(SILab2.function(new User("Damjan", "Damjan", "damjan@gmail.com"),new ArrayList<User>()));

    }

    @Test
    void MultipleCondition(){
        assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertThrows(RuntimeException.class, () -> SILab2.function(new User(null, null, null), new ArrayList<User>()));
        assertFalse(SILab2.function(new User("Damjan", "P@ssw0r", "damjan@gmail.com"),new ArrayList<User>()));
        assertTrue(SILab2.function(new User("Damjan", "P@ssw0rd123", "damjan@gmail.com"),new ArrayList<User>()));
    }
}
