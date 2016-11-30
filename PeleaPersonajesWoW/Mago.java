package PersonajesWoW;

/**
 *
 * @author jorgeubuntu
 */
public class Mago extends Personaje{
//atributos
  private int mana;
  private int fragmentosEscarcha;
//constructor

  public Mago(int mana, int fragmentosEscarcha, String nombre, int nivelExperiencia, int nivelEquipo, String arma, String raza, String clase, String especializacion, int danio, int vida) {
    super(nombre, nivelExperiencia, nivelEquipo, arma, raza, clase, especializacion, danio, vida);
    this.mana = mana;
    this.fragmentosEscarcha = fragmentosEscarcha;
  }
//getter and setter

  public int getMana() {
    return mana;
  }

  public void setMana(int mana) {
    this.mana = mana;
  }

  public int getFragmentosEscarcha() {
    return fragmentosEscarcha;
  }

  public void setFragmentosEscarcha(int fragmentosEscarcha) {
    this.fragmentosEscarcha = fragmentosEscarcha;
  }
//métodos
  public void mesaRefrigerios(int mana){
    System.out.println(this.nombre +" ha creado una Mesa de Refrigerios usando " +mana +" de maná.");
  }
  public void descargaEscarcha(int danio){
    System.out.println(this.nombre +" ha lanzado Descarga de Escarcha haciendo " +danio +" de daño.");
  }
}
