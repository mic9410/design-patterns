package adapter.end;

import java.io.IOException;

public interface PlainToEncryptedAdapter {
    public String readFile(String path) throws IOException;

}
