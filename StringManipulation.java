// Online Java Compiler
// Use this editor to write, compile, and run your Java code online

public class StringManipulation {
    public static void main(String[] args) {
        String arr = "abcd";
        char ch = 'c';  // Set the character you want to find
        int count = -1;
        int countnext = -1;
        String rev = "";
        String ori = "";

        // Finding the index of 'ch' and splitting the string
        for (int j = 0; j < arr.length(); j++) {
            if (arr.charAt(j) == ch) {
                count = j;
                countnext = count + 1;
                break;
            }
        }

        // Check if the character is found
        if (count != -1) {
            // Generate the original substring from the next character
            for (int k = countnext; k < arr.length(); k++) {
                ori += arr.charAt(k);
            }

            // Reverse the substring before the character
            for (int i = count; i >= 0; i--) {
                rev += arr.charAt(i);
            }

            System.out.println("Original after character: " + ori);
            System.out.println("Reversed before character: " + rev);
            System.out.println("Final result: " + rev + ori);
        } else {
            System.out.println("Character not found in the string.");
        }
    }
}
