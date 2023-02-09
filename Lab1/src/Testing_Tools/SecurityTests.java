package Testing_Tools;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SecurityTests {

    /**
     * Test instance which should be invalid due to not meeting length required at all e.g. empty
     */
    @Test
    public void testLogonEmptyUserId() {
        String userId = "";
        String password = "Freddy99";
        Security s = new Security();
        boolean actual = s.logon(userId, password);
        boolean expected = false;
        assertEquals(expected, actual);
        // assertFalse(actual);   // can also use this assert
    }


    /**
     * Test instance which should be valid due to space in username as it appears to trim spaces
     */
    @Test
    public void testLogonUserIdSpace() {
        String userId = "freddy hello";
        String password = "Freddyabc123";
        Security s = new Security();
        boolean actual = s.logon(userId, password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    /**
     * Test instance which should be invalid due to not meeting length required
     */
    @Test
    public void testLogonPasswordLength() {
        String userId = "freddy";
        String password = "Fred7";
        Security s = new Security();
        boolean actual = s.logon(userId, password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    /**
     * Test instance which should be invalid due to no uppercase character included
     */
    @Test
    public void testLogonPasswordContainsUpper() {
        String userId = "freddy";
        String password = "fred7";
        Security s = new Security();
        boolean actual = s.logon(userId, password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    /**
     * Test instance which should be invalid due to no digit included
     */
    @Test
    public void testLogonPasswordContainsNoDigit() {
        String userId = "freddy";
        String password = "Freddy";
        Security s = new Security();
        boolean actual = s.logon(userId, password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    /**
     * Test instance which should be completely valid
     */
    @Test
    public void testLogonSuccess() {
        String userID = "CharlieWoo01";
        String password = "SomePassword1412";
        Security s = new Security();
        boolean actual = s.logon(userID, password);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
