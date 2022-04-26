import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String credentials;
    private final boolean checkResult;


    public AccountTest(String credentials, boolean checkResult) {
        this.credentials = credentials;
        this.checkResult = checkResult;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getData() {
        return new Object[][]{
                {"Яковлев Евгений", true},
                {"Я к", true},
                {"Я кк", true},
                {"Яковлев Евгенийййй", true},
                {"Яковлев Евгениййййй", true},
                {" Яковлев Евгений", false},
                {"Яковлев Евгений ", false},
                {"Яков Лев Евгений", false},
                {"Як", false},
                {"Яковлев Евгенийййййй", false},
                {"Яковлев Евгениййййййййййййййй", false},
                {"", false}
        };
    }

    @Test
    public void checkingNameTest() {
        Account account = new Account(credentials);
        boolean result = account.checkNameToEmboss();
        assertEquals("Введено невалидное значение", checkResult, result);
    }
}