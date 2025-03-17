package OOps3.Inheritence;

public class BoxColor extends BoxWeight {
    String color;

    public BoxColor(double side, double weight, String color) {
        super(side, weight);
        this.color = color;
    }
}
