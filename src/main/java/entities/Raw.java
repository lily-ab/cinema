package entities;

import javax.persistence.*;

@Entity
@Table(name = "raw")
public class Raw {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idraw;
    private  int number;
    private int idHall;

    public int getIdraw() {
        return idraw;
    }

    public void setIdraw(int idraw) {
        this.idraw = idraw;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIdHall() {
        return idHall;
    }

    public void setIdHall(int idHall) {
        this.idHall = idHall;
    }
}
