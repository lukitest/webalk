package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Template")
@Table(name = "Templates")
public class TemplateEntity {
	
	@Id
	@Column(name = "Title")
	private String title;
	@Id
	@Column(name = "Value")
	private String value;
	@Id
	@Column(name = "Recipient")
	private String recipient;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}


}
