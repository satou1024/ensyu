import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println(i + 1);   
            System.out.println("Weight:");
            double Weight = new Scanner(System.in).nextDouble();
            System.out.println("Height:");
            double Height = new Scanner(System.in).nextDouble();
            double BMI = Weight / (Height * Height);
            String sv = String.format("%.2f", BMI);
            double v2 = Double.parseDouble(sv);
            System.out.println(v2);
        }
    }
}
