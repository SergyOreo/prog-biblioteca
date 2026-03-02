public class Libro {
    // Atributos de la clase Libro
    private int id;
    private String titulo;
    private String autor;
    private int numPaginas;

    /**
     * Constructor de clase Libro
     * @param id identificador
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param numPaginas número de páginas del libro
     */
    public Libro(int id, String titulo, String autor, int numPaginas) { // parámetros del metodo
        // Variable del metodo
        int numHojas;

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;

        numHojas = numPaginas/2;
    }

    /**
     * Conseguir el ID del libro
     * @return int id del libro
     */
    public int getId() {
        return id;
    }

    /**
     * Conseguir el título del libro
     * @return String titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Conseguir el autor del libro
     * @return String autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Conseguir el número de páginas del libro
     * @return int NumPaginas
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    /**
     * toString de clase Libro
     * @return
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Libro {");

        sb.append(String.format("id : %d;" , id));
        sb.append(String.format("titulo : %s;" , titulo));
        sb.append(String.format("autor : %s;" , autor));
        sb.append(String.format("numPaginas : %d;" , numPaginas));
        sb.append("}");

        return sb.toString();
    }
}
