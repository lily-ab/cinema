package com.lab4nc.cinema.DAL.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reservation", schema = "cinemadb", catalog = "")
public class ReservationEntity {
    private int idreservation;
    private SeanceEntity seanceByIdSeance;
    private SeatEntity seatByIdSeat;

    @Id
    @Column(name = "idreservation", nullable = false)
    public int getIdreservation() {
        return idreservation;
    }

    public void setIdreservation(int idreservation) {
        this.idreservation = idreservation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationEntity that = (ReservationEntity) o;
        return idreservation == that.idreservation;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idreservation);
    }

    @ManyToOne
    @JoinColumn(name = "idSeance", referencedColumnName = "idseance", nullable = false)
    public SeanceEntity getSeanceByIdSeance() {
        return seanceByIdSeance;
    }

    public void setSeanceByIdSeance(SeanceEntity seanceByIdSeance) {
        this.seanceByIdSeance = seanceByIdSeance;
    }

    @ManyToOne
    @JoinColumn(name = "idSeat", referencedColumnName = "idseat", nullable = false)
    public SeatEntity getSeatByIdSeat() {
        return seatByIdSeat;
    }

    public void setSeatByIdSeat(SeatEntity seatByIdSeat) {
        this.seatByIdSeat = seatByIdSeat;
    }
}
