public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //bai 1. circle
        Circle circle = new Circle();
        circle.setColor("xanh");
        circle.setRadius(5);
        System.out.println(circle.toString());

        //bai1.cylinder hinh tru
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(8);
        cylinder.setRadius(7);
        System.out.println(cylinder.toString());

        //bai2
        Point2D point2D = new Point2D();
        point2D.setX(20);
        point2D.setY(20);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D();
        point3D.setX(20);
        point3D.setY(20);
        point3D.setZ(30);
        System.out.println(point3D.toString());

        //bai3

        Shape shape = new Shape();
        shape.setColor("red");
        System.out.println(shape.toString());

        Triangle triangle = new Triangle();
        triangle.setColor("blue");
        triangle.setSide1(3);
        triangle.setSide2(5);
        triangle.setSide3(7);
        System.out.println(triangle.toString());

        //bai4
        ArrayCalculator arrayCalculator = new ArrayCalculator();
        int[] arrInt={1,2,3};
        int intSum = ArrayCalculator.sumOfArray(arrInt);
        System.out.println("Tong mang so nguyen la: "+intSum);
        double[] arrDouble={1.2,2.3,3.4};
        double doubleSum = ArrayCalculator.sumOfArray(arrDouble);
        System.out.println("Tong mang so thuc la: "+doubleSum);

        //bai5
        int intMin= ArrayCalculator.minOfArray(arrInt);
        int intMax= ArrayCalculator.maxOfArray(arrInt);
        System.out.println("Gia tri min mang int la: " + intMin);
        System.out.println("Gia tri max mang int la: " + intMax);

        double doubleMin= ArrayCalculator.minOfArray(arrDouble);
        double doubleMax= ArrayCalculator.maxOfArray(arrDouble);
        System.out.println("Gia tri min mang double la: " + doubleMin);
        System.out.println("Gia tri max mang double la: " + doubleMax);
    }
}