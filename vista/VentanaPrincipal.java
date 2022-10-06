package vista;


import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //---------------------------
    // Atributos 
    //---------------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    //---------------------------
    // Metodos
    //---------------------------

    // Metodo constructor
    public VentanaPrincipal()
    {
        //Definicion contenedor de la ventana
        this.setLayout(null);

        //Creación y adición de un panel tipo PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,465,300);
        this.add(miPanelEntradaDatos);

        //Creación y adición de un panel tipo PanelOperación
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,320,465,60);
        this.add(miPanelOperaciones);
        

        //Creación y adición de un panel tipo PanelResultado
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,390,465,180);
        this.add(miPanelResultados);

        // Caracteristicas de la ventana
        this.setTitle("Empresa");
        this.setSize(500,620);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}