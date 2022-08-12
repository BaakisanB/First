public class Temperature {
    public static void main(String[] args) {
        double f = 98.7;
        double c = 23.6;

        double ftoc = (f-32) / 9 * 5;
        double ctof = c / 5 *9 + 32;

        System.out.println("Fahrenheit value before converting to celsius is : "+f);
        System.out.println("Fahrenheit value after converting to celsius is : "+c);
        System.out.println("Celsius value before converting to fahrenheit is : "+ftoc);
        System.out.println("Celsius value after converting to fahrenheit is : "+ctof);
    }
}
