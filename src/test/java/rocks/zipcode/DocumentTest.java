package rocks.zipcode;

/**
 * @author leon on 18/11/2018.
 */
abstract public class DocumentTest {
    protected DocumentInterface documentWriter;

    public DocumentTest(DocumentInterface documentWriter) {
        this.documentWriter = documentWriter;
    }
}
