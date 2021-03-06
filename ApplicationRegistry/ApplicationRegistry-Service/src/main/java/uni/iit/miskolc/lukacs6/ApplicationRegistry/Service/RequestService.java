package uni.iit.miskolc.lukacs6.ApplicationRegistry.Service;

import java.util.List;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Request;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.*;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.exception.UserNotExistsException;

public interface RequestService {

	void submitRequest(String neptuncode, String title)
			throws InvalidRequestException, InvalidUserException, InvalidTemplateException, UserNotExistsException;

	List<Request> listRequestByUser(String neptuncode) throws InvalidUserException, UserNotExistsException;

	void addComment(int requestId, String newComment) throws InvalidRequestException;

	List<Request> listRequestByComment(String comment) throws InvalidRequestException;

	void makeVerdict(int requestId, String newStatus) throws InvalidRequestException;

	void forwardRequest(String neptuncode, int requestId) throws InvalidRequestException, InvalidUserException, UserNotExistsException;

}
