class Test{
    public static void main(String args[]){
        String str="abc";
        char []arr1=str.toCharArray();
        String str1="def";
        char []arr2 =str1.toCharArray();
        char []arr3=new char [arr1.length+arr2.length];

     for(int i=0;i<arr1.length;i++){
        arr3[i]=arr1[i];
     }
     for(int i=0;i<arr2.length;i++){
        arr3[arr1.length+i]=arr2[i];
     }
   for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    System.out.println("\nnew string ="+new String(arr3));

    }


}
