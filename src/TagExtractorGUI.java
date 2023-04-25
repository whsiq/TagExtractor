import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TagExtractorGUI extends JFrame {
    JPanel mainPnl;
    JPanel filePnl;
    JPanel displayPnl;
    JPanel optionPnl;

    JTextField browseTF;
    JButton browseBtn;

    JTextArea tagTA;
    JScrollPane scroller;

    JButton quitBtn;
    JButton saveBtn;

    public TagExtractorGUI() {
        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        createFilePanel();
        mainPnl.add(filePnl, BorderLayout.NORTH);

        createDisplayPanel();
        mainPnl.add(displayPnl, BorderLayout.CENTER);

        createOptionPanel();
        mainPnl.add(optionPnl, BorderLayout.SOUTH);

        add(mainPnl);
        setSize(400, 400);
        setTitle("Tag Extractor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void createFilePanel() {
        filePnl = new JPanel();
        filePnl.setLayout(new BorderLayout());

        browseTF = new JTextField();
        browseBtn = new JButton("Browse..");

        filePnl.add(browseTF, BorderLayout.CENTER);
        filePnl.add(browseBtn, BorderLayout.EAST);
    }

    public void createDisplayPanel() {
        displayPnl = new JPanel();
        displayPnl.setLayout(new GridLayout(1,1));

        tagTA = new JTextArea();
        scroller = new JScrollPane(tagTA);

        displayPnl.add(scroller);
    }

    public void createOptionPanel() {
        optionPnl = new JPanel();
        optionPnl.setLayout(new GridLayout(1,2));

        saveBtn = new JButton("Save");
        quitBtn = new JButton("Quit");
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        optionPnl.add(saveBtn);
        optionPnl.add(quitBtn);
    }
}
