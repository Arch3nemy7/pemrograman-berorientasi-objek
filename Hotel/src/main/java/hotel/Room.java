package hotel;

import java.io.Serializable;
import java.util.ArrayList;

public class Room implements Serializable {

    String name;
    String contact;
    String gender;
    ArrayList<Food> food = new ArrayList<>();

    public Room() {
        this.name = "-";
        this.contact = "-";
        this.gender = "-";
    }

    public Room(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }
}
