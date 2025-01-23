import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayStatic();
        Palindrome();
    }

    public static void ArrayStatic (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        String num =  scanner.nextLine();

        String[] strArr = num.split(" ");
        int[] numArr = new int[strArr.length];
        for (int i = 0; i< strArr.length; i++){
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        int sum = 0;
        int count = 0;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int maxNum2 = Integer.MIN_VALUE;
        int minNum2 = Integer.MAX_VALUE;
        for (int i = 0; i < numArr.length; i++){
            sum += numArr[i];
            count ++;
            if (maxNum < numArr[i]){
                maxNum2 = maxNum;
                maxNum = numArr[i];
            }
            else if (maxNum2 < numArr[i]){
                maxNum2 = numArr[i];
            }
            if (minNum > numArr[i]){
                minNum2 = minNum;
                minNum = numArr[i];
            }
            else if (minNum2 > numArr[i]){
                minNum2 = numArr[i];
            }
        }
        double avg = (double) sum /count;
        System.out.println("Summa :" + sum);
        System.out.println("Average :" + avg);
        System.out.println("Max Num :" + maxNum);
        System.out.println("Second Max num : " + maxNum2);
        System.out.println("Min Num :" + minNum);
        System.out.println("Second Min num : " + minNum2);


    }

    public static void Palindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for palindrome: ");
        String element = scanner.nextLine();
        String[] arr = element.split("");
        int c = 0;
        for(int i = 0; i < arr.length/2; i++){
            if (arr[i].equals(arr[arr.length -1 - i])){
                c++;
            }
        }
        if (c == arr.length/2){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
//        Second method
//        if (element.equals(reversed)){
//            System.out.println("The elements is a palindrome");
//        }
//        else{
//            System.out.println("The elements is not a palindrome");
//        }

        System.out.println("Enter the sentence for palindrome: ");
        String sentence = scanner.nextLine();
        String cc = sentence.replaceAll("[^a-zA-Z0-9]", "");
        String[] sentenceArr = cc.split(" ");
        System.out.println(Arrays.toString(sentenceArr));
        int c2 = 0;
        for(int i = 0; i < sentenceArr.length/2; i++){
            if (sentenceArr[i].equals(sentenceArr[sentenceArr.length -1 - i])){
                c2++;
            }
        }
        if (c2 == sentenceArr.length/2){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
