package model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Owner {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    private String firstName, secondName;
    @ManyToMany(
            fetch = FetchType.
                    LAZY,cascade = CascadeType.ALL
    )
    private List<Car> cars =new ArrayList<Car>();

    public Owner(String firstName, String secondName, List<Car> cars) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.cars = cars;
    }

    public Owner(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Owner() {
    }
}
