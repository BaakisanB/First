public class FindAverage {
    public static void main(String[] args) {
        double x,y,z;
        x = 10;
        y = 5;
        z = 15;

        double ans = calcAvg(x,y,z); 
        System.out.println("Average is : "+ans);
    }

    public static double calcAvg(double a, double b, double c) {
        double calcAvg = (a + b + c) / 3;
        return calcAvg;
    }
}
