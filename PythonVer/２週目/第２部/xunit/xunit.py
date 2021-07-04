class WasRun(object):
    def __init__(self, name):
        self.wasRun = None


test = WasRun("testMethod")
print(test.wasRun)
test.testMethod()
print(test.wasRun)
