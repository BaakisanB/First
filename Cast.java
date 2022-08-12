public class Cast {
    public static void main(String[] args) {
        int x = 5;
        double y = 10.5;

        double xtod = x;
        long xtol = x;
        float xtof = x;
        float ltof = xtol;
        int ytoi = (int) y;
        long ytol = (long) y;

        System.out.println("xtod is : "+xtod);
        System.out.println("xtol is : "+xtol);
        System.out.println("xtof is : "+xtof);
        System.out.println("ltof is : "+ltof);
        System.out.println("ytoi is : "+ytoi);
        System.out.println("ytol is : "+ytol);
    }
}