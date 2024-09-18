package Clases;

public class Habitacion {
    private int numeroHabitacion;
    private int cantidadSingle;
    private int cantidadDobles;
    private double precioPorDia;

    public Habitacion(int numeroHabitacion, int cantidadSingle, int cantidadDobles, double precioPorDia) {
        this.numeroHabitacion = numeroHabitacion;
        this.cantidadSingle = cantidadSingle;
        this.cantidadDobles = cantidadDobles;
        this.precioPorDia = precioPorDia;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getCantidadSingle() {

        return cantidadSingle;
    }

    public void setCantidadSingle(int cantidadSingle) {

        this.cantidadSingle = cantidadSingle;
    }

    public int getCantidadDobles() {

        return cantidadDobles;
    }

    public void setCantidadDobles(int cantidadDobles) {

        this.cantidadDobles = cantidadDobles;
    }

    public double getPrecioPorDia() {

        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {

        this.precioPorDia = precioPorDia;
    }

    public int cantidadDePasajeros(int cantidadSingle, int cantidadDobles){
        int cant = cantidadSingle + (cantidadDobles*2);
        return cant;
    }


    @Override
    public String toString() {
        return "Habitaciones{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", cantidadSingle=" + cantidadSingle +
                ", cantidadDobles=" + cantidadDobles +
                ", precioPorDia=" + precioPorDia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        Habitacion habitaciones = (Habitacion) o;
        return numeroHabitacion == this.numeroHabitacion && cantidadSingle == this.cantidadSingle && cantidadDobles == this.cantidadDobles && Double.compare(precioPorDia, this.precioPorDia) == 0;
    }


}
