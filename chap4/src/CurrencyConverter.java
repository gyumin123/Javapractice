import java.util.Scanner;

public class CurrencyConverter{
    private static double rate; // 환율 저장

    public static double toDollar(double won) { // 원화 → 달러
        return won / rate;
    }

    public static double toKRW(double dollar) { // 달러 → 원화
        return dollar * rate;
    }

    public static void setRate(double r) { // 환율 설정
        rate = r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러) >> ");
        double rate = scanner.nextDouble();
        setRate(rate); // 환율 저장

        System.out.println("백만원은 $" + toDollar(1_000_000) + " 입니다.");
        System.out.println("$100는 " + toKRW(100) + " 원입니다.");

        scanner.close();
    }
}
