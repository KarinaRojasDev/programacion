public class Main {
    public static void main(String[] args) {
        Mago mago =new Mago("Hahhy Poter");
        Bruja bruja = new Bruja("Cruela");

        System.out.println();
        mago.lanzarHechizo("Leviosa");
        bruja.moverse();
        System.out.println();
        bruja.lanzarHechizo("Inmovilizado");
        mago.moverse();
    }
}
