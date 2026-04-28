package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathUtilsTest {

    @Test
    void testPortablePath() {
        Path path = Paths.get("temp", "data.txt");
        assertFalse(PathUtils.fileExists(path.toString())); // vì file chưa tồn tại
    }
}

