import java.util.Scanner;

public class ConditionVariableMutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Please enter an integer as variable 'a': ");
        int a = scanner.nextInt();

        
        System.out.print("Please enter an integer between 0 and 30 as variable 'b': ");
        int b = scanner.nextInt();

        
        System.out.print("Please enter an integer between 0 and 100 as variable 'credits': ");
        int credits = scanner.nextInt();

        
        System.out.print("Please enter a boolean (true/false) as variable 'isBonus': ");
        boolean isBonus = scanner.nextBoolean();

       
        System.out.print("Please enter an integer between 0 and 50 as variable 'd': ");
        int d = scanner.nextInt();

        
        System.out.print("Please enter an integer between 0 and 500 as variable 'time': ");
        int time = scanner.nextInt();

       
        int output1 = 0;
        String output2 = "";
        int output3 = 0;
        String output4 = "";

        
        if (a % 2 == 0) {
            output1++;
        }

        
        if (b >= 10 && b <= 20) {
            output2 = "Sweet!";
        } else if (b < 10) {
            output2 = "Less!";
        } else if (b > 20) {
            output2 = "More!";
        }

       
        if (credits >= 50 && !isBonus) {
            output3 -= 2;
        } else if (credits < 50 && !isBonus) {
            output3 -= 1;
        }

        
        if (d % 4 == 0 && time <= 200) {
            output4 = "Check";
        } else if (time > 200) {
            output4 = "Time out";
        } else {
            output4 = "Run Forest Run!";
        }

       
        System.out.println("Output1: " + output1);
        System.out.println("Output2: " + output2);
        System.out.println("Output3: " + output3);
        System.out.println("Output4: " + output4);
    }
}

