import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

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

        JButton MenuInsertarRegistro = new JButton("Insertar registro");
        MenuInsertarRegistro.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        MenuInsertarRegistro.setBounds(96, 109, 249, 32);
        MenuInsertarRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuInsertar insertar = new MenuInsertar();
                insertar.setVisible(true);
            }
        });
        contentPane.setLayout(null);
        contentPane.add(MenuInsertarRegistro);

        JButton MenuConsultarRegistro = new JButton("Consultar registro");
        MenuConsultarRegistro.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        MenuConsultarRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuImprimir imprimir = new MenuImprimir();
                imprimir.setVisible(true);
            }
        });
        MenuConsultarRegistro.setBounds(96, 151, 249, 32);
        contentPane.add(MenuConsultarRegistro);

        JButton MenuModificarRegistro = new JButton("Modificar registro");
        MenuModificarRegistro.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        MenuModificarRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuModificar modificar = new MenuModificar();
                modificar.setVisible(true);
            }
        });
        MenuModificarRegistro.setBounds(96, 193, 249, 32);
        contentPane.add(MenuModificarRegistro);

        JLabel lblNewLabel = new JLabel("Elditrón S.L.");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
        lblNewLabel.setBounds(140, 10, 162, 48);
        contentPane.add(lblNewLabel);

        JLabel lblSeleccioneLaOpcin = new JLabel("Seleccione la opción que desea realizar");
        lblSeleccioneLaOpcin.setHorizontalAlignment(SwingConstants.CENTER);
        lblSeleccioneLaOpcin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblSeleccioneLaOpcin.setBounds(10, 68, 416, 24);
        contentPane.add(lblSeleccioneLaOpcin);

        JSeparator separator = new JSeparator();
        separator.setBounds(49, 57, 330, 2);
        contentPane.add(separator);

    }
}

