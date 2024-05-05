package Clases;

import java.util.List;

/**
 *
 * @author Laura Pineda
 */
public class MaterialCDClases {

    private String idInterno;
    private String titulo;
    private String artista;
    private String genero;
    private String duracion;
    private String numCanciones;
    private String uniDisp;
    
        public MaterialCDClases (String idInterno, String titulo, String artista, String genero, String duracion, String numCanciones, String uniDisp) {
        
            this.idInterno = idInterno;
            this.titulo = titulo;
            this.artista = artista;
            this.genero = genero;
            this.duracion = duracion;
            this.numCanciones = numCanciones;
            this.uniDisp = uniDisp;
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
        
        public String getartista() {
            return artista;
        }
        
        public void setartista(String artista) {
            this.artista = artista;
        }
        
        public String getgenero() {
            return genero;
        }
        
        public void setgenero(String genero) {
            this.genero = genero;
        }
        
        public String getduracion() {
            return duracion;
        }
        
        public void setduracion(String duracion) {
            this.duracion = duracion;
        }
        
        public String getnumCanciones() {
            return numCanciones;
        }
        
        public void setnumCanciones(String numCanciones){
            this.numCanciones = numCanciones;
        }
        
        public String getuniDisp() {
            return uniDisp;
        }
        
        public void setuniDisp(String uniDisp) {
            this.uniDisp = uniDisp;
        }

    public void add(List<MaterialCDClases> materialCDs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
