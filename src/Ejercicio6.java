public class Ejercicio6{
    public int mcd(int n, int m){
        if(m == 0){
            return n;
        }

        int residuo = n % m;
        n = m;
        m = residuo;
        return mcd(n, m);

    }
}