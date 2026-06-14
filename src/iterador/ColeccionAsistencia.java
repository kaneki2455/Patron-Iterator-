package iterador;

import Interface.Iterable;
import Interface.Iterador;
import model.RegistroAsistencia;

public class ColeccionAsistencia implements Iterable {

    private RegistroAsistencia[] registros;
    private int indice = 0;

    public ColeccionAsistencia() {
        registros = new RegistroAsistencia[10];
    }

    public void agregarRegistro(RegistroAsistencia registro) {
        if (indice < registros.length) {
            registros[indice] = registro;
            indice++;
        }
    }

    @Override
    public Iterador crearIterador() {
        return new ArrayIterator(registros);
    }
}
