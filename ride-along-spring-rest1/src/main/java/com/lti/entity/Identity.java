/**
 * Saves Identity details.
 * @author: Yugandhara
 * @Version:1.0
  
 */

package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "identity_det")
@SequenceGenerator(name = "identityseq" ,sequenceName = "identity_seq",initialValue = 101,allocationSize = 1)
@NamedQuery(name = "max_id3", query = "SELECT MAX(userId) FROM User")
public class Identity {
	
	@Id
	@GeneratedValue(generator = "identityseq", strategy = GenerationType.SEQUENCE)
	private int identityId;
	
	@Column(length = 15)
	private String aadhaarNo ;
	@Column(length = 15)
	private String panNo;
	
	@OneToOne
	@JoinColumn(name = "userId")
	private User user;

	public int getIdentityId() {
		return identityId;
	}

	public void setIdentityId(int identityId) {
		this.identityId = identityId;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
