public class Main {
    public static void main(String[] args) {

        int[] mas = new int[4];
        mas [0] = 45;
        mas [1] = 78;
        mas [2] = 54;
        mas [3] = 23;

        int sum = 0;
        for(int i = 0; i < mas.length; i++){
            sum += mas[i];
        }
        System.out.println("Сумма = " + sum);
}
    }