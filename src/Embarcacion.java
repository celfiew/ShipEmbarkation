public abstract class Embarcacion {
    private static final int ANIO_FABRICACION_BASE = 2020;
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioDeFabricacion;
    private int longitudMetrosEslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, int longitudMetrosEslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.longitudMetrosEslora = longitudMetrosEslora;
    }

    public double calcularMontoAlquiler(){
        if (this.anioDeFabricacion > ANIO_FABRICACION_BASE){
            return this.precioBase + this.valorAdicional;
        } else
            return this.precioBase;
    }

    public String DatosCapitan(){
        return capitan.toString();
    }
    public void Embarcar(){
        System.out.println("Esta embarcación se nos va con el capitan: "  + capitan.toString());
        System.out.println("Adios a todos nos vemos pronto, buen viaje y buena mar...");
    }
}
