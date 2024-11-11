import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Authentication {
    public static void main(String[] args) {
        Font customFont = new Font("Arial", Font.BOLD, 20);
        Color buttonColor = new Color(70, 130, 180);
        JFrame frame = new JFrame("Authentication");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        JPanel signUpPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(12, 10, 12, 10);

        JLabel title = new JLabel("Create Your Account");
        title.setFont(customFont);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        signUpPanel.add(title, gbc);

        JPanel usernamePanel = new JPanel();
        usernamePanel.setLayout(new BoxLayout(usernamePanel, BoxLayout.Y_AXIS));
        JLabel label1 = new JLabel("Masukin username cik : ");
        usernamePanel.add(label1);
        usernamePanel.add(Box.createVerticalStrut(10));
        JTextField username = new JTextField(45);
        usernamePanel.add(username);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        signUpPanel.add(usernamePanel, gbc);

        JPanel emailPanel = new JPanel();
        emailPanel.setLayout(new BoxLayout(emailPanel, BoxLayout.Y_AXIS));
        JLabel label2 = new JLabel("Masukin email cik : ");
        emailPanel.add(label2);
        emailPanel.add(Box.createVerticalStrut(10));
        JTextField email = new JTextField(45);
        emailPanel.add(email);
        gbc.gridy = 2;
        signUpPanel.add(emailPanel, gbc);

        JPanel passwordPanel = new JPanel();
        passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.Y_AXIS));
        JLabel label3 = new JLabel("Passwordmu cik : ");
        passwordPanel.add(label3);
        passwordPanel.add(Box.createVerticalStrut(10));
        JPasswordField password = new JPasswordField(45);
        passwordPanel.add(password);
        gbc.gridy = 3;
        signUpPanel.add(passwordPanel, gbc);

        JPanel reenterPasswordPanel = new JPanel();
        reenterPasswordPanel.setLayout(new BoxLayout(reenterPasswordPanel, BoxLayout.Y_AXIS));
        JLabel label4 = new JLabel("Masukin lagi passwordmu cik : ");
        reenterPasswordPanel.add(label4);
        reenterPasswordPanel.add(Box.createVerticalStrut(10));
        JPasswordField reenterPassword = new JPasswordField(45);
        reenterPasswordPanel.add(reenterPassword);
        gbc.gridy = 4;
        signUpPanel.add(reenterPasswordPanel, gbc);

        JPanel endJPanel = new JPanel();
        endJPanel.setLayout(new BoxLayout(endJPanel, BoxLayout.Y_AXIS));
        JButton signUp = new JButton("Sign Up!");
        signUp.setBackground(buttonColor);
        signUp.setForeground(Color.WHITE);
        signUp.setAlignmentX(Component.CENTER_ALIGNMENT);
        endJPanel.add(signUp);
        endJPanel.add(Box.createVerticalStrut(10));
        JLabel label5 = new JLabel("Atau");
        label5.setAlignmentX(Component.CENTER_ALIGNMENT);
        endJPanel.add(label5);
        endJPanel.add(Box.createVerticalStrut(10));
        JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        loginPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel label6 = new JLabel("Already have an account?");
        loginPanel.add(label6);
        JButton logIn = new JButton("Log In?");
        logIn.setBackground(buttonColor);
        logIn.setForeground(Color.WHITE);
        loginPanel.add(logIn);
        endJPanel.add(loginPanel);
        endJPanel.add(Box.createVerticalStrut(10));
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        signUpPanel.add(endJPanel, gbc);

        JPanel logInPanel = new JPanel(new GridBagLayout());
        JLabel loginTitle = new JLabel("Log In to Your Account");
        loginTitle.setFont(customFont);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        logInPanel.add(loginTitle, gbc);

        JPanel loginEmailPanel = new JPanel();
        loginEmailPanel.setLayout(new BoxLayout(loginEmailPanel, BoxLayout.Y_AXIS));
        JLabel loginLabel1 = new JLabel("Email cik :");
        loginEmailPanel.add(loginLabel1);
        loginEmailPanel.add(Box.createVerticalStrut(10));
        JTextField loginEmail = new JTextField(45);
        loginEmailPanel.add(loginEmail);
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        logInPanel.add(loginEmailPanel, gbc);

        JPanel loginPasswordPanel = new JPanel();
        loginPasswordPanel.setLayout(new BoxLayout(loginPasswordPanel, BoxLayout.Y_AXIS));
        JLabel loginLabel2 = new JLabel("Password cik :");
        loginPasswordPanel.add(loginLabel2);
        loginPasswordPanel.add(Box.createVerticalStrut(10));
        JPasswordField loginPassword = new JPasswordField(45);
        loginPasswordPanel.add(loginPassword);
        gbc.gridy = 2;
        logInPanel.add(loginPasswordPanel, gbc);

        JPanel loginJPanel = new JPanel();
        loginJPanel.setLayout(new BoxLayout(loginJPanel, BoxLayout.Y_AXIS));
        JButton logButton = new JButton("Log In!");
        logButton.setBackground(buttonColor);
        logButton.setForeground(Color.WHITE);
        logButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginJPanel.add(logButton);
        loginJPanel.add(Box.createVerticalStrut(10));
        JLabel orLabel = new JLabel("Atau");
        orLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginJPanel.add(orLabel);
        loginJPanel.add(Box.createVerticalStrut(10));
        JPanel signupPJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        signupPJPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel noAccLabel = new JLabel("I don't have an account?");
        signupPJPanel.add(noAccLabel);
        JButton signButton = new JButton("Sign Up?");
        signButton.setBackground(buttonColor);
        signButton.setForeground(Color.WHITE);
        signupPJPanel.add(signButton);
        loginJPanel.add(signupPJPanel);
        loginJPanel.add(Box.createVerticalStrut(10));
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        logInPanel.add(loginJPanel, gbc);

        mainPanel.add(signUpPanel, "SignUp");
        mainPanel.add(logInPanel, "LogIn");

        logIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "LogIn");
            }
        });

        signButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "SignUp");
            }
        });

        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
