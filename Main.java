import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final String PATH = "src/input.txt";
        WordAnalyzer wordAnalyzer = new WordAnalyzer();
        List<String> theLongestWords = new ArrayList<>();

        String inputText = FileReaderUtil.readInputFile(PATH);
        String[] plantArray = inputText.split(" ");

        Map<String, Integer> plantFood = wordAnalyzer.countWordFrequencies(plantArray);
        wordAnalyzer.findLongestWords(plantArray, theLongestWords);

        System.out.println("Количество слов: " + plantArray.length);
        WordAnalyzer.printWordFrequencies(plantFood);
        System.out.println("Самые длинные слова: " + theLongestWords);
    }
}