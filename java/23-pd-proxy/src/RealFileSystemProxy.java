import java.util.HashMap;
import java.util.Map;

public class RealFileSystemProxy implements FileSystem {
    private final Map<String, String> cache = new HashMap<>();
    @Override
    public String readFile(String filename) {
        System.out.println(" Proxy [before] ");
        if (cache.containsKey(filename)) {
            System.out.println(" Proxy [get from cache] file " + filename);
        } else {
            RealFileSystem rfs = new RealFileSystem();
            String content = rfs.readFile(filename);
            cache.put(filename, content);
            System.out.println(" Proxy [update cache]");
            System.out.println(" - cache size " + cache.size());
        }
        System.out.println(" Proxy [after] " + filename.toUpperCase());
        return cache.get(filename);
    }
}
