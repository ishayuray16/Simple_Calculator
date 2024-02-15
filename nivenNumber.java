import java.util.*;
class nivenNumber
{
    public static void main()
    {
        Scanner inputScan = new Scanner(System.in);
        int harshadInput = inputScan.nextInt();
        int sumOfDigits = 0;
        int harshadInputCopy = harshadInput;
        while(harshadInputCopy!=0)
        {
            int RemovedDigit = harshadInputCopy%10;
            sumOfDigits+=RemovedDigit;
            sumOfDigits/=10;
        }
        if(harshadInput%sumOfDigits == 0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not a Niven number)");
        }
        inputScan.close();
    }
}