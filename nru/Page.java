package nru;

public class Page {

	int id;
	boolean referenced;
	boolean modified;
	boolean present;
	int pageFrame;
	boolean protection; //0:escrita/leitura; 1:somente leitura;
	
	public Page(int id, boolean referenced, boolean modified, boolean present, int pageFrame, boolean protection){
		this.id = id;
		this.referenced = referenced;
		this.modified = modified;
		this.present = present;
		this.pageFrame = pageFrame;
		this.protection = protection;
	}
}
