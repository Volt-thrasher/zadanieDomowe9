package z1;

import java.util.Objects;

public class Jacket {
    private String colour;
    private String producer;
    private int size;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getInfo () {
        return "Producent: "+producer+", Color: "+colour+", Rozmiar: "+size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jacket jacket = (Jacket) o;
        return size == jacket.size &&
                Objects.equals(colour, jacket.colour) &&
                Objects.equals(producer, jacket.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, producer, size);
    }
}
