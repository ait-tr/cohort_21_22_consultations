import java.io.*;
import java.util.ArrayList;

public class FileIO {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            // Если хотим добавлять, используйте вариант ниже(с параметром true):
            // BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            String line = "Hello, Michail, Evgeniy, Kirill, Vladimir!";
            writer.write(line);
            writer.write("\nIt is almost Сhristmas!");
            writer.newLine(); // разделитель, чтобы перенести на следующую строку
            writer.write("What a wonderful time of the year.");
            writer.append("Privet");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt")); // можете создать другой txt и читать его
//            // Если хотим вручную  читать по строкам
//            String line1 = reader.readLine();
//            System.out.println(line1);
//            reader.readLine();
//            String line2 = reader.readLine();
//            System.out.println(line2);
            String line = null;
            ArrayList<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lines.add(line);
            }
            reader.close();// закрываем
            System.out.println(lines);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}