package at.ac.tuwien.auto.modelua.uml2opcua.qvto.developer.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewTransformationProjectWizard extends Wizard implements INewWizard {

	public NewTransformationProjectWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO: copy the example project to the user's workspace
		// check out https://github.com/eclipse/qvto/tree/master/plugins/org.eclipse.m2m.qvt.oml.samples
		return true;
	}

}
