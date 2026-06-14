package model;
public  class RegistroAsistencia{
    private String dni;
    private String nombre;
    private String fechaIngreso;
    private String horaIngreso;
    private int minutosRetraso;

    public RegistroAsistencia(String dni, String nombre, String fechaIngreso, String horaIngreso, int minutosRetraso) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.minutosRetraso = minutosRetraso;
    }

    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public String getHoraIngreso() {
        return horaIngreso;
    }
    public int getMinutosRetraso() {
        return minutosRetraso;
    }

}

