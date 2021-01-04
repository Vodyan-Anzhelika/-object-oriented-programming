public class Test {


    /*
    Допустим у нас есть мобильное приложение, которые отвечает
    за все наши средства, хранящиеся на разных счетах и в разных банках.
    Допустим мы хотим совершить покупку с помощью этого приложения, но мы не помним
    на каком счету сколько денег.
    Тогда паттерн цепочка обязаностей поможет нам это сделать.
    Мы выстраиваем цепочку из наших счетов, и при попытке оплатить какой-либо товар
    деньги на счетах будут проверяться по цепочке - если на первом счете не хватает денег, будет произведена
    попытка оплаты с 2-ого счета, если и на 2-ом нет достаточной суммы, то будет произведена попытка оплаты
    с 3-его счета. Если и на нем не хватает денег, то покупка не будет соверешена.
    p.s. и не важно что western union это вообще другое
     */
    @org.testng.annotations.Test
    public void canPay() {
        Sberbank sberbank = new Sberbank(100);
        WesternUnion wu = new WesternUnion(200);
        Mastercard mc = new Mastercard(300);
        sberbank.setNext(wu);
        wu.setNext(mc);
        sberbank.pay(70);
        System.out.println("--------------------------------------");
        sberbank.pay(130);
        System.out.println("--------------------------------------");
        sberbank.pay(294);
        System.out.println("--------------------------------------");
        sberbank.pay(500);
        System.out.println("--------------------------------------");
        System.out.println("Sberbank ="+sberbank.getBalance());
        System.out.println("WesternUnion ="+wu.getBalance());
        System.out.println("Mastercard ="+mc.getBalance());
    }
}