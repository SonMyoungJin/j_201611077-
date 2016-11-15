class MultiplesThreeFive{
	int j;
	int sum=0;
	
	void getSum(int j){
		for(int i=1;i<j;i++){
			if(i%3==0 || i%5==0){
				sum=sum+i;
			}
		}	
		System.out.println(sum);
	}
	public static void main(String[] args){
		MultiplesThreeFive m=new MultiplesThreeFive();
		m.getSum(1000);	
	}
}