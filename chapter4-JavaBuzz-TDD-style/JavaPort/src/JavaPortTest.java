import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaPortTest {
    private String plane;
    private JavaPort airport;


    @BeforeEach
    public void initJavaPort() {
        airport = new JavaPort();
        plane = "plane";
    }

    @Test
    public void testLanded() {
        String output = airport.land(plane);
        assertEquals("Landed", output);
    }

    @Test
    public void testTakeoff() {
        String output = airport.takeoff(plane);
        assertEquals("Taken off", output);
    }
}
