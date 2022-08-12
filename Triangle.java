public class Triangle {
        double  height, base, hypotenuse;

    public double FindArea() {
        double area = base * height / 2;
        return area;
    }
    public double FindHypotenuse() {
        double hypo = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        hypotenuse = hypo;
        return hypo;
    }
    public double FindPerimeter() {
        FindHypotenuse();
        double perimeter = base + height + hypotenuse;
        return perimeter;
    }
}
