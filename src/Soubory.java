import java.io.*;

public class Soubory {
    private String text;

    public void writeToFile(String filePath, String endFilePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(endFilePath));
        char[] chars;
        while ((text = br.readLine()) != null) {
            chars = text.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (Character.isUpperCase(chars[i])) {
                    chars[i] = Character.toLowerCase(chars[i]);
                } else if (Character.isLowerCase(chars[i])) {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
                bw.write(chars[i]);
            }
        }
        br.close();
        bw.close();
    }
}
