public class Main {
    public static void main(String[] args) {
        System.out.println("Hello VitaminCode03");
        System.out.println("My name is Khoa");

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
}
