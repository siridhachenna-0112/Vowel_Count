import java.util.Scanner;
public class Vowels{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String input=sc.nextLine();
        int VowelCount=0;
        input=input.toLowerCase();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                VowelCount++;
            }
        }
        System.out.println("No.of vowels in the string:"+ VowelCount);
        sc.close();
    }
}

