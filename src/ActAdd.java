import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ActAdd extends JFrame {
    final static int width = 500;
    final static int height = 500;

    boolean succeed;

    JLabel addLabel = new JLabel("fill object properties");

    JButton checkBtn = new JButton("add");
    JButton cancel = new JButton("cancel");

    EsketitWindow parent;

    JTextField[] fields = {
            new JTextField(""),
            new JTextField(""),
            new JTextField(""),
            new JTextField(""),
            new JTextField(""),
            new JTextField("")
    };

    public ActAdd(EsketitWindow parent){
        this.parent=parent;
        succeed=false;

        this.setVisible(true);
        this.setBounds(100,10,width,height);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7,1));
        panel.add(addLabel);

        JLabel[] labels = {
                new JLabel("Name"),
                new JLabel("Color"),
                new JLabel("Wardrobe location"),
                new JLabel("Size"),
                new JLabel("Clearance"),
                new JLabel(""),
        };

        for (int i=0;i<labels.length;i++){
            AuthWindow.addField(panel,labels[i],fields[i]);
        }

        addBtn(panel);


    }

    void addBtn(JPanel panel){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(checkBtn);
        p.add(cancel);
        cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                succeed=false;
                ActAdd.super.setVisible(false);
                parent.setEnabled(true);
            }
        });
    }
    void addCheckBtn(){
        checkBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                //блаблабла
            }
        });
    }
}
