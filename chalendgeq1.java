
public class chalendgeq1 {

	public static String replaceOne(String text, int i, int n, String sub) {
		
	//text= "APCS is very easy";
	//sub=" not ";
	//i=7;
	//n=1;
	
//	String partOne=text.substring(0,i);
//	String partTwo=text.substring(i+n, text.length());
//	
//	String newword=partOne+ sub+ partTwo;
//	
//	return newword;	
		String returnStr=text.substring(0,i)+sub+text.substring(i+n);
		
		return returnStr;
		
	}
	
	public static String replaceAll(String text, String what, String sub) {
		
		//saveText.add(text);
		int i=0;
		int n=what.length();
		while(i>=0){
			
			i=text.indexOf(what);
			if(i>0)
				text=replaceOne(text,i,n,sub);
			
		}
		return text;
		
		
		}
	
	public static String undoReplaceAll(){
		
		if(saveText.size()==0)
			return null;
		return saveText.remove(saveText.size()-1);
		
	}
	
	public static void main(String[] args) {
		
		
		//System.out.println(replaceOne("APCS is very easy", 7,1, " not "));
		System.out.println(replaceAll("Happy","a","A"));

	}

}
