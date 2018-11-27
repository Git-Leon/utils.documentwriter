package rocks.zipcode;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 16/11/2018.
 */
public class Document implements DocumentInterface {

    private final FileWriter fileWriter;
    private final File file;

    public Document(String fileName) throws IOException {
        this(new File(fileName));
    }

    public Document(File file) throws IOException {
        this.file = file;
        this.fileWriter = new FileWriter(file);
    }

    @Override
    public void write(String contentToBeWritten) {
        try {
            fileWriter.write(contentToBeWritten);
            fileWriter.flush();
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    @Override
    public void write(Integer lineNumber, String valueToBeWritten) {
        String[] lines = read().split("\n");
        lines[lineNumber] = valueToBeWritten;
        try {
            Files.write(file.toPath(), Arrays.asList(lines));
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    @Override
    public String read(Integer lineNumber) {
        return read().split("\n")[lineNumber];
    }

    @Override
    public String read() {
        StringBuilder stringBuilder = new StringBuilder();
        toList().forEach(line -> stringBuilder.append(line).append("\n"));
        return stringBuilder.toString().replaceAll("\n$", "");
    }

    @Override
    public void replaceAll(String stringToReplace, String replacementString) {
        overWrite(read().replaceAll(stringToReplace, replacementString));
    }

    @Override
    public void overWrite(String content) {
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(content);
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new Error(e);
        }
    }

    public List<String> toList() {
        try {
            return Files.readAllLines(file.toPath());
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    @Override
    public File getFile() {
        return file;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(file.getName())
                .append("{")
                .append(read())
                .append("}")
                .toString();
    }
}
