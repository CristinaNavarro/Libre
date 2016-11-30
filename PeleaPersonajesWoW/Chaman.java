package PersonajesWoW;

/**
 *
 * @author jorgeubuntu
 */
public class Chaman extends Personaje {
//atributos
  private int voragine;
  private int mana;
  
//constructor

  public Chaman(int voragine, int mana, String nombre, int nivelExperiencia, int nivelEquipo, String arma, String raza, String clase, String especializacion, int danio, int vida) {
    super(nombre, nivelExperiencia, nivelEquipo, arma, raza, clase, especializacion, danio, vida);
    this.voragine = voragine;
    this.mana = mana;
  }
//getter and setter

  public int getVoragine() {
    return voragine;
  }

  public void setVoragine(int voragine) {
    this.voragine = voragine;
  }

  public int getMana() {
    return mana;
  }

  public void setMana(int mana) {
    this.mana = mana;
  }
//métodos
  public void descargaRelampados(int danio) {
    System.out.println(super.nombre +" hace " +danio +" de daño con la habilidad Descarga de Relámpagos");
  }
  public void formaLobo() {
    System.out.println(super.nombre +" se ha transformado en lobo. Recupera 100 de vida");
  }
  
}
