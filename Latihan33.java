/**
 * Latihan33
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : User Login
 */

class user {
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String UserName,String Password){
        if (UserName.equals(username)){
            statusAkun = true;      
        }
        else if ( Password.equals(password)){
             statusAkun = false;  
        } 
        else{
            statusAkun = false;
        }
         return statusAkun;
       

}

    private void hasilLogin(boolean statusAkun, String UserName){
        if(statusAkun){
            System.out.println("*****HALLO " + UserName.toUpperCase() 
                                + "*****");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else {
            System.out.println("Ooops,Username atau Password Anda salah");
        }

        }
    

    public void pengecekanLogin(String UserName, String Password){
        System.out.println(cekAkun(UserName, Password));
        hasilLogin(statusAkun, UserName);
    }
}
