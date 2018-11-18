package rocks.zipcode.numericdocument;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Document;
import rocks.zipcode.NumericCharDocument;

import java.io.IOException;

/**
 * @author leon on 16/11/2018.
 */
public class NumericDocumentWriteTest {

    @Test
    public void writeNumericValuesToFile123() throws IOException {
        // given
        String fileName = "file.txt";
        String contentToBeWritten = "123";
        Document documentWriter = new NumericCharDocument(fileName);

        // when
        documentWriter.write(contentToBeWritten);
    }

    @Test
    public void writeNumericValuesToFile987() throws IOException {
        // given
        String fileName = "file.txt";
        String contentToBeWritten = "987";
        Document documentWriter = new NumericCharDocument(fileName);

        // when
        documentWriter.write(contentToBeWritten);
    }

    @Test(expected = IllegalArgumentException.class)
    public void writeSpecialCharacter() throws IOException {
        // given
        String fileName = "file.txt";
        String contentToBeWritten = "()";
        Document documentWriter = new NumericCharDocument(fileName);

        // when
        documentWriter.write(contentToBeWritten);
    }

    @Test(expected = IllegalArgumentException.class)
    public void writeAlphaValuesTest() throws IOException {
        // given
        String fileName = "file.txt";
        String expected = "The quick brown foxy";
        Document documentWriter = new NumericCharDocument(fileName);

        // when
        documentWriter.write(expected);
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }

}
