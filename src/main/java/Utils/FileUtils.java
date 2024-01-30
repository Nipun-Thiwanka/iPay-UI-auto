package Utils;

import java.io.FileReader;

public class FileUtils {

    public static String readJSONFile(String filePath) {
        try {
            FileReader reader = new FileReader(filePath);
            StringBuilder content = new StringBuilder();
            int character;

            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }

            reader.close();
            return content.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}