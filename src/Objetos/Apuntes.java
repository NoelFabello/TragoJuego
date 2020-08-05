/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import Nucleo.Estados;
import
        Personajes.Javier;
import Nucleo.Objeto;
import Nucleo.Personaje;
/**
 *
 * @author Noel
 */
public class Apuntes extends Objeto{
    public Apuntes(String nombre, String descripcion, boolean usado, int ataque, int modataque, int modataqueRival, int modarmadura, int modarmaduraRival, int precision, int modprecision, int modprecisionRival, int modvelocidad, int modvelocidadRival, int modvida, Estados estado) {
        super("Apuntes", "", false, ataque, modataque, modataqueRival, modarmadura, modarmaduraRival, precision, modprecision, modprecisionRival, modvelocidad, modvelocidadRival, modvida, estado);
    }
}
