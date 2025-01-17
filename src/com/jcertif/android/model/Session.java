package com.jcertif.android.model;



import java.util.Date;



public class Session extends JCertifObject{

	
	private long id;
	private String title;
	private String summary;
	private String description;
	private String status;
	private String keyword;
	private String[] category;
    private Date start;
	private Date end;
	private String[] speakers;
	private int salle;
	
	
	
	public Session() {
		super();
	}

    public Session(int id, String title, String summary, String description, String status, String keyword, String[] category,Date start, Date end, String[] speakers, int salle, int version, boolean deleted) {
        super(version, deleted);
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.description = description;
        this.status = status;
        this.keyword = keyword;
        this.category = category;
        this.start=start;
        this.end = end;
        this.speakers = speakers;
        this.salle = salle;
    }

	public Session(int id, String title, String summary, String description,
			String status, String keyword, String[] category,Date start, Date end,
			String[] speakers, int salle, String version) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.description = description;
		this.status = status;
		this.keyword = keyword;
		this.category = category;
                this.start=start;
		this.end = end;
		this.speakers = speakers;
		this.salle = salle;
		
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String[] getCategory() {
		return category;
	}

	public void setCategory(String[] category) {
		this.category = category;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String[] getSpeakers() {
		return speakers;
	}

	public void setSpeakers(String[] speakers) {
		this.speakers = speakers;
	}

	public int getSalle() {
		return salle;
	}

	public void setSalle(int salle) {
		this.salle = salle;
	}

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

	
	
	
	
}
