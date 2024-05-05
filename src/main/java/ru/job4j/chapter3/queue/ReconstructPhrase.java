package ru.job4j.chapter3.queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder str = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                str.append(evenElements.poll());
            } else {
                evenElements.poll();
            }
        }
        return str.toString();
    }

    private String getDescendingElements() {
        StringBuilder str = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            str.append(descendingElements.pollLast());
        }
        return str.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }

    public static void main(String[] args) {
        Deque<Character> evenElements = new LinkedList<>(
                Arrays.asList(
                        'S', '1', 'l', '3', 'o', 'h', 'g', 'h', 'a', 'm', 'n', 't',
                        ' ', 't', 'o', ' ', 'f', 'q', ' ', '6', 'l', '.', 'a', ',',
                        'n', 'w', 'g', 'd', 'u', 'a', 'a', 'u', 'g', 'd', 'e', 'q',
                        ' ', 'y', 'J', 'd', 'a', 'k', 'v', 'p', 'a', 'e', ':', 'b'
                )
        );
        ReconstructPhrase reconstructPhrase = new ReconstructPhrase(null, evenElements);
        String str = reconstructPhrase.getEvenElements();
        System.out.println(str);
    }
}
