public class Main {
    public static void main(String[] args) {

        int[] vetor = {3,6,8,1,4,9,0};
        Sort a = new Sort();
        vetor = a.SelectionSort(vetor);
        System.out.println("Selection Sort");
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print(vetor[i]  + " ");
        }

        int[] vetor2 = {3,6,8,1,4,9,0};
        vetor2 = a.BubbleSort(vetor2);
        System.out.println();
        System.out.println("Bubble Sort");
        for(int i = 0; i < vetor2.length; i++)
        {
            System.out.print(vetor2[i]  + " ");
        }
       

    }
}