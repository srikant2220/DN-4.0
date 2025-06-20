class FinancialForecasting
{
    public static double predictFutureValue(int currentPeriod, double initialValue, double growthRate)
    {
        if(currentPeriod==0)
        {
            return initialValue;
        }
        return predictFutureValue(currentPeriod-1, initialValue, growthRate)*(1+growthRate);
    }
    public static void main(String[] args) 
    {
        double initialValue=1000.0,growthRate=0.05,futureValue=0.0;
        int futurePeriods=5;
        futureValue=predictFutureValue(futurePeriods, initialValue, growthRate);
        System.out.println("Predicted value after "+futurePeriods+" : "+futureValue);
    }
}
