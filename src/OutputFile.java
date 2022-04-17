import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OutputFile {
    char[] buffer;
    String pathFile;

    public void OutputFile() {

    }
    public void OutputFile(String offsetString) {
        Path path = Paths.get("output.txt");
        try (FileWriter fileWriter = new FileWriter(path.toString())) {
            this.pathFile = path.toString();
            System.out.print("Данные сохранены в: " + path.toString());
            buffer = offsetString.toCharArray();
            fileWriter.write(buffer);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
