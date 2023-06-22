public class Main {
    public static void main(String[] args) {
        //Criação do primeiro array
        int[] vetor = {3, 6, 8, 1, 4, 9, 0};
        //Criação de um objeto da classe Sort
        Sort a = new Sort();
        //Usando o método SelectionSort para organizar o array
        a.SelectionSort(vetor);
        System.out.println("Selection Sort");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        int[] vetor2 = {3, 6, 8, 1, 4, 9, 0};
        //Usando o método BubbleSort para organizar o array
        a.BubbleSort(vetor2, vetor2.length);
        System.out.println();
        System.out.println("Bubble Sort");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");

        }

    }

}
