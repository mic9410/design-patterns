package adapter.end;

import adapter.end.plain.text.PlainText;

import java.io.IOException;

public class EncryptedText implements PlainToEncryptedAdapter {
    private String path;

    public EncryptedText(String path) {
        this.path = path;
    }

    @Override
    public String readFile() throws IOException {
        PlainText pt = new PlainText(this.path);
       return ("This is encryped version of the text: " + pt.readPlainText());
    }

}