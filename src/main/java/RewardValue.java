public class RewardValue {

    double CV;
    double MV;
    public RewardValue(double cashValue){
        CV=cashValue;
        MV=cashValue/0.0035;
    }
    public RewardValue(int milesValue){
        MV=milesValue;
        CV=milesValue*0.0035;
    }
    public double getCashValue(){
        return CV;
    }
    public double getMilesValue(){
        return MV;
    
    }
        
    
}
