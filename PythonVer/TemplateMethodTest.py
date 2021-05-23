from xunit import TestResult


class TemplateMethodTest(object):
    def testTmplateMethod(self):
        test = WasRun("testMethod")
        result = TestResult()
        test.run(result)
        assert("setUp testMethod tear Down " == test.log)

class WasRun(object):
    def setUp(self):
        self.log = "setUp "


    def testMethod(self):
        self.log = self.log + "testMethod "


    def tearDown(self):
        self.log = self.log + "tearDown "
