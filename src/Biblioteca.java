import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public void prestarLibro (Libro libros){
    }
    public void recibirLibro (Libro libros){
    }

    public Biblioteca() {
        setLibros(new ArrayList<Libro>());
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }






}


