package Great;

public class CountLetter {
    public static void main(String[] args) {
        String s = "aaaaa bb c dd eeeeeeeeee";
        int[] count = new int[26]; // 26 letters in the English alphabet
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) { // only count letters
                int index = Character.toLowerCase(c) - 'a'; // convert to lowercase and get index
                count[index]++;
            }
        }
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                char c = (char) (i + 'a'); // convert index to letter
                System.out.println("The letter " + c + " occurs " + count[i] + " times.");
            }
        }
    }
}
