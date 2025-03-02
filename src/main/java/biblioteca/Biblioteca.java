package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un bliblioteca con una colección de libros
 * Permite agregar, eliminar y buscar libros por titulo y por autor
 *
 * @see Libro
 * @author Samantha Mohedano
 * @version 2.3.2025
 */

public class Biblioteca {

    // TODO: Documentar estos atributos
    /** Lista de libro disponible en la biblioteca */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /** Constructor por defecto de la biblioteca sin libros */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este metodo.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /** Constructor con parámetros
     * @param libros Lista de libros con la que se inicializa la biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Documentar este metodo
    //  Test: Comprobar si se ha agregado
    /** Agrega un libro a la biblioteca
     * @param libro un libro para agregar
     *
     * return {@code true} si el libro se ha agregado correctamente o {@code false} si el libro NO se ha agregado correctamente */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    /** Elimina un libro a la biblioteca
     * @param libro un libro para eliminar
     * return {@code true} si el libro se ha eliminado correctamente o {@code false} si el libro NO se ha eliminado correctamente */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Devuelve la lista de libros de la biblioteca
     * @return lista de libros de la biblioteca
     * */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Encuentra/busca un libro por título
     * @param titulo titulo que quieres buscar
     * @return libro, encuentra un libro por titulo buscado
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * @deprecated Este metodo ha quedado obsoleto
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)} en su lugar
     * @param autor eliges el autor que quieres buscar
     * @return devuelve el libro por el autor buscado
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test 01: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test 02: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Busca los todos libros de un autor determinado
     * @since V2.0
     * Sustituye al metodo {@link #encuentaLibroPorAutor(String)}
     * @param autor autor que quieres buscar
     * @return devuelve el libro por el autor buscado
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}