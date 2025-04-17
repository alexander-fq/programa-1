public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEnCelsius = 35.2;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

        System.out.println(mensaje);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);
    }

}