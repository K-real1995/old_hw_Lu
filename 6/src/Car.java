import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int speed;
    public int horsePower;

    public Car(String brand, String model, String color, int speed, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHorsePower() {
        return horsePower;
    }


    public static void saveToFile(String filename, String text, boolean append) throws IOException {
        File file1 = new File(filename);

        FileWriter fw = new FileWriter(file1, append);

        PrintWriter pw = new PrintWriter(fw);

        pw.println(text);

        pw.close();

    }

    public static ArrayList<Car> readCarsFromFile(File target) throws FileNotFoundException {
        Scanner s = new Scanner(target);

        ArrayList<Car> carList = new ArrayList<>();

        while (s.hasNextLine()){
            String line = s.nextLine();
            String[] items = line.split(",");

            String brand = items[0];
            String model = items[1];
            String color = items[2];
            int speed = Integer.parseInt(items[3]);
            int horsePower = Integer.parseInt(items[4]);


            Car newCar = new Car(brand, model, color,speed, horsePower);
            carList.add(newCar);
        }
        return carList;
    }

}


