import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;


public class Writer {

    public static void writeInformation(File target) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(target);
        String text;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите необходимые данные (для выхода из цикла введите !q): ");
            text = scanner.nextLine();
            if (text.equals("!q")){
                break;
            }
            writer.println(text);
        } while (true);
        writer.close();
    }

}
