package com.t4a.processor;

import com.t4a.predict.PredictionLoader;
import org.springframework.context.ApplicationContext;

/**
 * This will ensure that the action classes are loaded from Spring Applicaiton Context rather than
 * creating the new one , the advantage of that is we can maintain spring dependency injection for all the beans
 */
public class SpringAwareActionProcessor extends ActionProcessor{

    public SpringAwareActionProcessor(ApplicationContext context)  {
        PredictionLoader.getInstance(context);

    }
}
