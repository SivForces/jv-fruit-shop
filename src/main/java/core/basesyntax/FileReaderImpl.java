package core.basesyntax;

import java.io.*;
import java.nio.charset.Charset;

public class FileReaderImpl extends FileReader {
    public FileReaderImpl() throws FileNotFoundException {
        super(fileName);
    }

    public FileReaderImpl(File file) throws FileNotFoundException {
        super(file);
    }

    public FileReaderImpl(FileDescriptor fd) {
        super(fd);
    }

    public FileReaderImpl(String fileName, Charset charset) throws IOException {
        super(fileName, charset);
    }

    public FileReaderImpl(File file, Charset charset) throws IOException {
        super(file, charset);
    }
}
