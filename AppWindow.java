import java.awt.*;
import java.awt.event.*;

class AppWindow extends Frame {

    // Buttons and card panel
    Button buttonColorCustomizing = new Button("Color Customizing");
    Button buttonColorSchemeExamples = new Button("Color SchemeExamples");
    Button buttonColorSchemesReady_Made = new Button("Color Schemes Ready-Made");
    CardLayout LayoutCard = new CardLayout();
    Panel panelCards = new Panel(LayoutCard);

  AppWindow() {
    setSize(500, 500);
    setVisible(true);
    setLocation (300, 100);
    
    // Create main panel
    Panel panelMain = new Panel(new FlowLayout());
    panelMain.setBackground(Color.white);
    
    // Create GridBagLayout panels
    GridBagLayout gblColorCustomizing = new GridBagLayout();
    Panel panelColorCustomizing = new Panel(gblColorCustomizing);
    panelColorCustomizing.setBackground(Color.cyan); // Coloring the panel
    panelColorCustomizing.add(new Label("This is label for panel color customizing"));
    // panelColorCustomizing.setSize(50,50);            // Settings size
    GridBagLayout gblColorSchemeExamples = new GridBagLayout();
    Panel panelColorSchemeExamples = new Panel(gblColorSchemeExamples);
    panelColorSchemeExamples.setBackground(Color.green);  // Coloring the panel
    panelColorSchemeExamples.add(new Label("This is label for panel color scheme examples"));
    // panelColorSchemeExamples.setSize(50,50);              // Setting size
    GridBagLayout gblColorSchemesReady_Made = new GridBagLayout();
    Panel panelColorSchemesReady_Made = new Panel(gblColorSchemesReady_Made);
    panelColorSchemesReady_Made.setBackground(Color.yellow);  // Coloring the panel
    panelColorSchemesReady_Made.add(new Label("This is label for panel color schemes ready-made"));
    // panelColorSchemesReady_Made.setSize(50,50);               // Setting size

    // Adding GridBagLayout panels to the panelCards
    panelCards.add(panelColorCustomizing, "1");
    panelCards.add(panelColorSchemeExamples, "2");
    panelCards.add(panelColorSchemesReady_Made, "3");

    // Adding buttons and card panel on the main panel
    panelMain.add(buttonColorCustomizing);
    panelMain.add(buttonColorSchemeExamples);
    panelMain.add(buttonColorSchemesReady_Made);
    panelMain.add(panelCards);

    LayoutCard.show(panelCards, "1");


   
    // Adding main panel 
    add(panelMain); 
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });

    // Adding actions for buttons
    buttonColorCustomizing.addMouseListener(mouseAdapter);
    buttonColorSchemeExamples.addMouseListener(mouseAdapter);
    buttonColorSchemesReady_Made.addMouseListener(mouseAdapter);

  } // AppWindow - end

  MouseAdapter mouseAdapter = new MouseAdapter() {
    public void mouseClicked (MouseEvent e) {
      if (e.getSource() == buttonColorCustomizing) LayoutCard.show(panelCards, "1");
      if (e.getSource() == buttonColorSchemeExamples) LayoutCard.show(panelCards, "2");
      if (e.getSource() == buttonColorSchemesReady_Made) LayoutCard.show(panelCards, "3");
    }
  };

 }
