import xunit
import result_listener


def testNotification(self):
    result = xunit.TestResult()
    listener = result_listener.ResultListener()
    result.addListener(listener)
    xunit.WasRun("testMethod").run(result)
    assert(1 == listener.count)
