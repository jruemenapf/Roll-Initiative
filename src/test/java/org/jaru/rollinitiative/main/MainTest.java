package org.jaru.rollinitiative.main;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Jan
 */
public class MainTest {


    @Test
    public void getTextTest() {
        Main main = Mockito.mock(Main.class);
        Mockito.when(main.getText()).thenReturn("Penis");
        assertEquals(main.getText(), "Penis");
    }
}
