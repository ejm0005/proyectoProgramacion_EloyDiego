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

public class MenuModificar extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuImprimir frame = new MenuImprimir();
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
    public MenuModificar() {
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        //Título interno del programa y el menú
        JLabel title = new JLabel("Elditrón S.L. - Modificar Registro");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
        title.setBounds(31, 20, 377, 48);
        contentPane.add(title);

        //Separador de contenidos
        JSeparator separator = new JSeparator();
        separator.setBounds(53, 78, 330, 2);
        contentPane.add(separator);

        //Label que indica al usuario que debe seleccionar una opción
        JLabel lblSeleccioneLaOpcin = new JLabel("Seleccione el tipo de dato que desea modificar");
        lblSeleccioneLaOpcin.setHorizontalAlignment(SwingConstants.CENTER);
        lblSeleccioneLaOpcin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblSeleccioneLaOpcin.setBounds(10, 90, 416, 24);
        contentPane.add(lblSeleccioneLaOpcin);

        //Botón que lanza el formulario de modificar cliente
        JButton VentanaModificarCliente = new JButton("Modificar Cliente");
        VentanaModificarCliente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        VentanaModificarCliente.setBounds(96, 124, 249, 32);
        VentanaModificarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ModificarCliente modCliente = new ModificarCliente();
                modCliente.setVisible(true);
            }
        });
        contentPane.setLayout(null);
        contentPane.add(VentanaModificarCliente);

        //Botón que lanza el formulario de modificar encargo
        JButton VentanaModificarEncargo = new JButton("Modificar Encargo");
        VentanaModificarEncargo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        VentanaModificarEncargo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ModificarEncargo modEncargo = new ModificarEncargo();
                modEncargo.setVisible(true);
            }
        });
        VentanaModificarEncargo.setBounds(96, 166, 249, 32);
        contentPane.add(VentanaModificarEncargo);

        //Botón que lanza el formulario de modificar tecnico
        JButton VentanaModificarTecnico = new JButton("Modificar Técnico");
        VentanaModificarTecnico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        VentanaModificarTecnico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ModificarTecnico modTecnico = new ModificarTecnico();
                modTecnico.setVisible(true);
            }
        });
        VentanaModificarTecnico.setBounds(96, 208, 249, 32);
        contentPane.add(VentanaModificarTecnico);


    }
}
