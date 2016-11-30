package PersonajesWoW;
import java.util.Scanner;
/**
 *
 * @author jorgeubuntu
 */
public class Principal {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    Personaje prueba = new Personaje("Prueba", 1, 1, "Bastón", "Prueba", "P", "P", 10,1000);
    Chaman vagabondsoul = new Chaman(150, 220000, "Vagabondsoul", 1, 1, "Bastón", "Draenei", "Chamán", "Mejora", 200, 2000);
    Mago psicoloca = new Mago(300000, 5, "Psicóloca", 1, 1, "Varita", "Humana", "Mago", "Escarcha", 200, 2000);
    int contador=1;
    while (vagabondsoul.vida>0 && psicoloca.vida>0) {
      int movimientoChaman = (int) ((3)*Math.random()+1);
      switch (movimientoChaman) {
        case 1:
          vagabondsoul.descargaRelampados(200);
          psicoloca.vida -= vagabondsoul.danio;
          break;
        case 2:
          vagabondsoul.formaLobo();
          vagabondsoul.vida += 100;
          break;
        case 3:
          System.out.println(vagabondsoul.nombre +" se despistó y pasó su turno.");
          break;
      }
      int movimientoMago = (int) ((3)*Math.random()+1);
      switch (movimientoMago) {
        case 1:
          psicoloca.descargaEscarcha(200);
          vagabondsoul.vida -= psicoloca.danio;
          break;
        case 2:
          psicoloca.mesaRefrigerios(200);
          psicoloca.vida += 100;
          break;
        case 3:
          System.out.println(psicoloca.nombre +" se despistó y pasó su turno.");
          break;
      }
      System.out.println("Final del turno " +contador);
      System.out.println("Vida de Vagabondsoul: " +vagabondsoul.vida);
      System.out.println("Vida de Psicóloca: " +psicoloca.vida);
      contador++;
      System.out.println("Pulse enter para continuar: ");
      String enter = teclado.nextLine();
    }
    if (vagabondsoul.vida>0){
      System.out.println("Vagabondsoul ganó la batalla.");
    }else{
      System.out.println("Psicóloca ganó la batalla.");
    }
  }
}
