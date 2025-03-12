import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panel2;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();

        ///ActionListener nos permite que al escribir una informacion en un
        ///cuadro de texto y al precionar enter lo muestre en un label
//        campoTexto.addActionListener(e -> {
//            replicarTexto();
//        });

        /// KeyAdapter nos permite que al momento de escribir informacion
        /// Se refleje al precionar las teclas
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    private void replicarTexto() {
        this.replicadorLabel.setText(this.campoTexto.getText());
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);//Lanzar contenido del panel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Al precionar X de la aplicacion, finaliza proceso
        setSize(600, 400);//Medidas del panel en pixeles
        setLocationRelativeTo(null); // Centramos ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();//Cambiar el look and feel a modo oscuro
        Forma forma = new Forma();
        forma.setVisible(true);
    }


}
