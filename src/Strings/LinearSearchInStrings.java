package Strings;

public class LinearSearchInStrings {
    static void main(String[] args) {
        String name = "Dvij";
        char target = 'i';
        boolean answer = linearSearch(name, target);
        System.out.println(answer);
    }

    static boolean linearSearch(String str, char target) {
        if(str.isEmpty()) {
            return false;
        }

        // str.toCharArray() method converts a String into an Array
        for(char ch: str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }

        return false;
    }
}
