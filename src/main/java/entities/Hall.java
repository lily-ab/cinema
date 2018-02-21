package entities;

import javax.persistence.*;

@Entity
@Table(name = "hall")
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idhall;

    private String name;
    private String description;

    public int getIdhall() {
        return idhall;
    }

    public void setIdhall(int idhall) {
        this.idhall = idhall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
