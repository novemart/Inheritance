public class Dog extends Animal implements ITalk{

    private boolean isOkay = true;
    String colour = "black";

    private static int counter;

    public Dog(String name, int height, int weight, int age) {
        super(name, weight, height, age);
        counter ++;
    }

    public String talk(){
        return "woof woof";
    }

    public Dog(String name1) {
        this(name1, 10, 10, 10);
    }


    public boolean getIsOkay(){
        return this.isOkay;
    }

    public static int getCounter(){
        //this.name = "Martina";
        return counter;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", isOkay=" + isOkay +
                ", colour='" + colour + '\'' +
                '}';
    }
}

