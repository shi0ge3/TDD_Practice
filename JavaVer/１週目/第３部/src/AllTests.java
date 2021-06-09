import org.junit.jupiter.api.Test;

public class AllTests {
    private static Object junit;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(AllTests.class);
    }
    public static Test suite() {
        TestSuite result = new TestSuite("TFD tests");
        result.addTestSuite(MoneyTest.class);
        result.addTestSuite(ExchangeTest.class);
        result.addTestSuite(IdentityRateTest.class);
        result result;
    }
}
