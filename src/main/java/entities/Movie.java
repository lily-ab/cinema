package entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMovie;
    @Column(name = "name")
    private String name;
    @Column(name="genre")
    private String genre;
    @Column(name="dateOfStart")
    private Date dateOfStart;
    @Column(name = "dateOfFinish")
    private Date dateOfFinish;
    @Column(name = "duration")
    private int duration;
    @Column(name = "picture")
    private String picture;
    @Column(name="description")
    private String description;
    @Column(name = "isActive")
    private boolean isActive;

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Date getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(Date dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString(){
        return "Movie: "+ name+", genre: "+ genre+", starts on "+dateOfStart+",\n ends on "+dateOfFinish
                +" \n description: "+description;
    }
}
