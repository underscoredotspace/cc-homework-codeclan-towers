import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before() {
        this.bedroom = new Bedroom("128", BedroomType.SINGLE, 75.00);
    }

    @Test
    public void hasNumber() {
        assertEquals("128", bedroom.getNumber());
    }

    @Test
    public void hasBedroomType() {
        assertEquals(BedroomType.SINGLE, bedroom.getType());
    }

    @Test
    public void hasRate() {
        assertEquals(75.00, bedroom.getRate(), 0.01);
    }
}