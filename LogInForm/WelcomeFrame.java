import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeFrame extends LogInForm{

    // Creating Attribute
    private Container c;
    private JLabel welcomeLabel;
    private Font titleFont;
    private ImageIcon aiubIcon;

    // Default Constructor
    WelcomeFrame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        this.setTitle("Americal International University - Bangladesh");
        initialization();
    }

    // initialization Method
    public void initialization(){
        // Creating Container
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        // Creating Image Icon
        aiubIcon = new ImageIcon(getClass().getResource("aiub.png"));
        setIconImage(aiubIcon.getImage());

        // Creating Font
        titleFont = new Font("Arial" , Font.BOLD , 30);

        // Creating welcome Label
        welcomeLabel = new JLabel();
        welcomeLabel.setText("Hello , Welcome to our Desktop App");
        welcomeLabel.setFont(titleFont);
        welcomeLabel.setBounds(20,20,600,100);
        c.add(welcomeLabel);



    }
}
