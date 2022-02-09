package Arrays;

public class Principal {
    public static void main(String[] args) {
        Student[] arr;
        // Asigna en memoria 5 objetos del tipo student
        arr = new Student[5];
        // inicializa elementos del array
        arr[0] = new Student(1, "uno");
        arr[1] = new Student(2, "uno");
        arr[2] = new Student(3, "uno");
        arr[3] = new Student(4, "uno");
        arr[4] = new Student(5, "uno");
    }
}
