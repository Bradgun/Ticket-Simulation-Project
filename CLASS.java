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
    boolean valid = true;
    if (month < 1 || month > 12) {
        System.out.println("Invalid month. Enter valid month between 1 - 12.");
        valid = false;
    }
    else if (day < 1 || day > 31) {
        System.out.println("Invalid day. Enter day between 1 - 31.");
        valid = false;
    }
    return valid;
}

public double calculateTicketPrice(int month, int day)
{
    if (month = 6 || month = 7 || month = 8)
}