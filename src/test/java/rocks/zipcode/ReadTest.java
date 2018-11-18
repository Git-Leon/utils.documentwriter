package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 18/11/2018.
 */
public class ReadTest extends DocumentTest {

    public ReadTest(DocumentInterface documentWriter) {
        super(documentWriter);
    }

    public void testRead1() {
        // given
        String expected = "The\nquick\nbrown\nfox";
        documentWriter.write(expected);

        // when
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRead2() {
        // given
        String expected = "The\nquicker\nbrown\nfox";
        documentWriter.write(expected);

        // when
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }

}
