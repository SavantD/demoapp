import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    App app = new App();

    @Test
    public void testApp()
    {
        assertEquals("Hello world", app.greet("world"));
    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
}
