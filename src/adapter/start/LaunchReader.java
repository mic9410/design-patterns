package adapter.start;

import adapter.start.plain.text.ReadPlainText;

import java.io.IOException;

public class LaunchReader {

    public static void main(String[] args) throws IOException {
        ReadPlainText rpt = new ReadPlainText("C:\\Repos\\design-patterns\\src\\adapter\\start\\plain\\text\\text.txt");
        System.out.println(rpt.getText());
    }
}
