public class Practice_18 {
    public static void main(String[] args){
        int[][] matrix = {
            {5, 6, 8},
            {2, 3, 7},
            {7, 4, 0}
        };

        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                sum = matrix[i][j] + sum;
            }
        }

        System.out.println(sum);
        
    }
}
