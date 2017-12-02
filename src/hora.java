import javax.swing.*;
import java.util.Stack;

public class hora {




        Stack<Integer> pila=new Stack<>();

    public void HoraT(int hora,int cantidad){

        pila.push((int) (hora + cantidad) % 24);


        while (!pila.empty())

            JOptionPane.showInputDialog(null,pila.pop());
    }
}
