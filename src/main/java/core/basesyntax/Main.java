package core.basesyntax;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.Converter;
import core.basesyntax.service.ReaderService;
import core.basesyntax.service.ReportGenerator;
import core.basesyntax.service.WriteService;
import core.basesyntax.strategy.OperationStrategy;

import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.util.List;

public class Main {
    public static void main(String[] arg) {
        ReaderService readerService = new ReaderService() {
            @Override
            public List<String> read(String path) {
                return null;
            }
        };
        List<String> inputReport = readerService.read(CharBuffer.wrap("reportToRead.csv"));

        Converter converter = new Converter() {
            @Override
            public List<FruitTransaction> convert(List<String> lines) {
                return null;
            }
        };

        OperationStrategy operationStrategy = new OperationStrategy();

        Process process = new Process() {
            @Override
            public OutputStream getOutputStream() {
                return null;
            }

            @Override
            public InputStream getInputStream() {
                return null;
            }

            @Override
            public InputStream getErrorStream() {
                return null;
            }

            @Override
            public int waitFor() throws InterruptedException {
                return 0;
            }

            @Override
            public int exitValue() {
                return 0;
            }

            @Override
            public void destroy() {

            }
        };

        ReportGenerator reportGenerator = new ReportGenerator() {
            @Override
            public String getReport() {
                return null;
            }
        };

        WriteService writeService = new WriteService() {
            @Override
            public void write(String report, String path) {

            }
        };

    }
}
