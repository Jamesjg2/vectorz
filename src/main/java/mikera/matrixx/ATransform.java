package mikera.matrixx;

import mikera.vectorz.AVector;
import mikera.vectorz.Vectorz;

/**
 * Base class for all vector transformations
 * 
 * @author Mike
 *
 */
public abstract class ATransform {
	// =====================================
	// Abstract interface
	
	/**
	 * Transforms the source vector, storing the result in the given destination vector
	 * @param source
	 * @param dest
	 */
	public abstract void transform(AVector source, AVector dest);
	
	/**
	 * Returns the number of dimensions required for input vectors
	 * @return
	 */
	public abstract int inputDimensions();
	
	/**
	 * Returns the number of dimensions required for output vectors
	 * @return
	 */
	public abstract int outputDimensions();

	
	// =====================================
	// Standard implementations
	
	/**
	 * Returns true if this transformation is guaranteed to be linear
	 * @return
	 */
	public boolean isLinear() {
		return false;
	}
	
	/**
	 * Transforms a vector destructively. Intended for fast non-allocating transforms
	 * @param v
	 */
	public void transformInPlace(AVector v) {
		throw new UnsupportedOperationException();
	}


}
