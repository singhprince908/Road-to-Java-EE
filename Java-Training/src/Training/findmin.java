package Training;

import java.util.Arrays;

public class findmin {
	public static void main(String[] args) {
		int input2[]= {-39957,-17136,35466,21820,-26711};
		int price=0;
		int pricelist[]=new int[input2.length];
		for(int i=0;i<input2.length;i++)
		{
			price+=input2[i];
			pricelist[i] =price;
		}
		System.out.println(Arrays.toString(pricelist));
		int min=pricelist[0];
		
		for(int i=1;i<pricelist.length;i++)
		{
			if(pricelist[i]<min)
			{
				min=pricelist[i];
			}
		}
		System.out.println(min);
	}

}
