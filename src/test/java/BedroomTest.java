import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before() {
        this.bedroom = new Bedroom("128", BedroomType.SINGLE, 75);
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
        assertEquals(75, bedroom.getRate());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }
}