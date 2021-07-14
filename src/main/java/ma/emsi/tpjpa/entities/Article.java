package ma.emsi.tpjpa.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class Article implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long IdArticle;
	private String codeArticle;
	private String destignation;
	private BigDecimal prixinitaireHT;
	private BigDecimal tauxTVA;
	private BigDecimal prixTTC;
	private String photo;
	@ManyToOne
	@JoinColumn(name="IdCategories")
	private Categories categories;
	
}
