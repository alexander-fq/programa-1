public class Main{
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("pelicula: Matrix ");
        
        int fechaDeLanzamiento = 1999;
        System.out.println(fechaDeLanzamiento);
        boolean incluidoEnElPan = true;
        double notaPelicula = 9.2;

        double promedioPelicula = (8.2 + 6.2 + 4.1) / 3;
        System.out.println(promedioPelicula);

        String sinopsis = """
                la pelicula Matrix fue la mejor pelicula del fin del milenio 
                fue lanzada en:
                """ + fechaDeLanzamiento;

        System.out.println(sinopsis);  
        
        
    }
    
}  