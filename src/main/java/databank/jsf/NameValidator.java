package databank.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator( "nameValidator")
public class NameValidator implements Validator<String> {

	@Override
	public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
		if ( value == null || value.length() == 0) {
			FacesMessage msg = new FacesMessage( "Name should not be empty", "Empty name.");
			msg.setSeverity( FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException( msg);
		}

	}

}
