package is2.ulpgc.kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CSVFileVideogameLoader implements VideogamesLoader{
    private File file;

    public CSVFileVideogameLoader(File file) {
        this.file = file;
    }
    public static CSVFileVideogameLoader with(String file){
        return new CSVFileVideogameLoader(new File(file));
    }

    @Override
    public List<Videogame> load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            return load(reader);
        }catch(IOException e){
            return Collections.emptyList();
        }
    }
    private List<Videogame> load(BufferedReader reader){
        return reader.lines().skip(1).map(line->toVideogame(line.split(","))).collect(Collectors.toList());
    }

    private Videogame toVideogame(String[] split) {
        return new Videogame(
                Float.parseFloat(split[8]),Float.parseFloat(split[9]),Float.parseFloat(split[10])
        );
    }
}
