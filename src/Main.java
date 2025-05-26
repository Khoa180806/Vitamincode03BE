public class Main {
    public static void main(String[] args) {
        System.out.println("Hello VitaminCode03");
        System.out.println("My name is Khoa");
        System.out.println("Thay doi test push len --> Su thay doi : Loc");
        System.out.println("we're gay");
        System.out.println("i'm not gay");
    }
    public class bai1 {
        static Scanner sc = new Scanner(System.in);

        public static void CalNumAB() {
            System.out.println("Nhap vao hai so : ");
            System.out.print("a = ");
            int a = sc.nextInt();
            System.out.print("b = ");
            int b = sc.nextInt();
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            if (b != 0) {
                System.out.println("a / b = " + (float) a / b);
            } else {
                System.out.println("Khong the chia cho 0");
            }
        }
        public static void timnghiem() {
            System.out.println("Nhap vao cac he so a, b, c : ");
            System.out.print("a = ");
            int a = sc.nextInt();
            System.out.print("b = ");
            int b = sc.nextInt();
            System.out.print("c = ");
            int c = sc.nextInt();
            if (b != 0) {
                float x = (float) (c - a) / b;
                System.out.println("nghiem x = " + x);
            } else {
                if (a == c) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
        }
}
