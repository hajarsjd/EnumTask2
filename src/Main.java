import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        2.1.satiş maşininda mövcud olan bütün ickileri göstərin.
        System.out.println("Drinks: ");
        for(Drinks drinks : Drinks.values()){
            System.out.println(drinks);
        }
//        2.2.İstifadəçiyə müvafiq kodu daxil edərək elementi seçməyə icazə verin.
//        2.3.Seçilmiş ickilerin ümumi qiymətini hesablayın və göstərin.
        double cost = 0;
        while (true) {
            int code = scanner.nextInt();
            if (code == -1) {
                break;
            }
            if (code >= 0 && code < Drinks.values().length) {
                Drinks selectedDrink = Drinks.values()[code]; //values 0 1 2 3
                cost += selectedDrink.getPrice();
                System.out.println("You selected: " + selectedDrink.getName() +" -- " + selectedDrink.getPrice());

            } else {
                System.out.println("Invalid code. Please try again.");
            }
        }
        System.out.println("Total cost: " + cost);

    }
}