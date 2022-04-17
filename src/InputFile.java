import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class InputFile {
    String inputString;

    public void InputFile() {

    }

    public void InputFile(String str) {
        char[] buffer = new char[256];

        try(FileReader reader = new FileReader(str)) {
            int c;
            while ((c = reader.read(buffer)) > 0) {
                if (c < 256) {
                    buffer = Arrays.copyOf(buffer, c);
                }

            }
            this.inputString = new String(buffer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
