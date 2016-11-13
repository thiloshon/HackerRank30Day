import java.util.Scanner;

/**
 * Created by Thiloshon on 06-May-16.
 */
public class Day11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
       // int num=0;
        int ans=-81;
        for(int x=0;x<=3;x++){
            for(int y=0;y<=3;y++){
                int num = arr[x][y]+arr[x][y+1]+arr[x][y+2]+arr[x+1][y+1]+ arr[x+2][y]+ arr[x+2][y+1]+ arr[x+2][y+2];
                System.out.println(num);
                if (num>ans){
                    ans=num;
                }
            }
        }

        System.out.print(ans);
    }
}

