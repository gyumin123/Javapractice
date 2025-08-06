import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("2개의 정수를 입력받아 합을 출력하는 프로그램");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        System.out.println(i + j);
    }
}


