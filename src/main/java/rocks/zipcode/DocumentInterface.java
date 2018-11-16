package rocks.zipcode;

import java.io.File;

/**
 * @author leon on 16/11/2018.
 */
public interface DocumentInterface {
    void write(String contentToBeWritten);

    void write(Integer lineNumber, String valueToBeWritten);

    String read(Integer lineNumber);

    String read();

    void replaceAll(String stringToReplace, String replacementString);

    void overWrite(String content);

    File getFile();

    @Override
    String toString();
}
