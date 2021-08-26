package bcitca.kulwinder.sam.comp1451;

public class IPhone extends IDevice {
	private double numberOfMinutesRemainingOnPlonePlan;
    private String carrier;
    
    public IPhone(String purpose, double numberOfMinutesRemainingOnPlonePlan, String carrier) {
    	super(purpose);
    	this.numberOfMinutesRemainingOnPlonePlan = numberOfMinutesRemainingOnPlonePlan;
    	this.carrier = carrier;
    	
    }
    
    @Override
	public String toString() {
		return this.getClass().getSimpleName()+"carrier"+this.carrier + "number of mintues remaining on phone plan" + this.numberOfMinutesRemainingOnPlonePlan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(numberOfMinutesRemainingOnPlonePlan);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		IPhone other = (IPhone) obj;
		if (Double.doubleToLongBits(numberOfMinutesRemainingOnPlonePlan) != Double
				.doubleToLongBits(other.numberOfMinutesRemainingOnPlonePlan))
			return false;
		return true;
	}
	
	public void printDetails() {
		System.out.println(this.getClass().getSimpleName() + ": The purpose if this IDevice is"+ this.getPurpose());
	}


	public double getNumberOfMinutesRemainingOnPlonePlan() {
		return numberOfMinutesRemainingOnPlonePlan;
	}

	public void setNumberOfMinutesRemainingOnPlonePlan(double numberOfMinutesRemainingOnPlonePlan) {
		this.numberOfMinutesRemainingOnPlonePlan = numberOfMinutesRemainingOnPlonePlan;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

}
