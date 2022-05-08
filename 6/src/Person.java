import com.opencsv.CSVWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {
    public String name;
    public String lastName;
    public String age;
    public String phoneNumber;


    public Person() {

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public static void writingCSV(LinkedList<String[]> target, File target2) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(target2));
        writer.writeAll(target);
        writer.close();
    }


    public static List<Person> readFile(String fileName) throws IOException {
        List<Person> result = new ArrayList<Person>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {
            String line = br.readLine();
            if (line == null) throw new IllegalArgumentException("File is empty");
            while ((line = br.readLine()) != null) {
                String[] items = line.split(",");
                try {
                    if (items.length > 4) throw new ArrayIndexOutOfBoundsException();
                    Person person = new Person();
                    person.setName(items[0]);
                    person.setLastName(items[1]);
                    person.setAge(items[2]);
                    person.setPhoneNumber(items[3]);
                    result.add(person);
                } catch (ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e) {
                    System.out.println("Invalid line: " + line);
                }
            }
            return result;
        }
    }

}













