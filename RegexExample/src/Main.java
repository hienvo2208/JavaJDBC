import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // vd1: Chi nhap 1 so: ^[0-9]$
        // vd2: Nhap nhieu so: ^[0-9]+$
        // vd3: Nhap so >= 6 ki tu: ^[0-9]{6,}$
        // vd4: Nhap trong khoang bao nhieu ky tu: ^[0-9]{6,9}$
        // vd5: Nhap ky tuong thuong va ky tuong hoa:^[a-zA-Z]+$
        // vd6: Nhap ky tu so va ky tu chu: ^[a-zA-Z0-9]+$
        // vd7: Them dau cach: ^[a-zA-Z0-9 ]+$

       while(true){
           System.out.println("input txt: ");
           String txt = scanner.nextLine();
           Pattern p = Pattern.compile("^[a-zA-Z0-9 ]+$");
           if(p.matcher(txt).find()){
               System.out.println("success");
               break;
           }else{
               System.out.println("not Success");
           }
       }
    }
}
