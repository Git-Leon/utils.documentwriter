package rocks.zipcode;

import java.io.IOException;

/**
 * @author leon on 18/11/2018.
 */
public class SpecialCharDocument extends Document {
    public SpecialCharDocument(String fileName) throws IOException {
        super(fileName);
    }

    @Override
    public void write(String contentToBeWritten) {
        if (!isSpecialCharacters(contentToBeWritten)) {
            throw new IllegalArgumentException();
        }
        super.write(contentToBeWritten);
    }

    private Boolean isSpecialCharacters(String s) {
        return !(s.matches("[0-9 ]+") || s.matches("[a-z A-Z]+"));
    }
}
