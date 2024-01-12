public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
        BaseKrediManager[] var2 = krediManagers;
        int var3 = krediManagers.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            BaseKrediManager krediManager = var2[var4];
            System.out.println(krediManager.hesapla(1000.0));
        }

    }
}