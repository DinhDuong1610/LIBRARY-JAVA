package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.Model_NhanVien;
import view.component.Item_khuSach;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Font;

public class QL_CuaHang extends JPanel{
	
	private JPanel panel;

	public QL_CuaHang() {
		setBackground(Color.WHITE);
		setSize(1240, 830);
		setLayout(null);
		
		JLabel lb_logo = new JLabel("");
		lb_logo.setIcon(new ImageIcon(QL_CuaHang.class.getResource("/images/logo_title.png")));
		lb_logo.setHorizontalAlignment(SwingConstants.CENTER);
		lb_logo.setBounds(370, 10, 442, 63);
		add(lb_logo);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(159, 191, 940, 613);
		add(panel);
		panel.setLayout(new GridLayout(2, 3, 50, 50));
		
		Item_khuSach item1 = new Item_khuSach(1);
		item1.getLb_title().setText("SÁCH GIÁO KHOA");
		item1.getPanel().setBackground(new Color(239, 163, 163));
		item1.getPanel().setOpaque(true);
		panel.add(item1);
		
		Item_khuSach item2 = new Item_khuSach(2);
		item2.getLb_title().setText("SÁCH KHOA HỌC");
		item2.getPanel().setBackground(new Color(255, 237, 172));
		item2.getPanel().setOpaque(true);
		panel.add(item2);
		
		Item_khuSach item3 = new Item_khuSach(3);
		item3.getLb_title().setText("SÁCH NGHỆ THUẬT");
		item3.getPanel().setBackground(new Color(255, 183, 239));
		item3.getPanel().setOpaque(true);
		panel.add(item3);
		
		Item_khuSach item4 = new Item_khuSach(4);
		item4.getLb_title().setText("SÁCH VĂN HỌC");
		item4.getPanel().setBackground(new Color(133, 255, 248));
		item4.getPanel().setOpaque(true);
		panel.add(item4);

		Item_khuSach item5 = new Item_khuSach(5);
		item5.getLb_title().setText("SÁCH SELF HELP");
		item5.getPanel().setBackground(new Color(210, 194, 255));
		item5.getPanel().setOpaque(true);
		panel.add(item5);
		
		Item_khuSach item6 = new Item_khuSach(6);
		item6.getLb_title().setText("TRUYỆN TRANH");
		item6.getPanel().setBackground(new Color(248, 215, 129));
		item6.getPanel().setOpaque(true);
		panel.add(item6);
		
		JLabel lblNewLabel = new JLabel("TẦNG 1");
		lblNewLabel.setForeground(new Color(244, 164, 96));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(160, 128, 278, 41);
		add(lblNewLabel);
		
		JLabel lblTng = new JLabel("TẦNG 2");
		lblTng.setForeground(new Color(244, 164, 96));
		lblTng.setHorizontalAlignment(SwingConstants.CENTER);
		lblTng.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTng.setBounds(487, 128, 278, 41);
		add(lblTng);
		
		JLabel lblTng_1 = new JLabel("TẦNG 3");
		lblTng_1.setForeground(new Color(244, 164, 96));
		lblTng_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTng_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTng_1.setBounds(821, 128, 278, 41);
		add(lblTng_1);
			
	}
	
	public void online(Model_NhanVien nhanvien, int quay) {
		Component[] components = panel.getComponents();
		for (Component component : components) {
		    if (component instanceof Item_khuSach) {
		        Item_khuSach item = (Item_khuSach) component;
		        if(item.getQuay() == quay) {
		        	item.online(nhanvien);
		        	panel.repaint();
		        	panel.revalidate();
		        	break;
		        }
		    }
		}
	}
	
	public void offline(int quay) {
		Component[] components = panel.getComponents();
		for (Component component : components) {
		    if (component instanceof Item_khuSach) {
		        Item_khuSach item = (Item_khuSach) component;
		        if(item.getQuay() == quay) {
		        	item.offline();
		        	panel.repaint();
		        	panel.revalidate();
		        	break;
		        }
		    }
		}
	}
}
