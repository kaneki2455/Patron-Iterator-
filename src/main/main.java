package main;

import iterador.ColeccionAsistencia;
import interfaces.Iterator;
import model.RegistroAsistencia;

public class Main {

    public static void main(String[] args) {

        ColeccionAsistencia coleccion = new ColeccionAsistencia();

        coleccion.agregarRegistro(new RegistroAsistencia("12345678", "Juan Pérez", "13/06/2025", "08:35", 5));
        coleccion.agregarRegistro(new RegistroAsistencia("87654321", "María López", "13/06/2025", "09:10", 40));
        coleccion.agregarRegistro(new RegistroAsistencia("11223344", "Carlos Ruiz", "13/06/2025", "08:05", 5));
        coleccion.agregarRegistro(new RegistroAsistencia("44332211", "Ana Torres", "13/06/2025", "08:50", 20));

        Iterator iterator = coleccion.createIterator();

        System.out.println("=== REPORTE DE TARDANZAS ===");
        while (iterator.hasNext()) {
            RegistroAsistencia r = (RegistroAsistencia) iterator.next();
            if (r.getMinutosRetraso() > 0) {
                System.out.println("DNI: " + r.getDni() +
                        " | Nombre: " + r.getNombre() +
                        " | Fecha: " + r.getFechaIngreso() +
                        " | Hora: " + r.getHoraIngreso() +
                        " | Retraso: " + r.getMinutosRetraso() + " min");
            }
        }
    }
}