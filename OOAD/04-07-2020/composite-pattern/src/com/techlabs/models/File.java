package com.techlabs.models;

public class File implements IDiscItem{

	private String name;
	private int size;
	private String extension;
	
	public File(String name, int size, String extension) {
		this.name = name;
		this.size = size;
		this.extension = extension;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public String getExtension() {
		return extension;
	}

	@Override
	public String show(int level) {
		return(name+"."+extension+" "+size+"MB").toString();
	}
	
	
}
