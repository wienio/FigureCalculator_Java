/**
 * Created by Wienio on 2017-03-01.
 */

public abstract class Figure implements Print {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public void print() {
        System.out.println("Jestem klasa abstrakcyjna!");
    }
}