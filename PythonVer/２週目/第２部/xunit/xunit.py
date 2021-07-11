"""
TODO
テストメソッドが失敗したとしてもtearDownを呼び出す
複数のテストを走らせる
収集したテスト結果を出力する
"""


class TestResult(object):
    def summary(self):
        return "1 run, 0 failed"


class TestCase(object):
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def run(self):
        self.setUp()
        method = getattr(self, self.name)
        method()
        self.tearDown()


class WasRun(TestCase):
    def setUp(self):
        self.log = "setUp "

    def testMethod(self):
        self.log = self.log + "testMethod "

    def tearDown(self):
        self.log = self.log + "tearDown "


class TestCaseTest(TestCase):
    def testTemplateMethod(self):
        test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown" == test.log)

    def testResult(self):
        test = WasRun("testMethod")
        result = test.run()
        assert("1 run, 0 failed" == result.summary())


print(TestCaseTest("testTemplateMethod").run())
TestCaseTest("testResult").run()
