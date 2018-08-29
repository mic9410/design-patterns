package adapter;

import adapter.plain.text.ReadPlainText;

import java.io.IOException;

public class LaunchDevice {

    public static void main(String[] args) throws IOException {
        ReadPlainText rpt = new ReadPlainText("text.txt");
        System.out.println(rpt.getText());
    }
}
