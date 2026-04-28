import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathUtilsTest {

    @Test
    void testPortablePath() {
        Path path = Paths.get("temp", "data.txt"); // portable separator
        assertTrue(PathUtils.fileExists(path.toString()));
    }
}
