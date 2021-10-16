import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoopingJFrame {
    private static JFrame myFrameWindow;

    public static void main(String[] args) {
        myFrameWindow = new JFrame();
        myFrameWindow.setTitle("Looping Button JFrame");
        myFrameWindow.setResizable(false);
        myFrameWindow.setBounds(50, 50, 800, 600);

        JLabel myLabel = new JLabel();
        myLabel.setText("Input Jumlah Button : ");
        myLabel.setBounds(50, 30, 300, 30);

        JTextField myInputNumber = new JTextField();
        myInputNumber.setBounds(50, 60, 200, 30);

        JButton myBtnExec = new JButton();
        myBtnExec.setText("Hit Me");
        myBtnExec.setBounds(255, 60, 100, 30);

        myBtnExec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int jumlahBtn = Integer.parseInt(myInputNumber.getText());
                JButton btnNew[] = new JButton[jumlahBtn];

                for (int loop = 0; loop < jumlahBtn; loop++) {
                    btnNew[loop] = new JButton();
                    btnNew[loop].setBounds(50 + (loop * 155), 110, 150, 30);
                    btnNew[loop].setText("Button loop " + loop);
                    myFrameWindow.add(btnNew[loop]);
                    myFrameWindow.repaint();
                }
            }
        });
        myFrameWindow.add(myLabel);
        myFrameWindow.add(myBtnExec);
        myFrameWindow.add(myInputNumber);
        myFrameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrameWindow.setLayout(null);
        myFrameWindow.setVisible(true);
    }
}
