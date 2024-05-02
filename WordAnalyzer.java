import java.util.*;

class WordAnalyzer {
    public Map<String, Integer> countWordFrequencies(String[] plantArray) {
        Map<String, Integer> plantFood = new HashMap<>();
        for (String word : plantArray) {
            plantFood.put(word, plantFood.getOrDefault(word, 0) + 1);
        }
        return plantFood;
    }

    public void findLongestWords(String[] plantArray, List<String> theLongestWords) {
        int maxWordLength = 0;
        for (String word : plantArray) {
            int wordLength = word.length();
            if (wordLength > maxWordLength) {
                theLongestWords.clear();
                maxWordLength = wordLength;
                theLongestWords.add(word);
            } else if (wordLength == maxWordLength && !theLongestWords.contains(word)) {
                theLongestWords.add(word);
            }
        }
    }

    public static void printWordFrequencies(Map<String, Integer> plantFood) {
        for (Map.Entry<String, Integer> entry : plantFood.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}