import java.util.Scanner;

public class SuccessorFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하시오 : ");
        int score = scanner.nextInt();
        if (score >= 80)
            System.out.println("축축");
        scanner.close();

    }
}
