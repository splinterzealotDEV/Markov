public class Markov {
    private int[] salidas;
    private int[] estados;
    private double[] probI;
    private double[][] A;
    private double[][] B;
    private int[] observaciones;
    private double[][] alfa;
    private double[][] beta;
    public Markov()
    {

    }

    public int[] getSalidas() {
        return salidas;
    }

    public int[] getEstados() {
        return estados;
    }

    public double[] getProbI() {
        return probI;
    }

    public double[][] getpTrans() {
        return A;
    }

    public double[][] getPsalidas() {
        return B;
    }

    public void setSalidas(int[] salidas) {
        this.salidas = salidas;
    }

    public void setEstados(int[] estados) {
        this.estados = estados;
    }

    public void setProbI(double[] probI) {
        this.probI = probI;
    }

    public void setpTrans(double[][] pTrans) {
        this.A = pTrans;
    }

    public void setPsalidas(double[][] psalidas) {
        this.B = psalidas;
    }

    public double[][] getA() {
        return A;
    }

    public double[][] getB() {
        return B;
    }

    public int[] getObservaciones() {
        return observaciones;
    }

    public double[][] getAlfa() {
        return alfa;
    }

    public double[][] getBeta() {
        return beta;
    }

    public void setA(double[][] a) {
        A = a;
    }

    public void setB(double[][] b) {
        B = b;
    }

    public void setObservaciones(int[] observaciones) {
        this.observaciones = observaciones;
    }

    public void setAlfa(double[][] alfa) {
        this.alfa = alfa;
    }

    public void setBeta(double[][] beta) {
        this.beta = beta;
    }

    public void inicializar(double[][] a, double[][] b, double[] pi, int[] est, int[]salid, int[] o)
    {
        setA(a);
        setB(b);
        setProbI(pi);
        setEstados(est);
        setSalidas(salid);
        setObservaciones(o);
        this.alfa=new double[est.length][est.length];
        this.beta=new double[est.length][o.length];
    }

    public void forward()
    {

        double alpha=0;

        for(int i=0;i<estados.length;i++)
        {
            System.out.println(i+"alv");
            alpha=probI[i]*B[observaciones[0]-1][i];
            alfa[0][i]=alpha;

            System.out.println(alpha+"tu jefa");
        }
        alpha=0;

        //int t=0;
        int tj=0;
        for(int i=0;i<estados.length;i++)
        {
            for(int j=0;j<estados.length;j++)
            {
                for(int k=0;k<estados.length;k++) {

                    alpha += (alpha * estados[i] * A[j][i]);
                    //alfa[t+1][j]=alpha[t+1];
                    //t++;
                    tj = j;
                }
                alfa[j][i]=alpha;
            }



        }


    }

    public void backward()
    {

    }
    public void imprimir(double[][] m)
    {
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                System.out.println(m[i][j]);
            }
        }
    }
}




