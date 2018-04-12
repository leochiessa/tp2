package sensores;

import java.util.Observable;

public class Auto extends Observable {

    int aceite = 0;
    int presion = 0;
    int agua = 0;

    public void setAceite(int aceite) {
        int atributo = 0;
        int anterior = this.aceite;
        this.aceite = aceite;
        setChanged();
        this.notifyObservers(anterior);
    }

    public int getAceite() {
        return this.aceite;
    }

    public void setPresion(int presion) {
        int anterior = this.presion;
        this.presion = presion;
        setChanged();
        this.notifyObservers(anterior);
    }

    public int getPresion() {
        return this.presion;
    }

    public void setAgua(int agua) {
        int anterior = this.agua;
        this.agua = agua;
        setChanged();
        this.notifyObservers(anterior);
    }

    public int getAgua() {
        return this.agua;
    }
}
