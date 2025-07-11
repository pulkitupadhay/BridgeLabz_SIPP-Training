package Algorithms;

public class WordInSentence {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is powerful.",
            "Python is popular.",
            "C++ is fast."
        };
        System.out.println(findSentenceWithWord(sentences, "popular")); 
    }
}
