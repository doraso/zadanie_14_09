public class Room {
    public static void main(String[] args) {

        Element tv1 = new Element();
        tv1.brand = "Samsung";
        tv1.type = "LED";
        tv1.screenSize = 31.5;
        tv1.energyClass = "AAA";
        tv1.price = 4555.99;

        /*Element tv2 = new Element();
        tv2.brand = "Samsung";
        tv2.type = "OLED";
        tv2.screenSize = 55;
        tv2.energyClass = "AAA";
        tv2.price = 6899.99; */

        Element tv2 = new Element("Samsung", "OLED", 55, "AAA", 6899.99);

        System.out.println("W moim pokoju znajduje się: ");
        System.out.println("Telewizor " + tv1.brand);
        System.out.println(" Typ: " + tv1.type + ", " + " o przekątnej ekranu " + tv1.screenSize
                + " i klasie energetycznej " + tv1.energyClass );
        System.out.println(" Cena zakupu: " + tv1.price);
        System.out.println(" ");
        System.out.println("A wolałabym:) : ");
        System.out.println("Telewizor " + tv2.brand);
        System.out.println(" Typ: " + tv2.type + ", " + " o przekątnej ekranu " + tv2.screenSize
                + " i klasie energetycznej " + tv2.energyClass );
        System.out.println(" Cena zakupu: " + tv2.price);

    }
}
