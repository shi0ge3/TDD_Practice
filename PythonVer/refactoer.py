class testSuite(object):
    def __init__(self):
        self.tests = []

    def add(self, test):
        self.test = test
        self.tests.append(test)

    def run(self, result):
        for test in self.teststests:
            test.run(result)


class TestCase:
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def run(self, result):
        result.testStarted()
        self.setUp()
        try:
            method = getattr(self, self.name)
            method()
        except:
            result.testFailed()
        self.tearDown()


class WasRun(TestCase):
    def setUp(self):
        self.log = "setUp "

    def testMethod(self):
        self.log = self.log + "testMethod "