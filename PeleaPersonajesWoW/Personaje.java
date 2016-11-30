package PersonajesWoW;

/**
 *
 * @author jorgeubuntu
 */
public class Personaje {
//atributos
  protected String nombre;
  protected int nivelExperiencia;
  protected int nivelEquipo;
  protected String arma;
  protected String raza;
  protected String clase;
  protected String especializacion;
  protected int danio;
  protected int vida;
  
//constructor

  public Personaje(String nombre, int nivelExperiencia, int nivelEquipo, String arma, String raza, String clase, String especializacion, int danio, int vida) {
    this.nombre = nombre;
    this.nivelExperiencia = nivelExperiencia;
    this.nivelEquipo = nivelEquipo;
    this.arma = arma;
    this.raza = raza;
    this.clase = clase;
    this.especializacion = especializacion;
    this.danio = danio;
    this.vida = vida;
  }
//getter and setter
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) { 
    this.nombre = nombre;
  }

  public int getNivelExperiencia() {
    return nivelExperiencia;
  }

  public void setNivelExperiencia(int nivelExperiencia) {
    this.nivelExperiencia = nivelExperiencia;
  }

  public int getNivelEquipo() {
    return nivelEquipo;
  }

  public void setNivelEquipo(int nivelEquipo) {
    this.nivelEquipo = nivelEquipo;
  }

  public String getArma() {
    return arma;
  }

  public void setArma(String arma) {
    this.arma = arma;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getClase() {
    return clase;
  }

  public void setClase(String clase) {
    this.clase = clase;
  }

  public String getEspecializacion() {
    return especializacion;
  }

  public void setEspecializacion(String especializacion) {
    this.especializacion = especializacion;
  }
  
  public int getDanio() {
    return danio;
  }
  
  public void setDanio(int danio) {
    this.danio=danio;
  }
  public int getVida() {
    return vida;
  }
  
  public void setVida(int vida) {
    this.vida=vida;
  }
//método
  public void subidaNivel() {
    nivelExperiencia++;
    System.out.println(this.nombre +" ha subido al nivel " +this.nivelExperiencia);
  }
  public void ataqueBasico() {
    System.out.println(this.nombre +" ha hecho " +this.danio +" de daño con un ataque básico.");
  }
}
