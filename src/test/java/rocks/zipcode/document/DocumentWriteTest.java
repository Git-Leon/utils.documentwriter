package rocks.zipcode.document;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Document;

import java.io.IOException;

/**
 * @author leon on 16/11/2018.
 */
public class DocumentWriteTest {

    @Test
    public void writeTest1() throws IOException {
        // given
        String fileName = "file.txt";
        String expected = "The quick brown fox";
        Document documentWriter = new Document(fileName);

        // when
        documentWriter.write(expected);
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void writeTest2() throws IOException {
        // given
        String fileName = "file.txt";
        String expected = "The quicker browner fox";
        Document documentWriter = new Document(fileName);

        // when
        documentWriter.write(expected);
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }
}
