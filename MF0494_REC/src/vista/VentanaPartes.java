package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class VentanaPartes extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;


	/**
	 * Create the frame.
	 */
	public VentanaPartes() {
		setBounds(100, 100, 491, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[40px,grow,fill][grow]"));
		
		JLabel lblNewLabel_4 = new JLabel("    DGT - Partes de reparaci\u00F3n");
		lblNewLabel_4.setPreferredSize(new Dimension(97, 30));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBackground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setOpaque(true);
		contentPane.add(lblNewLabel_4, "cell 0 0,growx");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 1,grow");
		panel.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow]"));
		
		JLabel lblNewLabel_3 = new JLabel("Lista de partes:");
		panel.add(lblNewLabel_3, "cell 0 0,alignx left");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, "cell 0 1,grow");
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "cell 0 2,grow");
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Cerrar");
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}

}
