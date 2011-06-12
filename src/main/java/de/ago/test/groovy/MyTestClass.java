package de.ago.test.groovy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: albgorski
 * Date: 29.05.11
 * Time: 17:47
 * To change this template use File | Settings | File Templates.
 */
public class MyTestClass {
  private static final Logger LOG = LoggerFactory.getLogger(MyTestClass.class);

    public String myPublicMethod(String input) {
        return input + getSufixPrivate();
    }

    private String getSufixPrivate() {
        LOG.debug("executing private method...");
        return "added";
    }
}
