import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panel2;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();
        campoTexto.addActionListener(e -> {
            System.out.println("Se ejecuto action listener: " + e);
        });
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);//Lanzar contenido del panel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Al precionar X de la aplicacion, finaliza proceso
        setSize(600, 300);//Medidas del panel en pixeles
        setLocationRelativeTo(null); // Centramos ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();//Cambiar el look and feel a modo oscuro
        Forma forma = new Forma();
        forma.setVisible(true);
    }


}
