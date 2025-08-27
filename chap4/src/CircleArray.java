package src;

// circle   객체 배열 만들기

class Circle2 {
    int radius;
    public Circle2(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * 3.14;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        Circle2 [] c = new Circle2[5];
        for (int i = 0; i < c.length; i++)
            c[i] = new Circle2(i);

        for (int i = 0; i < c.length; i++)
            System.out.print((int)(c[i].getArea()) + " ");
    }
}
