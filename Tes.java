abstract class LayananTransportasi {
    protected String namaDriver;
    protected double jarak;
    protected double saldoUser;

    public LayananTransportasi(String namaDriver, double jarak, double saldoUser){
        this.namaDriver = namaDriver;
        this.saldoUser = saldoUser;
        if (jarak <= 0) {
            this.jarak = 1;
        } else {
            this.jarak = jarak;
        }
    }
    public abstract void hitungTarif();
}

class MadiunMotor extends LayananTransportasi {
    private double tarif;
    private double nim;
    private String nama;
    
    public MadiunMotor(String namaDriver, double jarak, double saldoUser, double nim, String nama){
        super(namaDriver, jarak, saldoUser);
        this.tarif = 2500;
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public void hitungTarif(){
        System.out.println("Tarif perjalanan adalah: "+tarif+" / km");
    }
    
    public void prosesTransaksi(){
        System.out.println("Transaksi oleh ");
    }
}

class MadiunMobil extends LayananTransportasi {
    private double tarif = 5000;
    
    public MadiunMobil(String namaDriver, double jarak, double saldoUser){
        super(namaDriver, jarak, saldoUser);
    }

    @Override
    public void hitungTarif(){
        System.out.println("Tarif perjalanan adalah: "+tarif+" / km");
    }
}