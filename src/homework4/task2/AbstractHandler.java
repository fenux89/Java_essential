package homework4.task2;

public abstract class AbstractHandler {
    abstract void open();

    abstract void create();

    abstract void change();

    abstract void save();
}

class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Open DOC");
    }

    @Override
    void create() {
        System.out.println("Create DOC");
    }

    @Override
    void change() {
        System.out.println("Change DOC");
    }

    @Override
    void save() {
        System.out.println("Save DOC");
    }
}
class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Open TXT");
    }

    @Override
    void create() {
        System.out.println("Create TXT");
    }

    @Override
    void change() {
        System.out.println("Change TXT");
    }

    @Override
    void save() {
        System.out.println("Save TXT");
    }
}
class XMLHandler extends  AbstractHandler {
    @Override
    void open() {
        System.out.println("Open XML");
    }

    @Override
    void create() {
        System.out.println("Create XML");
    }

    @Override
    void change() {
        System.out.println("Change XML");
    }

    @Override
    void save() {
        System.out.println("Save XML");
    }
}
