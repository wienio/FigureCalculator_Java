/**
 * Created by Wienio on 2017-03-02.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String [] args ) throws MyException {
        Scanner in = new Scanner(System.in);
        int choose,a,r,h,index,figure_choose;
        boolean loop_end=false;
        List<Figure> figures = new ArrayList<>();


        while (loop_end!=true) {
            System.out.print('\f');
            System.out.println("MENU");
            System.out.println("1) Wybierz figure i wprowadz dane");
            System.out.println("2) Wyswietl dane konkretnej figury (wymagany index!)");
            System.out.println("3) Wyjscie");
            System.out.print("Podaj numer: ");
            choose=in.nextInt();

            switch (choose) {
                case 1:
                {
                    System.out.println("wybierz co chcesz dodac: ");
                    System.out.println("1) Kwadrat");
                    System.out.println("2) Trojkat");
                    System.out.println("3) Kolo");
                    figure_choose=in.nextInt();
                    switch (figure_choose) {
                        case 1:
                        {
                            System.out.print("Podaj dlugosc boku: ");
                            a=in.nextInt();
                            if ( a <= 0 ) {
                                throw new MyException("Podano bledna dlugosc!");
                            }
                            else {
                                figures.add(new Square(a));
                            }
                            break;
                        }
                        case 2:
                        {
                            System.out.print("Podaj dlugosc boku, a nastepnie wysokosc: ");
                            a=in.nextInt();
                            h=in.nextInt();

                            if (a <= 0 || h <= 0) {
                                throw new MyException("Podano bledna dlugosc!");
                            }
                            else {
                                figures.add(new Triangle(a,h));
                            }
                            break;
                        }
                        case 3:
                        {
                            System.out.print("Podaj dlugosc proemienia: ");
                            r=in.nextInt();
                            if ( r <= 0 ) {
                                throw new MyException("Podano bledna dlugosc!");
                            }
                            else {
                                figures.add(new Circle(r));
                            }
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case 2:
                {
                    System.out.print("Podaj nr dodanego elementu do wyswietlenia (pierwszy element ma indeks 0!): ");
                    index=in.nextInt();
                    try {
                        figures.get(index).print();
                    } catch (IndexOutOfBoundsException exception) {
                        System.out.println("Blad, poprawna ilosc wprowadzonych figur to: " + figures.size());
                    }
                    break;
                }
                case 3:
                {
                    loop_end=true;
                    break;
                }
                default:
                    break;
            }
        }
    }
}