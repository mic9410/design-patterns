package adapter.plain.text;

import java.io.*;


public class ReadPlainText {

    private String openedText;

    public ReadPlainText(String path) throws IOException {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        this.openedText = br.readLine();
    }

    public String getText() {
        return openedText;
    }
}
