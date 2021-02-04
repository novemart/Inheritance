public abstract class Animal { //final

    protected String name;
    protected int height; //final
    protected int weight;
    protected int age;


    public Animal(String name, int weight, int height, int age) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) { //final
        if (name != "")
            this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }



}
