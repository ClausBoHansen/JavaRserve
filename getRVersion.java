import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;
 
public class getRVersion {
 
    public static void main(String[] args) throws RserveException,
            REXPMismatchException {
        RConnection c = new RConnection();
        REXP x = c.eval("R.version.string");
//        REXP x = c.eval("tt()");
//        REXP x = c.eval("1+1");
        System.out.println(x.asString());
    }
}
