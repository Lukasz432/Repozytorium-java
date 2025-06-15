package Tasks.Lab10.ZAD1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZliczanieSlow {

    public void PodawanieZdania() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String tekst = sc.nextLine();
        //wykorzystywanie regexa do pozbycia sie duzych liter i znakow specialnych
        tekst = tekst.toLowerCase().replaceAll("[.,!?;:]","");

        String[] words = tekst.split("\\s+"); //pozbycie sie bialych znakow
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        System.out.println("Lista wystąpień: słów:\n");
        for(Map.Entry<String, Integer> entry : wordMap.entrySet()) {// for each
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
