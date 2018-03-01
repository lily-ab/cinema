package com.lab4nc.cinema.DAL.Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "seat", schema = "cinemadb", catalog = "")
public class SeatEntity {
    private int idseat;
    private int number;
    private int price;
    private byte isTaken;
    private Collection<ReservationEntity> reservationsByIdseat;
    private RawEntity rawByIdRaw;

    @Id
    @Column(name = "idseat", nullable = false)
    public int getIdseat() {
        return idseat;
    }

    public void setIdseat(int idseat) {
        this.idseat = idseat;
    }

    @Basic
    @Column(name = "number", nullable = false)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    @Column(name = "price", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "isTaken", nullable = false)
    public byte getIsTaken() {
        return isTaken;
    }

    public void setIsTaken(byte isTaken) {
        this.isTaken = isTaken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeatEntity that = (SeatEntity) o;
        return idseat == that.idseat &&
                number == that.number &&
                price == that.price &&
                isTaken == that.isTaken;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idseat, number, price, isTaken);
    }

    @OneToMany(mappedBy = "seatByIdSeat")
    public Collection<ReservationEntity> getReservationsByIdseat() {
        return reservationsByIdseat;
    }

    public void setReservationsByIdseat(Collection<ReservationEntity> reservationsByIdseat) {
        this.reservationsByIdseat = reservationsByIdseat;
    }

    @ManyToOne
    @JoinColumn(name = "idRaw", referencedColumnName = "idraw", nullable = false)
    public RawEntity getRawByIdRaw() {
        return rawByIdRaw;
    }

    public void setRawByIdRaw(RawEntity rawByIdRaw) {
        this.rawByIdRaw = rawByIdRaw;
    }
}
