package Prototype;

public class Person {
    private float height;
    private float weight;
    private String name;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person clone() {
        Person pClone = new Person();
        pClone.setHeight(this.height);
        pClone.setWeight(this.weight);
        pClone.setName(this.name);

        return pClone;
    }
}
