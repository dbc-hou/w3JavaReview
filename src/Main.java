import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Scanner;
import java.time.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main extends Thread {
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
        String x = reverseString("David Bruce Collins");
        System.out.println(x);
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
                    capitalAnswer = "";
                    System.out.println(qPrompt);
                }
            }
            System.out.println("Very good! Continue? Y/N");
            String yesNo2 = sc.nextLine();
            if (yesNo2.equalsIgnoreCase("N")) {
                System.out.println("Thank you for playing! Goodbye.");
                sc.close();
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
        Iterator<String> it = uniqueThings.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void testWrappers() {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println("My integer is " + myInt.intValue() + ", my double is " + myDouble.doubleValue() + ", and my favorite character is " + myChar.charValue() + ".");
    }

    public static void testExceptions1() {
        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception e) {
            System.out.println("Oops, we got us an error here: " + e.getStackTrace());
        }
        finally {
            System.out.println("The exception was handled.");
        }
    }

    public static void testExceptions2(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 Earth years old!");
        } else {
            System.out.println("Access granted. Welcome aboard.");
        }
    }

    public static void testRegex() {
        Pattern p = Pattern.compile("sch+", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("Visit WSchools!");
        boolean matchFound = m.find();
        if (matchFound) {
            System.out.println("Match found (case-insensitive)");
        } else {
            System.out.println("Match not found.");
        }
    }

    public void run() {
        System.out.println("This code is running in a thread.");
    }

    public static void walk() {
        Main thread = new Main();
        thread.start();
        System.out.println("This code is outside of a thread.");
    }

    public static void testLambda() {
        AtomicInteger start = new AtomicInteger();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            start.addAndGet(n);
            System.out.println(start.get());
        });
    }

    public static String reverseString(String originalString) {
        String rString = "";
        System.out.println("Original string: " + originalString);

        for (int i = 0; i < originalString.length(); i++) {
            rString = originalString.charAt(i) + rString;
        }

        return "Reversed string: " + rString;
    }
}
