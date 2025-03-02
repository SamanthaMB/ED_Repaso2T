package biblioteca;

/**
 * La clase {@code Libro} representa un libro en una biblioteca.
 * Contiene la información básica de un libro, como el título, el autor
 * y el año de publicación. Esta clase permite almacenar y manipular
 * la información relacionada con un libro.
 *
 *
 * @author Samantha Mohedano
 * @version 2.3.2025
 *
 */

public class Libro {

    /**
     * El título del libro.
     */
    private String titulo;
    /**
     * El autor del libro.
     */
    private String autor;
    /**
     * El año de publicación del libro.
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método
    /**
     * Constructor con todo
     * Crea una nueva instancia de {@code Libro} con el título del libro, autor del libro
     * y año de publicación del libro.
     *
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param anioPublicacion El año de publicación del libro.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**
     * Obtiene el año de publicación del libro.
     *
     * @return El año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
