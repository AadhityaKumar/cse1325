package library;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.BufferedReader;

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

    public Patron(BufferedReader br) throws IOException {
        this.patron_name  =               br.readLine();
    }
/* 
    public void save(BufferedWriter bw) throws IOException {
        bw.write(patron_name       + '\n');
    }*/

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