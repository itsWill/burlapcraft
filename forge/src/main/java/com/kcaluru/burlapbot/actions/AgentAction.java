package com.kcaluru.burlapbot.actions;

import com.kcaluru.burlapbot.stategenerator.StateGeneratorFinderDungeon;

import burlap.oomdp.core.Domain;
import burlap.oomdp.core.State;
import burlap.oomdp.singleagent.Action;

public abstract class AgentAction extends Action {
	
	abstract void doAction(State state);
	
	/**
	 * 
	 * @param name
	 * @param domain
	 */
	public AgentAction(String name, Domain domain) {
		super(name, domain, "");
	}
	
	protected AgentAction getAction() {
		return this;
	}

	@Override
	protected State performActionHelper(State s, String[] params) {
		AgentAction action = this.getAction();
		
		System.out.println(action.toString());
		
		action.doAction(s);
		
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		State newState = StateGeneratorFinderDungeon.getCurrentState(domain);
		
		System.out.println(newState.toString());
		
		return newState;
	}

}
