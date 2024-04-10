package STRING;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Welcome";
        System.out.println("String length: " + s.length());

        // concatination
        String s1 = "Welcome to";
        String s2 = "training";

//        System.out.println(s1+s2);
//        System.out.print("String concat: " + s1.concat(" "+s2));

        System.out.println("welcome to" + " training");
        System.out.println("welcome" . concat(" " + "training"));

        // Equals
        String s3 = "WELCOME";
        String s4 = "welcome";
        System.out.println("Equals: " + s3.equals(s4));  // false
        // consider case-senstivity- so it will consider small case and long case differently

        // EqualsignoreCase
        System.out.println("Equalsignorecase: " + s3.equalsIgnoreCase(s4));  // true
        // dosen't consider case senstivity and matches the characters and not small case or long case.

        // contains
        System.out.println("contains: " + s3.contains("WEL"));  // true
        // contains also consider case senstivity


        // substring
        System.out.println("Substring: " + s3.substring(4)); // ELCOME
        // removes the first index of string
        // we need to pass 2 parameters like starting index and ending index

        // replace
        System.out.println("Replace: " + s3.replace("E", "w"));  // WWLCOMW
        // so we replace a character present in string with new character we want to see in that position


        // you can delete all the char from the string only integer will left
        String st = "hell09H₹ydra";
        st = st.replaceAll("[^\\d]", "");
        System.out.println(st);


    }
}
