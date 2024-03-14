public class Tugas {
    String namaMK;
    String namaTugas;
    String deadline;

    public Tugas(String namaMK, String namaTugas, String deadline) {
        this.namaMK = namaMK;
        this.namaTugas = namaTugas;
        this.deadline = deadline;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    @Override
    public String toString() {
        return "Mata Kuliah = " + namaMK + ", Tugas = " + namaTugas + ", Deadline = " + deadline;
    }
}