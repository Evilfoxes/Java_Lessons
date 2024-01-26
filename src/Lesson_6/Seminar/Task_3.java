import java.util.LocalDate;
import java.util.Set;

public class Task_3 {
    private String name;
    private int age;
    private String poroda;

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPoroda() {
        return poroda;
    }
    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }
    private String owner;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", poroda='" + poroda + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age!= cat.age) return false;
        if (name!= null?!name.equals(cat.name) : cat.name!= null) return false;
        if (owner!= null?!owner.equals(cat.owner) : cat.owner!= null) return false;
        return poroda!= null? poroda.equals(cat.poroda) : cat.poroda == null;
    }
    return false;
    }

}