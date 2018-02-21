package entities;


import javax.persistence.*;

@Entity
@Table(name = "seat")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSeat;
    private int idRaw;
    private  int number;
    private int price;
    private boolean isTaken;

    public int getIdseat() {
        return idSeat;
    }

    public void setIdseat(int idseat) {
        this.idSeat = idseat;
    }

    public int getIdRaw() {
        return idRaw;
    }

    public void setIdRaw(int idRaw) {
        this.idRaw = idRaw;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }
}
