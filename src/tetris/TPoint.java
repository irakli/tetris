//tetris.TPoint.java
package tetris;

/*
 This is just a trivial "struct" type class --
 it simply holds an int x/y point for use by Tetris,
 and supports equals() and toString().
 We'll allow public access to x/y, so this
 is not an object really.
 */
public class TPoint implements Comparable<TPoint> {
	public int x;
	public int y;

	// Creates a tetris.TPoint based in int x,y
	public TPoint(int x, int y) {
		// questionable style but convenient --
		// params with same name as ivars

		this.x = x;
		this.y = y;
	}

	// Creates a tetris.TPoint, copied from an existing tetris.TPoint
	public TPoint(TPoint point) {
		this.x = point.x;
		this.y = point.y;
	}

	// Standard equals() override
	public boolean equals(Object other) {
		// standard two checks for equals()
		if (this == other) return true;
		if (!(other instanceof TPoint)) return false;

		// check if other point same as us
		TPoint pt = (TPoint) other;
		return (x == pt.x && y == pt.y);
	}

	// Used for comparing two TPoints
	@Override
	public int compareTo(TPoint that) {
		if (this.y < that.y) return -1;
		if (this.y > that.y) return 1;
		if (this.x < that.x) return -1;
		if (this.x > that.x) return 1;
		return 0;
	}

	// Standard toString() override, produce
	// human-readable String from object
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
