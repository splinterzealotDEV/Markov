public class main {


    public static void main(String[] args) {
        double[][] Ma={{.8,.4}, {.2,.6}};
        double[][] Mb={{.5,.1}, {.1,.7},{.4,.2}};
        double[] prob={.7,.3};
        int[] sal={1,2,3};
        int[] esta={1,2};
        int[] ob={3,1,2};
        Markov m=new Markov();
        m.inicializar(Ma,Mb,prob,esta,sal,ob);
        System.out.println(m.getA().length);
        System.out.println(m.getB().length);
        m.forward();
       // System.out.println(m.getA());
        //System.out.println(m.getB());
        m.imprimir(m.getAlfa());
        //m.forward();
    }
}
