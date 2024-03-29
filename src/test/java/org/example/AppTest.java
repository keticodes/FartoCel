package org.example;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @org.junit.Test
    public void testFahToCel() {
        float fahrenheit = 100;
        float expectedCelsius = (fahrenheit - 32) * 5 / 9; // Calculate expected value manually
        float actualCelsius = App.fahToCel(fahrenheit);

        // Assert that the actual Celsius value is equal to the expected value within a tolerance
        org.junit.Assert.assertEquals(expectedCelsius, actualCelsius, 0.001); // Tolerance of 0.001 degrees Celsius
    }

    @org.junit.Test
    public void testKelvinToCel() {
        float kelvin = 300;
        float expectedCelsius = (float) (kelvin - 273.15); // Calculate expected value manually
        float actualCelsius = App.kelvintoCel(kelvin);

        // Assert that the actual Celsius value is equal to the expected value within a tolerance
        org.junit.Assert.assertEquals(expectedCelsius, actualCelsius, 0.001); // Tolerance of 0.001 degrees Celsius
    }
    @org.junit.Test
    public void testKelvintoFahrenreit() {
        float kelvin = 300;
        float expectedFahrenheit = (float) (kelvin - 273.15) * 9 / 5 + 32; // Calculate expected value manually
        float actualFahrenheit = App.kelvintoFahrenreit(kelvin);
    }
}

