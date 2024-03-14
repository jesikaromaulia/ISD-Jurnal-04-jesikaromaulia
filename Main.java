import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Tugas> listTugas = new LinkedList<Tugas>();
        ListIterator<Tugas> iterator = listTugas.listIterator();

        Scanner jes = new Scanner(System.in);
        boolean run = true;

        while(run) {
            System.out.println("1. Input Tugas \n2. Delete Tugas \n3. Lihat List Tugas \n4. Keluar");

            int pilihan = jes.nextInt();
            jes.nextLine();

            switch(pilihan) {
                case 1:
                    System.out.println("Input Data Tugas");
                    System.out.print("Mata Kuliah : ");
                    String namaMK = jes.nextLine();

                    System.out.print("Tugas : ");
                    String namaTugas = jes.nextLine();

                    System.out.print("Deadline : ");
                    String deadline = jes.nextLine();

                    listTugas.addFirst(new Tugas(namaMK, namaTugas, deadline));
                    break;
                case 2:
                    System.out.println("Pilih Tugas");
                    System.out.print("1. Hapus Depan \n2. Hapus Belakang \n3. Hapus Berdasarkan Nama Mata Kuliah \n4. Hapus Berdasarkan Nama Tugas");

                    int pil = jes.nextInt();

                    switch (pil) {
                        case 1:
                            listTugas.removeFirst();
                            System.out.println("Data di depan list berhasil dihapus");
                            break;
                        case 2:
                            listTugas.removeLast();
                            System.out.println("Data di belakang tugas berhasil dihapus");
                            break;
                        case 3:
                            iterator = listTugas.listIterator();
                            System.out.print("Nama Mata Kuliah: ");
                            String mataKuliah = jes.next(); jes.nextLine();

                            while (iterator.hasNext()) {
                                Tugas delete = iterator.next();
                                if (delete.getNamaMK().equals(mataKuliah)) {
                                    iterator.remove();
                                }
                            }
                            System.out.println("Tugas mata kuliah " + "\"" + mataKuliah + "\"" + " berhasil dihapus dari list");
                            break;
                            case 4:
                                iterator = listTugas.listIterator();
                                System.out.print("Nama Tugas: ");
                                String tugas = jes.next(); jes.nextLine();

                                while (iterator.hasNext()) {
                                    Tugas delete = iterator.next();
                                    if (delete.getNamaTugas().equals(tugas)) {
                                        iterator.remove();
                                    }
                                }
                                System.out.println("Tugas berjudul " + "\"" + tugas + "\"" + " berhasil dihapus dari list");
                                break;
                    }
                    break;
                case 3:
                    for (Tugas n : listTugas) {
                        System.out.println(n);
                    }
                    break;
                case 4:
                run = false;
                break;

            }

        }
    }   
}