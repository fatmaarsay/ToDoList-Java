package todolist;

public class ToDoList {

    int id;
    float tarih;

    String baslik, aciklama;
    Boolean durum;

    @Override
    public String toString() {
        return String.valueOf(id) + " | " + baslik + " | " + aciklama + " | " + tarih + " | " + durum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public float getTarih() {
        return tarih;
    }

    public void setTarih(float tarih) {
        this.tarih = tarih;
    }

    public Boolean getDurum() {
        return durum;
    }

    public void setDurum(Boolean durum) {
        this.durum = durum;
    }

    public static void main(String[] args) {

    }

}
