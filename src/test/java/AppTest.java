import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    App app = new App();

    @Test
    public void testApp()
    {
        assertEquals("Hello world2", app.greet("world2"));
    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
}
