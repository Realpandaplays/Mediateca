package Clases;

/**
 *
 * @author Laura Pineda
 */
public class MaterialRevistaClases {

    private String idInterno;
    private String titulo;
    private String editorial;
    private String periodicidad;
    private String fechaPubli;
    private int uniDispo;
    
     public MaterialRevistaClases(String idInterno, String titulo, 
             String editorial, String fechaPubli, String periodicidad, int uniDispo){
         
        this.idInterno = idInterno;
        this.titulo = titulo;
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.fechaPubli = fechaPubli;
        this.uniDispo = uniDispo;
        
     }
     
     public String getidInterno() {
        return idInterno;
    }

    public void setidInterno(String idInterno) {
        this.idInterno = idInterno;
    }
    
     public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String geteditorial() {
        return editorial;
    }

    public void seteditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getperiodicidad() {
        return periodicidad;
    }

    public void setperiodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
    
    public String getfechaPubli() {
        return fechaPubli;
    }

    public void setfechaPubli(String fechaPubli) {
        this.fechaPubli = fechaPubli;
    }

     public int getuniDispo() {
        return uniDispo;
    }

    public void setuniDispo(int uniDispo) {
        this.uniDispo = uniDispo;
    }
        
}
