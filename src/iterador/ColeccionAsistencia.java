package iterador;

import interfaces.Agregado;
import interfaces.Iterator;
import model.RegistroAsistencia;

public class ColeccionAsistencia implements Agregado {

    private RegistroAsistencia[] registros;
    private int indice = 0;

    public ColeccionAsistencia() {
        registros = new RegistroAsistencia[100];
    }

    public void agregarRegistro(RegistroAsistencia registro) {
        if (indice < registros.length) {
            registros[indice] = registro;
            indice++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(registros);
    }
}