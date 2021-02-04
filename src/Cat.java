public class  Cat extends Animal implements ITalk{

    //overRIDING
    @Override
    public void setName(String name){
        super.setName(name);
        if ( name.length() > 4){
            this.name = name;
        }
    }

    public Cat(String name, int weight, int height, int age){
        super(name, weight, height, age);
    }


    public String talk(){
        return "meow meow";
    }

    public String purr(){
        return "purr purr";
    }

    //overLOADING
    public String purr(String word){
        return "purr purr" + word;
    }

    public String talk(String word1){
        return word1;
    }
}
