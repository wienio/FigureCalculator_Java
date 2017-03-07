import java.util.Locale;

/**
 * Created by Wienio on 2017-03-01.
 */
public class Square extends Figure implements Print {
    private int a;
    public Square (int a) {
        this.a=a;
    }

    @Override
    public void print() {
        System.out.println("Kwadrat o boku: " + this.a);
        System.out.println(String.format(Locale.US, "I przekatnej: %.4f" , Math.sqrt(2)*this.a));
        System.out.println("Obwod to: " + calculatePerimeter());
        System.out.println("Pole to: " + calculateArea());
    }

    @Override
    public double calculatePerimeter() {
        return 4*this.a;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.a,2);
    }
}
