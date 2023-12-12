package fr.TP2;

public class Thermometre {
    private double tempCelsius;

    public Thermometre() {
        this.tempCelsius = 0;
    }

    public Thermometre(double inputTempCelsius) {
        this.tempCelsius = inputTempCelsius;
    }

    public double getTempCelsius() {
        return tempCelsius;
    }

    public void setTempCelsius(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public double getTempKelvin() {
        return tempCelsius + 273.15;
    }

    public void setTempKelvin(double inputTempKelvin) {
        this.tempCelsius = inputTempKelvin + 273.15;
    }

    public double getTempFahrenheit() {
        return (tempCelsius * 1.8) + 32;
    }

    public void setTempFahrenheit(double inputTempFahrenheit) {
        this.tempCelsius = (inputTempFahrenheit * 1.8) + 32;
    }

    public static void main(String[] args) {
        Thermometre thermometre = new Thermometre();
        thermometre.setTempCelsius(11.0);
        System.out.println(thermometre.getTempCelsius());
        System.out.println(thermometre.getTempKelvin());
        System.out.println(thermometre.getTempFahrenheit());
        thermometre.setTempFahrenheit(250);
        System.out.println(thermometre.getTempCelsius());
    }
}
