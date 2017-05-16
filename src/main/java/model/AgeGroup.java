package model;

/**
 * Created by Val on 16/05/2017.
 */
public class AgeGroup {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgeGroup(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public AgeGroup(String name) {
        this.name = name;
    }
}
