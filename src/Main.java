import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz ile tablica ma mieć miejsc");
        int wybor_size = scanner.nextInt();
        System.out.println("Czy tablicę wygenerować? Czy podajesz wartości z klawiatury?");
        System.out.println("Wpisz 1 lub 2");
        int wybor = scanner.nextInt();

        double[] numberArray = new double[wybor_size];
        double[] sorterArray = new double[wybor_size];

        if (wybor == 1) {
            System.out.println("Podaj dolny zakres tablicy");
            int dolny = scanner.nextInt();
            System.out.println("Podaj górny zakres tablicy");
            int gorny = scanner.nextInt();
            System.out.println("Tablica jest nie posortowana.");
            for (int i = 0; i < wybor_size; i++) {
                numberArray[i] = (int) (Math.random() * (gorny - dolny)) * dolny;
                System.out.print(numberArray[i] + ", ");
            }
            System.out.println();
            System.out.println("Posortowana tablica.");

            sorterArray = insertionSort(numberArray);
            for (int i = 0; i < wybor_size; i++) {
                System.out.print(sorterArray[i] + ", ");
            }
        } else if (wybor == 2) {
            System.out.println("Wprowadź kolejno " + wybor_size + " liczb.");
            for (int i = 0; i < wybor_size; i++) {
                numberArray[i] = scanner.nextInt();
            }
            System.out.println("Nieposortowana tablica");
            for (int i = 0; i < wybor_size; i++) {
                System.out.print(numberArray[i] + ", ");
            }
            System.out.println();
            System.out.println("Posortowana tablica");
            double[] sortedArray = insertionSort(numberArray);

            for (int i = 0; i < wybor_size; i++) {
                System.out.print(sortedArray[i] + ", ");
            }
        }
    }
    public static  double[] insertionSort(double[] numberArray){
        int sizeArray = numberArray.length;
        double temp;
        for(int i = 1; i <sizeArray; i++){
            temp = numberArray[i];
            for(int j = i - 1; j>= 0 ; j--){
                if(numberArray[j] > temp){
                    numberArray[j + 1] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        return numberArray;
    }
}