package aiss.model;

import java.util.List;

public class Calendar {
	
	String id;
	String title;
	String description;
	List<Event> eventsList;
	List<Task> taskList;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public List<Event> getEventsList() {
		return eventsList;
	}
	public void setEventsList(List<Event> eventsList) {
		this.eventsList = eventsList;
	}
	public List<Task> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

}
