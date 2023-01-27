from app.hello_world import HelloWorld


def test_greets_the_world():
    hw = HelloWorld()
    assert hw.greets_the_world() == "Hello, world!"
