package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("/home/gamma/Documents/CDA/JAVA/OBJECT/recensement.csv");
        List<String> fileContent = Files.readAllLines(pathFile);
        List<String> lines = new ArrayList<>();

        for(int i=0; i<Math.min(101, fileContent.size()); i++){
            lines.add(fileContent.get(i));
        }

        Path pathCible = Paths.get("/home/gamma/Documents/CDA/JAVA/OBJECT/recensement-v2.csv");
        if (!Files.exists(pathCible)) {
            Files.createFile(pathCible);
        }
        Files.write(pathCible, lines, StandardOpenOption.APPEND);
    }
}
