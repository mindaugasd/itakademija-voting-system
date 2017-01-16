package vs.admin.features.candidate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "candidate_id")
	private Integer id;

}
