import java.util.Scanner;

public static void main(String args[])
{
    Scanner scnr = new Scanner(System.in);
    int month;
    int day;
    boolean valid = false;

    System.out.println("Hi, Welcome to Six Flags Theme Park!");
    System.out.println("Please enter the month and day you would like to purchase tickets");

    while(!valid)
    {
        System.out.print("Enter month: ");
        month = scnr.nextInt();
        System.out.print("Enter day: ");
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