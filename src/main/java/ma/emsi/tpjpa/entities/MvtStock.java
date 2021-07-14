package ma.emsi.tpjpa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor
public class MvtStock implements Serializable {

	public static final int ENTREE=1;
	public static final int SORTIE=1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long IdMvtStk;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	private BigDecimal quantite;
	
	private int typeMvt;
	
}
