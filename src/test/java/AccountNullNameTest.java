import org.junit.Test;

public class AccountNullNameTest {

    @Test(expected = NullPointerException.class)
    public void checkingNameIsNullTest() {
        Account account = new Account(null);
        account.checkNameToEmboss();
    }
}
