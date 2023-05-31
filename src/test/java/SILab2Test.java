import org.junit.jupiter.api.Test;

public class SILab2Test {

    @Test
    public void testValidEmail() {
        String email = "example@example.com";

        assert email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}") : "Невалиден е-маил.";
    }

    @Test
    public void testValidUsername() {
        String username = "example123";

        assert username.matches("[A-Za-z0-9]+") : "Невалидно корисничко име.";
    }
}
