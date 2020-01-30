package com.Pranav.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Float> appraisalRatings = new ArrayList<>();
		appraisalRatings.add(2.7f);
		appraisalRatings.add(2.8f);
		appraisalRatings.add(28.0f);
		appraisalRatings.add(29.0f);
		System.out.println(appraisalRatings);
		// Reassignment to child object only
		appraisalRatings = new LinkedList<>();
		appraisalRatings.add(2.4f);
		appraisalRatings.add(2.90f);
		appraisalRatings.add(2.32f);
		appraisalRatings.add(2.65f);
		System.out.println(appraisalRatings);
	}

}
