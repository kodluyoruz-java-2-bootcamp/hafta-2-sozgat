package org.kodluyoruz;

/**
 * Bu sınıf bir SSD'yi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her SSD'nin Hardware sınıfındakilere ek olarak 1 özelliği vardır:
 *      - Hafıza boyutu, GB cinsinden (memory) (int türünde) Örnek: 500 GB, 750 GB vs.
 *
 * TODO Bu özellik ve metotları için gereken kodları bu sınıfın içine yazın
 */
public class SSD extends Hardware
{
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    void setPower(int power) {
        this.power = power;
    }

    @Override
    void setPrice(double price) {
        this.price = price;
    }

    /*
     * Eğer SSD'nin hafızası 750 GB'tan fazlaysa, her 250 GB için fiyatı 275 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    double calculatePrice(double price) {
        double newPrice = price;
        if (getMemory()>750){
            for (int i = 750; i < getMemory() && getMemory() - i > 250 ; i+=250) {
                newPrice+=275;
            }
        }
        return newPrice;
    }
}
