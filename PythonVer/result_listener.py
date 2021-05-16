class ResultListener(object):
    def __init__(self):
        self.count = 0

    def startTest(self):
        self.count = self.count + 1
