package com.roiacademy.training;

public class FilterNames {
    public static void main(String[] args)
    {
        String[] names = {"Agon", "Blerim", "arta", "Eni", "Hana"};

        String[] filterNames = filter(names, "A");
        for (String name : filterNames){
            System.out.println(name);
        }
    }

    /**
     * This method filters given array of names with the given keyword
     * @param names
     * @param keyword
     * @return
     */
    public static String[] filter(String[] names, String keyword) {
        if (names == null || names.length < 1 || keyword == null || keyword.isEmpty()){
            throw new IllegalArgumentException("Arguments are not valid!");
        }

        String[] filterNames = new String[names.length];
        int index = 0;

        for(String name : names){ // O(N)
            if (name.toLowerCase().startsWith(keyword.toLowerCase())){
                filterNames[index++] = name;
            }
        }

        return filterNames;
    }


}
