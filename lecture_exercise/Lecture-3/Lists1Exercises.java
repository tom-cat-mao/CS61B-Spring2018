public class Lists1Exercises {

    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {

      if (L.rest == null) {
        return new IntList(null, L.x + x);
      }

      return new IntList(incrList(L.rest, x), L.x + x);
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static void dincrList(IntList L, int _x) {
        /* Your code here. */
	    if (L.rest == null) {
		    L.x += _x;
		    return;
	    }

	    L.x += _x;
	    Lists1Exercises.dincrList(L.rest, _x);
    }

    public static void main(String[] args) {
        IntList L = new IntList(null, 5);
        L.rest = new IntList(null, 7);
        L.rest.rest = new IntList(null, 9);
        IntList L_c = incrList(L, 3);
        IntList t_L_c = L_c;

	while (t_L_c != null) {
		System.out.println(t_L_c.get(0));
		t_L_c = t_L_c.rest;
	}

  System.out.println(L.size());

	Lists1Exercises.dincrList(L, 4);

	while (L != null) {
		System.out.println(L.get(0));
		L = L.rest;
	}


        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));        
    }
}
