public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
      int weight = 82;
        double height = 1.73;
        double BMI = service.calculate(weight, height);
        System.out.println(BMI);

    }
}