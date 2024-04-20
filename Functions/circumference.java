package Functions;
import java.util.*;

class circumference {
    public static double circum(double r){
        double circu = (2*3.14*r);
        return circu;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius:- ");
        double r = sc.nextDouble();
        sc.close();

        //calling function
        double circu = circum(r);
        System.out.print("Circumference of circle is:- "+circu);
    }
}
