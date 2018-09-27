package part01.chapter09;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
