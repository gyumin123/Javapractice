package src;

public class Book { /*생성자 선언 및 활용연습 */
    String title;
    String author;

    public Book(String t) {
        title = t;
        author = "작자미상";
    }

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public static void main(String [] args) {
        Book littleprince = new Book("어린왕자", "생택쥐페리");

        Book lovestory = new Book("춘향전");

        System.out.println( littleprince.title + " " + littleprince.author);
        System.out.println(lovestory.title + " " + lovestory.author);
    }
}
