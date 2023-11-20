      






public class LoginView {

    public LoginView() {
    
    JFrame frame = new JFrame ();
    frame.setSize(400,500);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setBackground(new Color(255, 0, 0));
        

    JPanel panel1 = new JPanel();
    panel1.setSize(400, 500);
    panel1.setLayout(null);
    frame.add(panel1);

    JPanel panel2 = new JPanel();
    panel2.setSize(400, 500);
    panel2.setLayout(null);
    frame.add(panel2);

    JLabel loginLbl = new JLabel("LOGIN");
    loginLbl.setBounds(175,50,100,40);
    panel1.add(loginLbl);
    
    JLabel userLbl = new JLabel("Username");
    userLbl.setBounds(70,100,150,40);
    panel1.add(userLbl);

    JTextField userTf = new JTextField("");
    userTf.setBounds(70,130,250,30);
    panel1.add(userTf);

    JLabel passLbl = new JLabel("Password");
    passLbl.setBounds(70,160,150,40);
    panel1.add(passLbl);

    JTextField passTf = new JTextField("");
    passTf.setBounds(70,190,250,30);
    panel1.add(passTf);

    JButton loginBtn = new JButton("Login");
    loginBtn.setBounds(130,270,125,30);
    panel1.add(loginBtn);
        

    JButton registerBtn = new JButton("Register");
    registerBtn.setBounds(130,320,125,30);
    panel1.add(registerBtn);
    frame.setVisible(true);
    }
}

