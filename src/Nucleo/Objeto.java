 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nucleo;

/**
 *
 * @author Noel
 */
public abstract class Objeto {
    private  String nombre;
    private String descripcion;
    private boolean usado;
    private int ataque;
    private int modataque;
    private int modataqueRival;
    private int modarmadura;
    private int modarmaduraRival;
    private int precision;
    private int modprecision;
    private int modprecisionRival;
    private int modvelocidad;
    private int modvelocidadRival;
    private int modvida;
    private Estados estado;

    public Objeto(String nombre, String descripcion, boolean usado, int ataque, int modataque, int modataqueRival, int modarmadura, int modarmaduraRival, int precision, int modprecision, int modprecisionRival, int modvelocidad, int modvelocidadRival, int modvida, Estados estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usado = usado;
        this.ataque = ataque;
        this.modataque = modataque;
        this.modataqueRival = modataqueRival;
        this.modarmadura = modarmadura;
        this.modarmaduraRival = modarmaduraRival;
        this.precision = precision;
        this.modprecision = modprecision;
        this.modprecisionRival = modprecisionRival;
        this.modvelocidad = modvelocidad;
        this.modvelocidadRival = modvelocidadRival;
        this.modvida = modvida;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getModataque() {
        return modataque;
    }

    public void setModataque(int modataque) {
        this.modataque = modataque;
    }

    public int getModataqueRival() {
        return modataqueRival;
    }

    public void setModataqueRival(int modataqueRival) {
        this.modataqueRival = modataqueRival;
    }

    public int getModarmadura() {
        return modarmadura;
    }

    public void setModarmadura(int modarmadura) {
        this.modarmadura = modarmadura;
    }

    public int getModarmaduraRival() {
        return modarmaduraRival;
    }

    public void setModarmaduraRival(int modarmaduraRival) {
        this.modarmaduraRival = modarmaduraRival;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getModprecision() {
        return modprecision;
    }

    public void setModprecision(int modprecision) {
        this.modprecision = modprecision;
    }

    public int getModprecisionRival() {
        return modprecisionRival;
    }

    public void setModprecisionRival(int modprecisionRival) {
        this.modprecisionRival = modprecisionRival;
    }

    public int getModvelocidad() {
        return modvelocidad;
    }

    public void setModvelocidad(int modvelocidad) {
        this.modvelocidad = modvelocidad;
    }

    public int getModvelocidadRival() {
        return modvelocidadRival;
    }

    public void setModvelocidadRival(int modvelocidadRival) {
        this.modvelocidadRival = modvelocidadRival;
    }

    public int getModvida() {
        return modvida;
    }

    public void setModvida(int modvida) {
        this.modvida = modvida;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    

    
    
    
    
    
}

