package Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "raw", schema = "cinemadb", catalog = "")
public class RawEntity {
    private int idraw;
    private Integer number;
    private HallEntity hallByIdHall;
    private Collection<SeatEntity> seatsByIdraw;

    @Id
    @Column(name = "idraw", nullable = false)
    public int getIdraw() {
        return idraw;
    }

    public void setIdraw(int idraw) {
        this.idraw = idraw;
    }

    @Basic
    @Column(name = "number", nullable = true)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RawEntity rawEntity = (RawEntity) o;
        return idraw == rawEntity.idraw &&
                Objects.equals(number, rawEntity.number);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idraw, number);
    }

    @ManyToOne
    @JoinColumn(name = "idHall", referencedColumnName = "idhall")
    public HallEntity getHallByIdHall() {
        return hallByIdHall;
    }

    public void setHallByIdHall(HallEntity hallByIdHall) {
        this.hallByIdHall = hallByIdHall;
    }

    @OneToMany(mappedBy = "rawByIdRaw")
    public Collection<SeatEntity> getSeatsByIdraw() {
        return seatsByIdraw;
    }

    public void setSeatsByIdraw(Collection<SeatEntity> seatsByIdraw) {
        this.seatsByIdraw = seatsByIdraw;
    }
}
