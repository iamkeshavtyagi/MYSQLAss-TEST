package Test3;

import java.util.Scanner;


class WeightLimitExceeded extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	WeightLimitExceeded(int curr_weight){
        System.out.print(Math.abs(15-curr_weight)+" kg abnormal condition : ");
    }
}


public class weight {

	void allowedWeight(int weight)throws WeightLimitExceeded{
		if(weight>15)
			
			throw new WeightLimitExceeded(weight);
		else
			
			System.out.println("You are in the limit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		weight ob=new weight();
		try (Scanner b = new Scanner(System.in)) {
			for(int i=0;i<2;i++){
			        try{
			            ob.allowedWeight(b.nextInt());
			        }catch(WeightLimitExceeded e){
			            System.out.println(e);
			        }
}
		}
	}
}
