package com.lab4nc.cinema.DAL.Entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "seance", schema = "cinemadb", catalog = "")
public class SeanceEntity {
    private int idseance;
    private Date date;
    private Time time;
    private Collection<ReservationEntity> reservationsByIdseance;
    private HallEntity hallByIdHall;
    private MovieEntity movieByIdMovie;

    @Id
    @Column(name = "idseance", nullable = false)
    public int getIdseance() {
        return idseance;
    }

    public void setIdseance(int idseance) {
        this.idseance = idseance;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeanceEntity that = (SeanceEntity) o;
        return idseance == that.idseance &&
                Objects.equals(date, that.date) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idseance, date, time);
    }

    @OneToMany(mappedBy = "seanceByIdSeance")
    public Collection<ReservationEntity> getReservationsByIdseance() {
        return reservationsByIdseance;
    }

    public void setReservationsByIdseance(Collection<ReservationEntity> reservationsByIdseance) {
        this.reservationsByIdseance = reservationsByIdseance;
    }

    @ManyToOne
    @JoinColumn(name = "idHall", referencedColumnName = "idhall", nullable = false)
    public HallEntity getHallByIdHall() {
        return hallByIdHall;
    }

    public void setHallByIdHall(HallEntity hallByIdHall) {
        this.hallByIdHall = hallByIdHall;
    }

    @ManyToOne
    @JoinColumn(name = "idMovie", referencedColumnName = "idMovie", nullable = false)
    public MovieEntity getMovieByIdMovie() {
        return movieByIdMovie;
    }

    public void setMovieByIdMovie(MovieEntity movieByIdMovie) {
        this.movieByIdMovie = movieByIdMovie;
    }
}
