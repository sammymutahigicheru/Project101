package challenges.sorting;

import java.io.*;

class Solution {
    public static int solution(String S, String C) {
        int max = 0;
        try {
            String string = "Tarantino,50,M,USA\n Carey Mulligan,27,F,UK\n Gong Li,45,F,China";

            BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(string.getBytes())));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains("Tarantino")){
                    String intValue = line.replaceAll("[^0-9]", "");
                    max = Integer.parseInt(intValue);
                }
            }
        } catch (IOException e) {
            // log something
            e.printStackTrace();
        }
        return max;
    }

    public static void main(String[] args) {
        int value = solution("","");
        System.out.println(value);
    }

}
