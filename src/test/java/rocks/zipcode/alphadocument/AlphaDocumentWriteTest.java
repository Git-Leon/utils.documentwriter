package rocks.zipcode.alphadocument;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Document;

import java.io.IOException;

/**
 * @author leon on 16/11/2018.
 */
public class AlphaDocumentWriteTest {

    @Test(expected = IllegalArgumentException.class)
    public void writeNumericValuesToFile() throws IOException {
        // given
        String fileName = "file.txt";
        String contentToBeWritten = "123";
        Document documentWriter = new Document(fileName);

        // when
        documentWriter.write(contentToBeWritten);
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(contentToBeWritten, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void writeSpecialCharacter() throws IOException {
        // given
        String fileName = "file.txt";
        String expected = "()";
        Document documentWriter = new Document(fileName);

        // when
        documentWriter.write(expected);
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }
}
