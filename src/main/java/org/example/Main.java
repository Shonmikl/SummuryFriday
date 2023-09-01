package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("grape");

        Map<Boolean, String> dividedByLetters = words.stream()
            .filter(word -> word.chars().allMatch(Character::isLetter))
            .collect(Collectors.partitioningBy(
                word -> Arrays.asList('a', 'e', 'i', 'o', 'u').contains(word.charAt(0)),
                Collectors.flatMapping(
                    word -> word.chars().boxed(),
                    Collectors.partitioningBy(
                        c -> "aeiou".contains(Character.toString((char) c.intValue()))
                    )
                )
            ))
            .entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> entry.getValue().get(true).stream()
                    .map(c -> Character.toString((char) c.intValue()))
                    .collect(Collectors.joining())
            ));

        System.out.println("Слова из гласных: " + dividedByLetters.get(true));
        System.out.println("Слова из согласных: " + dividedByLetters.get(false));
    }
}
