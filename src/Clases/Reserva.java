package Clases;
import java.time.LocalDate;
import java.util.Objects;


public class Reserva {
    private LocalDate fechaCheckIn;
    private LocalDate fechaCheckOut;
    private Habitacion habitacion;
    private double senia;
    private Pasajero pasajero;

    public Reserva(LocalDate fechaCheckIn, LocalDate fechaCheckOut, Habitacion habitacion, double senia, Pasajero pasajero) {
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.habitacion = habitacion;
        this.senia = senia;
        this.pasajero = pasajero;
    }

    public LocalDate getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(LocalDate fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public LocalDate getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(LocalDate fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public double getSenia() {
        return senia;
    }

    public void setSenia(double senia) {
        this.senia = senia;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }
        Reserva reserva = (Reserva) o;
        return Double.compare(senia, this.senia) == 0 && Objects.equals(fechaCheckIn, this.fechaCheckIn) && Objects.equals(fechaCheckOut, reserva.fechaCheckOut) && Objects.equals(habitacion, reserva.habitacion) && Objects.equals(pasajero, reserva.pasajero);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fechaCheckIn=" + fechaCheckIn +
                ", fechaCheckOut=" + fechaCheckOut +
                ", habitacion=" + habitacion +
                ", senia=" + senia +
                ", pasajero=" + pasajero +
                '}';
    }
}
