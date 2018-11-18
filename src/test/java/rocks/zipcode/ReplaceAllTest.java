package rocks.zipcode;

import org.junit.Assert;

/**
 * @author leon on 18/11/2018.
 */
public class ReplaceAllTest extends DocumentTest{
    public ReplaceAllTest(DocumentInterface documentWriter) {
        super(documentWriter);
    }
    public void testReplace_e_withUnderscore() {
        // given
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
