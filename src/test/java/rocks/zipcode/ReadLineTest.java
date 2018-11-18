package rocks.zipcode;

import org.junit.Assert;

/**
 * @author leon on 18/11/2018.
 */
public class ReadLineTest extends DocumentTest {
    public ReadLineTest(DocumentInterface documentWriter) {
        super(documentWriter);
    }

    public void testReadFirstLine() {
        // given
        String expected = "The";
        String contentToBeWritten = "The\nquick\nbrown\nfox";
        documentWriter.write(contentToBeWritten);

        // when
        String actual = documentWriter.read(0);

        // then
        Assert.assertEquals(expected, actual);
    }

    public void testReadSecondLine() {
        // given
        String expected = "quick";
        String contentToBeWritten = "The\nquick\nbrown\nfox";
        documentWriter.write(contentToBeWritten);

        // when
        String actual = documentWriter.read(1);

        // then
        Assert.assertEquals(expected, actual);
    }
}
