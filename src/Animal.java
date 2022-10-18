interface Animal {
    public abstract void animalSound();
    public void sleep();
    public void run();
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says 'tally-ho!'");
    }

    @Override
    public void sleep() {
        System.out.println("Oinkety-oink-zzzzzz");
    }

    public void run() {
        System.out.println("Running like the ketchup on your scrambled eggs...");
    }
}

class Dog implements Animal {
    public void animalSound() {
        System.out.println("The dog says '23 skidoo!'");
    }

    public void sleep() {
        System.out.println("hnnnnxxxxxx...");
    }

    public void run() {
        System.out.println("Running like the wind...");
    }
}
