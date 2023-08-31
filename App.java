import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        String phrase = "The quick brown fox jumped over the lazy dog";
        String myStr02 = "";
        int theCharIndex = 0;

        theCharIndex = phrase.indexOf("brown fox");

        System.out.println("\n The index of 'b' is: " + theCharIndex);

        myStr02 = phrase.substring(theCharIndex, 19);
        System.out.println(myStr02);



        String [] friends = {"jim", "angela", "oscar", "dwight"};

        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);



        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);


        for (int a : numbers) {
            System.out.println(a);
        }

        }
    }

