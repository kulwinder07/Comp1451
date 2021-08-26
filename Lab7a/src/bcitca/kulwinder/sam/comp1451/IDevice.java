package bcitca.kulwinder.sam.comp1451;

public abstract class IDevice {
	private String purpose;
	
	
	public IDevice(String purpose) 
	{
		setPurpose(purpose);
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		if(purpose!= null) {
		this.purpose = purpose;
		}else {
             throw new IllegalArgumentException("purpose cannot be null");
		}
		}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IDevice other = (IDevice) obj;
		if (purpose == null) {
			if (other.purpose != null)
				return false;
		} else if (!purpose.equals(other.purpose))
			return false;
		return true;
	}


	public abstract void printDetails();
	
	@Override
	public String toString() {
		return this.getPurpose();
	}

}
