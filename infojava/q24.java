class Program24{
    public static void main(String args[]){
        double bl=2.5;
        double bw=1.0;

         double bh=0.75;

          double walll=20;
    
           double wallh=2;
        
            double wallt=0.75;

             double bv=bl*bw*bh;

              double wv=walll*wallh*wallt;
              int n=(int)(wv/bv);
              double cp=900;
              double cost=(cp/100)*n;
              System.out.println("noofbrcik="+n);
              System.out.println("totalcost="+cost);
    }
}