import java.util.*;
public class Practice71 {
	public static void main(String[] args) {
		Random rd=new Random();
		ArrayList<Double>list=new ArrayList<>(10);
		
		System.out.println("심사위원 채점결과");
		for(int i=0;i<10;i++) {
			list.add(rd.nextDouble()*10);
			System.out.print(list.get(i)+"\t");
			if(i%2==1) {
				System.out.println();
			}
		}
		System.out.println();
		
		System.out.println("평균값: "+getAve(list)+"\n");
		
		System.out.println("가장 높은 점수: "+findMax(list));
		System.out.println("가장 낮은 점수: "+findMin(list)+"\n");
		
		System.out.println("최고점과 최저점을 제외한 결과");
		for(int i=0;i<8;i++) {
			System.out.print(list.get(i)+"\t");
			if(i%2==1) {
				System.out.println();
			}
		}
		System.out.println();
		
		System.out.println("최종 점수: "+getAve(list));

		
		
		
	}
	 public static Double findMax(ArrayList<Double> scores) {
		 Double max= scores.get(0);
		 for(double score: scores) {
			 if(score>max) {
				 max=score;
			 }
		 }
		 scores.remove(max);
		 return max;
	 }
	 public static Double findMin(ArrayList<Double> scores) {
		 Double min= scores.get(0);
		 for(double score: scores) {
			 if(score<min) {
				 min=score;
			 }
		 }
		 scores.remove(min);
		 return min;
		 
	 }
	 public static Double getAve(ArrayList<Double> scores) {
		 Double sum=0.0;
		 int count=0;
		 for(Double score: scores) {
			 sum+=score;
			 count++;
		 }
		 return sum/count;
	 }
}