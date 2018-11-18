package rocks.zipcode;

import org.junit.Assert;

/**
 * @author leon on 18/11/2018.
 */
public class ToStringTest extends DocumentTest {
    public ToStringTest(DocumentInterface documentWriter) {
        super(documentWriter);
    }

    public void toStringTest1() {
        // given
        String contentToBeWritten = "The quick brown fox";
        String fileName = documentWriter.getFile().getName();
        String expected = new StringBuilder(fileName)
                .append("{")
                .append(contentToBeWritten)
                .append("}")
                .toString();

        // when
        documentWriter.write(contentToBeWritten);
        String actual = documentWriter.toString();

        // then
        Assert.assertEquals(expected, actual);
    }

    public void toStringTest2() {
        // given
        String contentToBeWritten = "The quicker browner fox";
        String fileName = documentWriter.getFile().getName();
        String expected = new StringBuilder(fileName)
                .append("{")
                .append(contentToBeWritten)
                .append("}")
                .toString();

        // when
        documentWriter.write(contentToBeWritten);
        String actual = documentWriter.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
