package projet.vues.ecoutables.Checkbox;

import java.awt.AWTEvent;

import projet.AnimationBilles;

public class CheckboxBillardMode extends CheckboxPerso {

	private static final long serialVersionUID = 1L;

	public CheckboxBillardMode(String messageCheckbox) {
		super(messageCheckbox);
	}

	@Override
	public void action(AnimationBilles animationBilles, AWTEvent e) {
		animationBilles.setBillardMode();
	}

}
