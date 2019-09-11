package com.tarantsoff.demo;

import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.atomic.LongAdder;
import java.util.regex.Pattern;

public class WordCountDemo {
    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        String text = "one two three three";

        Pattern.compile("\\s+").splitAsStream(text).forEach(wc::recordWord);

        System.out.println(wc);
    }

    private static class WordCounter {
        HashMap<String, LongAdder> wc = new HashMap<>();

        LongAdder getAdder(String word) {
            return Optional.ofNullable(wc.get(word)).orElseGet(() -> {
                LongAdder longAdder = new LongAdder();
                wc.put(word, longAdder);
                return longAdder;
            });
        }

        void recordWord(String word) {
            getAdder(word).increment();
        }

        @Override
        public String toString() {
            return new StringBuilder("WordCounter{")
                    .append("wc=")
                    .append(wc)
                    .append('}')
                    .toString();
        }
    }
}
