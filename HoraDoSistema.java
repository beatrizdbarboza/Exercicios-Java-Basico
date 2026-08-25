package horadosistema;

import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.printf("Hora do Sistema é: ");
        System.out.println(relogio.toString()  );
    }
}