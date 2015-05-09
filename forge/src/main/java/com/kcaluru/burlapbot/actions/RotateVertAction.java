package com.kcaluru.burlapbot.actions;

import com.kcaluru.burlapbot.helpers.BurlapAIHelper;

import burlap.oomdp.core.Domain;
import burlap.oomdp.core.State;

public class RotateVertAction extends AgentAction {
	
	private int vertDirection;

	public RotateVertAction(String name, Domain domain, int rotateVertDirection) {
		
		super(name, domain);
		this.vertDirection = rotateVertDirection;
		
	}

	@Override
	void doAction(State state) {

		if (this.vertDirection == 1) {
			BurlapAIHelper.faceDownOne();
		}
		else {
			BurlapAIHelper.faceAhead();
		}

	}

}
