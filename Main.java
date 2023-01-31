package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int [] array = {2,5,4,56,4,3,5,34};
        selectionSort(array);
        for(int i: array){
            System.out.print(i + " ");
        }
    }
    /*
    Algorithm này về quy tắc thì tương đối giống với BubbleSort chỉ là nó so sánh nhiều hơn và đổi chỗ ít đi
    Sau mỗi vòng loop nó sẽ đưa được phần tử bé nhất lên đầu array
    BubbleSort so sánh và hoán đổi trực tiếp nếu phép so thỏa mãn if statement
    Còn Selection Sort thì sẽ loop hết array để tìm ra phần tử bé nhất gán nó thành 1 variable riêng biệt
    rồi loop xong 1 vòng ms đổi chỗ
     */



    private static void selectionSort (int[] array){
        for(int i = 0; i<= array.length-2; i++){
            int min = i;
            for(int j = i+1; j<=array.length-1;j++){
                if(array[j] < array[min]){
                    min =j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}