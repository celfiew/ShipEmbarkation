public class Yate extends Embarcacion implements Comparable{
    private int cantidadCamarotes;


    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, int longitudMetrosEslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, longitudMetrosEslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate yateAcomparar = (Yate) o;
        int resultado = 0;
        if (this.cantidadCamarotes > yateAcomparar.cantidadCamarotes){
            resultado = 1;
        } else if (this.cantidadCamarotes < yateAcomparar.cantidadCamarotes){
            resultado = -1;
        }
        return resultado;
    }

    @Override
    public void Embarcar() {
        System.out.println("\n Yate listo para zarpar");
        super.Embarcar();
    }


}
