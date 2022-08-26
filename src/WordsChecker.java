import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    private String[] textSplitWord;

    private Set<String> words = new HashSet<>();

    public WordsChecker(String text) {
        this.textSplitWord = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(words, textSplitWord);
    }

    public boolean hasWord(String word) {
        System.out.println(Arrays.toString(textSplitWord));
        System.out.println(words);
        return words.contains(word);
    }
}
