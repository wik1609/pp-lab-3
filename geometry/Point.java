public class Point {
    private double x;
    private double y; //te pola są prywatne dla x, y

    public Point(double x, double y) {
    this.x = x; //odwolujemy sie do parametru x
    this.y = y; //odwolujemy sie do parametru y
}
    public double getX() {
        return x; //metoda zwraca wartosc pola x
    }

    public double getY(){
        return y; //metoda zwraca wartosc pola y
    }

    public void setX(double x){ //ustawia wartosc pola x
        x = x; 
    }

    public void setY(double y) { //ustawia wartosc pola y
        y = y;
    }
    public static void main(String[] args) { //klasa main gdzie sprawdzamy dzialanie klasy Point
        Point point = new Point(3.0, 4.0);
        System.out.println("Współrzędne punktu: (" + point.getX() + " . " + point.getY() + ")"); // wyswietlamy wspolrzedne punktu
    }

    }
