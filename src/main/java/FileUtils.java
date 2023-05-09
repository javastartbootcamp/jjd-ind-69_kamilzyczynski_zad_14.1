import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    public List<Integer> readFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            Integer nextNumber = scanner.nextInt();
            numbers.add(nextNumber);
        }
        scanner.close();
        return numbers;
    }
}
