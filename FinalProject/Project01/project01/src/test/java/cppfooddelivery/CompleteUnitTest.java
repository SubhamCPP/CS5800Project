package cppfooddelivery;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({FactoryTest.class, FlyweightTest.class, CPPFoodDeliveryTest.class})
public class CompleteUnitTest {
}
