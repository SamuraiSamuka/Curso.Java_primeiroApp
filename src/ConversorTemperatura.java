public class ConversorTemperatura {
    public static void main(String[] args) {
        int temp = (int) ConversorTemperatura.celsiusToFahrenheit(32);
        System.out.println(temp);
    }
    public static double celsiusToFahrenheit(double temperatura) {
        return ((temperatura * 1.8) + 32);
    }
}
