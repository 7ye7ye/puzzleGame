package test;

import java.util.Random;

//打乱一个一维数组，并把它放进二维数组中
public class Test {
    public static void main(String[] args) {
        //创建一维数组
        int[] arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            int index=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();

        //创建二维数组
        int[][] date=new int[4][4];

        for (int i = 0; i < arr.length ; i++) {
            date[i/4][i%4]=arr[i];
        }

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(date[i][j]+" ");
            }
            System.out.println();
        }

    }
}
