import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

import static java.lang.Integer.MAX_VALUE;
import static javax.swing.SwingConstants.RIGHT;

public class ExtensionPanel extends JPanel
{
    public ExtensionPanel(PayloadConfiguration payloadConfiguration)
    {
        super(new GridLayout(0, 2));

        JLabel characterSetLabel = new JLabel("Character set: ", RIGHT);
        JTextComponent characterSetText = new JTextField(payloadConfiguration.getCharacterSet());

        this.add(characterSetLabel);
        this.add(characterSetText);

        JLabel payloadLengthLabel = new JLabel("Payload length: ", RIGHT);
        SpinnerNumberModel payloadLengthModel = new SpinnerNumberModel(payloadConfiguration.getPayloadLength(), 0, MAX_VALUE, 1);
        JSpinner payloadLengthSpinner = new JSpinner(payloadLengthModel);

        this.add(payloadLengthLabel);
        this.add(payloadLengthSpinner);

        JCheckBox randomOrderCheckbox = new JCheckBox("Random order", payloadConfiguration.isRandomOrder());

        this.add(randomOrderCheckbox);

        JCheckBox allowCharRepeatsCheckbox = new JCheckBox("Allow character repeats", payloadConfiguration.isAllowCharRepeats());

        this.add(allowCharRepeatsCheckbox);

        JLabel maxNumberOfGeneratedPayloadsLabel = new JLabel("Maximum number of generated payloads: ", RIGHT);
        SpinnerNumberModel maxNumberOfGeneratedPayloadsModel = new SpinnerNumberModel(payloadConfiguration.getMaxNumberOfGeneratedPayloads(), 0, MAX_VALUE, 100);
        JSpinner maxNumberOfGeneratedPayloadsSpinner = new JSpinner(maxNumberOfGeneratedPayloadsModel);

        this.add(maxNumberOfGeneratedPayloadsLabel);
        this.add(maxNumberOfGeneratedPayloadsSpinner);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(l -> {
            payloadConfiguration.setCharacterSet(characterSetText.getText());
            payloadConfiguration.setPayloadLength((Integer) payloadLengthModel.getNumber());
            payloadConfiguration.setRandomOrder(randomOrderCheckbox.isSelected());
            payloadConfiguration.setAllowCharRepeats(allowCharRepeatsCheckbox.isSelected());
            payloadConfiguration.setMaxNumberOfGeneratedPayloads((Integer) maxNumberOfGeneratedPayloadsModel.getNumber());
        });

        this.add(saveButton);
    }
}
