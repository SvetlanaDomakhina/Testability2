public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double massKg = 98;
        double heightM = 1.87;

        double myBmi = service.calculate(massKg, heightM);
        int bmi = (int) myBmi;
        System.out.println(bmi);
    }
}
