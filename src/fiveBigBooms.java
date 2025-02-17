public class fiveBigBooms {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print("BO");
            for (int j = 0; j < (Math.pow(3, i)); j++) {
                System.out.print("O");
            }
            System.out.println("M!!!");
        }
    }
}
