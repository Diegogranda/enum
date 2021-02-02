import java.util.*;
public class EnumTest {
    public Scanner scanner = new Scanner(System.in);
    public String consola = scanner.nextLine();

    public enum Colores {ROJO, AZUL, VERDE}

    ;
    public String str;
//constructor
    public EnumTest() {}
    //getters y setters

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    //metodos
    public String DameColor(){
        if (Colores.ROJO.equals(consola)) {
            str="gallina";

        }else if (Colores.AZUL.equals(consola)){
            str= "perro";

        }else if (Colores.VERDE.equals(consola)){
            str="caballo";

        }else {
            str="El animal eres tú";

        }
    return str;}
}

