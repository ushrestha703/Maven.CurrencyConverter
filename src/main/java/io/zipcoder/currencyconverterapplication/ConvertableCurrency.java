package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    CurrencyType forEx();

    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/this.forEx().getRate();
    }
}
