public class Practice {

    public static void main(String[] args) {
        Dog doggie1 = new Dog("Buddy");
        Dog doggie2 = new Dog("Ruby", 13, 10, 5);

        System.out.println("Doggie one is called " + doggie1.getName());
        System.out.println("Doggie two is called " + doggie2.getName());
        System.out.println("Is doggie one okay? " + doggie1.getIsOkay() );
        System.out.println("Doggie's one colour is " + doggie1.colour);

        System.out.println("We have " + doggie2.getCounter() + " dogs");
        System.out.println("We have " + Dog.getCounter() + " dogs");

        System.out.println(doggie1);

        Cat kitty1 = new Cat("Roger", 10, 10, 10);
        System.out.println("Cat one is called "+ kitty1.getName());
        kitty1.setName( "");
        kitty1.setName("Bob");
        System.out.println("Cat one is now called "+ kitty1.getName());

        //Animal animal = new Animal("Animal", 10, 15, 40);
        //System.out.println("Hi, I'm super generic animal " + animal.getName());

        sayHello(kitty1);
        //sayHello(doggie1);

        Animal cat = new Cat("Betty", 10, 10 , 30);
        //cat.talk();
        //cat.talk("Martina");
        if ( cat instanceof Cat){
            Cat newCat = (Cat) cat;
            System.out.println(newCat.purr());
        }

        System.out.println("***************************");
        ITalk[] talkative = new ITalk[2];
        talkative[0] = kitty1;
        talkative[1] = doggie1;
        for (int i =0; i<talkative.length; i++){
            System.out.println(talkative[i].talk());
        }

        System.out.println("**************************");
        Animal[] animals = new Animal[2];
        animals[0] = kitty1;
        animals[1] = doggie1;
        for (int i =0; i<animals.length; i++){
            System.out.println(animals[i].getName());
        }

    }

    public static void sayHello( ITalk animal){
        System.out.println("This is what this animal says: " + animal.talk());
    }
}
