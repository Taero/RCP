package com.starterkit.rcp.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;

public class Actions extends ViewPart {

	public Actions() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(3, false));
		
		Button btnNewButton = new Button(parent, SWT.FLAT);
		btnNewButton.setText("New book");
		
		Button btnNewButton_1 = new Button(parent, SWT.FLAT);
		btnNewButton_1.setText("Edit selected book");
		
		Button btnNewButton_2 = new Button(parent, SWT.FLAT);
		btnNewButton_2.setText("Delete selected book");
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
