import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RealFileSystem implements FileSystem {

    @Override
    public String readFile(String filename) {
        System.out.println("Real: reading file: " + filename);
        try {
            return new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException e) {
            return null;
        }
    }
}
