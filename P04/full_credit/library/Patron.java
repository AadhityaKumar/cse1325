package library;

/**
 * Simulates a patron.
 *
 * @author             Aadhitya Kumar
 * @version            1.0
 * @since              1.0
 * @license.agreement  Gnu General Public License 3.0
 */
public class Patron {
    private String patron_name;

    public Patron(String patron_name)
    {
        this.patron_name = patron_name;
    }

    /**
     * Returns the Cartesian or polar form of the Complex number,
     *   depending on the current form.
     *
     * @return         String of the patron's name.
     * @since          1.0
     */
    @Override
    public String toString()
    {
        return patron_name;
    }

}