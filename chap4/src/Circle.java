package src;

public class Circle {     // Circle 클래스의 객체 생성 및 활용 //
    int radius;
    String name;

    public Circle() { }

    public double getArea() {
        return 3.14*radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza ;
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "Pizza";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.name = "자바도넛";
        donut.radius = 2 ;
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}