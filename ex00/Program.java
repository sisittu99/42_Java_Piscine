import java.util.Scanner;

public class Program {
    public static boolean ft_check(String nbr) {
        if (nbr == null || nbr.length() != 6)
            return false;
        try {
            Integer.parseInt(nbr);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static int ft_writeSum(String nbr) {
        int sum = 0;

        for (int i = 0; i < 6; i++){
            sum += nbr.charAt(i) - '0';
        }
        return sum;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String nbr = input.nextLine();

        System.out.println("your number is " + nbr);
        if (!ft_check(nbr))
        {
            System.out.println("That's not a six-digits integer u n00b");
            System.exit(1);
        }
        System.out.println(ft_writeSum(nbr));
    }
}
