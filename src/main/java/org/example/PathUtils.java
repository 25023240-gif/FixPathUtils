package org.example;

import java.io.File;

public class PathUtils {
    // Hàm kiểm tra xem file có tồn tại không
    public static boolean fileExists(String path) {
        File f = new File(path);
        return f.exists();
    }
}
