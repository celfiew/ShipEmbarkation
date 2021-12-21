public class Main {

    public static void main(String[] args) {


        Capitan martin = new Capitan("Martin", "Fierro", "2323");
        Capitan juan = new Capitan("Juan", "Fierro", "232sd3");

        Embarcacion velero1 = new Velero(martin, 500.00,100,2022,4,5);
        Embarcacion velero2 = new Velero(juan, 300.00,50,2014,2,2);

        Velero velero1Azarpar = (Velero) velero1;
        Velero velero2Azarpar = (Velero) velero2;

        velero1.Embarcar();
        System.out.println("\nEl tamaño del velero es grande? " + (velero1Azarpar.esGrande() ? "Si\n" : "No\n"));
        System.out.println("\nel monto de alquiler de este yate es de: " + velero1.calcularMontoAlquiler() + "\n");


        velero2.Embarcar();
        System.out.println("\nEl tamaño del velero es grande? " + (velero2Azarpar.esGrande() ? "Si\n" : "No\n"));
        System.out.println("\nel monto de alquiler de este yate es de: " + velero2.calcularMontoAlquiler() + "\n");


        System.out.println("\n------------------------------------\n");



        Embarcacion yate1 = new Yate(martin, 500.00,200.00,2022,4,5);
        Embarcacion yate2 = new Yate(martin, 200.00,100.00,2011,4,1);

        Yate yate1Azarpar = (Yate) yate1;
        Yate yate2Azarpar = (Yate) yate2;

        yate1.Embarcar();
        System.out.println("Es más lujoso el yate1 al yate2? " + (yate1Azarpar.compareTo(yate2) == 1 ? "Si\n" : "No\n"));
        System.out.println("\nel monto de alquiler de este yate es de: " + yate1.calcularMontoAlquiler());

        yate1.Embarcar();
        System.out.println("\nEs más lujoso el yate2 al yate1? " + (yate1Azarpar.compareTo(yate2) == -1 ? "Si\n" : "No\n"));
        System.out.println("\nel monto de alquiler de este yate es de: " + yate2.calcularMontoAlquiler());
    }

}
