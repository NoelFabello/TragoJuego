/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import Nucleo.Estados;
import Personajes.Adri;
import Personajes.Javier;
import Personajes.Peybol;
import Personajes.Noel;
import Personajes.Sulo;
import Nucleo.Objeto;
import Nucleo.Personaje;
/**
 *
 * @author Noel
 */
public class Porro extends Objeto{
    public Porro(String nombre, String descripcion, boolean usado, int ataque, int modataque, int modataqueRival, int modarmadura, int modarmaduraRival, int precision, int modprecision, int modprecisionRival, int modvelocidad, int modvelocidadRival, int modvida, Estados estado) {
        super("Porro", "", false, ataque, modataque, modataqueRival, modarmadura, modarmaduraRival, precision, modprecision, modprecisionRival, modvelocidad, modvelocidadRival, modvida, estado);
    }
}
