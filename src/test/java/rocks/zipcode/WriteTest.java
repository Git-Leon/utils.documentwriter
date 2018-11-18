package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 18/11/2018.
 */
public class WriteTest extends DocumentTest{
    public WriteTest(DocumentInterface documentWriter) {
        super(documentWriter);
    }

    public void writeAlphaValuesTest()  {
        // given
        String expected = "The quick brown fox";

        // when
        documentWriter.write(expected);
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void writeSpecialCharactersTest()  {
        // given
        String expected = "()";

        // when
        documentWriter.write(expected);
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void writeNumericValuesTest()  {
        // given
        String expected = "123";

        // when
        documentWriter.write(expected);
        String actual = documentWriter.read();

        // then
        Assert.assertEquals(expected, actual);
    }
}
