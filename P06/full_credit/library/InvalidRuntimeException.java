package library;


/**
 * An error exception if the video's runtime is less than or equal to 0.
 *
 * @author             Aadhitya Kumar
 * @version            1.0
 * @since              1.0
 * @license.agreement  Gnu General Public License 3.0
 */
public class InvalidRuntimeException extends IllegalArgumentException{
    
    public InvalidRuntimeException() {super();}

    public InvalidRuntimeException(String message) {super(message);}

    public InvalidRuntimeException(Throwable err) {super(err);}

    public InvalidRuntimeException(String message, Throwable err) {super(message, err);}

    public InvalidRuntimeException(int runtime, String title)
    {
        super(title + "has Invalid runtime of" + runtime + "minutes.");
    }
}