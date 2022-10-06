package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //---------------------------
    // Atributos 
    //---------------------------
    private JLabel Lbtitulo;
    private JLabel LbX;
    private JLabel LbY;
    private JLabel LbZ;
    private JLabel LbW;
    private JLabel LbQ;
    private javax.swing.JTextField tfX;
    private javax.swing.JTextField tfY;
    private javax.swing.JTextField tfZ;
    private javax.swing.JTextField tfW;
    private javax.swing.JTextField tfQ;



    //---------------------------
    // Metodos
    //---------------------------

    //Metodo constructor
    public PanelEntradaDatos()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta al titulo
        Lbtitulo = new JLabel("DATOS", JLabel.CENTER);
        Lbtitulo.setFont(new Font("Algerian",Font.BOLD,20));
        Lbtitulo.setForeground(Color.BLACK);
        Lbtitulo.setBounds(10,10,465,20);
        this.add(Lbtitulo);

        //Crear y agregar etiqueta al titulo
        LbX = new JLabel("NOMBRE EMPLEADO");
        LbX.setFont(new Font("Algerian",Font.BOLD,10));
        LbX.setForeground(Color.BLACK);
        LbX.setBounds(10,50,465,20);
        this.add(LbX);

        tfX = new JTextField();
        tfX.setFont(new Font("Algerian", Font.PLAIN, 18));
        tfX.setForeground(Color.BLACK);
        tfX.setBounds(200, 50, 80, 20);
        this.add(tfX);

        //Crear y agregar etiqueta al titulo
        LbY = new JLabel("FECHA NACIO");
        LbY.setFont(new Font("Algerian",Font.BOLD,10));
        LbY.setForeground(Color.BLACK);
        LbY.setBounds(10,100,465,20);
        this.add(LbY);

        tfY = new JTextField();
        tfY.setFont(new Font("Algerian", Font.PLAIN, 18));
        tfY.setForeground(Color.BLACK);
        tfY.setBounds(200, 100, 80, 20);
        this.add(tfY);

        //Crear y agregar etiqueta al titulo
        LbZ = new JLabel("FECHA INGRESO AL TRABAJO");
        LbZ.setFont(new Font("Algerian",Font.BOLD,10));
        LbZ.setForeground(Color.BLACK);
        LbZ.setBounds(10,150,465,20);
        this.add(LbZ);

        tfZ = new JTextField();
        tfZ.setFont(new Font("Algerian", Font.PLAIN, 18));
        tfZ.setForeground(Color.BLACK);
        tfZ.setBounds(200, 150, 80, 20);
        this.add(tfZ);

        //Crear y agregar etiqueta al titulo
        LbQ = new JLabel("HORAS DE TRABAJO");
        LbQ.setFont(new Font("Algerian",Font.BOLD,10));
        LbQ.setForeground(Color.BLACK);
        LbQ.setBounds(10,200,465,20);
        this.add(LbQ);

        tfQ = new JTextField();
        tfQ.setFont(new Font("Algerian", Font.PLAIN, 18));
        tfQ.setForeground(Color.BLACK);
        tfQ.setBounds(200, 200, 80, 20);
        this.add(tfQ);

         //Crear y agregar etiqueta al titulo
         LbW = new JLabel("VALOR HORAS");
         LbW.setFont(new Font("Algerian",Font.BOLD,10));
         LbW.setForeground(Color.BLACK);
         LbW.setBounds(10,250,465,20);
         this.add(LbW);
 
         tfW = new JTextField();
         tfW.setFont(new Font("Algerian", Font.PLAIN, 18));
         tfW.setForeground(Color.BLACK);
         tfW.setBounds(200, 250, 80, 20);
         this.add(tfW);

        

        //Borde y titulo
         TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
         borde.setTitleColor(Color.BLACK);
         this.setBorder(borde);
 
    }

    //Metodos de acceso a la información
    public String getTfX()
    {
        return tfX.getText();
    }

    public String getTfY()
    {
        return tfY.getText();
    }

    public String getTfZ()
    {
        return tfZ.getText();
    }

    public String getTfQ()
    {
        return tfZ.getText();
    }

    public String getTfW()
    {
        return tfZ.getText();
    }

    //Metodo para borrar las cajas de texto
    public void borrar()
    {
        tfX.setText("");
        tfY.setText("");
        tfZ.setText("");
        tfQ.setText("");
        tfW.setText("");
    }
}

