package sensores;

import java.util.Observable;
import java.util.Observer;

public class Mecanico implements Observer {

    @Override
    public void update(Observable obs, Object o) {
        int anterior = (int) o;
        if (anterior != ((Auto) obs).getAceite()) {

            System.out.println("Anterior: " + anterior + ", Nuevo: " + ((Auto) obs).getAceite());

        }
        
        if (anterior != ((Auto) obs).getPresion()) {

            System.out.println("Anterior: " + anterior + ", Nuevo: " + ((Auto) obs).getPresion());

        }
        
        if (anterior != ((Auto) obs).getAgua()) {

            System.out.println("Anterior: " + anterior + ", Nuevo: " + ((Auto) obs).getAgua());

        }
    }
}
