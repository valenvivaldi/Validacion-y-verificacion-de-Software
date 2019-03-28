package practico1;

public class Mine {
	private boolean isMined;
	private boolean isMarked;
	private boolean isOpened;
	
	public Mine() {
		setMined(false);
		setMarked(false);
		setOpened(false);
	}

	/**
	 * @param isMined the isMined to set
	 */
	public void setMined(boolean isMined) {
		this.isMined = isMined;
	}

	/**
	 * @return the isMined
	 */
	public boolean isMined() {
		return isMined;
	}

	/**
	 * @param isMarked the isMarked to set
	 */
	public void setMarked(boolean isMarked) {
		this.isMarked = isMarked;
	}

	/**
	 * @return the isMarked
	 */
	public boolean isMarked() {
		return isMarked;
	}

	/**
	 * @param isOpened the isOpened to set
	 */
	public void setOpened(boolean isOpened) {
		this.isOpened = isOpened;
	}

	/**
	 * @return the isOpened
	 */
	public boolean isOpened() {
		return isOpened;
	}
	
	
}
