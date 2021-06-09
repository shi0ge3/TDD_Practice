import java.lang.reflect.Method;

abstract class Report {
    String printMessage;

    Report(String printMessage) {
        this.printMessage = printMessage;
    }

    void print() throws ReflectiveOperationException {
        Method runMethod = getClass().getMethod(this.printMessage, null);
        runMethod.invoke(this, new Class[0]);
    }

    void printHTML(){}

    void printXML(){}
}
