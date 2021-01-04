public class Test {
    /*
    Простыми словами - данная программа позволяет переводить текст из нижнего регистра
    в верхний и наоборот. Все это реализоано с помощью патерна интепретатор.
    В качестве интерпретатора используется интерфейс Epression.
    Две реализации интерфейс - LowerExpression и UpperExpression представляют нетерминальные объекты.
    Они реализуют операции перевода текста в нижний и верхний регистр соотвественно.
    Класс Context определяет методы для установки значений переменных и для получения их значений.
     */
    @org.junit.jupiter.api.Test
    public void interpret() {
        String str = "teXt fOr cheCk";
        Context context = new Context();
        Expression loverExpression = new LowerExpression(str);
        str = loverExpression.interpret(context);
        System.out.println(str);
        Expression upperExpression = new UpperExpression(str);
        str = upperExpression.interpret(context);
        System.out.println(str);
    }
}
