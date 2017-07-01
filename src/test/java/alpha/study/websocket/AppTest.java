package alpha.study.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);

    @Before
    public void before()
    {
        LOGGER.info("before");
        assertTrue(true);
        assertEquals(true, true);
    }

    @Test
    public void test()
    {
        LOGGER.info("test");
        assertTrue(true);
        assertEquals(true, true);
    }

    @After
    public void after()
    {
        LOGGER.info("after");
        assertTrue(true);
        assertEquals(true, true);
	}
}
