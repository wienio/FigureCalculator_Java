/**
 * Created by Wienio on 2017-03-01.
 */
public class Triangle extends Figure implements Print {
        @Override
        public void print() {
            System.out.println("Trojkat o boku " + this.a + " i wysokosci " + this.h);
            System.out.println("Obwod to: " + calculatePerimeter());
            System.out.println("Pole to: " + calculateArea());
        }

        @Override
        public double calculateArea() {
            return 0.5*this.a*this.h;
        }

        @Override
        public double calculatePerimeter() {
            return 3*this.a;
        }

    private int a,h;
    public Triangle(int a, int h) {
        this.a=a;
        this.h=h;
    }
}
