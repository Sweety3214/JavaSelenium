package classqspider.assignment;


public class SwitchClassAssignment {
    public static void main(String[] args) {
        SwitchClassAssignment switchClassAssignment = new SwitchClassAssignment();
        String result = SwitchClassAssignment.vowelOrConsonant('1');
        System.out.println(result);

    }

    public static String vowelOrConsonant(char input) {

        String output = null;

        if ((input >= 65) && (input <= 122)) {
            // Switch finding vowel or Consonant
            switch (input) {
                case 'a': {
                    output = "vowel";
                    break;
                }
                case 'e': {
                    output = "vowel";
                    break;
                }
                case 'i': {
                    output = "vowel";
                    break;
                }
                case 'o': {
                    output = "vowel";
                    break;
                }
                case 'u': {
                    output = "vowel";
                    break;
                }
                default: {
                    output = "Consonant";
                }

            }
        } else {
            output = "It's is not a alphabet";
        }


        return output;

    }
}
