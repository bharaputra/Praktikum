public abstract class Peminjam implements UserLogin {

    public boolean isLogin;
    public String nim;

    @Override
    public void doLogin() {
        System.out.println("Peminjam berhasil Login");
        isLogin = true;
    }

    @Override
    public void doLogout() {
        System.out.println("Peminjam berhasil Logout");
        isLogin = false;
    }

    @Override
    public boolean isLogin() {
        return isLogin;
    }

    public abstract void setKodePeminjam(String KodePeminjam);

    public abstract String getKodePeminjam();

    public abstract void setNamaPeminjam(String NamaPeminjam);

    public abstract String getNamaPeminjam();

}
