import java.util.Random;


public class Practice_15_16 {
    public static void main(String[] args){

        int[] numbers = new int[10];
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        int min = numbers[0];
        int max = numbers[0];

       
        for(int i = 0; i < numbers.length; i++){
            
            if(numbers[i] > max ){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
            
        }
         
        System.out.print("Максимальное число в массиве: " + max + " Мин. число в массиве " + min);


        int[][] matric = new int[5][5];

        for(int i = 0; i < matric.length; i++){
            matric[i][i] = 1;
        }

        for(int i = 0; i < matric.length; i++){
            for(int j = 0; j<matric.length;j++){
                System.out.print(matric[i][j] + " ");
            }
            System.out.println();
           
        }

        
    }
}
