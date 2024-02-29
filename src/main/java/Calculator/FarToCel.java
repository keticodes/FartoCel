package Calculator;

public class FartoCel {

    public static float fahToCel(float fah) {
        return (float) ((fah - 32) * 5 / 9);
    }

    public static float kelvintoCel(float kel) {
        return (float) (kel - 273.15);
    }
}