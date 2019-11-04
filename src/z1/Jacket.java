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
    public boolean equals(Object obj) {
        if (this == obj) return  true;
        if (obj == null) return  false;
        if (!(obj instanceof Jacket)) return false;
        Jacket other = (Jacket) obj;
        if (colour == null){
            if (other.colour != null)
                return false;
        } else if (!colour.equals(other.colour))
            return false;
        if (producer == null){
            if (other.producer != null)
                return false;
        } else if (!producer.equals(other.producer))
            return false;
        if (size != other.size)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, producer, size);
    }
}
