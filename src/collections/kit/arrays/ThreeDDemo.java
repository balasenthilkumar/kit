package collections.kit.arrays;

public interface ThreeDDemo {

    public static void main(String[] args) {
        int[][][] arr = new int[4][4][4]; //4*4*4 = 64

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    arr[i][j][k] = i+j+k;
                    //System.out.print(arr[i][j][k] +", ");
                    // arr[0][0][1]
                }
            }
        }

        for(int i[][]:arr){
            for(int j[]:i){
                for(int k:j){
                    System.out.print(k +", ");
                }

            }

        }
    }


}
