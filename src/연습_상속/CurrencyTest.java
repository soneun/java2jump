package 연습_상속;

public class CurrencyTest {
    public static void main(String[] args) {
        //객체 생성
        KRW krw = new KRW(1500,"원");
        USD usd = new USD(100.50,"달러");
        EUR eur = new EUR(260.87,"유로");
        JPY jpy = new JPY(1400,"엔");

        //부모 클래스를 통한 그룹화
        Currency[] currencies = {krw,usd,eur,jpy};

        //모든 화폐정보를 출력
        for (Currency c : currencies) {
            System.out.println(c.toString());
        }


    }
}
class Currency {
    public double amount;
    public String notation;

    Currency(double amount, String notation) {
        this.amount = amount;
        this.notation = notation;
    }
    public String toString() {
        return String.format("%.2f %s", amount,notation);
    }
}

class KRW extends Currency {
    KRW(double amount, String notation) {
        super(amount, notation);
    }
    public String toString(){
        return String.format("KRW: %.2f %s\n", amount, notation);
    }
}
class USD extends Currency {
    USD(double amount, String notation) {
        super(amount, notation);
    }
    public String toString(){
        return String.format("USD: %.2f %s\n", amount,notation);
    }
}
class EUR extends Currency {
    EUR(double amount, String notation) {
        super(amount, notation);
    }
    public String toString(){
        return String.format("EUR: %.2f %s\n", amount,notation);
    }
}
class JPY extends Currency {
    JPY(double amount, String notation) {
        super(amount, notation);
    }
    public String toString(){
        return String.format("JPY: %.2f %s\n", amount,notation);
    }
}
