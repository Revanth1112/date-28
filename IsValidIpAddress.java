package date28;

public class IsValidIpAddress {

	public static void main(String[] args) {
		String input = "172.16.254.1";
		input= input.replace('.',' ');
		String[]data = input.split(" ");
		int num =0;
		boolean isvalid = true;
		if(data.length !=4)isvalid=false;
		else {
			for(int i=0;i<data.length;i++) {
				num= Integer.parseInt(data[i]);
				if((num<0)||(num>255)){
					isvalid = false;
					break;
				}
			}
		}
		if(isvalid == true) {
			System.out.println("Valid IPv4 Address");
		}
		else {
			System.out.println("not Valid IPv4 Address");
		}
	}

}
