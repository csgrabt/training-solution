package methodparam.measuring;

public class Measurement {

    private double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }


    public double[] getValues() {
        return values;
    }

    public int findFirstIndexInLimit(int lower, int upper){
            for(int i = 0; i < values.length; i++){
                if(lower < values[i] & upper > values[i] ){return i;}
            }


        return -1;}


    public double minimum(){
        double min = 10000000.0;

        for (double n: values){
            if (n < min)
            {min = n;}

        }


    return min;}


    public double maximum(){
        double max = 0.0;

        for (double n: values){
            if (n > max)
            {max = n;}

        }


        return max;}




    public   ExtremValues minmax(){



        return new ExtremValues(minimum(), maximum());
    }








}













