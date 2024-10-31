package com.example.task02;

public class DiscountBill extends Bill {
    private long discount;

    private long getDiscount(){
        return this.discount;
    }
    private void setDiscount(long discount){
        this.discount = discount;
    }

    public long getDiscountPrice(){ //Возвраст стоимости с учётом скидки
        return this.getPrice()*(1-discount);
    }

    private long getProcent(){ //Возврат процента скидки
        return discount*100;
    }

    public long getAbsoluteDiscount(){ //Возврат разницы между полной стоимостью и стоимостью со скидкой
        return this.getPrice() - this.getDiscountPrice();
    }
}
