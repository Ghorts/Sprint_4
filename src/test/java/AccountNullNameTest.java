import org.junit.Test;

public class AccountNullNameTest {

    @Test(expected = NullPointerException.class)
    public void checkingNameTest() {
        Account account = new Account(null);
        account.checkNameToEmboss();
    }
}
