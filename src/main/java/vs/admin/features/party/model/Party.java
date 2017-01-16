package vs.admin.features.party.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parties")
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "party_id")
	private Integer id;

	@Column(name = "party_title")
	private String title;
}
