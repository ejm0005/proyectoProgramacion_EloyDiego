import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JButton btnNewButton = new JButton("Registrar Cliente");
        btnNewButton.setBounds(31, 180, 123, 32);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrarCliente register = new RegistrarCliente();
                register.setVisible(true);
            }
        });
        contentPane.setLayout(null);
        contentPane.add(btnNewButton);

        JButton btnRegistrarTcnico = new JButton("Registrar Técnico");
        btnRegistrarTcnico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrarTecnico tecnicoRegister = new RegistrarTecnico();
                tecnicoRegister.setVisible(true);
            }
        });
        btnRegistrarTcnico.setBounds(278, 180, 123, 32);
        contentPane.add(btnRegistrarTcnico);

    }
}

