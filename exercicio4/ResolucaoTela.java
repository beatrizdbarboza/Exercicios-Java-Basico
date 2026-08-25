package resolucaotela;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args){
        Dimension resolucao = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        System.out.println("Sua resolução de tela está:");
        System.out.println(resolucao);
    }
}
