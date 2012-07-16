package org.codebone.security.group;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.codebone.framework.generic.AbstractModel;
import org.codebone.security.authorities.AuthoritiesModel;
import org.codebone.security.manager.ManagerModel;


@Entity
public class GroupModel extends AbstractModel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Long idx;
	
	@Column
	private String name = "";
	
	@Column
	private String description = "";
	
	@OneToMany
	@JoinColumn(name="groupIdx")
	private List<AuthoritiesModel> authoritiesList;
	
	@OneToMany
	@JoinColumn(name="groupIdx")
	private List<ManagerModel> managerList;

	@Override
	public String toString() {
		return "GroupModel [idx=" + idx + ", name=" + name + ", description="
				+ description + ", authoritiesList=" + authoritiesList
				+ ", managerList=" + managerList + "]";
	}

	public Long getIdx() {
		return idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<AuthoritiesModel> getAuthoritiesList() {
		return authoritiesList;
	}

	public void setAuthoritiesList(List<AuthoritiesModel> authoritiesList) {
		this.authoritiesList = authoritiesList;
	}

	public List<ManagerModel> getManagerList() {
		return managerList;
	}

	public void setManagerList(List<ManagerModel> managerList) {
		this.managerList = managerList;
	}

	public GroupModel(Date createdDate, Date updatedDate, Long idx,
			String name, String description,
			List<AuthoritiesModel> authoritiesList,
			List<ManagerModel> managerList) {
		super(createdDate, updatedDate);
		this.idx = idx;
		this.name = name;
		this.description = description;
		this.authoritiesList = authoritiesList;
		this.managerList = managerList;
	}

	public GroupModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupModel(Date createdDate, Date updatedDate) {
		super(createdDate, updatedDate);
		// TODO Auto-generated constructor stub
	}
	
	
}
