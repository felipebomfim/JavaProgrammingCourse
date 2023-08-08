package in28minutes.sorting.consumer;

import java.util.logging.Logger;
import java.util.List;

import in28minutes.sorting.util.MySortingUtil;

public class MySortingUtilConsumer {
    
    public static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());
    
    public static void main(String[] args) {
        MySortingUtil util = new MySortingUtil();
        List<String> sorted = util.sort(List.of("John","Zeus","Thor","Mary"));
        logger.info(sorted.toString());
        
    }
}
