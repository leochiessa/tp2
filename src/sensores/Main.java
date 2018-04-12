package sensores;

public class Main {

    public static void main(String[] args) {
        Mecanico mecanico = new Mecanico();
        Auto auto = new Auto();
        auto.addObserver(mecanico);
        auto.setAceite(100);
        auto.setPresion(30);
        auto.setAgua(100);
    }

}