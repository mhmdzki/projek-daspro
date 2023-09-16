 //projekDaspro;

public class connection {

    namaGuru[] namaGuru = new namaGuru[100];
    int size = 0;

    // input data
    public void inputNamaGuru(namaGuru data){
        namaGuru[size] = data;
        size++;
    }
    // cari username
    public int cariUsername(String Username){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(namaGuru[i].Username.equals(Username)){
                index = i;
                break;
            }
        }
        return index;
    }
    // cari indeks id nama guru
    public int cariIdNamaGuru(int id){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(namaGuru[i].idnamaGuru == (id)){
                index = i;
                break;
            }
        }
        return index;
    }

    // update gaji guru
    public void updateGajiGuru(int id, double gajipokok, double lamajammengajar, double tunjangan){
        int index = cariIdNamaGuru(id);
        namaGuru[index].gajipokok = gajipokok;
        namaGuru[index].lamajammengajar = lamajammengajar;
        namaGuru[index].tunjangan = tunjangan;
        
        // Add this line to print a message
        System.out.println("Gaji update for namaGuru with id: " + id);
    }

    // tampil daftar nama guru
    public void tampil() {
        for (int i=0; i< size; i++) {
            namaGuru[i].tampil();
            
            // Add this line to print a message
            System.out.println("Printing data for namaGuru " + i);
        }
    }

    // tampilkan data tertentu
    public void tampilDataTertentu(int id) {
        int index = cariIdNamaGuru(id);
        namaGuru[index].tampil();
        
        // Add this line to print a message
        System.out.println("Printing data for namaGuru with id: " + id);
    }
}
