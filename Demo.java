public class Demo {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.height = 4;
        t.base = 3;
        double area = t.FindArea();
        System.out.println("Area is : "+area);
        double hypo = t.FindHypotenuse();
        System.out.println("Hypo is : "+hypo);
        double perimeter = t.FindPerimeter();
        System.out.println("Perimeter is : "+perimeter);
    }
}
