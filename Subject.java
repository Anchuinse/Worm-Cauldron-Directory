/**
 * Created by Matt on 11/1/16.
 */
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Subject
{
    String ID, rating, description;
    int cost;

    public Subject(String id, String PRT, String words, int COST)
    {
        ID = id;
        rating = PRT;
        description = words;
        cost = COST;
    }

    public String getID() {return ID;}

    public String getRating() {return rating;}

    public String getDescription() {return description;}

    public int getCost() {return cost;}

    public void displaySubject()
    {
        JFrame frame = new JFrame();
        frame.setLocation(300,300);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));
        JPanel top_panel = new JPanel();
        frame.add(top_panel);
        top_panel.setPreferredSize(new Dimension(500,100));
        top_panel.setLayout(new GridLayout(1,2));
        JPanel id_panel = new JPanel();
        top_panel.add(id_panel);
        id_panel.setLayout(new GridLayout(2,1));
        id_panel.add(new JLabel(ID));
        id_panel.add(new JLabel(rating));
        top_panel.add(new JLabel("" + cost));
        JTextArea text = new JTextArea(description);
        text.setLineWrap(true);
        frame.add(text);
        frame.validate();
        frame.repaint();
    }

    public static void main(String[] args)
    {
        Subject patient_zero = new Subject("D1234", "Mover 2", "Hella quick Hella quick Hella quick Hella quick Hella quick Hella quick Hella quick Hella quick Hella quick Hella quick Hella quick ", 110);
        patient_zero.displaySubject();
    }
}
