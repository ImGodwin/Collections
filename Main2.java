import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Integer> numsReceived = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Add any number ");
            int numFromUser = Integer.parseInt(input.nextLine());
            numsReceived = ascendingNums(numFromUser);
            System.out.println(numsReceived);
        }catch (Exception e){
            System.err.println("Error message");
        }
    }
    public static ArrayList<Integer> ascendingNums(int num){
       ArrayList<Integer> numsToPrint = new ArrayList<>();
        Random rnNums = new Random(); //come lo scanner
        for (int i = 0; i < num; i++)
        {
            numsToPrint.add(rnNums.nextInt(0, 100));
        }
        Collections.sort(numsToPrint);
        return numsToPrint;
    }
}
