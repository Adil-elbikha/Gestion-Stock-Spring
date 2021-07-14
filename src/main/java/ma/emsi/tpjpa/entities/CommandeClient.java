package ma.emsi.tpjpa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class CommandeClient implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdCommandeClient;
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date datecommande;
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@ManyToMany(mappedBy = "commandeClient")
	private List<LigneCdeClient> ligneCdeClients;
}
