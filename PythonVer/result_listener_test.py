import xunit


def testNotification(self):
    self.count = 0
    result = xunit.TestResult()
    result.addListener(self)
    xunit.WasRun("testMethod").run(result)
    assert(1 == self.count)


def startTest(self):
    self.count = self.count + 1
