package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FileReadRunner {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        Path pathFileToRead = Paths.get("./src/files/resources/data.txt");
        
//        List <String> lines = Files.readAllLines(pathFileToRead);
//        lines.stream().forEach(System.out::println);
        Files.lines(pathFileToRead)
        .filter(s -> s.toLowerCase().contains("a"))
        .forEach(System.out::println);
    }

}
