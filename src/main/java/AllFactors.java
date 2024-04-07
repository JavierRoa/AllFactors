// Aclaración: En la clase main, agregué unos espacios entre resultados de cada
// llamada del método printFactors, para hacer más fácil la legibilidad de los resultados. Además,
// a pesar de que el desafío especifica que puede entregarse el resultado sin la separación
// por comas, decidí crear otro método que hiciera esto, ya que además de agregar un poco
// más de dificultad, ayuda al orden de los resultados.

public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
        System.out.println(" ");
        printFactors(32);
        System.out.println(" ");
        printFactors(10);
        System.out.println(" ");
        printFactors(-1);
        System.out.println(" ");
        printFactorsWithComas(6);
        printFactorsWithComas(32);
        printFactorsWithComas(10);
        printFactorsWithComas(-1);
    }
    private static void printFactors(int number) {
        // Valida que el número sea mayor a 1 y si no lo es, imprime el mensaje adecuado.
        if(number<1) {
            System.out.println("Invalid Value");
            return;  // Este return no es realmente necesario para el funcionamiento, sin embargo, hará que el método se detenga ahí y no pierda tiempo en leer el resto del código.
        }
        // Uso bucle for para verificar cada número entre 1 y el parámetro number, y:
        for(int i=1; i<=number; i++) {
            // Si el índice divide a number sin dejar resto, imprime el índice.
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }
    private static void printFactorsWithComas(int number) {
        // Valida que el número sea mayor a 1 y si no lo es, imprime el mensaje adecuado.
        if(number<1) {
            System.out.println("Invalid Value");
            return;  // Este return no es realmente necesario para el funcionamiento, sin embargo, hará que el método se detenga ahí y no pierda tiempo en leer el resto del código.
        }
        String allFactors = "";  // Creo un string vacío.
        int index = 1;  // Creo una variable index, la cual se inicializa en 1.
        // Uso un bucle while, el cual en cada iteración:
        while(index <= number) {
            // Si el índice divide a number sin dejar resto, concatena index a allFactors.
            if(number % index == 0) {
                allFactors += index;
                // Para agregar una coma luego de cada número, excepto el final, verifico
                // en un if anidado si index es menor a number. Una vez cumplida esta
                // condición, se concatena ", " a allFactors.
                if(index < number) {
                    allFactors+= ", ";
                }
            }
            index++;  // Incremento index en 1
        }
        // Finalmente, imprimo allFactors, con todos los números separados por comas.
        System.out.println(allFactors);
    }
}