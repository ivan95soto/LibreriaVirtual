package libreriaVirtual;

import java.time.LocalDate;

public class Libro extends ProductoLibreria {

    private String titulo ;
    private String autor;
    private String editorial;
    
    public Libro(LocalDate fechaPublicacion, int codigo, String titulo, String autor, String editorial) {
        super(fechaPublicacion, codigo);
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    


}
