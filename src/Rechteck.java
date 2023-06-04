public class Rechteck {
    private double length;
    private double width;

    public Rechteck(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Die Länge und Breite muss positiv sein!");
        }
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
