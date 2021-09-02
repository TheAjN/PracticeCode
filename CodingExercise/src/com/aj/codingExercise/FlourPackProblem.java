package com.aj.codingExercise;

public class FlourPackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canPack(5, 3, 24));
	}

	public static boolean canPack(int big, int small, int goal) {

		if (big < 0 || small < 0 || goal < 0) {
			return false;
		}

		int totalb = 5 * big;
		int totals =  small;
		if (totalb >= goal) {

			if ((totalb % goal) == 0) {
				return true;
			} else if((totalb%goal)<=totals) {
				return true;
			}else {
				return false;
			}
		} else if((totalb<goal) && (totalb>0)){
			if ((totalb + totals) == goal) {
				return true;
			} else if ((totalb + totals) > goal) {

				return (totals >= (goal % totalb) ) ? true : false;
			}
		}else if(totalb==0) {
			if(totals>=goal) {
				return true;
			}else {
				return false;
			}		
		}
		return false;
	}

	   public static boolean canPackActual(int bigCount, int smallCount, int goal){
	        if(bigCount < 0 || smallCount < 0 || goal < 0) {  // #1 validation
	            return false;
	        }
	        if(bigCount*5 + smallCount < goal) { // #2 supply must be greater than demand
	            return false;
	        }
	        return (goal%5 <= smallCount); // #3 regardless of bigCount, remainder of goal has to be less than smallCount
	    }
	
}

/*
 * Write a method named canPack with three parameters of type int named
 * bigCount, smallCount, and goal.
 * 
 * The parameter bigCount represents the count of big flour bags (5 kilos each).
 * 
 * The parameter smallCount represents the count of small flour bags (1 kilo
 * each).
 * 
 * The parameter goal represents the goal amount of kilos of flour needed to
 * assemble a package.
 * 
 * Therefore, the sum of the kilos of bigCount and smallCount must be at least
 * equal to the value of goal. The method should return true if it is possible
 * to make a package with goal kilos of flour.
 * 
 * If the sum is greater than goal, ensure that only full bags are used towards
 * the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0,
 * the method should return false since each big bag is 5 kilos and cannot be
 * divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method
 * should return true because of 1 full bigCount bag and 4 full smallCount bags
 * equal goal, and it's okay if there are additional bags left over.
 * 
 * If any of the parameters are negative, return false.
 * 
 * 
 * EXAMPLE INPUT/OUTPUT:
 * 
 * canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5
 * kilos) and goal is 4 kilos.
 * 
 * canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5
 * kilos) and goal is 5 kilos.
 * 
 * canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1
 * kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned
 * above.
 * 
 * canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos
 * each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and
 * goal is 11 kilos.
 * 
 * canPack (-3, 2, 12); should return false since bigCount is negative.
 * 
 * 
 * NOTE: The method canPack should be defined as public static like we have been
 * doing so far in the course.
 * 
 * NOTE: Do not add a main method to the solution code.
 */