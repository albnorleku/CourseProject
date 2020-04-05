package com.roiacademy.collections;

import java.util.*;

public class CollectionsProblems {
    private static Map<String, List<String>> qytetet;

    static {
        qytetet = new HashMap<>();
        qytetet.put("01", List.of("Prishtina", "Fushe Kosova", "Drenasi", "Lipjani", "Podujeva"));
        qytetet.put("02", List.of("Mitrovica", "Skenderaj", "Vushtrri"));
        qytetet.put("03", List.of("Peja", "Istogu", "Klina"));
        qytetet.put("04", List.of("Prizren", "Suhareka"));
        qytetet.put("05", List.of("Ferizaj", "Vitia"));
        qytetet.put("06", List.of("Gjilani", "Kamenica"));
        qytetet.put("07", List.of("Gjakova", "Malisheva"));
    }

    public CollectionsProblems() {

    }

    public static List<String> getCityWithLetter(char letter) {
        List<String> qyetetMeShkronjenX = new ArrayList<>();
        for(Map.Entry<String, List<String>> qytetiList: qytetet.entrySet()) {
            for (String qytetei : qytetiList.getValue()) {
                if (qytetei.contains(String.valueOf(letter))) {
                    qyetetMeShkronjenX.add(qytetei);
                }
            }
        }
        return qyetetMeShkronjenX;
    }

    public static void main(String[] args) {
        char letter = 'j';
        List<String> qyetet = CollectionsProblems.getCityWithLetter(letter);

        for (String qyeteti: qyetet) {
            System.out.println("Qyteti me shkronjen  " + letter + ": "+ qyeteti);
        }
    }
}
