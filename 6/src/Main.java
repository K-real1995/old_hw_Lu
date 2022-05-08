import java.io.*;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        Writer.writeInformation(file);


        File csvFile = new File("test.csv");

        String[] headers = {"Name","Last name","Age","Phone number"};
        Human ivan = new Human("Иван", "Иванов", "25", "89127654321");
        Human anton = new Human("Антон", "Антонов", "23", "89214567891");
        Human vasylyi = new Human("Василий", "Васильев", "32", "89216538653");
        Human petr = new Human("Пётр", "Петров", "38", "89765438765");
        Human fedor = new Human("Фёдор", "Федоров", "49", "89763450918");

        String[] data1 = Human.getArrayList(ivan);
        String[] data2 = Human.getArrayList(anton);
        String[] data3 = Human.getArrayList(vasylyi);
        String[] data4 = Human.getArrayList(petr);
        String[] data5 = Human.getArrayList(fedor);

        LinkedList<String[]> writingArr = new LinkedList<>();

        writingArr.add(headers);
        writingArr.add(data1);
        writingArr.add(data2);
        writingArr.add(data3);
        writingArr.add(data4);
        writingArr.add(data5);

        Person.writingCSV(writingArr, csvFile);

        System.out.println(Person.readFile(String.valueOf(csvFile)));

        Car ferarri = new Car("Ferarri", "California","Blue",250,990);
        Car bmw = new Car("BMW", "X6", "White", 190, 360);

        Car[] carsArray = new Car[2];

        carsArray[0] = ferarri;
        carsArray[1] = bmw;
//
        File carsFile = new File("myCars.txt");

        for (int i = 0; i < carsArray.length; i++){
            String outputText = carsArray[i].getBrand() + "," + carsArray[i].getModel() + "," + carsArray[i].getColor() +
                    "," + carsArray[i].getSpeed() + "," + carsArray[i].getHorsePower();

            Car.saveToFile("myCars.txt", outputText, true);
        }

        System.out.println(Car.readCarsFromFile(carsFile));


    }
}


