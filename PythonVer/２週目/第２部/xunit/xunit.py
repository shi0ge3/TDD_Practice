"""
TODO
tearDownを後で呼び出す
テストメソッドが失敗したとしてもtearDownを呼び出す
複数のテストを走らせる
収集したテスト結果を出力する
WasRunで文字列をログに記録する
"""


class TestCase(object):
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def run(self):
        self.setUp()
        method = getattr(self, self.name)
        method()


class WasRun(TestCase):
    def setUp(self):
        self.wasRun = None
        self.log = "setUp "

    def testMethod(self):
        self.wasRun = 1
        self.log = self.log + "testMethod "


class TestCaseTest(TestCase):
    def setUp(self):
        self.test = WasRun("testMethod")

    def testSetUp(self):
        self.test.run()
        assert("setUp testMethod " == self.test.wasSetUp)


print(TestCaseTest("testSetUp").run())
