public class Biblioteca {
    private Libro[] catalogo;

    private final int CANT_MAX_LIBROS;

    public Biblioteca(int cantidad_maxima_libros){
        CANT_MAX_LIBROS = cantidad_maxima_libros;
        catalogo = new Libro[CANT_MAX_LIBROS];
    }

    /**
     * Buscar el libro con el id proporcionado
     * @param idLibro identificador del libro a buscar
     * @return
     */
    public Libro findLibro(int idLibro){
        boolean seguirBuscando = true;
        Libro libroEncontrado = null;

        for (int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if ( catalogo[i] != null && catalogo[i].getId() == idLibro ){
                libroEncontrado = catalogo[i];
                seguirBuscando = false;
            }
        }

        return libroEncontrado;
    }

    /**
     * Busca el primer hueco dentro del catalogo que esté libre
     * @return int posicion del hueco libre, -1 si no hay hueco
     */
    private int buscarPrimerHuecoLibre(){
        int posicionLibre = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if ( catalogo[i] == null ){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }

        return posicionLibre;
    }
}
