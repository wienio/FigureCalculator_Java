import java.util.Locale;

/**
 * Created by Wienio on 2017-03-01.
 */
public class Circle extends Figure implements Print {
    private int r;

    public Circle(int r) {
        this.r=r;
    }

    @Override
    public void print() {
        System.out.println("Kolo o srednicy " + 2*this.r +", czyli promien to: " + this.r);
        System.out.println(String.format (Locale.US, "Obwod to: %.4f" , calculatePerimeter()));
        System.out.println(String.format (Locale.US, "Pole to: %.4f" , calculateArea()));
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*this.r;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.r,2)*Math.PI;
    }
}
