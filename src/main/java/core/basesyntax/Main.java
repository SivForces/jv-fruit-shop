package core.basesyntax;

import java.io.FileReader;
import java.nio.CharBuffer;
import java.util.List;

public class Main {
    public static void main(String[] arg) {
        FileReader fileReader = new FileReaderImpl();
        List<String> inputReport = fileReader.read(CharBuffer.wrap("reportToRead.csv"));
    }
}
