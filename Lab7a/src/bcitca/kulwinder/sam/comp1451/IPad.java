package bcitca.kulwinder.sam.comp1451;

public  class IPad extends IDevice {
	private boolean hasACase;
	private String operatingSystemVersion;
	
	public IPad(String purpose, boolean hasACase, String operatingSystemVersion) {
		super(purpose);
		this.hasACase = hasACase;
		this.operatingSystemVersion = operatingSystemVersion;
	}
	
	public boolean isHasACase() {
		return hasACase;
	}

	public void setHasACase(boolean hasACase) {
		this.hasACase = hasACase;
	}

	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"perating system versin"+this.operatingSystemVersion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((operatingSystemVersion == null) ? 0 : operatingSystemVersion.hashCode());
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
		IPad other = (IPad) obj;
		if (operatingSystemVersion == null) {
			if (other.operatingSystemVersion != null)
				return false;
		} else if (!operatingSystemVersion.equals(other.operatingSystemVersion))
			return false;
		return true;
	}


}
