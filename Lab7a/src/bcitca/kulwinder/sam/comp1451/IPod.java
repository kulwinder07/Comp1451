package bcitca.kulwinder.sam.comp1451;

public class IPod extends IDevice {
	private int numberOfSongsStored;
	private double maximumVolumeInDecibels;
	
	public IPod(String purpose, int numberOfSongsStored, double maximumVolumeInDecibels ) {
		super(purpose);
		this.numberOfSongsStored = numberOfSongsStored;
		this.maximumVolumeInDecibels=maximumVolumeInDecibels;
	}
	
	public int getNumberOfSongsStored() {
		return numberOfSongsStored;
	}

	public void setNumberOfSongsStored(int numberOfSongsStored) {
		this.numberOfSongsStored = numberOfSongsStored;
	}

	public double getMaximumVolumeInDecibels() {
		return maximumVolumeInDecibels;
	}

	public void setMaximumVolumeInDecibels(double maximumVolumeInDecibels) {
		this.maximumVolumeInDecibels = maximumVolumeInDecibels;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"number of songs"+this.numberOfSongsStored+ "volume in decibels" + this.maximumVolumeInDecibels;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfSongsStored;
		return result;
	}
	
	public void printDetails() {
		System.out.println(this.getClass().getSimpleName() + ": The purpose if this IDevice is"+ this.getPurpose());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		IPod other = (IPod) obj;
		if (numberOfSongsStored != other.numberOfSongsStored)
			return false;
		return true;
	}


}
