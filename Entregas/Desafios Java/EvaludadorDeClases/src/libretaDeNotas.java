import java.util.*;

public class libretaDeNotas {
    public static void main(String[] args) {
        Map<String, List<Integer>> libretaNotas = new HashMap<>();
        String estudiante;
        int nEst;
        int nAsig;
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema automatizado de ingreso de calificaciones");
        do {
            System.out.println("Por favor ingrese el número de estudiantes");
            nEst = sc.nextInt();
            if (nEst <= 0) {
                System.out.println("Ingrese un numero mayor a 0");
            }
        } while (nEst <= 0);
        do {
            System.out.println("Ingrese la cantidad de asignaturas a evaluar");
            nAsig = sc.nextInt();
            if (nAsig <= 0) {
                System.out.println("Ingrese un numero mayor a 0");
            }
        } while (nAsig <= 0);
        Scanner nom = new Scanner(System.in);
        for (int i = 0; i < nEst; i++) {
            System.out.println("Ingrese nombre del estudiante");
            estudiante = nom.nextLine();
            if (libretaNotas.containsKey(estudiante.toLowerCase())) {
                System.out.println("El estudiante ya ha sido ingresado previamente.");
                i -= 1;
                continue;
            }

            List<Integer> notas = new ArrayList<>(nAsig);
            for (int j = 0; j < nAsig; j++) {
                System.out.println("Ingrese evaluaciones del estudiante");
                nota = sc.nextInt();
                if (nota < 10 || nota > 70) {
                    System.out.println("La nota ingresada está fuera de rango. Recuerde escala de 10 a 70");
                    j -= 1;
                    continue;
                }
                notas.add(nota);
            }
            libretaNotas.put(estudiante.toLowerCase(), notas);
        }

        System.out.println("Libreta de notas:");
        for (Map.Entry<String, List<Integer>> entry : libretaNotas.entrySet()) {
            System.out.println("Estudiante: " + entry.getKey() + ", Notas: " + entry.getValue());
        }
        Map<String, Float> libretaPromedios = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : libretaNotas.entrySet()) {
            String est = entry.getKey();
            List<Integer> nPromedios = entry.getValue();
            int suma = 0;
            for (int notaEstudiante : nPromedios) {
                suma += notaEstudiante;
            }
            float promedio = (float) suma / nPromedios.size();
            libretaPromedios.put(est, promedio);
        }
            int menu;
        do {
            System.out.println("*** Menu de acceso a procesamiento de datos: ***");
            System.out.println("Opciones de menu:");
            System.out.println("1. Promedio por estudiante");
            System.out.println("2. Listado de aprobación");
            System.out.println("3. Percentil 50 por estudiante.");
            System.out.println("0. Finalizar");
            System.out.print("Ingrese su opción: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Promedio de notas por estudiante:");
                    for (Map.Entry<String, Float> entry : libretaPromedios.entrySet()) {
                        System.out.println("Estudiante: " + entry.getKey() + ", Promedio: " + entry.getValue());
                    }
                    break;
                case 2:
                    System.out.println("Aprobación por estudiante:");
                    for (Map.Entry<String, Float> entry : libretaPromedios.entrySet()) {
                        Float prom = entry.getValue();
                        boolean apr = (prom > 40);
                        System.out.println("Estudiante: " + entry.getKey() + " aprobado: " + apr);
                    }
                    break;
                case 3:
                    System.out.println("Estudiante se encuentra sobre promedio curso:");
                    float ctrl = 0;
                    for (Map.Entry<String, Float> entry : libretaPromedios.entrySet()) {
                        float aCurso = entry.getValue();
                        ctrl += aCurso;
                }
                    float pCurso = ctrl / libretaPromedios.size();
                    for (Map.Entry<String, Float> entry : libretaPromedios.entrySet()) {
                        String idEst = entry.getKey();
                        Float estProm = entry.getValue();
                        boolean promCurso = estProm > pCurso;
                        System.out.println(idEst + "se encuentra sobre el promedio del curso " + promCurso);
                        }
                 break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        }while (menu != 0) ;
            sc.close(); // int
            nom.close(); // String
        System.out.println("Gracias por utilizar nuestros sistemas, vuelva pronto");
        }
    }
