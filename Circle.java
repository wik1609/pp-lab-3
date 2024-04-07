public class Circle { // klasa Circle
    private Point center; // Prywatne pole dla środka koła
    private double radius; // Prywatne pole dla promienia koła

    public Circle(Point center, double radius) { // Konstruktor klasy Circle
        this.center = center; 
        this.radius = radius;      // Inicjalizacja pola radius i center
    }

    public Point getCenter() { // zwracanie środka koła
        return center;
    }

    public double getRadius() { // zwracanie promienia koła
        return radius;
    }

    public double calculatePerimeter() { // metoda która liczy obwód koła
        return 2 * Math.PI * radius;
    }

    public double getArea() { // metoda która liczy pole powierzchni koła
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) { 
        Point center = new Point(4, 5); 
        double radius = 3.0; // przypisanie wartosci dla promienia kola
        Circle circle = new Circle(center, radius); // Tworzenie obiektu klasy Circle
        
        // Wyświetlanie właściwości koła
        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
    }
}
