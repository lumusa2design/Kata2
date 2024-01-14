package is2.ulpgc.kata2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Videogame> videogames = CSVFileVideogameLoader.with("is2/ulpgc/kata2/VideogamesDataset.csv").load();
        float japan = 0;
        float eeuu = 0;
        float world = 0;
        for(Videogame videogame: videogames){
            japan += videogame.getSalesJapan();
            eeuu += videogame.getSalesEEUU();
            world += videogame.getSalesWorld();
        }
        System.out.println("Japan = " + japan);
        System.out.println("EEUU = " + eeuu);
        System.out.println("World = " + world);
    }
}
