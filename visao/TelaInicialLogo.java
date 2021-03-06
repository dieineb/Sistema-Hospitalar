package visao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.BorderLayout;

public class TelaInicialLogo extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaInicialLogo() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		add(lblNewLabel, BorderLayout.CENTER);

	}

}
