import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        System.out.println(toCalculate());


    }

    private static int toCalculate() {
        int result = 0;
        try {
            Scanner scanner = new Scanner(new File("Puzzle.txt"));

            while (scanner.hasNextLine()) {
                String stringToSearch = scanner.nextLine();
                System.out.println(stringToSearch);


                Pattern integerPattern = Pattern.compile("\\d");
                Matcher matcher = integerPattern.matcher(stringToSearch);

                List<String> integerList = new ArrayList<>();
                while (matcher.find()) {
                    integerList.add(matcher.group());
                }
                System.out.println(integerList);
                int toCalculate = Integer.parseInt(integerList.get(0) + integerList.get(integerList.size()-1));
                System.out.println(toCalculate);
                result += toCalculate;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}