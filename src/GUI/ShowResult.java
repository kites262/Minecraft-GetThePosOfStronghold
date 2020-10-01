package GUI;

import javax.swing.*;
import java.awt.*;

import type.pos;

public class ShowResult extends JFrame {
	private static final long serialVersionUID = 1L;

	public void ResultGUI(String title, pos s, pos a, pos b, double deg1, double deg2){
		Container container = getContentPane();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(512,512,272,256);
		setLayout(null);
		setTitle(title);
//		JFrame frame = new JFrame(title);

//		frame.setSize(512,256);
/*
		JLabel show_va = new JLabel(
				String.valueOf(a.x)
						+", "
						+String.valueOf(a.z)
						+", degree "
						+String.valueOf(deg1)
						+"° *"
		);show_va.setLocation(4,4);
		JLabel show_vb = new JLabel(
				String.valueOf(b.x)
						+", "
						+String.valueOf(b.z)
						+", degree "
						+String.valueOf(deg2)
						+"° *"
		);show_va.setLocation(4,32);
		JLabel show_vr = new JLabel(
				String.valueOf(p.x)
						+"; "
						+String.valueOf(p.z)
						+"; "
		);show_va.setLocation(8,64);
		container.add(show_va);
		container.add(show_vb);
		container.add(show_vr);

//		label.setHorizontalAlignment(400,600);
//		label.setForeground(Color.cyans);
//		label.setFont(font("Consolas",Font.BOLD,32));
		JLabel show_va = new JLabel(
//				String.valueOf(a.x)
						a.x
						+", "
//						+String.valueOf(a.z)
						+a.z
						+", degree "
//						+String.valueOf(deg1)
						+deg1
						+"° *"
		);
		show_va.setBounds(4,32,256,24);
		JLabel show_vb = new JLabel(
//				String.valueOf(b.x)
						b.x
						+", "
						+b.z
//						+String.valueOf(b.z)
						+", degree "
//						+String.valueOf(deg2)
						+deg2
						+"° *"
		);
		show_vb.setBounds(4,56,256,24);
		JButton show_vr = new JButton(
//				String.valueOf(p.x)
						p.x
						+"   "
//						+String.valueOf(p.z)
						+p.z
		);

 */
		JLabel show_va = new JLabel(""
						+pos.toString(a)
						+", degree "
						+deg1
						+"° *"
		);
		show_va.setBounds(4,32,256,24);
		JLabel show_vb = new JLabel(""
						+pos.toString(b)
						+", degree "
						+deg2
						+"° *"
		);
		show_vb.setBounds(4,56,256,24);
		JButton show_vr = new JButton(""
				+pos.toString__three_number_behind(s)
		);
		show_vr.addActionListener(Listener -> Button.Exit());

		show_va.setFont(font("微软雅黑",Font.ITALIC,16));
		show_vb.setFont(font("微软雅黑",Font.ITALIC,16));

		show_vr.setBounds(0,128,256,64);
		show_vr.setFont(font("Console",Font.BOLD,18));
		show_vr.setBackground(Color.gray);
		show_vr.setForeground(Color.orange);

		container.add(show_va);
		container.add(show_vb);
		container.add(show_vr);
		container.setBackground(Color.white);

		setAlwaysOnTop(true);
		setVisible(true);
	}

	private static Font font(String type, int style, int size) {
		return new Font(type,style,size);
	}
}
