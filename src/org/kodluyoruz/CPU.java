package org.kodluyoruz;

/**
 * Bu sınıf bir işlemciyi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her işlemcinin Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Çekirdek sayısı (cores) (int türünde)
 *      - Thread sayısı (threads) (int türünde)
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class CPU extends Hardware
{
    private int cores;
    private int threads;

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
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
     * Çekirdek sayısı 6 veya daha fazlaysa CPU'nun fiyatı %30 oranında artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    double calculatePrice() {
        double newPrice = this.price;
        if (getCores() >= 6 ){
            newPrice = newPrice*130/100;
            return newPrice;
        }
        else{
            return newPrice;
        }
    }
}
