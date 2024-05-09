import java.util.Scanner;

public static void main(String args[])
{
    Scanner scnr = new Scanner(System.in);
    int month;
    int day;
    boolean valid = false;

    while(!valid)
    {
        System.out.println("Enter a month: ");
        month = scnr.nextInt();
        System.out.println("Enter a day: ");
        day = scnr.nextInt();
        valid = checkValidity(month, day);
    }

    calculateTicketPrice(month, day);
}

public boolean checkValidity(int month, int day)
{

}

public double calculateTicketPrice(int month, int day)
{
    if (month = 6 || month = 7 || month = 8)
}