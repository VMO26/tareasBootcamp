import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
    //Los set o conjuntos no permiten duplicado y no tienen un orden preestablecido
    Set<String> peliculas = new java.util.HashSet<>();
        System.out.println(peliculas);
    //Proceso para agregar valores al conjunto.
    peliculas.add("Gladiador");
    peliculas.add("Blade Runner");
    peliculas.add("Shrek");
    peliculas.add("Top Gun");
    System.out.println(peliculas);
    // Remover elementos
        peliculas.remove("Shrek");
        System.out.println(peliculas);
    //Obtener algun elemento
        //Verificar existencia
        if (peliculas.contains("Shrek")){
            System.out.println("Shrek");
        }
    for ( String pelicula : peliculas ) {
        if (pelicula.equals("Shrek")){
        String peliculaFavorita = pelicula;
        }
        System.out.println("Su pelicula favorita es " + peliculaFavorita);
    }
    }
}
