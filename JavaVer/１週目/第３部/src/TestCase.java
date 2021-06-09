public class TestCase {
    public void runBare() throws Throwable {
        setUp();
        try {
            runTest();
        }
        finally {
            tearDown();
        }
    }

    public void setUp() {
    }

    public void runTest() {
    }

    public void tearDown() {
    }
}
