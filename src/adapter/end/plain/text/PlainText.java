package adapter.end.plain.text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class PlainText {

    private String openedText;

    public PlainText(String path) throws IOException {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        this.openedText = br.readLine();
    }

    public String readFile() {
        return this.openedText;
    }
}
