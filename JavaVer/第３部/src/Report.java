abstract class Report {
    String printMessage;

    Report(String printMessage) {
        this.printMessage = printMessage;
    }

    void print() {
        switch (printMessage) {
            case "printHTML":
                printHTML();
                break;
            case "printXML":
                printXML();
                break;
        }
    }

    void printHTML(){}

    void printXML(){}
}
