import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Executable;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

        EmailService emailService=EmailService.getInstance();
        Order order=new Order();

@Test
    void testGetInstance() {
        EmailService e2=EmailService.getInstance();
        assertTrue(emailService.equals(e2));
    }


    @Test
    void testException() {
        Assertions.assertThrows(RuntimeException.class,()->emailService.sendEmail(new Order()));
    }

    @Test
    void testSendEmail() {
        String s="order dispatched";
        assertTrue(EmailService.getInstance().sendEmail(order,s));
    }
}