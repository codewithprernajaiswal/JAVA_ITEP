// class Test{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 if(i==1||j==1||j==5-i-1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
                
//             }
//              System.out.println();
//         }
//     }
// }

class Test{
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            char ch=(char)('A'+i-1);
            for(int j=1;j<=i;j++){
                
                System.out.print(ch);
            }
             System.out.println();
        }
    }
}