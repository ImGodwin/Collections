import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Integer> numsReceived = new ArrayList<>();
        ArrayList<Integer> numsReversed = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Add any number ");
            int numFromUser = Integer.parseInt(input.nextLine());
            numsReceived.addAll(ascendingNums(numFromUser));
            System.out.println(numsReceived);
            numsReversed = createNewList(numsReceived);
            System.out.println(numsReversed);
            System.out.println(numsReceived);
            print(numsReceived, true);
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

    public static ArrayList<Integer> createNewList(ArrayList<Integer> arr ){

        ArrayList<Integer> app = new ArrayList<>(arr);
        ArrayList<Integer> arr2 = new ArrayList<>(arr);
        Collections.reverse(app);
        System.out.println("questo è app " + app);
        arr2.addAll(app);
        return arr2;
    }

    public static void print(ArrayList<Integer> arr, boolean x){
        for (int i = 0; i < arr.size(); i++) {
            if (x){
                if (i % 2 == 0){
                    System.out.println(arr.get(i));
                }
            }else{
                if (i % 2 != 0){
                    System.out.println(arr.get(i));
                }
            }
        }
    }

}
