class Person {
    private String nama;
    private int umur;
    private String email;
    private String  password;
    private double balance;
    boolean isLogin = false;
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    void addPoint(double point){
        this.balance += (point*1000);
    }
    public void buat_akun(String email, String password) {
        isLogin = true;
        setEmail(email);
        setPassword(password);
        System.out.println("Akun telah dibuat");
        System.out.println("Email : " + getEmail());
        System.out.println("Password : [hidden]");
    }
}
