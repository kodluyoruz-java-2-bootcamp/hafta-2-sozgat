package org.kodluyoruz;

/**
 * Bu sınıf bilgisayar donanımları için hazırlanmış bir üst sınıftır.
 *
 * Her donanım için ortak olan 3 özellik vardır:
 *      - Markası (brand) (String türünde) Örnek: AMD, Intel, Nvidia, Samsung vs.
 *      - Fiyatı (price) (double türünde)
 *      - Çalışırken harcayacağı güç (power) (int türünde) Not: 1 ile 150 arasında bir değer verebilirsiniz.
 *
 * TODO Bu 3 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public abstract class Hardware
{
    protected String brand;
    protected double price;
    protected int power;

    abstract void setBrand(String brand);

    abstract void setPrice(double price);

    abstract void setPower(int power);

    abstract double calculatePrice(double price);


}
