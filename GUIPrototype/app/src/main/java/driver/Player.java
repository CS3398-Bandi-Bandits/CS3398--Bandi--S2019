package driver;
import java.io.Serializable;
import java.util.HashMap;
import WOPackage.*;
/**
 * 	@author Devon Tyson
 */

public class Player implements IFightable, Serializable {

	private Skill strength, defence, hp, speed;
	private int combatLevel;
	private String username;
	private WorkoutLog log;
	private int lastKnownSteps;
	private boolean firstPedometer;
	
	// constructor for new players
	public Player(String name) {

		this.log = new WorkoutLog();
		this.username = name;
		this.strength = new Strength();
		this.defence = new Defence();
		this.hp = new Hitpoints();
		this.speed = new Speed();
		this.combatLevel = 1;
		this.lastKnownSteps = 0;
		this.firstPedometer = true;
	}
	
	// constructor for existing players
	public Player(String name, Skill str, Skill def, Skill hp, Skill speed) {

		this.username = name;
		this.strength = str;
		this.defence = def;
		this.hp = hp;
		this.speed = speed;
		calculateCombatLevel();
	}
	
	private void calculateCombatLevel() {
		
		int cb = (this.defence.getLevel()/3 + this.strength.getLevel())/3 + (this.hp.getLevel()/5) - 1;
		if(!(cb < 1)) {
			this.combatLevel = cb;
		}
	}
	
	public String getUsername() {
		
		return this.username;
	}
	
	public int getCombatLevel() {
		
		calculateCombatLevel();
		return this.combatLevel;
	}
	
	public Skill getStrengthSkill() {
		
		return this.strength;
	}
	
	public Skill getDefenceSkill() {
		
		return this.defence;
	}
	
	public Skill getHitPointsSkill() {
		
		return this.hp;
	}

	public boolean isFirstPedometer() {
		return firstPedometer;
	}

	public void setFirstPedometer(boolean firstPedometer) {
		this.firstPedometer = firstPedometer;
	}

	public int getLastKnownSteps() {
		return lastKnownSteps;
	}

	public void setLastKnownSteps(int lastKnownSteps) {
		this.lastKnownSteps = lastKnownSteps;
	}

	public Skill getSpeedSkill() {
		
		return this.speed;
	}
	
	public void trainSkill(Skill skill, int addedXp) {
		
		skill.train(addedXp);
	}

	public WorkoutLog getLog() {
		return log;
	}

	public void setLog(WorkoutLog log) {
		this.log = log;
	}

	public String getCombatString() {
		return "Combat";
	}

	@Override
	public void attack() {
		
		// TODO Auto-generated method stub
	}
}
