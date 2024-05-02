import java.io.*;

class FileReaderUtil {
    public static String readInputFile(String path) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                sb.append(line).append(System.lineSeparator());
                line = br.readLine();
            }
            return sb.toString().replaceAll("\\s+", " ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}