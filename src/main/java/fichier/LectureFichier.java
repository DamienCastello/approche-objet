package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        /* OLD
        Path pathFile = Paths.get("/home/gamma/Documents/CDA/JAVA/OBJECT/recensement.csv");
        List<String> lines = Files.readAllLines(pathFile);

        for(String l : lines){
            System.out.println(l);
        }
         */

        ArrayList<Ville> villes = new ArrayList<>();
        Path pathFile = Paths.get("/home/gamma/Documents/CDA/JAVA/OBJECT/approche-objet/recensement.csv");
        List<String> lines = Files.readAllLines(pathFile);

        for (int i = 1; i < lines.size(); i++) {
            String[] tokens = lines.get(i).split(";");

            Ville ville = new Ville(
                    tokens[6],
                    tokens[2],
                    tokens[1],
                    Integer.parseInt(tokens[9].replace(" ", ""))
            );

            villes.add(ville);
        }

        String first = lines.getFirst();
        String[] cols = first.split(";");
        String header = cols[6] + ";" + cols[2] + ";" + cols[1] + ";" + cols[9];

        Path pathCible = Paths.get("/home/gamma/Documents/CDA/JAVA/OBJECT/approche-objet/recensement-v2.csv");
        if (!Files.exists(pathCible)) {
            Files.createFile(pathCible);
        }

        Files.write(pathCible, List.of(header), StandardOpenOption.APPEND);

        List<String> linesOut = new ArrayList<>();
        for (Ville v : villes) {
            linesOut.add(v.getNom() + ";" + v.getCodeDepartement() + ";" + v.getNomRegion() + ";" + v.getPopulationTotale());
        }

        Files.write(pathCible, linesOut, StandardOpenOption.APPEND);
    }
}
