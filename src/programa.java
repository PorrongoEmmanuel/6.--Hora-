import javax.swing.*;

public class programa {

    public static void main(String[]args){
        hora  horas = new hora();


        int h = Integer.parseInt(JOptionPane.showInputDialog("La Hora Actual Es?"));


        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Que hora sera dentro de?"));


        horas.HoraT(h,cantidad);

    }
}
