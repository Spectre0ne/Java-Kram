import java.util.Scanner;

public class Rechteck {

    private double length;
    private double width;

    public Rechteck(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double berechneFläche() {
        return length * width;
    }

    public double berechneUmfang() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

    }
}