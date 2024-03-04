public class FartoCel {

    public static float fahToCel(float fah) {
        return (float) ((fah - 32) * 5 / 9);
    }

    public static float kelvintoCel(float kel) {
        return (float) (kel - 273.15);
    }

    public static float kelvintoFahrenreit(float kelvin) {
        return (float) (kelvin - 273.15) * 9 / 5 + 32;
    }
}