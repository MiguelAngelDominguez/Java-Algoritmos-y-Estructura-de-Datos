// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Personaje Tank = new Personaje(1,"Tank","Lanzar Rocas",6000,"El tank GAA","negro",4,"Tankear","macho");
        Personaje Hunter = new Personaje(2,"Hunter","Atrapar a un Oponente",400,"El Hunter GAA","verde",1.5,"Atanking","macho");

        System.out.println(Tank.toString());
        System.out.println(Hunter.toString());
    }
}