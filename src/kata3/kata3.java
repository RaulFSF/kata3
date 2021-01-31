package kata3;

public class kata3 {
    public static void main(String[] args){
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ulpg.es");
        histogram.increment("ull.es");
        histogram.increment("dis.ulpg.es");
        histogram.increment("gmail.es");
        histogram.increment("ulpg.es");
        histogram.increment("dis.ulpg.es");
        histogram.increment("gmail.es");
        histogram.increment("ull.es");
        histogram.increment("dis.ulpg.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
   
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM",histogram);
        histogramDisplay.execute();
    }
}
