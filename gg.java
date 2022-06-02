//это супер класс, в который входят два подкласса Cat, Dog

class Animal {
    // здесь задаются одинаковые данные для всех животных, индивидуальные данные задаются в классе для конкретного животного

    public String name;
    public int run;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();

    }
}


//это подкласс Cat, супер класса Animal с наследованием extends
class Cat extends Animal {

    protected boolean swim;
    int jump;

//конструктор Cat

    public Cat(String name, int run, boolean swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Swim:" + swim + " /Jump: " +jump+ " meters/");
    }
}


//это подкласс Dog супер класса Animal с наследованием extends
class Dog extends Animal {

    public double jump;
    public int swim;

    //конструктор Dog

    public Dog(String name, int run, int swim, double jump ) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println("DogName: " + name  + " /RunLimit: " + run+ " meters/" + " /Swim:" + swim + " /Jump: " +jump+ " meters/");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("CatsCategory");
        Cat cat = new Cat("Cat", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Dogs");
        Dog dog = new Dog("Dog", 500, 10, 0.5);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}
