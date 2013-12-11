package mikera.matrixx.impl;

import mikera.matrixx.AMatrix;
import mikera.vectorz.AVector;
import mikera.vectorz.impl.AMatrixViewVector;

/**
 * Vector class representing a view of a matrix band
 * @author Mike
 *
 */
@SuppressWarnings("serial")
public final class MatrixBandView extends AMatrixViewVector {
	private int band;
	
	private MatrixBandView(AMatrix source, int band) {
		super(source,source.bandLength(band));
		this.band=band;
	}

	public static AVector create(AMatrix source, int band) {
		if ((band>=source.columnCount())||(band<=-source.rowCount())) return null;
		return new MatrixBandView(source,band);
	}
	
	@Override
	protected int calcRow(int i) {
		return (band<0)?i-band:i;
	}
	@Override
	protected int calcCol(int i) {
		return (band>0)?i+band:i;
	}

	@Override
	public AVector exactClone() {
		return new MatrixBandView(source.exactClone(),band);
	}

}