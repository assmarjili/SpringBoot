package com.assma.pfe.entities;

import java.util.*;

import javax.persistence.*;

import com.assma.pfe.enumeration.ESection;

@Entity
public class Sujet{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSujet;
	
	@Enumerated(EnumType.STRING)
	private ESection section;
	
	private String title;
	
	private String description;
	

	private String envr;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "sujet_id", foreignKey = @ForeignKey(name="fk_sujet_id"))
    private List < User > etudiants = new ArrayList < > ();
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "encadrant_ins_id", foreignKey = @ForeignKey(name="fk_encadrant_ins_id"))
	private Encadrant encadrantIns;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "encadrant_ese_id", foreignKey = @ForeignKey(name="fk_encadrant_ese_id"))
	private EncadrantEse encadrantEse;

	public Sujet() {
		super();
	}
	
	public Sujet(Long idSujet, ESection section, String title, String description, String envr, List<User> etudiants,
			Encadrant encadrantIns, EncadrantEse encadrantEse) {
		this.idSujet = idSujet;
		this.section = section;
		this.title = title;
		this.description = description;
		this.envr = envr;
		this.etudiants = etudiants;
		this.encadrantIns = encadrantIns;
		this.encadrantEse = encadrantEse;
	}

	public Long getIdSujet() {
		return idSujet;
	}

	public void setIdSujet(Long idSujet) {
		this.idSujet = idSujet;
	}

	public ESection getSection() {
		return section;
	}

	public void setSection(ESection section) {
		this.section = section;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnvr() {
		return envr;
	}

	public void setEnvr(String envr) {
		this.envr = envr;
	}

	public List<User> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<User> etudiants) {
		this.etudiants = etudiants;
	}

	public Encadrant getEncadrantIns() {
		return encadrantIns;
	}

	public void setEncadrantIns(Encadrant encadrantIns) {
		this.encadrantIns = encadrantIns;
	}

	public EncadrantEse getEncadrantEse() {
		return encadrantEse;
	}

	public void setEncadrantEse(EncadrantEse encadrantEse) {
		this.encadrantEse = encadrantEse;
	}

	@Override
	public String toString() {
		return "Sujet [idSujet=" + idSujet + ", section=" + section + ", title=" + title + ", description="
				+ description + ", envr=" + envr + ", etudiants=" + etudiants + ", encadrantIns=" + encadrantIns
				+ ", encadrantEse=" + encadrantEse + "]";
	}

	
	
}
