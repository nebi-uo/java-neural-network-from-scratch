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

    public static double magnitude(double[] u) {
        double magnitude = 0.0;
        int vectorLength = u.length; 
        double tempNum = 0;

        for (int i = 0; i < vectorLength; i++) {
            double tempNum2 = u[i]*u[i];

            tempNum = tempNum + tempNum2;
        }

        magnitude = Math.sqrt(tempNum);

        return magnitude;
    }

    public static double[] normalize(double[] u) {
        double[] normal = new double[u.length];
        double mag = Vector_Engine.magnitude(u);
        int vectorLength = u.length;
        
        for (int i = 0; i < vectorLength; i++) {
            normal[i] = u[i] / mag;
        }

        return normal;
    }

    public static double dot(double[] u, double[] v){
        double product = 0.0;
        int vectorLength = u.length;

        for (int i = 0; i < vectorLength; i++) {
            double tempNum = u[i] * v[i];

            product = product + tempNum;
        }

        return product;
    }

    public static boolean isOrthogonal(double[] u, double[] v) {
        boolean isOrthogonal = false;
        double dot = Vector_Engine.dot(u, v);

        if (dot == 0) {
            isOrthogonal = true;
            return isOrthogonal;
        }
        else{
            return isOrthogonal;
        }
    }

    // Projection of vector u onto vector v
    public static double[] proj(double[] u, double[] v) {
        double[] projection = new double[u.length];
        double dot = Vector_Engine.dot(u, v);
        double magnitude = Vector_Engine.magnitude(v);
        int vectorLength = u.length;

        double tempNum = dot / (magnitude * magnitude);

        for (int i = 0; i < vectorLength; i++) {
            projection[i] = v[i] * tempNum;
        }

        return projection;
    }

    /*public static double[] linearCombination() {
        
    }*/

    public static void main (String[] args) {
        double scalar = 2;
        double[] v1 = {2, 4, 3};
        double[] v2 = {3, 4, 2};

        double[] vsum = Vector_Engine.add(v1, v2);
        double[] vdiff = Vector_Engine.subtract(v1 , v2);
        double[] vmult = Vector_Engine.scale(v1, scalar);
        double vmag = Vector_Engine.magnitude(v1);
        double[] vnorm = Vector_Engine.normalize(v1);
        double vdot = Vector_Engine.dot(v1, v2);
        boolean vorth = Vector_Engine.isOrthogonal(v1, v2);
        double[] vproj = Vector_Engine.proj(v1, v2);

        System.out.println(Arrays.toString(vsum));
        System.out.println(Arrays.toString(vdiff));
        System.out.println(Arrays.toString(vmult));
        System.out.println(vmag);
        System.out.println(Arrays.toString(vnorm));
        System.out.println(vdot);
        System.out.println(vorth);
        System.out.println(Arrays.toString(vproj));
    }   
}