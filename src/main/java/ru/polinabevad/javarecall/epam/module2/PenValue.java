package ru.polinabevad.javarecall.epam.module2;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PenValue {
    private int price;
    private String productName;

    public PenValue(int i, String s) {
        price = i;
        productName = s;
    }

    public PenValue() {

    }

    public static void main(String[] args) {
        val pen = new PenValue()
                .setPrice(1)
                .setProductName(" ");
        System.out.println(pen);
        System.out.println(pen.equals(new PenValue(1," ")));
    }


    protected boolean canEqual(Object other) {
        return other instanceof PenValue;
    }

}
