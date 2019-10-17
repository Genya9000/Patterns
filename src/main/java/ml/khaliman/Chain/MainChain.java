package Patterns.Chain;

public class MainChain {
    public static void main(String args[]) {
// конфигурирование цепочки
        Fiksation root = new Fiksation("Фиксация сделана");
        Control control = new Control(root, "Контроль осуществлен");
        Comission comission = new Comission(control, "комиссия снята");
// запуск
        System.out.println("Message from Comission < " + comission.handleRequest() +" >");
    }
}
