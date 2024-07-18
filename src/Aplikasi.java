class Aplikasi {
    private Person person;
    private int poin = 0;
    boolean isDaftarProgram = false;
    Aplikasi(Person person) {
        this.person = person;
    }
    void daftarProgram(){
        if(person.isLogin){
            System.out.println("Anda terdaftar di program afiliasi");
            isDaftarProgram = true;
        } else {
            System.out.println("Anda harus login terlebih dahulu");
        }
    }
    void pilihProduk(String produk){
        if(isDaftarProgram) {
            System.out.println("Anda telah memilih produk " + produk + " Untuk di promosikan");
        } else {
            System.out.println("Anda harus mendaftar program afiliasi terlebih dahulu");
        }
    }
    void membagikanTautan(){
        if(isDaftarProgram){
            System.out.println("Anda sudah membagikan link afiliasi (poin +10)");
            addPoin(10);

        } else {
            System.out.println("Anda harus mendaftar program afiliasi terlebih dahulu");
        }
    }
    void addPoin(int poin){
        this.poin += 10;
    }
    void statusPendaftaran(){
        if(isDaftarProgram){
            System.out.println("Anda SUDAH terdaftar program afiliasi di aplikasi ini");
        } else {
            System.out.println("Anda BELUM terdaftar program afiliasi di aplikasi ini");
        }
    }
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getPoin() {
        return poin;
    }

    public void setPoin(int poin) {
        this.poin = poin;
    }

    public boolean isDaftarProgram() {
        return isDaftarProgram;
    }

    public void setDaftarProgram(boolean daftarProgram) {
        isDaftarProgram = daftarProgram;
    }
}
