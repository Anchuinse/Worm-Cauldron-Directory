/**
 * Created by Matt on 11/1/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interface extends JFrame implements ActionListener
    //next create the 'pop-up' windows for the subjects by having an if statement (if button label contains numbers and z=9)
{
    JPanel main_panel = new JPanel();
    JPanel welcome = new JPanel();
    Timer timer = new Timer(4500, this);
    Database database = new Database();
    ArrayList<Series> series = database.getSeries();
    ArrayList<Subject> subjects = database.getSubjects();
    ArrayList<Formula> formulae = database.getFormulae();
    JPanel homepage = homepage();

    public Interface()
    {
        super("Division Formula Interface");
        setSize(1700,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        add(main_panel);
        createWelcome();
        main_panel.add(welcome);
        timer.start();
    }

    private void createWelcome()
    {
        final Font big_font = new Font("Arial", Font.BOLD, 30);
        welcome.setSize(1700,900);
        welcome.setLayout(new GridLayout(2,1));
        JLabel wlcm = new JLabel("Welcome to The Division Formula Directory...");
        JLabel second = new JLabel("Your business is very important to us");
        JLabel alpha = new JLabel("(prototype)");
        second.setHorizontalAlignment(JLabel.CENTER);
        wlcm.setFont(big_font);
        welcome.add(wlcm);
        welcome.add(second);
        welcome.add(alpha);
    }

    private JPanel homepage()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));

        JPanel top_panel = new JPanel();                            //top panel should just contain a basic message
        JTextArea text = new JTextArea("What kind of message do I want? Modify it in Interface 43");
        text.setSize(1200,150);
        text.setLineWrap(true);
        top_panel.add(text);

        JPanel bot_panel = new JPanel();                            //bot panel with series buttons
        bot_panel.setLayout(new GridLayout(5,6));
        for (int i = 0; i<seriesButtons().size(); ++i)
        {
            bot_panel.add(seriesButtons().get(i));
        }

        panel.add(top_panel);
        panel.add(bot_panel);
        return panel;
    }

    private JPanel seriesPage(String input)
    {
        Series current = findSeries(input);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));

        JPanel top_panel = new JPanel();                            //top panel should just contain a basic message
        JTextArea text = new JTextArea(current.getDescription());
        text.setSize(1200,150);
        text.setLineWrap(true);
        top_panel.add(text);

        JPanel bot_panel = new JPanel();                            //bot panel with formula buttons
        bot_panel.setLayout(new GridLayout(5,6));
        ArrayList<JButton> buttons = formulaButtons(current);
        for (int i = 0; i<buttons.size(); ++i)
        {
            bot_panel.add(buttons.get(i));
        }

        panel.add(top_panel);
        panel.add(bot_panel);
        return panel;
    }

    private JPanel formulaPage(String input)
    {
        Formula current = findFormula(input);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));

        JPanel top_panel = new JPanel();                            //top panel should contain crucial info
        top_panel.setLayout(new GridLayout(1,2));
        JPanel top_left_panel = new JPanel();
        top_left_panel.setLayout(new GridLayout(6,1));
        top_left_panel.add(new JLabel(current.getName() + " " + current.getCode()));
        top_left_panel.add(new JLabel("Reliability: " + current.getReliability()));
        top_left_panel.add(new JLabel("Originality: " + current.getOriginality()));
        top_left_panel.add(new JLabel("Power: " + current.getPower()));
        top_left_panel.add(new JLabel("Deviation: " + current.getDeviation()));
        top_left_panel.add(new JLabel("Price: " + current.getPrice()));
        top_panel.add(top_left_panel);
        JTextArea requirements = new JTextArea(current.getRequirements());
        requirements.setLineWrap(true);
        top_panel.add(requirements);


        JPanel mid_panel = new JPanel();                            //mid panel with the description
        JTextArea text = new JTextArea(current.getDescription());
        text.setSize(1200,300);
        text.setLineWrap(true);
        mid_panel.add(text);

        JPanel bot_panel = new JPanel();                            //bot panel with subject buttons
        bot_panel.setLayout(new GridLayout(2,4));
        ArrayList<JButton> buttons = subjectButtons(current);
        for (int i = 0; i<buttons.size(); ++i)
        {
            bot_panel.add(buttons.get(i));
        }

        panel.add(top_panel);
        panel.add(mid_panel);
        panel.add(bot_panel);
        return panel;
    }

    private JFrame subjectPage(String input)
    {
        Subject current = findSubject(input);
        JFrame frame = new JFrame();                                //making the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setLocation(300,400);

        JPanel main = new JPanel();
        main.setLayout(new GridLayout(2,1));

        JPanel top = new JPanel();                                  //contains ID, Rating, and Cost
        top.setLayout(new GridLayout());
        top.setPreferredSize(new Dimension(250,50));

        JPanel top_left = new JPanel();
        top_left.setLayout(new GridLayout(2,1));
        top_left.add(new JLabel(current.getID()));
        top_left.add(new JLabel(current.getRating()));

        JLabel top_right = new JLabel(current.getCost() + " pts");

        top.add(top_left);
        top.add(top_right);

        JTextArea bottom = new JTextArea(current.getDescription()); //contains description
        bottom.setLineWrap(true);

        main.add(top);
        main.add(bottom);
        frame.add(main);
        return frame;
    }

    private ArrayList<JButton> seriesButtons()
    {
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        for (int i = 0; i < database.getSeries().size(); ++i)
        {
            JButton button = new JButton(database.getSeries().get(i).getName() + " Series");
            button.addActionListener(this);
            buttons.add(button);
        }
        return buttons;
    }

    private ArrayList<JButton> formulaButtons(Series series)
    {
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        for (int i = 0; i < formulae.size(); ++i)
        {
            if (formulae.get(i).getCode().contains(series.getName()))
            {
                JButton button = new JButton(formulae.get(i).getName());
                button.addActionListener(this);
                buttons.add(button);
            }
        }
        JButton back_to_homepage = new JButton("Back");
        back_to_homepage.setActionCommand("ToHomepage");
        back_to_homepage.addActionListener(this);
        buttons.add(back_to_homepage);
        return buttons;
    }

    private ArrayList<JButton> subjectButtons(Formula formula)
    {
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        for (int i = 0; i < subjects.size(); ++i)
        {
            if (subjects.get(i).getID().contains(formula.getCode()))
            {
                JButton button = new JButton(subjects.get(i).getID());
                button.addActionListener(this);
                buttons.add(button);
            }
        }
        JButton back_to_homepage = new JButton("Back");
        back_to_homepage.setActionCommand("ToHomepage");
        back_to_homepage.addActionListener(this);
        buttons.add(back_to_homepage);
        return buttons;
    }

    private Series findSeries(String this_one)
    {
        for (int i=0; i<series.size(); ++i)
        {
            if (series.get(i).getName().equals((this_one)))
            {
                return series.get(i);
            }
        }
        return series.get(series.size());
    }

    private Formula findFormula(String this_one)
    {
        for (int i=0; i<formulae.size(); ++i)
        {
            if (formulae.get(i).getName().equals((this_one)))
            {
                return formulae.get(i);
            }
        }
        return formulae.get(formulae.size());
    }

    private Subject findSubject(String this_one)
    {
        for (int i=0; i<subjects.size(); ++i)
        {
            if (subjects.get(i).getID().equals((this_one)))
            {
                return subjects.get(i);
            }
        }
        return subjects.get(subjects.size());
    }

    private boolean containsNumbers(String input)
    {
        boolean answer = false;
        if (input.contains("0") || input.contains("1") || input.contains("2") || input.contains("3") || input.contains("4") || input.contains("5") ||
                input.contains("6") || input.contains("7") || input.contains("8") || input.contains("9"))
        {
            answer = true;
        }
        return answer;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        int z = 9;
        String input = e.getActionCommand();
        if (input == "ToHomepage")
        {
            main_panel.removeAll();
            main_panel.add(homepage);
            z=0;
            validate();
            repaint();
        }
        if (e.getSource() == timer)
        {
            main_panel.remove(welcome);
            main_panel.add(homepage);
            validate();
            repaint();
            timer.stop();
            z=0;
        }
        else
        {
            if (input.length() == 8)
            {
                char character = input.charAt(0);
                String newinput = character + "";
                main_panel.remove(homepage);
                main_panel.add(seriesPage(newinput));
                z=0;
                validate();
                repaint();
            }
        }
        if (z==9)
        {
            if (containsNumbers(input) == false)
            {
                main_panel.removeAll();
                main_panel.add(formulaPage(input));
                validate();
                repaint();
            }
            else
            {
                JFrame subject = subjectPage(input);
            }
        }
    }

    public static void main(String[] args)
    {
        Interface interface1 = new Interface();
    }
}
