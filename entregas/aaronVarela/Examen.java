import java.util.Scanner;
class ClaseJava {
    public static void main(String[] args) {
        System.out.println("Examen Parcial PRG1");
        Scanner scanner = new Scanner(System.in);
        int edadAlumno;
        edadAlumno = scanner.nextInt();
        if (edadAlumno >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}