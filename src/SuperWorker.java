/* Devon Tyson
 * 
 * Open Closed Principle - This class uses the Open Closed Principle by using interfaces to
 * 		maintain uniformity amongst similar classes without having to be modified.
 * 		The class is open for extension and closed for modification.
 * Single Responsibility Principle - This class is only responsible to the SuperWorker.
 * 		The only reason for this code to change would be because the SuperWorker needs to change.
 * 		SuperWorker has been separated from all other workers in order to maintain single responsibility.
 * Interface Segregation Principle - Does not apply.
 */

package threesolid;

public class SuperWorker implements IWorkable, IFeedable {
	public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in launch break
	}
}