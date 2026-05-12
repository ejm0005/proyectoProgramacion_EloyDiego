import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;

public class MainMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainMenu frame = new MainMenu();
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
    public MainMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        //Título interno del programa
        JLabel title = new JLabel("Elditrón S.L.");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
        title.setBounds(137, 20, 162, 48);
        contentPane.add(title);

        //Separador de contenidos
        JSeparator separator = new JSeparator();
        separator.setBounds(53, 78, 330, 2);
        contentPane.add(separator);

        //Label que indica al usuario que debe seleccionar una opción
        JLabel lblSeleccioneLaOpcin = new JLabel("Seleccione la opción que desea realizar");
        lblSeleccioneLaOpcin.setHorizontalAlignment(SwingConstants.CENTER);
        lblSeleccioneLaOpcin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblSeleccioneLaOpcin.setBounds(10, 90, 416, 24);
        contentPane.add(lblSeleccioneLaOpcin);

        //Botón que lanza el menu de insertar registros
        JButton MenuInsertarRegistro = new JButton("Insertar registro");
        MenuInsertarRegistro.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        MenuInsertarRegistro.setBounds(96, 124, 249, 32);
        MenuInsertarRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuInsertar insertar = new MenuInsertar();
                insertar.setVisible(true);
            }
        });
        contentPane.setLayout(null);
        contentPane.add(MenuInsertarRegistro);

        //Botón que lanza el menu de consultar registros
        JButton MenuConsultarRegistro = new JButton("Consultar registro");
        MenuConsultarRegistro.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        MenuConsultarRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuImprimir imprimir = new MenuImprimir();
                imprimir.setVisible(true);
            }
        });
        MenuConsultarRegistro.setBounds(96, 166, 249, 32);
        contentPane.add(MenuConsultarRegistro);

        //Botón que lanza el menu de modificar registros
        JButton MenuModificarRegistro = new JButton("Modificar registro");
        MenuModificarRegistro.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        MenuModificarRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuModificar modificar = new MenuModificar();
                modificar.setVisible(true);
            }
        });
        MenuModificarRegistro.setBounds(96, 208, 249, 32);
        contentPane.add(MenuModificarRegistro);


    }
}

