public class Velero extends Embarcacion{
    private static final int CANTIDAD_MASTILES_LIMITE = 4;
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, int longitudMetrosEslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, longitudMetrosEslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean esGrande(){
        return cantidadMastiles > CANTIDAD_MASTILES_LIMITE;
    }

    @Override
    public void Embarcar() {
        System.out.println("\nVelero listo para zarpar");
        super.Embarcar();
    }
}
