package adapter.end;

import adapter.end.plain.text.PlainText;

import java.io.IOException;

public class LaunchReader {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Repos\\design-patterns\\src\\adapter\\end\\plain\\text\\text.txt";

        PlainText rpt = new PlainText(path);
        System.out.println(rpt.readFile());

        EncryptedText enc = new EncryptedText(path);
        System.out.println(enc.readFile());
    }
}
