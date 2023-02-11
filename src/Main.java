public class Main {

    public static void main(String[] args){
        //Ejercicio 1
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] array1 = new int[]{12, -1, 15, 2, 4, 14};
        System.out.println(ejercicio1.sumArray(array1, array1.length - 1));

        //Ejercicio 2
        Ejercicio2 ejercicio2 = new Ejercicio2();
        String word = "Abecedario";
        System.out.println(ejercicio2.reverseString(word, word.length() - 1));

        //Ejercicio 3
        int[] ejemplo3 = new int[]{1, 2, 3, 4, 5 , 6};
        System.out.println(promArray(ejemplo3, ejemplo3.length - 1));

        //Ejercicio 4
        Ejercicio4 ejercicio4 = new Ejercicio4();
        int[] array4 = new int[]{1, 15, 8, 19, 21, 40, -4, 10};
        if (ejercicio4.findIndex(array4, 0, 19) == -1){
            System.out.println("Ese número no existe");
        }else {
            System.out.println("Index: " + ejercicio4.findIndex(array4, 0, 19));
        }

        //Ejercicio 5
        Ejercicio5 ejercicio5 = new Ejercicio5();
        int[] numeros = new int[]{0, 0};
        numeros =  ejercicio5.divRestasSucesivas(56, 15, 0, numeros);
        System.out.println("El resto es: " + numeros[0] + " y el cociente es: " + numeros[1]);

        //Ejercicio 6
        Ejercicio6 ejercicio6 = new Ejercicio6();
        int n = 2366;
        int m = 273;
        System.out.println("El mcd de " + n + " y " + m + " es: " + ejercicio6.mcd(n, m));

    }

    public static int sumArray(int [] array, int n){

        //caso base
        if (n == 0){
            return array[0];
        }

        //operación y llamado recursivo
        return array[n] + sumArray(array, n - 1);
    }

    public static Double promArray(int [] array, int n){

        //caso base
        if (n == 0){
            return (double) array[0]/array.length;
        }

        //Operación y llamado recursivo
        return (double) array[n]/array.length + promArray(array, n - 1);
    }

}
