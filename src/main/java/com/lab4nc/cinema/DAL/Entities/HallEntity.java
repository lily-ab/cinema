package com.lab4nc.cinema.DAL.Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "hall", schema = "cinemadb", catalog = "")
public class HallEntity {
    private int idhall;
    private String name;
    private String description;
    private Collection<RawEntity> rawsByIdhall;
    private Collection<SeanceEntity> seancesByIdhall;

    @Id
    @Column(name = "idhall", nullable = false)
    public int getIdhall() {
        return idhall;
    }

    public void setIdhall(int idhall) {
        this.idhall = idhall;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HallEntity that = (HallEntity) o;
        return idhall == that.idhall &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idhall, name, description);
    }

    @OneToMany(mappedBy = "hallByIdHall")
    public Collection<RawEntity> getRawsByIdhall() {
        return rawsByIdhall;
    }

    public void setRawsByIdhall(Collection<RawEntity> rawsByIdhall) {
        this.rawsByIdhall = rawsByIdhall;
    }

    @OneToMany(mappedBy = "hallByIdHall")
    public Collection<SeanceEntity> getSeancesByIdhall() {
        return seancesByIdhall;
    }

    public void setSeancesByIdhall(Collection<SeanceEntity> seancesByIdhall) {
        this.seancesByIdhall = seancesByIdhall;
    }
}
