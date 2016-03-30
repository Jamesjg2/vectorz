package mikera.vectorz.nativeimpl;

import com.github.fommil.netlib.BLAS;
import com.github.fommil.netlib.LAPACK;

public class BlasInstance {

	public static BLAS blas=null;
	public static LAPACK lapack=null;
	
	static {
		try {
			blas=BLAS.getInstance();
		} catch (Throwable e) {
			
		}

		try {
			lapack=LAPACK.getInstance();
		} catch (Throwable e) {
			
		}	
	}
}