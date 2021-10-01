public class CodeupCrypt {


    public static String hashPassword(String input) {

        String output = "";
        for (int i = 0; i < input.length(); i = +1) {
            if (input.charAt(i) == 'a') {
                output += 4;
            }
            else if(Character.toLowerCase(input.charAt(i))=='e'){
                output +=3;
            }
            else{
                output +=input.charAt(i);
            }
        }return output;

    }
}

