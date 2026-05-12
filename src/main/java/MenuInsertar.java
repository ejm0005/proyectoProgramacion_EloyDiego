import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MenuInsertar extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuInsertar frame = new MenuInsertar();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MenuInsertar() {
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        //Título interno del programa
        JLabel title = new JLabel("Elditrón S.L. - Insertar Registro");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
        title.setBounds(31, 20, 377, 48);
        contentPane.add(title);

        //Separador de contenidos
        JSeparator separator = new JSeparator();
        separator.setBounds(53, 78, 330, 2);
        contentPane.add(separator);

        //Label que indica al usuario que debe seleccionar una opción
        JLabel lblSeleccioneLaOpcin = new JLabel("Seleccione el tipo de dato que desea registrar");
        lblSeleccioneLaOpcin.setHorizontalAlignment(SwingConstants.CENTER);
        lblSeleccioneLaOpcin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblSeleccioneLaOpcin.setBounds(10, 90, 416, 24);
        contentPane.add(lblSeleccioneLaOpcin);

        //Botón que lanza el formulario de registrar cliente
        JButton VentanaRegistrarCliente = new JButton("Registrar Cliente");
        VentanaRegistrarCliente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        VentanaRegistrarCliente.setBounds(96, 124, 249, 32);
        VentanaRegistrarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrarCliente regCliente = new RegistrarCliente();
                regCliente.setVisible(true);
            }
        });
        contentPane.setLayout(null);
        contentPane.add(VentanaRegistrarCliente);

        //Botón que lanza el formulario de registrar encargo
        JButton VentanaRegistrarEncargo = new JButton("Registrar Encargo");
        VentanaRegistrarEncargo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        VentanaRegistrarEncargo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrarEncargo regEncargo = new RegistrarEncargo();
                regEncargo.setVisible(true);
            }
        });
        VentanaRegistrarEncargo.setBounds(96, 166, 249, 32);
        contentPane.add(VentanaRegistrarEncargo);

        //Botón que lanza el formulario de registrar tecnico
        JButton VentanaRegistrarTecnico = new JButton("Registrar Técnico");
        VentanaRegistrarTecnico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        VentanaRegistrarTecnico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrarTecnico regTecnico = new RegistrarTecnico();
                regTecnico.setVisible(true);
            }
        });
        VentanaRegistrarTecnico.setBounds(96, 208, 249, 32);
        contentPane.add(VentanaRegistrarTecnico);


    }
}
