package rocks.zipcode;

import java.io.IOException;

/**
 * @author leon on 16/11/2018.
 */
public class AlphaDocument extends Document {
    public AlphaDocument(String fileName) throws IOException {
        super(fileName);
    }

    @Override
    public void write(String contentToBeWritten) {
        if (!isAlpha(contentToBeWritten)) {
            throw new IllegalArgumentException();
        }
        super.write(contentToBeWritten);
    }

    private Boolean isAlpha(String s) {
        return s.matches("[a-z A-Z]+");
    }
}
