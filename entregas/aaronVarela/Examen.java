import java.util.Scanner;
class ClaseJava {
    public static void main(String[] args) {
        System.out.println("Examen Parcial PRG1");
        Scanner scanner = new Scanner(System.in);
        int edadAlumno;
        int asignaturasMatriculadas;
        final int ASIGNATURASMINIMAS = 1;
        final int ASIGNATURASMAXIMAS = 10;
        final int EDADMINIMA = 17;
        final int EDADMAXIMA = 77;
        System.out.println("Ingrese la edad del alumno");
        edadAlumno = scanner.nextInt();
        while (edadAlumno <= EDADMINIMA || edadAlumno >= EDADMAXIMA) {
            System.out.println("Edad no válida, ingrese nuevamente");
            edadAlumno = scanner.nextInt();
        }
        System.out.println("Ingrese el número de asignaturas matriculadas");
        asignaturasMatriculadas = scanner.nextInt();
        while (asignaturasMatriculadas < ASIGNATURASMINIMAS || asignaturasMatriculadas > ASIGNATURASMAXIMAS) {
            System.out.println("Número de asignaturas no válido, ingrese nuevamente");
            asignaturasMatriculadas = scanner.nextInt();
        }
    }
}