
abstract class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }

    String getName() {
        return name;
    }

    class Dog extends Animal {
        /**
         * Creates a new
         */
        Dog(String name){
            super(name);
        }
       }

    }


class Cat extends Animal {
    /**
     * Creates a new
     */
    Cat(String name){
        super(name);
    }


    /*
     * @return the name of the given animal
     */
    static String getAnimalName(Animal a) {
        String name = null;
        if (a instanceof Dog) {
            name = ((Dog) a).getName();
        } else if (a instanceof Cat) {
            name = ((Cat) a).getName();
        }
        return name;
    }

}
