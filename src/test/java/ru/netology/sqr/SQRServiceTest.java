package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import static ru.netology.sqr.Assertion.*;

public class SQRServiceTest {

    @Test
    public void shouldCounter() {
        SQRService service = new SQRService();

        int actual = service.sqr(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCounterWithAnError() {
        SQRService service = new SQRService();

        int actual = service.sqr(300, 200);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCounterWithMinus() {
        SQRService service = new SQRService();

        int actual = service.sqr(-200, -300);
        int expected = 3;

        assertEquals(expected, actual);
    }
}


