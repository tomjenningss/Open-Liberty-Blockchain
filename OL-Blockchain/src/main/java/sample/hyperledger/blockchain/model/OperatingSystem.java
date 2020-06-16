package sample.hyperledger.blockchain.model;

public class OperatingSystem {
	
	//static String pathRoot = "/Users/Shared/FabConnection/";
	private String pathRoot;
	
	public OperatingSystem() {
		
	}
	
	public OperatingSystem(String cpathRoot) {
		pathRoot = cpathRoot;
		
	}
	
	public String getOperatingSystem() {
		
		String getProperites = System.getProperty("os.name");
		
		if(getProperites.contains("WIN")) {
			pathRoot = "C:/Users/Public/FabConnection/";
		}else {
			pathRoot = "/Users/Shared/FabConnection/";
			System.out.println(pathRoot);
		}
		
		return pathRoot;
	}
	public void setOperatingSystem(String os) {
		this.pathRoot = os;
	}

	

}