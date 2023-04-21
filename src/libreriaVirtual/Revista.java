package libreriaVirtual;

import java.time.LocalDate;

public class Revista extends ProductoLibreria {
    
    private String nombre ;
    private String editor;
    
    public Revista(LocalDate fechaPublicacion, int codigo, String nombre, String editor) {
        super(fechaPublicacion, codigo);
        this.nombre = nombre;
        this.editor = editor;
    }
    
}
