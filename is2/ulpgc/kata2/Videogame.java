package is2.ulpgc.kata2;

import java.util.Objects;

public class Videogame {
    private float salesJapan;
    private float salesEEUU;
    private float salesWorld;

    public Videogame(float salesJapan, float salesEEUU, float salesWorld) {
        this.salesJapan = salesJapan;
        this.salesEEUU = salesEEUU;
        this.salesWorld = salesWorld;
    }

    public float getSalesJapan() {
        return salesJapan;
    }

    public void setSalesJapan(float salesJapan) {
        this.salesJapan = salesJapan;
    }

    public float getSalesEEUU() {
        return salesEEUU;
    }

    public void setSalesEEUU(float salesEEUU) {
        this.salesEEUU = salesEEUU;
    }

    public float getSalesWorld() {
        return salesWorld;
    }

    public void setSalesWorld(float salesWorld) {
        this.salesWorld = salesWorld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videogame videogame = (Videogame) o;
        return Float.compare(videogame.salesJapan, salesJapan) == 0 && Float.compare(videogame.salesEEUU, salesEEUU) == 0 && Float.compare(videogame.salesWorld, salesWorld) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesJapan, salesEEUU, salesWorld);
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "salesJapan=" + salesJapan +
                ", salesEEUU=" + salesEEUU +
                ", salesWorld=" + salesWorld +
                '}';
    }
}
