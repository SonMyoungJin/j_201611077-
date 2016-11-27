class PeopleSumAverage {

  static void calSum(int[][] data) {
    int sumW;
    int sumM;
    for(int i=0;i<data.length;i++) {
      sumW=data[i][0]+sumW;
      sumM=data[i][1]+sumM;
     }
        System.out.printf("M : %d, W: %d/n",sumW,sumM);
    }
  }
  public static void main(String[] args){
   int[][] data={
    {74425, 76326},
    {61164, 61636},
    {109688, 115744},
    {144796, 146776},
    {174996, 181676},
    {177841, 177434},
    {204630, 205980},
    {223373, 232245},
    {161055, 166130},
    {171576, 176735},
    {279169, 293772},
    {239450, 251066},
    {148690, 156510},
    {182977, 196992},
    {237792, 242641},
    {283869, 296762},
    {209344, 210282},
    {118965, 114441},
    {186503, 186856},
    {195734, 203014},
    {254381, 249472},
    {212401, 229111},
    {271654, 295354},
    {319197, 335045},
    {229829, 231671}
};
    PeopleSumAverage sa=new PeopleSumAverage();
    sa.calSum(data);
  }
}