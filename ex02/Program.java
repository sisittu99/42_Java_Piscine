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

    public static boolean ft_primeNbr(int nbr) {
        if (nbr % 2 == 0)
            return false;
        int i = 1;
        for (; 2 * i + 1 < Math.sqrt(nbr) + 1; i++)
            if (nbr % (2 * i + 1) == 0)
                return false;
        return true;
    }

    public static int ft_writeSum(String nbr) {
        int sum = 0;

        for (int i = 0; i < nbr.length(); i++){
            sum += nbr.charAt(i) - '0';
        }
        return sum;
    }
    public static void main (String[] args) {
        int count = 0;

        while (true) {
            System.out.print("-> ");
            Scanner input = new Scanner(System.in);

            String nbr = input.nextLine();

            if (nbr.equals("42"))
                break ;
            if (!ft_check(nbr))
                continue ;

            int sum = ft_writeSum(nbr);
            if (ft_primeNbr(sum))
                count++;
        }
        System.out.println("Count of coffee-request:\t" + count);
    }
}