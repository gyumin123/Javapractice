
public class DoWhileSample {    //a 부터 z 까지의 출력
    public static void main(String[] args) {
        char c = 'a' ;

        do {
            System.out.print(c);
            c = (char) (c + 1);

        } while (c <= 'z');
    }

}
