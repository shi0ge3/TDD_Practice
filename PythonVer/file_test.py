from msilib.schema import File


def setUp(self):
    self.file = File("foobar").open()


def testMethod(self):
    # テストの実行。
    pass


def tearDown(self):
    self.file.close()