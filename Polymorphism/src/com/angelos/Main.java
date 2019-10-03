package com.angelos;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "Not plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
}

public class Main {

    public static void main(String[] args) {
        //for (int i = 1; i < 11; i++) {
        //    Movie movie = randomMovie();
        //    System.out.println("Movie #" + i +
        //            " : " + movie.getName() + "\n" +
        //            "Plot: " + movie.plot() + "\n");
        //}

        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i +
                    " : " + car.getName() + "\n" +
                    "Cylinders: " + car.getCylinders() + "\n" +
                    "Wheels: " + car.getWheels());
            car.startEngine();
            car.accelerate();
            car.brake();
            System.out.println();
        }
    }

    public static Movie randomMovie() {
        int randomNum = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNum);
        switch (randomNum) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
            default:
                return null;
        }
    }

    public static Car randomCar() {
        int randomNum = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNum);
        switch (randomNum) {
            case 1:
                return new Nissan("Juke", 4);
            case 2:
                return new Skoda("Fabia", 3);
            case 3:
                return new Mercedes("Clk240", 6);
            default:
                return null;
        }
    }
}
