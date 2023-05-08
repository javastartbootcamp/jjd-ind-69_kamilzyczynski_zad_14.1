import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        try {
            List<Integer> integers = fileUtils.readFile("liczby.txt");

            Set<Integer> uniqueNumbers = new TreeSet<>();

            for (Integer integer : integers) {
                uniqueNumbers.add(integer);
            }

            for (Integer uniqueNumber : uniqueNumbers) {
                int counter = 0;
                for (Integer integer : integers) {
                    if (Objects.equals(uniqueNumber, integer)) {
                        counter++;
                    }
                }
                System.out.println(uniqueNumber + " - liczba wystąpień " + counter);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się wczytać pliku");
        }
    }
}
