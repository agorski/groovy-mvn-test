package de.ago

import de.ago.test.groovy.MyTestClass
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.equalTo

/**
 * Created by IntelliJ IDEA.
 * User: albgorski
 * Date: 29.05.11
 * Time: 20:37
 * To change this template use File | Settings | File Templates.
 */
class Test {
  static final Logger LOG = LoggerFactory.getLogger(Test.class);

  @org.junit.Test
  public void testPrivate() {
    LOG.info("calling private method from groovy ...");
    String a = new MyTestClass().getSufixPrivate();
    assertThat(a, equalTo("added"))
  }


  @org.junit.Test
  public void testGroovy() {
    def li = ['a', 'b', 'c', 'd', 'e', 'f']
    assert li.disjoint(['f', 'h']) == false
    assert li.disjoint(['x', 'y']) == true
    assert li.disjoint(['A', 'Z']) == true
  }

}
