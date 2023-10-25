
class Main {
    public static void main(String [] args) {
        int[][] arr = {{1, 3, 9}, {2, 7, 3}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}