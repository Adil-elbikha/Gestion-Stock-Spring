package ma.emsi.tpjpa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor
public class Vente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long IdVente;
	
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date datevente;
	@OneToMany(mappedBy = "vente")
	private List<LigneVente> ligneVentes;
}
