
//     // public static void main(String args[]){
//     //     for(int i=1;i<=5;i++){
//     //         for(int s=i;s<=5-i;s++){
//     //             System.out.print(" ");

//     //         }
//     //         for(int j=1;j<=i;j++){
//     //             System.out.print(j+" ");
//     //         }
//     //         System.out.println();
//     //     }
//     // }
//     class Test{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int s=1;s<=5-i;s++){
//                 System.out.print(" ");

//             }
//             for(int j=1;j<=i;j++){
//                 if(i==j||j==5-i){
//                     System.out.print("1");
//                 }
//                 // System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    int n = sc.nextInt();

    for(int i=0; i<=n; i++){
      for(int j=0; j<n-i; j++){
        System.out.print(" ");
      }
      for(int j=0; j<=i; j++){
        if(j==0||j==i||i==n){
          System.out.print(1+" ");
        }else{
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
