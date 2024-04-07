package geometry;

public class ColoredCircle extends Circle {
    private String color;

    public ColoredCircle(Point center, double radius, String color) {
        super(center, radius);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Point center = new Point(3, 4);
        double radius = 5.0;
        String color = "red";
        ColoredCircle coloredCircle = new ColoredCircle(center, radius, color);
        
        System.out.println("Środek koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + coloredCircle.getRadius());
        System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + coloredCircle.getArea());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
    }
}