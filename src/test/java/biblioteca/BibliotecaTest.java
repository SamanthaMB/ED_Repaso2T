package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro));
    }

    @Test
    void eliminarLibro() {
       List<Libro> libros = new ArrayList<>();
       libros.add(libro);
       Biblioteca biblio = new Biblioteca(libros);
       assertTrue(biblio.eliminarLibro(libro));
    }

    @Test
    void getLibros() {
        List<Libro> libros = new ArrayList<>();
        libros.add(libro);
        Biblioteca biblio = new Biblioteca(libros);
        //Probar que getLibros devuelve la lista correcta de libros.
        List<Libro> librosDevueltos = biblio.getLibros();
        //Verificar que los libros devueltos son correctos
        assertTrue(librosDevueltos.contains(libro));
    }

    @Test
    void encuentraLibroPorTitulo() {
        List<Libro> listaBuena = new ArrayList<>();
        listaBuena.add(libro);
        Biblioteca biblio = new Biblioteca(listaBuena);

        // Probar que encuentra el libro por el titulo "The Art of Computer Programming"
        Libro libroencontrado = biblio.encuentraLibroPorTitulo("The Art of Computer Programming");

        assertNotNull(libroencontrado, "El libro -The Art of Computer Programming- no se encuentra");

        assertEquals("The Art of Computer Programming", libroencontrado.getTitulo(),"El titulo del libro debe ser -The Art of Computer Programming-");
    }

    @Test
    void encuentaLibroPorAutor() {
    }

    @Test
    void encuentraLibrosPorAutor() {
        List<Libro> listaBuena = new ArrayList<>();
        listaBuena.add(libro);
        Biblioteca biblio = new Biblioteca(listaBuena);

        // Probar el metodo con el autor "Donald Knuth"
        List<Libro> listaTotal = biblio.encuentraLibrosPorAutor("Donald Knuth");

        //Verificar que libro está dentro de la listaTotal
        assertTrue(listaTotal.contains(libro));

        //Verificar el tamaño de la lista es 1
        assertEquals(1, listaTotal.size());

    }
}