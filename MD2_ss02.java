package ra;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MD2_ss02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      EX 01: cho nguoi dung nhap vao so tu nhien kiem tra chan le
//        -Tao scanner
//        -Cau lenh nhap
//        -Tao bien luu gia tri nhap
//        -Dung cau lenh if else de kiem tra so chia het cho 3 va 5
//        System.out.println("Moi nhap vao so tu nhien:");
//        int number = Integer.parseInt(scanner.nextLine());
//        if (number % 5 == 0 && number % 3 == 0){
//            System.out.printf(" %d chia het cho 3 va 5", number);
//        }else {
//            System.out.printf("%d khong chia het cho 3 va 5", number);
//        }
//        EX 02: chuyen doi chu thanh so
//        -Tao scanner
//        -Cau lenh nhap 1 so tu 0-9
//        -luu vao bien
//        -su dung cau lenh switch case de xet tung gia tri 1
//        System.out.println("Moi nhap vao 1 so tu 0 -9:");
//        int number = Integer.parseInt(scanner.nextLine());
//        switch (number) {
//            case 0:
//                System.out.println("khong");
//                break;
//            case 1:
//                System.out.println("Mot");
//                break;
//            case 2:
//                System.out.println("Hai");
//                break;
//            case 3:
//                System.out.println("Ba");
//                break;
//            case 4:
//                System.out.println("Bon");
//                break;
//            case 5:
//                System.out.println("Nam");
//                break;
//            case 6:
//                System.out.println("Sau");
//                break;
//            case 7:
//                System.out.println("Bay");
//                break;
//            case 8:
//                System.out.println("Tam");
//                break;
//            default:
////                System.out.println("Chin");
//        }

//        EX 5: hien thi cac so nguyen to < 100
//        so nguyen to la so chia het cho 1 va chinh no
//        su dung vong lap de duyet cac so chia het cho 1 va chinh no
//        ta duoc 2 uoc
//        tiep tuc su dung vong lap nua de kim tra uoc thu 3
//        neu co 3 uoc tro len thi khong phai so nguyen to
//        for (int number = 2; number < 100; number++) {
//                System.out.println("so =" + number);
//            int commonDivisor = 0;

//            for (int j = 1; j <= number; j++) {
//                if (number % j == 0) {
//                    commonDivisor++;
//                }
//            }
//            System.out.println("common divisor:" + commonDivisor);
//            if (commonDivisor == 2) {
//                System.out.println("so:" + number + " la so nguyen to");
//            }
//        }
        
//        EX 06: Hiển thi 20 số nguyên đầu tiên
//        dùng vòng lặp while
//        số nguyên bắt đầu tù 2
//        tạo 1 bin đếm
        int number = 2;
        int countPrime = 0;
        while (countPrime != 20){
            int commonDivisor = 0;
            for ( int i  = 1; i <= number; i ++){
                if (number % i == 0){
                    commonDivisor++;
                }
            }
            if (commonDivisor == 2){
                System.out.println("So nguyen to = " + number);
                countPrime++;
            }
            number++;
        }
    }
}
