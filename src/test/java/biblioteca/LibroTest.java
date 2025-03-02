package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @Test
    void getTitulo() {
        assertEquals("The Art of Computer Programming", libro.getTitulo(), "Otro Titulo");
    }

    @Test
    void setTitulo() {
        String otroTitulo = "Clean Code";
        libro.setTitulo(otroTitulo);
        assertEquals(otroTitulo, libro.getTitulo(),"The titulo should be the same");
    }

    @Test
    void getAutor() {
    }

    @Test
    void setAutor() {
    }

    @Test
    void getAnioPublicacion() {
    }

    @Test
    void setAnioPublicacion() {
    }
}