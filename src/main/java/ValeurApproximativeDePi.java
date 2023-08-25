public class ValeurApproximativeDePi {

    public  static double approx(double[][] pts){
        double estimation = 0d;
        double nbInside = 0d;
        for(double[] pt : pts){
            double x = pt[0];
            double y = pt[1];
            if( (x*x)+(y*y) <= 1){
                nbInside = nbInside+1;
            }
        }

        return estimation = (nbInside/pts.length)*4;
    }


}
