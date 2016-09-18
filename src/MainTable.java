import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainTable extends JFrame
{
	JTable jTab;
	PersonDM tModel;

	public MainTable() throws ClassNotFoundException, SQLException
	{
		setLayout(new FlowLayout());
		setSize(800, 600);
		CRUDDriver drv = new CRUDDriver();

		tModel = new PersonDM(drv.read());
		jTab = new JTable(tModel);

		JScrollPane jsp = new JScrollPane(jTab);

		jTab.setPreferredScrollableViewportSize(new Dimension(550, 400));
		getContentPane().add(jsp);

		setVisible(true);

	}
}
