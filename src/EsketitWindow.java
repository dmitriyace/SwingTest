import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EsketitWindow extends JFrame {

    ////////MAKING DA TREEEEEEE
    final String[] nodes = new String[]{"Коллекция1", "Коллекция2"};
    final String[][] leafs = new String[][]{{"Чай", "Кофе", "Коктейль", "Сок", "Морс", "Минералка"},
            {"Пирожное", "Мороженое", "Зефир", "Халва"}};


    JPanel panel;
//    EsketitWindow thisWindow;

    private static final int width = 1380;
    private static final int height = 768;
    EsketitWindow thisOne;

    JButton in = new JButton("load pyjamas");
    JButton save = new JButton("save tree");
    JButton addBtn = new JButton("add pyjama");
    JButton delete = new JButton("delete pyjama");
    JButton show = new JButton("show");

    EsketitWindow() {
        super("Esketit");

        DefaultMutableTreeNode collNode = new DefaultMutableTreeNode(nodes[0]);
        DefaultMutableTreeNode coll2Node = new DefaultMutableTreeNode(nodes[1]);
        for (int i = 0; i < leafs[0].length; i++)
            collNode.add(new DefaultMutableTreeNode(leafs[0][i], false));
        for (int i = 0; i < leafs[1].length; i++)
            coll2Node.add(new DefaultMutableTreeNode(leafs[1][i], false));
        JTree tree = new JTree(new DefaultTreeModel(coll2Node, true));
        JTree tree2 = new JTree((new DefaultTreeModel(collNode, true)));



        this.setVisible(true);
        this.setBounds(100, 10, width, height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        panel.add(save);
        panel.add(delete);
        panel.add(in);
        panel.add(addBtn);
        panel.add(show);
        panel.add(new JScrollPane(tree2));
        panel.add(tree);

        addBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                EsketitWindow.super.setEnabled(false);
                new ActAdd(thisOne);
            }
        });

        this.setContentPane(panel);
    }

    void addButtons(JPanel panel) {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(5, 5));

        addBtn.setPreferredSize(new Dimension(120, 120));
        jPanel.add(addBtn);
        jPanel.add(new Label("mmmmmmmm"));

    }


}
