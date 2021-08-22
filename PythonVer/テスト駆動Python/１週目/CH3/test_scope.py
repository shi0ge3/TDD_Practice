import pytest


@pytest.fixture(scope='function')
def func_scope():
    """"""

@pytest.fixture(scope='module')
def mod_scope():
    """"""

@pytest.fixture(scope='session')
def sess_scope():
    """"""

@pytest.fixture(scope='class')
def class_scope():
    """"""

def test_1(sess_scope, mod_scope, func_scope):
    """"""

def test_2(sess_scope, mod_scope, func_scope):
    """"""


@pytest.mark.usefixtures('class_scope')
class testSomething(object):
    """Demo class scope fixtures."""

    def test_3(self):
        """Test using a class scope fixture"""

    def test_4(self):
        """Again, multiple tests area more fun."""
