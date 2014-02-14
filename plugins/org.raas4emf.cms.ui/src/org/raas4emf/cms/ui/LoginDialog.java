/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LoginDialog extends Dialog {

	private static final int LOGIN_ID = IDialogConstants.CLIENT_ID + 1;

	private Combo userText;
	private Text passText;
	private Label mesgLabel;
	private String title;
	private String message;
	private String username;
	private String password;

	private String[] items;

	private Label passLabel;

	public LoginDialog(final Shell parent, final String title, final String message, String... items) {
		super(parent);
		this.items = items;
		this.title = title;
		this.message = message;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	protected void configureShell(final Shell shell) {
		super.configureShell(shell);
		if (title != null) {
			shell.setText(title);
		}
		// Workaround for RWT Text Size Determination
		shell.addControlListener(new ControlAdapter() {

			public void controlResized(ControlEvent e) {
				initializeBounds();
			}
		});
	}

	protected Control createDialogArea(final Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new GridLayout(2, false));
		mesgLabel = new Label(composite, SWT.NONE);
		GridData messageData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		messageData.horizontalSpan = 2;
		mesgLabel.setLayoutData(messageData);
		Label userLabel = new Label(composite, SWT.NONE);
		userLabel.setText("Username:");
		userText = new Combo(composite, SWT.BORDER);
		userText.setItems(items);
		userText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		userText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent event) {
				boolean needPsw = !userText.getText().equals("Architect");
				passLabel.setVisible(needPsw);
				passText.setVisible(needPsw);
			}

		});
		passLabel = new Label(composite, SWT.NONE);
		passLabel.setText("Password:");
		passText = new Text(composite, SWT.BORDER | SWT.PASSWORD);
		passText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		if (items.length > 0)
			userText.setText(items[0]);
		initilizeDialogArea();
		return composite;
	}

	protected void createButtonsForButtonBar(final Composite parent) {
		createButton(parent, IDialogConstants.CANCEL_ID, "Cancel", false);
		createButton(parent, LOGIN_ID, "Login", true);
	}

	protected void buttonPressed(final int buttonId) {
		if (buttonId == LOGIN_ID) {
			username = userText.getText();
			password = passText.getText();
			if (userText.getText().equals("Architect"))
				password = "a";
			setReturnCode(OK);
			close();
		} else {
			password = null;
		}
		super.buttonPressed(buttonId);
	}

	private void initilizeDialogArea() {
		if (message != null) {
			mesgLabel.setText(message);
		}
		if (username != null) {
			userText.setText(username);
		}
		userText.setFocus();
	}

	public void setItems(String... items) {
		this.items = items;
	}
}
