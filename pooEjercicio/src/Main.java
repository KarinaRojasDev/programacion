public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.setMatricula("1234JMV");
        coche1.setMarca("Renault");
        coche1.setAnioMatriculacion(2023);
        coche1.setElectrico(true);
        System.out.println(coche1);
        System.out.println("---------------");
        Coche coche2 =new Coche(coche1);
        coche2.setElectrico(false);
        System.out.println(coche2);
    }
}
