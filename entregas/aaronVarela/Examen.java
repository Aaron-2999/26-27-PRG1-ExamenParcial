import java.util.Scanner;
class ClaseJava {
    public static void main(String[] args) {
        System.out.println("Examen Parcial PRG1");
        Scanner scanner = new Scanner(System.in);
        int edadAlumno;
        int asignaturasMatriculadas;
        final int EDADMINIMA = 17;
        final int EDADMAXIMA = 77;
        edadAlumno = scanner.nextInt();
        while (edadAlumno <= EDADMINIMA || edadAlumno >= EDADMAXIMA) {
            System.out.println("Edad no válida, ingrese nuevamente");
            edadAlumno = scanner.nextInt();
        }
        asignaturasMatriculadas = scanner.nextInt();
    }
}