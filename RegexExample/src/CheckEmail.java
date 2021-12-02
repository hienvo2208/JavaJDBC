import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckEmail {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       // 1. De nhap mail voi ky tu dau tien la chu cai: ^[a-zA-Z][a-zA-Z0-9]+@$
        while(true){
           System.out.println("Input email: ");
           String email = scanner.nextLine();
           Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9\\_]+@[a-zA-Z]+(\\.[a-zA-Z]+)$");
           if(p.matcher(email).find()){
               System.out.println("Success");
               break;
           }else{
               System.out.println("Not success");
           }
       }
    }

}
