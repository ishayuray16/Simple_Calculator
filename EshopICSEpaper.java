import java.util.*;
public class EshopICSEpaper {
    public static class Eshop
    {
        private String name;
        private double price;

        void accept()
        {
            Scanner SN = new Scanner(System.in);
            System.out.println("Enter the name of the item : ");
            name = SN.nextLine();
            System.out.println("Enter the price of the item : ");
            price = SN.nextInt();
            SN.close();
        }
        void calculate()
        {
            if(price > 1000 && price <= 25000)
                price*=95.0/100.0;
            if(price > 25000 && price <=57000)
                price*=92.5/100;
            if(price>57000 && price <100000)
                price*=90.0/100.0;
            if(price > 100000)
                price*=85.0/100.0;
            else
                price = Math.abs(price);
        }
        void display()
        {
            System.out.println(name);
            System.out.println(price);
        } 

    }
    public static void main(String args[])
    {
        Eshop obj = new Eshop();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
