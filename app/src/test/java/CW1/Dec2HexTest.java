/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CW1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {
    @Test public void ValidateConverstion() {
        assertEquals("F", Dec2Hex.convert(new String[]{"15"}));
        assertEquals("0", Dec2Hex.convert(new String[]{"0"}));
	assertEquals("-1",Dec2Hex.convert(new String[]{""}));
	assertEquals("-1",Dec2Hex.convert(new String[]{"words"}));
    }
}
