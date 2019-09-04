package shape;

public class ShapeTest{
    public static void main(String[] args) {
        ShapeObject shape = new ShapeObject();

        System.out.println(shape);

        shape = new ShapeObject("red", false);
        System.out.println(shape+ "\n");

        Circle circle = new Circle();
        System.out.println(circle );
        System.out.println("Area: "+circle.getArea() );
        circle = new Circle(3.5);
        System.out.println(circle);
        circle =new Circle(2.5 , "indigo", false);
        System.out.println(circle+ "\n");

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3 , 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5 , 5.5 , "orange" , true);
        System.out.println(rectangle+"\n");

        Square square = new Square();
        System.out.println(square);
        square = new Square(4);
        System.out.println(square);
        square = new Square(5 , "Red" , false);
    }
}
