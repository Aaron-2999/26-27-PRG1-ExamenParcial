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
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;
        int nota5 = 0;
        int nota6 = 0;
        int nota7 = 0;
        int nota8 = 0;
        int nota9 = 0;
        int nota10 = 0;
        double mediaNotas;
        int aprobadas = 0;
        int suspendidas = 0;
        int notaParaAprobar = 5;
        for (int i = 1; i <= asignaturasMatriculadas; i++) {
            System.out.println("Ingrese nota " + i);
            if (i == 1) {
                nota1 = scanner.nextInt();
                if (nota1 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
            } else if (i == 2) {
                nota2 = scanner.nextInt();
                if (nota2 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
            } else if (i == 3) {
                nota3 = scanner.nextInt();
                if (nota3 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
            } else if (i == 4) {
                nota4 = scanner.nextInt();
                if (nota4 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
            } else if (i == 5) {
                nota5 = scanner.nextInt();
                if (nota5 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
            } else if (i == 6) {
                nota6 = scanner.nextInt();
                if (nota6 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
            } else if (i == 7) {
                nota7 = scanner.nextInt();
                if (nota7 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
            } else if (i == 8) {
                nota8 = scanner.nextInt();
                if (nota8 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
            } else if (i == 9) {
                nota9 = scanner.nextInt();
                if (nota9 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
            } else if (i == 10) {
                nota10 = scanner.nextInt();
                if (nota10 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
            }
            
        }
        mediaNotas = (double) (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10) / asignaturasMatriculadas;
        System.out.println("La media de las notas es: " + mediaNotas);
        System.out.println("Número de asignaturas aprobadas: " + aprobadas);
        System.out.println("Número de asignaturas suspendidas: " + suspendidas);
    }
}