package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("THIS IS CIRCLE");
    }

    @Override
    public String displayInformation() {
        return "Figure: Circle, area: " + getArea() + " sq. units, radius: " + radius
                + " units, color: " + getColor();
    }
}
