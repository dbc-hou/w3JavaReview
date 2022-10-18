import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Scanner;
import java.time.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    int x = 5;
    final int y = 3;
    String fname = "David";
    String lname = "Collins";
    int age = 59;
    static ArrayList<String> cars = new ArrayList<String>();
    static LinkedList<String> dogs = new LinkedList<String>();
    static HashMap<String, String> capitalCities = new HashMap<String, String>();
    static HashSet<String> uniqueThings = new HashSet<String>();

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        testHashSet();
    }

    static void mainSecondMethod() {
        System.out.println("Greetings from H-Town!");
    }

    public void mainThirdMethod() {
        System.out.println("Greetings from Clutch City!");
    }

    public static void testEnums() {
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }

    public static void testScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");

        String userName = sc.nextLine();
        System.out.println("Welcome back, " + userName + "!");

        System.out.println("What is your age in years? (No fractions or decimals, please.)");
        int age = sc.nextInt();

        System.out.println("And what is your current annual salary?");
        double salary = sc.nextDouble();

        int dogYears = age * 7;
        System.out.println("Your age in dog years is " + dogYears);

        double monthly = salary / 12;
        System.out.println("Your monthly compensation is " + monthly);
    }

    public static void testDates() {
        LocalDate myDate = LocalDate.now();
        System.out.println("Date = " + myDate);

        LocalTime myTime = LocalTime.now();
        System.out.println("Time = " + myTime + " CDT");

        LocalDateTime myDateAndTime = LocalDateTime.now();
        System.out.println("Exact moment in history = " + myDateAndTime);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateAndTime.format(myFormatObj);
        System.out.println("Formatted version = " + formattedDate);
    }

    public static void testArrayList() {
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("ZENN");
        System.out.println(cars.get((int) (Math.random() * cars.size())));
        cars.set(0, "Opel");
        System.out.println("Adding Opel to the list. There are now " + cars.size() + " cars listed:");
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(">> " + i);
        }
    }

    public static void testLinkedList() {
        dogs.add("Fluffy");
        dogs.add("Bingo");
        dogs.add("Lassie");
        dogs.add("Tomfoolery's Grand Champion Sir Yongy Bongy Bo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to add another dog? Y/N");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("Y")) {
            System.out.println("What's the dog's name?");
            String newDog = sc.nextLine();
            dogs.addLast(newDog);
            System.out.println("Here is the current list of dogs:");
            for (String j : dogs) {
                System.out.println(">> " + j);
            }
        } else {
            System.out.println("Thank you for playing.");
        }
    }

    public static void testHashMap() {
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Laos", "Vientiane");
        capitalCities.put("Cote d'Ivoire", "Yamoussoukro");

        for (String i : capitalCities.keySet()) {
            String qPrompt = "What is the capital of " + i + "?";
            System.out.println(qPrompt);
            Scanner sc = new Scanner(System.in);
            String capitalAnswer = sc.nextLine();
            while (!(capitalAnswer.equalsIgnoreCase(capitalCities.get(i)))) {
                System.out.println("Sorry, that's not correct. Try again? Y/N");
                String yesNo1 = sc.nextLine();
                if (yesNo1.equalsIgnoreCase("N")) {
                    break;
                } else if (yesNo1.equalsIgnoreCase("Y")) {
                    System.out.println(qPrompt);
                }
            }
            System.out.println("Very good! Continue? Y/N");
            String yesNo2 = sc.nextLine();
            if (yesNo2.equalsIgnoreCase("N")) {
                System.out.println("Thank you for playing! Goodbye.");
                break;
            }
        }
    }

    public static void testHashSet() {
        uniqueThings.add("Grand Canyon");
        uniqueThings.add("Hanging Gardens");
        uniqueThings.add("Great Wall of China");
        uniqueThings.add("Orange Show");
        if (!(uniqueThings.contains("Kayleen's Brownies"))) {
            uniqueThings.add("Kayleen's Brownies");
        }
        for (String k : uniqueThings) {
            System.out.println(k);
        }
    }
}
