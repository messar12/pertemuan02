import Koneksi.Database;
import Model.Mahasiswa;
import Model.Dosen;
import Model.MataKuliah;

public class Main{
	public static void main (String [] args){
		System.out.println("ini program Main");
		Database.hubungkan();
		Dosen.TampilanInfo();
		Mahasiswa.TampilanInfo();
		MataKuliah.TampilanInfo();
		
		
		
	}
}