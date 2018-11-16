package rocks.zipcode.document;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.Document;

import java.io.IOException;

/**
 * @author leon on 16/11/2018.
 */
public class DocumentReplaceAllTest {
    @Test
    public void testReplace_e_withUnderscore() throws IOException {
        // given
        String fileName = "file.txt";
        Document documentWriter = new Document(fileName);
        String contentToBeWritten = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
        String expected = contentToBeWritten.replaceAll("e", "_");
        documentWriter.write(contentToBeWritten);

        // when
        documentWriter.replaceAll("e", "_");

        // then
        String actual = documentWriter.read();
        Assert.assertEquals(expected, actual);
    }
}
