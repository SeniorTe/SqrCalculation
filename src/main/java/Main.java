import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        int minLimit = 200;
        int maxLimit = 650;

        SQRService service = new SQRService();
        System.out.println(service.calcSqrt(minLimit, maxLimit));
    }
}