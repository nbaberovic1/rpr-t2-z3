package ba.unsa.etf.rpr;

import java.util.List;

public class MatVis {

    /**
     * vraća minimalni element
     * @param lista
     * @return minimalnu vrijednost u proslijeđenoj listi
     */

    public static Double min(List<Double> lista){
        double min = Double.MAX_VALUE;
        for(Double x : lista){
            if(x.doubleValue() < min) min = x.doubleValue();
        }
        return min;
    }

    /**
     * vraća maksimalni element
     * @param lista
     * @return maksimalnu vrijednost u proslijeđenoj listi
     */

    public static Double max(List<Double> lista){
        double max = Double.MIN_VALUE;
        for(Double x : lista){
            if(x.doubleValue() > max) max = x.doubleValue();
        }
        return  max;
    }

    /**
     * vraća mean proslijeđene liste
     * @param lista
     * @return
     */

    public static Double mean(List<Double> lista){
        double sum = 0;
        for (Double x : lista){
            sum = sum + x.doubleValue();
        }
        return sum / lista.size();
    }

    /**
     * vraća standardnu devijaciju proslijeđene liste
     * @param lista
     * @return
     */

    public static Double standardnaDevijacija(List<Double> lista){
        Double mean = MatVis.mean(lista);
        double sum = 0;
        for(Double x : lista){
            sum = sum + Math.pow(x - mean, 2);
        }
        return Math.sqrt(sum / lista.size());
    }
}
