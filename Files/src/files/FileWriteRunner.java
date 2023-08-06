package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Path pathFileToWrite = Paths.get("./src/files/resources/file-write.txt");
        
        List<String> list = List.of("Apple","Boy","Dog","Cat","Elephant");
            
        Files.write(pathFileToWrite, list);

    }

}
