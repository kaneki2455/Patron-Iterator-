package iterador;

import Interface.Iterador;
import Interface.Iterador;
import model.RegistroAsistencia;

public class ArrayIterator implements Iterador {

    private RegistroAsistencia[] registros;
    private int posicion = 0;

    public ArrayIterator(RegistroAsistencia[] registros) {
        this.registros = registros;
    }

    @Override
    public boolean hasNext() {
        return posicion < registros.length && registros[posicion] != null;
    }

    @Override
    public Object next() {
        RegistroAsistencia registro = registros[posicion];
        posicion++;
        return registro;
    }
}