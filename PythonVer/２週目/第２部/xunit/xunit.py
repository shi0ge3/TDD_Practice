"""
TODO
setUpを最初に呼び出す
tearDownを後で呼び出す
テストメソッドが失敗したとしてもtearDownを呼び出す
複数のテストを走らせる
収集したテスト結果を出力する
"""

class TestCase(object):
    def __init__(self, name):
        self.name = name

    def run(self):
        method = getattr(self, self.name)
        method()


class WasRun(TestCase):
    def __init__(self, name):
        self.wasRun = None
        super().__init__(name)

    def testMethod(self):
        self.wasRun = 1


class TestCaseTest(TestCase):
    def testRunning(self):
        test = WasRun("testMethod")
        assert(not test.wasRun)
        test.run()
        assert(test.wasRun)

    def testSetUp(self):
        test = WasRun("testMthod")
        test.run()
        assert(test.wasSetUp)


print(TestCaseTest("testRunning").run())
print(TestCaseTest("testSetUp").run())
