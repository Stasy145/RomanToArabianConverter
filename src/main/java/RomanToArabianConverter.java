import java.util.HashMap;

public class RomanToArabianConverter {
    public static void main(String[] args) {
        RomanToArabianConverter roman = new RomanToArabianConverter();
        System.out.println(roman.romanToArabian("XVI")); //16
        System.out.println(roman.romanToArabian("VIIX")); //15
    }



    public int romanToArabian(String romanVersion) {


        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);



        int endPoint = romanVersion.length()-1;
        char[] romanVersionArray = romanVersion.toCharArray();
        int integerInHashMap;
        int arabianVersion = map.get(romanVersionArray[endPoint]);
        for (int i = endPoint-1; i >=0; i--) {
            integerInHashMap = map.get(romanVersionArray[i]);

            if (integerInHashMap < map.get(romanVersionArray[i + 1])) {
                arabianVersion -= integerInHashMap;
            } else {
                arabianVersion += integerInHashMap;
            }


        }
        return arabianVersion;

    }
}

