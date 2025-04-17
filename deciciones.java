public class deciciones {
    public static void main(String[] args) {
        
        int fechaDeLanzamiento = 1999;
        System.out.println(fechaDeLanzamiento);
        boolean incluidoEnElPan = false;
        double notaPelicula = 9.2;
        
        String tipoDePlan = "plus";

        if (fechaDeLanzamiento > 2023){
            System.out.println("peliculas mas populares");
        }  
        else{
            System.out.println("peliculas antigas");
        }

        
        if (incluidoEnElPan && tipoDePlan.equals("plus") ){
            System.out.println("Disfrute de su pelicula");
        }
        else{
            System.out.println("pelicula no disponible");
        }
    }
}
