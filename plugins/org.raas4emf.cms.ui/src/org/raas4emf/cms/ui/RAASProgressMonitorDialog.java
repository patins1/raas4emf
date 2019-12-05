package org.raas4emf.cms.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.raas4emf.cms.core.Activator;

public class RAASProgressMonitorDialog 

extends Job {

	private IRunnableWithProgress runnable;

	public RAASProgressMonitorDialog(String title, Shell shell) {
		super(title);
		System.out.println("constr");
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			runnable.run(monitor);
		} catch (Exception e) {
			Activator.err(e);
			return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, e.getMessage(), e);
		}
		return Status.OK_STATUS;
	}

	public void run(boolean fork, boolean cancelable, IRunnableWithProgress runnable)
			throws InvocationTargetException, InterruptedException {
		this.runnable = runnable;
		System.out.println("this.cadTool7");
		runnable.run(new NullProgressMonitor() {
			@Override
			public void subTask(String name) {
				System.out.println("subTask "+name);
				super.subTask(name);
			}
			@Override
			public void worked(int work) {
				System.out.println("worked "+work);
				super.worked(work);
			}
			@Override
			public void done() {
				System.out.println("done");
				super.done();
			}
		});
		System.out.println("this.cadTool78");
//		this.schedule();
	}
//extends ProgressMonitorDialog {
//
//	public RAASProgressMonitorDialog(String title, Shell shell) {
//		super(shell);
//		this.title = title;
//	}
//
//	protected void configureShell(final Shell shell) {
//		super.configureShell(shell);
//		shell.setText(title);
//	}

	String title;
}
