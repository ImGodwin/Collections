import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Set<String> setWords = new HashSet<>();

        try{

            System.out.println("Add any number between 5 - 10");
            int numFromUser = Integer.parseInt(input.nextLine());

            ArrayList<String> duplicate = new ArrayList<>();
            for (int i = 0; i < numFromUser; i++){
                System.out.println("add new word: ");
                String word = input.nextLine();
                if (!setWords.add(word)){
                    duplicate.add(word);
                }
            }
           /* System.out.println(duplicate);
            System.out.println(setWords.size());
            System.out.println(setWords);*/


        }catch(Exception e){
            System.err.println("Incorrect input");
        }




    }

}
