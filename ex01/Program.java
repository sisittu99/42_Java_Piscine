import java.util.Scanner;

public class Program {
    public static boolean ft_check(String nbr) {
        if (nbr == null)
            return false;
        try {
            int check = Integer.parseInt(nbr);
            if (check < 2)
                return false;
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void ft_printResult(boolean r, int it)
    {
        System.out.println(r + "\t" + it);
        System.exit(0);
    }
    public static void ft_primeNbr(int nbr) {
        if (nbr % 2 == 0)
            ft_printResult(false, 0);
        int i = 1;
        for (; 2 * i + 1 < Math.sqrt(nbr) + 1; i++)
            if (nbr % (2 * i + 1) == 0)
                ft_printResult(false, i);
        ft_printResult(true, i);
    }

    public static void main (String[] args) {
        System.out.print("-> ");
        Scanner input = new Scanner(System.in);

        String nbr = input.nextLine();

        if (!ft_check(nbr)) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        int number = Integer.parseInt(nbr);
        ft_primeNbr(number);
    }
}