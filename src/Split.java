public class Split {

    /**
     * Create a String named 'ret' and get the first letter of
     * each word inside the string.
     * Use String.split() and String.charAt() methods.
     * Find detailed API documentation at the website listed above.
     */
    public String split() {
        String tester = "Idol Long Oolong Vertical Europe University Toyota";
        String[] words = tester.split(" ");
        String output = "" ;
        String c;
        for (int i = 0; i < words.length; i++) {
            c = words[i];
            output += c.charAt(0);
        }
        return output;

    }
}