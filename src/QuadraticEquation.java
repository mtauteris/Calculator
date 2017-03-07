/**
 * Created by Mokinys on 2017.03.07.
 */
public class QuadraticEquation {

    private double quadraticEquationRoot1(double a, double b, double c) {
        double root1, root2;
        root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        return Math.max(root1, root2);
    }

    private double quadraticEquationRoot2(double a, double b, double c) {
        double root1, root2;
        root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        return Math.min(root1, root2);
    }

    public void countQuadraticEquation(double a, double b, double c) {
        if (Double.isNaN(quadraticEquationRoot1(a, b, c)) || Double.isNaN(quadraticEquationRoot2(a, b, c))) {
            System.out.println("Answer contains imaginary numbers");
        } else
            System.out.println("The values are: " + quadraticEquationRoot1(a, b, c) + ", " + quadraticEquationRoot2(a, b, c));

    }
}
