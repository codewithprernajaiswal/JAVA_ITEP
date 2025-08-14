class Test{
    public static void main(String args[]){
    int n1[] = {1, 5, 10, 20, 40, 80};
int n2[] = {6, 7, 20, 80, 100};
int n3[] = {3, 4, 15, 20, 30, 70, 80, 120};
int x=0,y=0,z=0;
int al[];
while(x<n1.length && y<n2.length && z<n3.length){
    if(n1[x]==n2[y] && n2[y]==n3[z]){
        System.out.println(n1[x]);
    //    al=x;
       x++;
       y++;
       z++;
    }
    else if(n1[x]<n2[y]){
        x++;
    }
    else if(n2[y]<n3[z]){
        y++;
    }
    else {
        z++;
    }

}

// // System.out.println("al="+al[]);
// System.out.println("Given Data..");
//         for(int i=0; i<n; i++)
//           System.out.println(al[i]);
    }
}