package adapter.end;

import adapter.end.plain.text.PlainText;

import java.io.IOException;

public class EncryptedText implements PlainToEncryptedAdapter {
    @Override
    public String readFile(String path) throws IOException {
        PlainText pt = new PlainText(path);
       return ("This is encryped version of the text: " + pt.getText());
    }


}