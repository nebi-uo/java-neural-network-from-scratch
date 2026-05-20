import java.util.ArrayList;
import java.util.Arrays;

public class Vector_Engine{

    public static double[] add(double[] u, double[] v) {
        double[] sum = new double[u.length];
        int vectorLength = u.length;
        
        if (u.length != v.length) {
            double[] empty = {};

            System.out.println("Invalid Operation");
            return empty;
        }
        else{
            for(int i = 0; i < vectorLength; i++){
                sum[i] = u[i] + v[i];
            }

            return sum;
        }
    }

    public static double[] subtract(double[] u, double[] v) {
        double[] difference = new double[u.length];
        int vectorLength = u.length;

        if (u.length != v.length) {
            double[] empty = {};

            System.out.println("Invalid Operation");
            return empty;
        }
        else {
            for (int i = 0; i < vectorLength; i++) {
                difference[i] = u[i] - v[i];
            }

            return difference;
        }
    }

    public static double[] scale(double[] u, double c) {
        double[] scalarMultiple = new double[u.length];
        int vectorLength = u.length;

        for (int i = 0; i < vectorLength; i++) {
            scalarMultiple[i] = u[i] * c;
        }

        return scalarMultiple;
    } 

    //public static double[] normalize(double[] u) {
        
    //}

    public static void main (String[] args) {
        double scalar = 2;
        double[] v1 = {2, 4, 3};
        double[] v2 = {3, 4, 2};

        Vector_Engine vecOp = new Vector_Engine();
        double[] vsum = vecOp.add(v1, v2);
        double[] vdiff = vecOp.subtract(v1 , v2);
        double[] vmult = vecOp.scale(v1, scalar);

        System.out.println(Arrays.toString(vsum));
        System.out.println(Arrays.toString(vdiff));
        System.out.println(Arrays.toString(vmult));
    }   
}