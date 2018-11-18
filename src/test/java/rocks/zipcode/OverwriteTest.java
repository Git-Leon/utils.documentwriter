package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @author leon on 18/11/2018.
 */
public class OverwriteTest extends DocumentTest {

    public OverwriteTest(DocumentInterface documentWriter) {
        super(documentWriter);
    }

    public void writeTest1() {
        // given
        String contentToBeOverwritten = "The quick brown fox";
        String expected = "The quick browner fox";
        documentWriter.write(contentToBeOverwritten);

        // when
        documentWriter.overWrite(expected);
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }

    public void writeTest2() {
        // given
        String contentToBeOverwritten = "The quick brown fox";
        String expected = "The quick brownest fox";
        documentWriter.write(contentToBeOverwritten);

        // when
        documentWriter.overWrite(expected);
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }
}
